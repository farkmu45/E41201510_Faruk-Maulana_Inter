package Auth;

import java.util.Scanner;

public class Biometric extends Authentication {
    private String user;

    public Biometric() {
        super("Biometric");
    }

    @Override
    public void login(Scanner input) {
        clear();

        System.out.print("Sedang menyiapkan perangkat\n");
        loading("Harap tunggu");

        clear();

        System.out.print("\nMasukkan nama anda = ");

        user = input.nextLine();

        input.close();

        System.out.print("\nSedang mengecek nama di database\n");
        loading("Harap tunggu");

        System.out.print("\nLetakkan jari anda di scanner\n");
        loading("Harap tunggu");

        System.out.print("\nSelamat datang " + user + " !");
    }
}
