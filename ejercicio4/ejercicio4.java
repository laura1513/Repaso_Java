import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String casa;
        System.out.println("Introduce tu casa de Harry Potter");
        casa= read.nextLine();
        if (casa == "gryffindor") {
            System.out.println("bravery");
        } else if (casa == "hufflepuff") {
            System.out.println("loyalty");
        } else if (casa == "slytherin") {
            System.out.println("cunning");
        } else if (casa == "ravenclaw") {
            System.out.println("intellect");
        } else {
            System.out.println("not a valid house");
        }
    }
}
