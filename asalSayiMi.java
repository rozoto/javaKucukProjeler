package paket;
import java.util.Scanner;

public class asalSayiMi {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi= scanner.nextInt();

        boolean asal=true;
        for(int i=2;i<sayi;i++) {
            if(sayi%i==0) asal=false;
        }
        if(asal==true) System.out.println("Sayi asaldir.");
        else System.out.println("Sayı asal değildir.");
    }
}
