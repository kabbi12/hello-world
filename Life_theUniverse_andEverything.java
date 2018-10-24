import java.util.Scanner;

/*
first task in "Algorythmen und Datenstrukturen"
 */
class Life_theUniverse_andEverything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {

            int i;

            if (((i = scanner.nextInt()) != 42) && (i<100 && i>-100)) {
                System.out.println(i);
            } else {
                System.exit(0);

            }
        }
    }
}
