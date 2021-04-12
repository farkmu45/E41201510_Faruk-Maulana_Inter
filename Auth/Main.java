package Auth;

import java.util.Scanner;

import Utils.Input;

public class Main {
    public static void main(String[] args) {

        Passwordless passwordless = new Passwordless();
        Social social = new Social();
        Password pass = new Password();
        Biometric biometric = new Biometric();
        Scanner scan = new Scanner(System.in);

        Input input = new Input();

        int choice;

        Authentication[] auth = { passwordless, social, pass, biometric };

        System.out.println("Silahkan pilih metode autentikasi yang tersedia");
        System.out.println();

        for (int i = 0; i < auth.length; i++) {
            System.out.println((i + 1) + ". " + auth[i].getName());
        }

        System.out.print("=> ");
        choice = input.getNumber(1, 4);

        auth[choice - 1].login(scan);

    }
}
