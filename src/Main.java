import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String input = scanner.nextLine();

        try {
            int x = Integer.parseInt(input.trim());
            System.out.println("Вы ввели: " + x);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: " + e.getClass().getSimpleName());
        }
    }
}