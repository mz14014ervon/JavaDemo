package general;

import lombok.Data;

import static utils.RandomDataGenerator.generateRandominputString;
import static utils.RandomDataGenerator.generateRandomEmail;
import static utils.RandomDataGenerator.generateRandommobileNr;

@Data
public class User {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String password;

    public User()   {
        this.firstName = generateRandominputString();
        this.lastName = generateRandominputString();
        this.mobileNumber = generateRandommobileNr();
        this.email = generateRandomEmail();
        this.password = generateRandominputString();

    }

    public User(String firstName, String lastName)  {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
