package lesson_6_oop;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order(InputOrder.inputStringFromConsole("Client name: "), InputOrder.inputStringFromConsole("Product: "),
                                InputOrder.inputIntegerFromConsole("Quantity: "), InputOrder.inputIntegerFromConsole("Price: "));
        SaveFile.saveToJson(order);
    }
}
