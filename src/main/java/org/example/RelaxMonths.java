package org.example;

public class RelaxMonths {
    public static int calculate(int income, int expenses, int threshold) {
        int relaxMonthCount = 0; // счётчик месяцев отдыха
        int amountOfMoney = 0; // количество денег на счету
        String relaxMonthsResult = "";
        for (int month = 0; month < 12; month++) {
            if (amountOfMoney >= threshold) { // можем ли отдыхать?
                relaxMonthsResult = relaxMonthsResult
                        + "Месяц " +  (month + 1)
                        + ". Денег " +  amountOfMoney
                        + ". Буду отдыхать. Потратил -" + expenses
                        + ", затем ещё  -" + (amountOfMoney - expenses - ((amountOfMoney - expenses) / 3))
                        + "\n";
                amountOfMoney -= expenses;
                amountOfMoney /= 3;
                relaxMonthCount++; // увеличиваем счётчик месяцев отдыха
            }
            else {
                relaxMonthsResult = relaxMonthsResult
                        + "Месяц " + (month + 1)
                        + ". Денег " + amountOfMoney
                        + ". Придётся работать. Заработал +" + income
                        + ", потратил -" + expenses
                        + "\n";
                amountOfMoney += income - expenses;
            }
        }
       // return relaxMonthsResult + "Количество месяцев отдыха: " + relaxMonthCount + "\n";
        return relaxMonthCount;
    }
}
