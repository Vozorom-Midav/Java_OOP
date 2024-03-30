package lesson7_oop;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher{


    private Collection<Observer> observers = new ArrayList<>();
    private Collection<Observer> archiveObserver = new ArrayList<>();

    public void sendOffer(String companyName, Vacancy companyVacancy) {
        for (Observer observer : observers){
            boolean remove = observer.receiveOffer(companyName, companyVacancy);
            if(remove){
                archiveObserver.add(observer);
                System.out.printf("%s больше не ищет работу\n", observer.getName());
            }
        }

        for (Observer observer : archiveObserver)
        {
            removeObserver(observer);
        }
        archiveObserver.clear();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
