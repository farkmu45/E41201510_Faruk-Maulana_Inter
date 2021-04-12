package Auth;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Authentication {
    private String name;

    public Authentication(String name) {
        this.name = name;
    }

    public void login(Scanner input) {
        System.out.println("Belum ada metode login yang diimplementasikan");
    };

    public void loading(String text) {
        try {
            System.out.print(text);
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
