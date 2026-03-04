import java.util.Scanner;
public class method2 {
    public static void method2(String[] args){
        Scanner myObj = new Scanner (System.in);
        System.out.println("masukkan batas awal: ");
        int awal = myObj.nextInt();

        System.out.println("masukkan batas akhir: ");
        int akhir = myObj.nextInt();

        System.out.println("Bilangan genap: ");
        for(int i = awal; i <= akhir; i++){
            if (i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main (String[] args){
        method2(args);
    }
}
