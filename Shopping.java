import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>(8);
        int productCount = 0;

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");

            int actionNumber = scanner.nextInt();
            scanner.nextLine();

            if (actionNumber == 1) {
                System.out.print("Введите товар: ");
                String productName = scanner.nextLine();
                if (shoppingList.contains(productName)) {
                    System.out.println("Такой товар уже есть в списке!");
                } else {
                    shoppingList.add(productName);
                    System.out.println("Товар " + shoppingList.get(productCount) + " добавлен в список под номером " + (productCount + 1));
                    productCount++;
                }

            } else if (actionNumber == 2) {
                if (productCount > 0) {
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(i + 1 + ". " + shoppingList.get(i));
                    }
                } else {
                    System.out.println("Список товаров пуст. Сперва добавьте товар!");
                }

            } else if (actionNumber == 3) {
                if (productCount > 0) {
                    shoppingList.subList(0, productCount).clear();
                    productCount = 0;
                    System.out.println("Список товаров пуст!");
                } else {
                    System.out.println("Список товаров пуст. Сперва добавьте товар!");
                }
            } else if (actionNumber == 4) {
                    System.out.println("До скорых встреч!");
                    return;
            } else {
                System.out.println("Неизвестная команда!");
            }
        }
    }
}