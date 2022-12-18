import java.util.Arrays;
import java.util.Scanner;

//Вам необходимо создать программу с собственным классом Пациент.
//В классе вам нужно описать переменные характерные для данной сущности,
// например у пациента могут быть переменные ФИО, возраст, диагноз и тд.
//В классе должны быть обязательно переменные типов int, String, boolean.
//Далее в главном классе вы должны создать минимум 3 объекта Пациента и заполнить
// их данными из консоли (ввод данных сделать в отдельном методе).
//После ввода данных вы должны вывести данные на экран в следующем виде:
//Пациент “ФИО” - Возраст = “возраст”
//Далее вы должны дать пользователю возможность найти пациента по фамилии и по возрасту.
//Это значит, что в консоли должно появится предложение найти пользователя по ФИО или по возрасту.
//Пользователь вводит нужное имя, и программа отображает всех пациентов с данным именем (тоже самое сделать для возраста).
// Опять же поиск происходит в отдельных методах.
public class Task3_2 {
    public static void main(String[] args) {
        int patientCount = 3;

        Patient[] array = new Patient[patientCount];
        for (int i = 0; i < patientCount; i++) {

            String name;
            int age;
            String diagnosis;
            boolean client;

            Scanner sc = new Scanner(System.in);
            System.out.println("input name:");
            name = sc.nextLine();

            System.out.println("input age:");
            age = sc.nextInt();
            sc.nextLine();

            System.out.println("input diagnosis:");
            diagnosis = sc.nextLine();
            System.out.println("input client:");
            client = sc.nextBoolean();

            array[i] = new Patient(name, age, diagnosis, client); //добавляем пациентов в массив по индексу
        }
        System.out.println(Arrays.toString(array));
        System.out.println();     // разрыв

        System.out.println("If you want to search a patient by Name - input 1, by Age - input 2");
        System.out.println("Input 1 or 2:");
        Scanner scan = new Scanner(System.in);
        int num;
        num = scan.nextInt();
        if (num == 1) {      //если набираем 1 - реализуем метод findPatientForName
            findPatientForName(array);
        }
        if (num == 2) {      //если набираем 1 - реализуем метод findPatientForAge
            findPatientForAge(array);
        }
    }

    public static void findPatientForName(Patient[] array) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Input name: ");
        String search = sc1.nextLine();
        for (Patient patient : array) {
            if (patient.name.equals(search)) { //если имя пациента в массиве совпадает с введенным, выводим этого пациента
                System.out.println(patient);
            }
        }
    }
    //создаем метод с поиском по возрасту, по аналогии с методом поиска по имени
    public static void findPatientForAge(Patient[] array) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Input age: ");
        int search = sc1.nextInt();
        for (Patient patient : array) {
            if (patient.age == search) {
                System.out.println(patient);
            }
        }
    }
}










