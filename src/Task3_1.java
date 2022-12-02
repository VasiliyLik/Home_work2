import java.util.Scanner;
//Представьте, что вам необходимо написать метод, определяющий количество страниц для вывода N новостей с учетом того,
// что на одной странице помещается 10 записей.
// В итоге у вас будет метод,который возвращает количество страниц, а на вход принимает количество новостей.
// Помните, что тут округлять нужно всегда к большему.
public class Task3_1 {
    public static void main(String[] args) {

        System.out.println(countLine());
    }

    public static double countLine() {
        System.out.println("введите число, задающее количество новостей");
        Scanner sc = new Scanner(System.in);
        double news = sc.nextInt();

        double count = news / 10;   //вычисляем количество страниц, вмещающих обозначенные новости (не более 10)
        count = Math.ceil(count);

        return count;
    }
}
