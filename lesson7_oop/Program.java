package lesson7_oop;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  ***. Добавить возможность отписаться от рассылки новых вакансий.
     * @param args
     */
    public static void main(String[] args) {

        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 150000);
        Company yandex = new Company("Yandex", publisher, 130000);
        Company geekBrains = new Company("GeekBrains", publisher, 107000);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        Director director1 = new Director("Директор #1");

        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(director1);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }
    }

}
