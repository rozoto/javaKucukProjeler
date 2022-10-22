package paket;
import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        //kendi hariç pozitif bölenlerinin toplamı sayının kendisine eşitse
        Scanner scanner=new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        int sayi= scanner.nextInt();
        int sayac=0;

        for(int i=1;i<sayi;i++){
            if(sayi%i==0) sayac=sayac+i;
        }
        if(sayac==sayi) System.out.println("Sayı mükemmeldir.");
    }

}
