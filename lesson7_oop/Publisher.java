package lesson7_oop;

public interface Publisher {
    void sendOffer(String companyName, Vacancy companyVacancy);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
