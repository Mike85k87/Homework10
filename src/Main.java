public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    // Задача 1
    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
    }

    // Задача 2
    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName.toUpperCase());
    }

    // Задача 3
    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String fullNameFix = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameFix);
    }
}