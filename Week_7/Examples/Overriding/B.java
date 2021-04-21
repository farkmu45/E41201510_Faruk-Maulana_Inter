package Week_7.Examples.Overriding;

public class B extends A {
    @Override
    public void tampilkanKeLayar() {
        super.tampilkanKeLayar();
        System.out.println("Method milik class B dipanggil");
    }
}
