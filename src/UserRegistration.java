import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private Scanner scanner;
    private Pattern pattern;
    private Matcher match;

    public UserRegistration() {
        this.scanner = new Scanner(System.in);
    }

    public String validName() {
        boolean flag = true;
        String patternEx = "[A-Za-z]{3,}";
         pattern = Pattern.compile(patternEx);
        while (flag) {
            System.out.println("Please enter  name with First capital letter and minimum 3");
            String name = scanner.nextLine();
            Matcher matcher = pattern.matcher(name);
            boolean result = matcher.matches();
            if (result) {
                flag = false;
                return name;
            }
        }
        return null;
    }
}
