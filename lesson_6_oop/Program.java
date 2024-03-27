package lesson_6_oop;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        
        String clientName = InputOrder.inputStringFromConsole("Client name: ");
        String product = InputOrder.inputStringFromConsole("Product: ");
        int quantity = InputOrder.inputIntegerFromConsole("Quantity: ");
        int price = InputOrder.inputIntegerFromConsole("Price: ");

        Order order = new Order(clientName, product, quantity, price);
        SaveFile.saveToJson(order);
    }
}
