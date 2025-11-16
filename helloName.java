import java.util.Scanner;

class nameHello{
    public String nameCreate(Scanner sc){
        System.out.print("What is your name?");
        String name = sc.nextLine();
        return name;
    }

    public void printName(String name){
        System.out.println("Hello " + name);
    }
}

public class helloName {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            nameHello hello = new nameHello();
            String name =hello.nameCreate(sc);
            hello.printName(name);
        }
    }
}