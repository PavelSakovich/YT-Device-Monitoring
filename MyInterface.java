@FunctionalInterface
public interface MyInterface {

    void sout (int a);

    default  void name() {
        System.out.println("Павел");
    }
}