import java.util.Scanner;


public class pratik2 {
    public static void main(String[] args) {
        int a,b;
        Double c;

        Scanner input = new Scanner(System.in);
        System.out.println("1.kenarı giriniz: ");
        a = input.nextInt();
        System.out.println("2. kenarı giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hiipotenüs: "+ c);



    }
}
