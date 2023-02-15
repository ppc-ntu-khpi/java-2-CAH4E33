package domain;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise {
    /**
     * атрибут типу LocalDate
     */
    private LocalDate firstdate;
    /**
     * атрибут типу LocalDate
     */
    private LocalDate seconddate;
    /**
     * атрибут типу int
     */
    private int count = 0;

    /**
     * Метод для отримання першої дати
     * @param y рік
     * @param m місяць
     * @param d число
     */
    public void setfirstdate(int y, int m, int d) {
        this.firstdate = LocalDate.of(y, m, d);
    }

    /**
     * Метод для отримання другої дати
     * @param y рік
     * @param m місяць
     * @param d число
     */
    public void setseconddate(int y, int m, int d) {
        this.seconddate = LocalDate.of(y, m, d);
    }

    /**
     * Метод для підрахунку та виводу кількості вихідних днів
     */
    public void CountingWeekends() {
        for (LocalDate date = firstdate; date.isBefore(seconddate.plusDays(1)); date = date.plusDays(1)) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY || date.getDayOfWeek() == DayOfWeek.SATURDAY) {

                count++;
            }

        }

        System.out.println("Number of weekends between dates: " + count);
    }

}
