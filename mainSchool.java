import java.util.Scanner;

class mainSchool {
    private static Scanner scan;
    
    public static void main(String[] args) {
        interfaceSchool e = new scientificStudent("", "", "");

        scan = new Scanner(System.in);

        scan.nextLine();
        scan.nextLine();
        scan.nextLine();

        e.exam();
        e.exercise();
        e.interview();
        e.presentation();
    }
}
