package lesson7_oop;

public enum VacancyTypeEnum {
    CLEANER("Уборщик"), COURIER("Курьер"), DESIGNER("Дизайнер"), DEVELOPER("Разработчик"), MARKETING("Маркетолог");

    private String translation;

    VacancyTypeEnum(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
