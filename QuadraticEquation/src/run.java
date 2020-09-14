import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        System.out.println("enter a: ");
        double a = sc.nextDouble();

        System.out.println("enter b: ");
        double b = sc.nextDouble();

        System.out.println("enter c: ");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);

        double delta = equation.getDiscriminant();
        double [] roots = equation.getRoots();

        if (delta < 0){
            System.out.println("this equation has no real root!");
        } else if (delta == 0){
            //double [] roots = equation.getRoots();
            System.out.println("this equation has one root: "+ roots[0]);
        } else {
            //double [] roots = equation.getRoots();
            System.out.println("this equation has 2 root: \n"
                    +"root 1: "+ roots[0]
                    + "\nroot 2: "+ roots[1] );
        }
    }
}
