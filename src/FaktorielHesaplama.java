import java.util.Scanner;

public class FaktorielHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scanner.nextInt();





        int factorielSonuc= 1;


        for (int i = sayi; i >=1 ; i--) {
            factorielSonuc *=i;
            System.out.println(factorielSonuc);
        }
       //
        // System.out.println(factorielSonuc);





    }




}
