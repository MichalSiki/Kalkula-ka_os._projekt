import java.util.Scanner;
public class Kalku_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vítejte v Kalkulačce");
        System.out.println("--------------------------------");
        System.out.println("Vyberte první číslo");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Vyberte druhé číslo");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Vybral jsi: " + a + " + " + b);
        System.out.println("Vyber akci!");
        System.out.println(" 1 - +");
        System.out.println(" 2 - -");
        System.out.println(" 3 - *");
        System.out.println(" 4 - /");
        int volba = Integer.parseInt(sc.nextLine());
        float vysledek = 0;
        switch (volba) {
            case 1:
                vysledek = a + b;
                break;
            case 2:
                vysledek = a - b;
                break;
            case 3:
                vysledek = a * b;
                break;
            case 4:
                vysledek = a / b;
                break;
        }
        if ((volba > 0) && (volba < 5)) ;
        {
                System.out.println("Vysledek je: " + vysledek);

        }
        System.out.println("Děkuji za použití kalkulačky");
    }
}
