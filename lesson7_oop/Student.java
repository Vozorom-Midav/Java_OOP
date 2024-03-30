package lesson7_oop;

import java.util.Random;

public class Student implements Observer{

    private String name;
    private int salary;
    VacancyTypeEnum profession;

    Random random = new Random();

    public Student(String name){
        this.name = name;
        salary = 5000;
        profession = VacancyTypeEnum.values()[random.nextInt(VacancyTypeEnum.values().length)];
    }

    @Override
    public boolean receiveOffer(String nameCompany, Vacancy companyVacancy) {
        if(companyVacancy.getVacancyType().equals(this.profession)){
            if (this.salary <= companyVacancy.getSalary()){
                System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                        name, nameCompany, companyVacancy.getSalary());
                this.salary = companyVacancy.getSalary();
                return true;
            }
            else {
                System.out.printf("Студент %s: Зарплата меня не устраивает! (компания: %s; заработная плата: %d)\n",
                        name, nameCompany, companyVacancy.getSalary());
                        return false;
            }
        }
        else {
            System.out.printf("Студент %s: Это не моя профессия! (компания: %s; Предлагали профессию: %s; Моя профессия: %s)\n",
            name, nameCompany, companyVacancy.getVacancyType().getTranslation(), profession.getTranslation());
            return false;
        }
    }

    public String getName() {
        return name;
    }
}
