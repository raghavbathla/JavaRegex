public class userRegestration {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("Enter the first name");
        String fName = userRegistration.validName();
        System.out.println("Enter the last name");
        String lName = userRegistration.validName();

    }
}
