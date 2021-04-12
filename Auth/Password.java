package Auth;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class Password extends Authentication {
    private String username;
    private char[] password;

    public Password() {
        super("Username + Password");
    }

    @Override
    public void login(Scanner input) {
        Console console = System.console();
        this.clear();
        System.out.println("Silahkan masukkan username dan password untuk login");
        System.out.print("Username  : ");
        username = input.nextLine();
        password = console.readPassword("Password  : ");
        Arrays.fill(password, ' ');

        loading("Sedang memverifikasi");
        System.out.println("\nBerhasil login, selamat datanag " + username);

    }
}
