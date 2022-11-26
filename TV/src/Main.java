import Samsung.UE431;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    obsluga();
    }

    private static void obsluga()
    {
        UE431 tv = new UE431();
        Scanner scanner = new Scanner(System.in);
        int opcja=0;
        System.out.println("1. Włącz, 2. Wyłącz, 3. ZmienProgram, 4.Wyłącz");
        while(opcja !=4)
        {
            opcja = scanner.nextInt();

                switch (opcja)
                {
                    case 1:
                        tv.wlacz();
                        break;
                    case 2:
                        tv.wylacz();
                        break;
                    case 3:
                        System.out.println("podaj numer programu");
                        int numer = scanner.nextInt();
                        tv.zmienPorgrma(numer);
                        break;
                    case 4:
                        return;
                }
        }



    }
}