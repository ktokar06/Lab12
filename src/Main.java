public class Main {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt("не_число");
        } catch (NumberFormatException e) {
            System.out.println("Класс исключения: " + e.getClass().getName());
        }
    }
}