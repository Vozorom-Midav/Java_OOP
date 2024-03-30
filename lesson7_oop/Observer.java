package lesson7_oop;

public interface Observer {

    boolean receiveOffer(String nameCompany, Vacancy companyVacancy);

    public String getName();
}
