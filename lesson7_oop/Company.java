package lesson7_oop;

import java.util.Random;

public class Company {

    private Random random = new Random();
    private String name;

    private Publisher jobAgency;
    private Vacancy companyVacancy = new CompanyVacancy();

    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        companyVacancy.setSalary(salary);
        jobAgency.sendOffer(name, companyVacancy);
    }
}
