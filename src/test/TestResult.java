package test;

import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        Exercise count = new Exercise();
        count.setfirstdate(2022, 12, 12); //
        count.setseconddate(2022, 12, 31);
        count.CountingDays();

    }
}