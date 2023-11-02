import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите имя: ");
            String firstname = scanner.nextLine();
            validateInputString(firstname);


            System.out.println("Введите фамилию: ");
            String lastname = scanner.nextLine();
            validateInputString(lastname);

            System.out.println("Введите отчество: ");
            String patronymic = scanner.nextLine();
            validateInputString(patronymic);

            System.out.println("Введите дату рождения: ");
            String birthDate = scanner.nextLine();
            validateInputString(birthDate);

            System.out.println("Введите номер телефона");
            String telephoneNumber = scanner.nextLine();
            validateInputInteger(telephoneNumber);

            System.out.println("Введите пол");
            String gender = scanner.nextLine();
            if (gender.equals("m") || gender.equals("f"))
            {
                System.out.println("User this name '" + firstname + "' create");
            }else validateInputGender();

            User user = new User(firstname, lastname, patronymic, birthDate, Integer.parseInt(telephoneNumber), gender);
            FileCreate fileCreate = new FileCreate();
            fileCreate.createFile(user);

        }catch (Exept e){
            System.out.println("Invalid input: " + e.getMessage());
        } catch (Exception E) {
            System.out.println("Введите номер телефона в цифровом формате");
        }
    }
    public static void validateInputString(String input) throws Exept {
        if (input == null || input.isEmpty()) {
            throw new Exept("Поле не может быть пустым");
        }
    }
    public static void validateInputInteger(String input) throws Exept {
        if (input == null || input.isEmpty()) {
            throw new Exept("Укажите корректный номер");
        }
    }
    public static void validateInputGender() throws Exept {
//        if (input != "m") {
            throw new Exept("Укажите пол значениями (m или f)");
//        }
    }
}