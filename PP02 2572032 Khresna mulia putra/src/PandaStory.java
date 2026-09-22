import java.util.Scanner;
import java.util.Random;

public class PandaStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Panda po = new Panda("Po");
        Tiger tigress = new Tiger("Tigress");
        Grasshopper mantis = new Grasshopper("Mantis");
        Snake viper = new Snake("Viper");
        Monkey monkey = new Monkey("Monkey");
        Crane crane = new Crane("Crane");
        Turtle oogway = new Turtle("Oogway");
        System.out.print("Input days for Po to train: ");
        int days = scanner.nextInt();
         for (int i = 1; i <= days; i++) {

            System.out.println("Day " + i);
            System.out.println("1. Training with Tigress");
            System.out.println("2. Training with Mantis");
            System.out.println("3. Training with Viper");
            System.out.println("4. Training with Monkey");
            System.out.println("5. Training with Crane");
            System.out.print("Choose wisely: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    po.training(tigress);
                    break;
                case 2:
                    po.training(mantis);
                    break;
                case 3:
                    po.training(viper);
                    break;
                case 4:
                    po.training(monkey);
                    break;
                case 5:
                    po.training(crane);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }if (random.nextInt(100) < 10) {
                po.training(oogway);
            }
        }

        System.out.println();
         po.showMyStatus();

        scanner.close();
    }
}