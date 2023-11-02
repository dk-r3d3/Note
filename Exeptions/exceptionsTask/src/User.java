public class User {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String birthDate;
    private Integer telephoneNumber;
    private String gender;

    public User(String firstName, String lastName, String patronymic, String birthDate, Integer telephoneNumber, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.telephoneNumber = telephoneNumber;
        this.gender = gender;
    }
    public String getName(){

        return firstName + " " + lastName + " " + patronymic + " " + birthDate + " "
                + telephoneNumber + " " + gender + "\n";
    }
    public String getLastName() {
        return lastName;
    }
}
