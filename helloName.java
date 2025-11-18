import java.util.Scanner;

class NameHelper {
    private final Scanner sc;

    public NameHelper(Scanner sc){
        this.sc = sc;
    }
    public String createName() {
        System.out.print("What is your name?");
        return sc.nextLine();
    }

    public void printGreeting(String name) {
        System.out.println("Hello " + name);
    }
}

public class HelloName {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            NameHelper hello = new NameHelper(sc);
            hello.printGreeting(hello.createName());
        }
    }
}