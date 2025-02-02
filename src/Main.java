import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы 2");
        System.out.println("\nTask 1");
        int[] summa = {2000, 4000, 1500, 5000, 2500};
        int result = 0;
        for (int i = 0; i < summa.length; i++) {
            result += summa[i];
        }
        System.out.printf("Сумма трат за месяц составила " + result + ", рублей ");
        System.out.println("\nTask 2");
        int[] weeklyExpenses = {200, 400, 150, 500, 250};
        int min = weeklyExpenses[0];
        int max = weeklyExpenses[0];
        for (int expense : weeklyExpenses) {
            if (expense < min) {
                min = expense;
            }
            if (expense > max) {
                max = expense;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей.");
        System.out.println("\nTask 3");
        double[] monthlyExpenses = {1500, 2000, 3000, 3500, 2500};
        double total = 0;
        for (double expense : monthlyExpenses) {
            total += expense;
        }
        double average = total / monthlyExpenses.length;
        System.out.printf("Средняя сумма трат за месяц составила " + average + " рублей.");
        System.out.println("\nTask 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}



