import java.util.Scanner;

public class Hello {
    public static void main(String [] args) {
        System.out.println("Hello. What is your name?");
        String userName;
        Scanner scrn = new Scanner(System.in);
        userName = scrn.next();
        System.out.println("It's nice to meet you, " + userName +" . How old are you?");
        String userAge;
        userAge = scrn.next();
        System.out.println("I see that you are still quite young at only " +userAge+".");
        System.out.println("Where do you live?");
        String userHome;
        userHome = scrn.next();
        System.out.println("Wow! I've always wanted to go to " + userHome + ". Thanks for chatting with me. Bye!");
    }
}

//comment for lab06