package ru.practicum;

import java.util.Scanner;
/*
номер вводимого месяца должен быть от 1 до 12 включительно;
номер вводимого дня должен быть от 1 до 30 включительно;
количество шагов должно быть положительным числом.
 */
class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    private int goalByStepsPerDay = 10_000;

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        // ввод и проверка номера месяца

        System.out.println("Введите день от 1 до 30 (включительно)");
        // ввод и проверка дня

        System.out.println("Введите количество шагов");
        // ввод и проверка количества шагов

        // получение соответствующего объекта MonthData из массива
        MonthData monthData = ...
        // сохранение полученных данных
        monthData.days[...] = ...
    }

    public void changeStepGoal() {

    }

    void printStatistic() {
        System.out.println("Введите число месяца");
        // ввод и проверка номера месяца

        monthData = // получение соответствующего месяца
        int sumSteps = // получение суммы шагов за месяц
                // вывод общей статистики по дням
                // вывод суммы шагов за месяц
                // вывод максимального пройденного количества шагов за месяц
                // вывод среднего пройденного количества шагов за месяц
                // вывод пройденной за месяц дистанции в километрах
                // вывод количества сожжённых килокалорий за месяц
                // вывод лучшей серии
                System.out.println(); // дополнительный перенос строки
    }
}
