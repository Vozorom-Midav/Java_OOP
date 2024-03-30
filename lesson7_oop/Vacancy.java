package lesson7_oop;

public interface Vacancy {

    public int getSalary();

    public void setSalary(int salary);

    public void setVacancyType(VacancyTypeEnum vacancyType);

    public VacancyTypeEnum getVacancyType();
}
