package ru.practicum;

/*
Количество пройденных шагов по дням в формате:
  1 день: 3000
  2 день: 2000
   ...
  30 день: 10000

Общее количество шагов за месяц.
Максимальное количество шагов в месяце.
Лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого.
 */
class MonthData {
    int[] days = new int[30];

/*
int sumStepsFromMonth(): подсчёт суммы шагов за месяц. Метод должен возвращать сумму элементов массива days[].
 */
void printDaysAndStepsFromMonth() {
    for (int i = 0; i < days.length; i++) {
        // вывод элементов массива в нужном формате
    }
}

int sumStepsFromMonth() {
    int sumSteps = 0;
    for (int i = 0; i < days.length; i++) {
        // подсчёт суммы элементов массива days[]
    }
    return sumSteps;
}

    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            // поиск максимального элемента
        }
        return maxSteps;
    }
/*
int bestSeries(int goalByStepsPerDay): поиск максимальной серии.
Метод должен возвращать максимальное количество подряд идущих элементов days[],
 больших, чем goalByStepsPerDay, или равных ему.
 */
    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            // поиск максимальной серии
        }
        return finalSeries;
    }

}