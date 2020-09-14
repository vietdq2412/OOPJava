import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        StopWatch watch = new StopWatch();

        watch.start();
        System.out.println("start: " + watch.getStartTime());


        System.out.println("enter to stop!");
        String stop = sc.nextLine();
        watch.stop();

        System.out.println("Stop: " + watch.getEndTime());

        System.out.println("elapse time: " + watch.getElapsedTime());
    }
}
