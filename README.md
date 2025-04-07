<h1 align="center">Hi there, I'm <a href="https://www.example.com" target="_blank">Kirill</a> 
<img src="https://github.com/blackcater/blackcater/raw/main/images/Hi.gif" height="32"/></h1>

<h3 align="center"> Student, Java Developer 🇷🇺 </h3>

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

