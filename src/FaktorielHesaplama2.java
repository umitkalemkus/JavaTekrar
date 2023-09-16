import java.util.Scanner;

public class FaktorielHesaplama2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        
        int sayi = scanner.nextInt();
        
        long FaKtorielSonuc= 1;


        System.out.print(sayi+"!= ");

        for (int i = sayi ; i >=1 ; i--) {


            FaKtorielSonuc *= i;
            if (i!= 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " = ");
            }

        }
        System.out.print(FaKtorielSonuc);
    }
    
    

}
