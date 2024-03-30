package lesson7_oop;

import java.util.Random;

public class CompanyVacancy implements Vacancy {

    VacancyTypeEnum vacancyType;
    private int salary;
    private String description;

    Random random = new Random();

    public CompanyVacancy(){
        vacancyType = VacancyTypeEnum.values()[random.nextInt(VacancyTypeEnum.values().length)];
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VacancyTypeEnum getVacancyType() {
        return vacancyType;
    }

    public void setVacancyType(VacancyTypeEnum vacancyType) {
        this.vacancyType = vacancyType;
    }
}
