package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] oTask1Result = OptionalTask1();
        System.out.println("Task 1:");
        for (int i = 1; i < oTask1Result.length; i++) {
            System.out.println(i + " Day : " + oTask1Result[i]);
        }

        int[] task2 = {10, 20, 30, 40, 49};
        Weather oTask2Result = OptionalTask2(task2);
        System.out.println();
        System.out.println("Task 2: " + oTask2Result);

        String [][] oTask3Result = OptionalTask3(OptionalTask1());
        System.out.println();
        System.out.println("Task 3:");
        for (int i = 1; i < oTask3Result.length; i++) {
                System.out.println((i + " Day : " + oTask3Result[i][0] + " , "  + "Recommendation: "+ oTask3Result[i][1]));
            }
        }

    public static int[] OptionalTask1() {
        int[] oTaskResult = new int[32];
        for (int i = 0; i < oTaskResult.length; i++) {
            oTaskResult[i] = (int) Math.round(Math.random() * 201) - 100;
        }
        return oTaskResult;
    }

    public static Weather OptionalTask2(int[] task2) {
        Weather generalWeather = null;
        Weather weather = null;

        for (int i = 0; i < task2.length; i++) {
            if (-100 <= task2[i] && task2[i] < -50) {
                weather = Weather.FROST;
            }
            if (-50 <= task2[i] && task2[i] < 0) {
                weather = Weather.COLD;
            }
            if (0 <= task2[i] && task2[i] < 50) {
                weather = Weather.WARM;
            }
            if (50 <= task2[i] && task2[i] <= 100) {
                weather = Weather.HOT;
            }
            if (generalWeather == null) {
                generalWeather = weather;
            }
            if (generalWeather == weather) {
                continue;
            }
            if (generalWeather != weather) {
                generalWeather = Weather.MIX;
            }
        }
        return generalWeather;

    }

    public static String [][] OptionalTask3(int[] OptionalTask1) {
        int[] optionalTask1 = OptionalTask1;
        int i = 1;
        int a = optionalTask1.length;
        String[][] task3 = new String[a][2];
        Weather j = null;
        for (i = 1; i< task3.length; i++){
           task3[i][0] = String.valueOf(optionalTask1[i]);
        }

        for (i = 1; i < task3.length; i++) {
            int input = optionalTask1[i];
            if (-100 <= input && input < -50) {
                j = Weather.FROST;
            }
            if (-50 <= input && input < 0) {
                j = Weather.COLD;
            }
            if (0 <= input && input < 50) {
                j = Weather.WARM;
            }
            if (50 <= input && input <= 100) {
                j = Weather.HOT;
            }
            task3[i][1] = String.valueOf(j);
        }
        return task3;
    }
}

