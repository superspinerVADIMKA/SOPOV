import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Aministrator> Zapis = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Введите кол-во записей: ");
            int count = scanner.nextInt();
            String[] names = new String[count];
            String[] surnames = new String[count];
            String[] phone = new String[count];
            int[] room = new int[count];
            System.out.println("Введите данные для каждой записи:");
            for (int i = 0; i < count; i++) {
                System.out.print("Введите имя " + (i+1) + ": ");
                names[i] = scanner.next();

                System.out.print("Введите фамилию " + (i+1) + ": ");
                surnames[i] = scanner.next();

                System.out.print("Введите номер " + (i+1) + ": ");
                phone[i] = scanner.next();

                System.out.print("Введите номер " + (i+1) + ": ");
                room[i] = Integer.parseInt(scanner.next());
            }

            System.out.println("Имя и фамилия каждого человека:");
            for (int i = 0; i < count; i++) {
                System.out.println("Запись " + (i+1) + ": " + names[i] + " " + surnames[i] + " " + phone[i] + " " + room[i]);
            }
        }

    }