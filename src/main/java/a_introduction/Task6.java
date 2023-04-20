package a_introduction;

public class Task6 {
    public static void main(String[] args) {
        double alcoholContent = 5.5;
        final String msg = alcoholContent >= 4
                ? "Mocne"
                : "Słabe" ;
        System.out.println(msg);
    }
}