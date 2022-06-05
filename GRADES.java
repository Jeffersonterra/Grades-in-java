import java.util.Scanner;

class GRADES {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Input the first grade:");
        double GRADE1 = leitor.nextDouble();
        System.out.println("Input the second grade:");
        double GRADE2 = leitor.nextDouble();

        double AVERAGE = (GRADE1 + GRADE2) / 2;
        System.out.printf("Final average: %1.2f", AVERAGE);
        if (AVERAGE >= 70) {
            System.out.printf("\nStudent: PASSED");
        } else {
            System.out.printf("\nStudent: FAILED");
        }
        leitor.close();
    }

}
