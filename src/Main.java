import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        String firstName = "Семён";
        String lastName = "Иванов";
        String middleName = "Семёнович";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника -  " + fullName);

        // Задание 2
        System.out.println("Задание 2");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);

        // Задание 3
        System.out.println("Задание 3");
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);
    }
}