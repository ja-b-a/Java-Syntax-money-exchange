import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        System.out.println("Введите Вашу сумму: ");
        Scanner scanner = new Scanner(System.in);
        int valueSum = scanner.nextInt();

        System.out.println("Выберите нужную валюту: ");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        int choiceType = scanner.nextInt();

        String result = convertCurrency(valueSum, choiceType);
        int dotIndex = result.indexOf(".");
        String finalResult = result.substring(0, dotIndex + 2);
        System.out.println("По текущему курсу сумма составит: " + finalResult);
        start();
    }

    static String convertCurrency(int valueSum, int choiceType) {
        double rubToUsd = 0.012;
        double rubToEur = 0.011;

        switch (choiceType) {
            case 1:
                double usdResult = valueSum * rubToUsd;
                return String.valueOf(usdResult);
            case 2:
                double eurResult = valueSum * rubToEur;
                return String.valueOf(eurResult);
        }
        return "0";
    }

}