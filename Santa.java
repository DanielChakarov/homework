
public class Santa {
    private static final Santa instance = new Santa();
    private Santa() {}

    public static Santa getInstance(){
        return instance;
    }

    public void chooseToy(){
        System.out.println("Choose ONE if you need (Doll) or TWO if you need (bicycle):");
    }
}
