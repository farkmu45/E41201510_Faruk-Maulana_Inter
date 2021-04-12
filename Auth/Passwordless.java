package Auth;

import java.util.Scanner;

import Utils.Input;

public class Passwordless extends Authentication {

    private String[] methods = { "SMS", "Email" };

    public Passwordless() {
        super("Passwordless (Magic Link)");
    }

    @Override
    public void login(Scanner input) {
        int choice;
        String phoneNumber = "";
        String email = "";

        clear();
        loading("Loading");
        clear();

        for (int i = 0; i < methods.length; i++) {
            System.out.println((i + 1) + ". " + methods[i]);
        }

        System.out.println("Kami akan mengirimkan link melalui pilihan yang anda pilih");
        System.out.print("=> ");
        choice = new Input().getNumber(1, 2);

        clear();

        if (choice == 1) {
            System.out.println("Anda memilih SMS, silahkan masukkan nomor handphone anda");
        } else {
            System.out.println("Anda memilih email, silahkan masukkan email anda");
        }

        System.out.print("=>");

        if (choice == 1) {
            phoneNumber = input.nextLine();
        } else {
            email = input.nextLine();
        }

        clear();
        loading("Harap tunggu");
        clear();

        if (choice == 1) {
            System.out.print("Kode telah dikirimkan melalui " + phoneNumber
                    + " silahkan gunakan link yang telah dikirim untuk login");
        } else {
            System.out.print(
                    "Kode telah dikirimkan melalui " + email + " silahkan gunakan link yang telah dikirim untuk login");
        }

    }
}
