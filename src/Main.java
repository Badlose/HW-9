public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int[] spendingPerWeak = new int[]{18_000, 10_000, 12_000, 22_000, 17_000};
        int sumPerMonth = 0;
        for (int i : spendingPerWeak) {
            sumPerMonth += i;
        }
        System.out.println("Сумма трат за месяц составила " + sumPerMonth + " рублей");

        //Task 2
        System.out.println("Task 2");
        //решил не создавать новый массив на 5 значений, взял из первого задания

        int maxWaste = 0;
        int minWaste = spendingPerWeak[0];
        for (int i = 0; i < spendingPerWeak.length; i++) {
            if (spendingPerWeak[i] > maxWaste) {
                maxWaste = spendingPerWeak[i];
            }
        }

        for (int i = 0; i < spendingPerWeak.length; i++) {
            if (spendingPerWeak[i] < minWaste) {
                minWaste = spendingPerWeak[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minWaste + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxWaste + " рублей");

        //Task 3
        System.out.println("Task 3");
        double average = sumPerMonth / spendingPerWeak.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Task 4
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}