package Auth;

import java.util.Scanner;

import Utils.Input;

public class Social extends Authentication {

    private String[] providers = { "Google", "Amazon", "Github", "Facebook" };

    public Social() {
        super("Social Login (Google, Amazon dll)");
    }

    public String[] getproviders() {
        return providers;
    }

    @Override
    public void login(Scanner input) {
        int choice;

        clear();

        loading("Loading");
        clear();

        System.out.println("Berikut beberapa layanan yang tersedia");
        for (int i = 0; i < providers.length; i++) {
            System.out.println((i + 1) + ". " + providers[i]);
        }

        System.out.println("Silahkan pilih layanan yang akan digunakan untuk login");
        System.out.print("=> ");

        choice = new Input().getNumber(1, 4);

        clear();
        System.out.println("Anda memilih " + providers[choice - 1]);
        System.out.println("Anda akan diarahkan ke halaman login berdasarkan layanan yang anda pilih");
        loading("Harap tunggu");
        clear();
        System.out.println("Berhasil login");
    }

}
