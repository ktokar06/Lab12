# Lab12 МДК.02.02

## Задание

Написать программу, отлавливающую ошибку `ValueError`. Вывести в консоль название класса исключения.

## Решение 

```java 
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt("не_число");
        } catch (NumberFormatException e) {
            System.out.println("Класс исключения: " + e.getClass().getName());
        }
    }
```

С вводом данных
```java
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
```

