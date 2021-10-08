import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private Scanner scanner;
    private Pattern p;
    private Matcher match;

    public UserRegistration() {
        this.scanner = new Scanner(System.in);
    }

    public String validName() {
        boolean flag = true;
        while (flag) {
            System.out.println("Please enter  name with First capital letter and minimum 3");
            String name = scanner.nextLine();
            boolean result = Pattern.compile("^[A-Z]{3}").matcher(name).matches();
            if (result) {
                flag = false;
                return name;
            }
        }
        return null;
    }
}
