import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        ArrayList<Orandge> orandges = new ArrayList<>();
        orandges.add(new Orandge());
        orandges.add(new Orandge());
        orandges.add(new Orandge());


        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());


        Box<Orandge> boxs1 = new Box<>(orandges);
        Box<Apple> boxs2 = new Box<>(apples);
        Box<Apple> boxs3 = new Box<>(apples);
        Box<Orandge> boxs4 = new Box<>(orandges);

        System.out.println("В коробке 2 было: " + boxs2.getWeight() + " фруктов");
        System.out.println("В коробке 3 было: " + boxs3.getWeight() + " фруктов");
        System.out.println("Высыпаем в коробку 3 фрукты из коробки 2");
        boxs2.pour(boxs3);
        System.out.println("В коробке 2 стало: " + boxs2.getWeight() + " фруктов");
        System.out.println("В коробке 3 стало: " + boxs3.getWeight() + " фруктов");

        if(boxs1.compare(boxs4)){
            System.out.println("Вес коробок равен");
        }
        else{
            System.out.println("Вес коробок различается");
        }

        boxs1.add(new Orandge());

        if(boxs1.compare(boxs4)){
            System.out.println("Вес коробок равен");
        }
        else{
            System.out.println("Вес коробок различается");
        }


    }
    
}
