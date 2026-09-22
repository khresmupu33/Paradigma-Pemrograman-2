import java.util.Scanner;
public class Soal1_TimeConverterDemo {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("input: ");
        int nilai = input.nextInt();
        Soal1_TimeConverter second= new Soal1_TimeConverter(nilai);
        System.out.println(second.showTime());
    }
}
