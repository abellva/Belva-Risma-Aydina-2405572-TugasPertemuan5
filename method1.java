import java.util.Scanner;
public class method1 {
    public static void method1(String[] args){
        Scanner myObj = new Scanner (System.in);
        System.out.println("masukkan nilai n: ");
        int n = myObj.nextInt();

        for(int i = 1; i<= n; i++){
            System.out.println("Saya senang belajar bahasa Java");
        }
    }
    public static void main (String[] args){
        method1(args);
    }
}
