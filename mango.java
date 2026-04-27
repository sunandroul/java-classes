interface Mango {
    void taste();
    void season();
}
class Winter implements Mango {

    public void taste() {
        System.out.println("Winter Mango Taste: Not available / Preserved mango taste");
    }

    public void season() {
        System.out.println("Winter Season: Mangoes are generally not grown");
    }
}
class Summer implements Mango {

    public void taste() {
        System.out.println("Summer Mango Taste: Sweet and juicy");
    }

    public void season() {
        System.out.println("Summer Season: Mango is widely available");
    }
}
public class MangoDemo {
    public static void main(String[] args) {

        Mango m1 = new Summer();
        Mango m2 = new Winter();

        System.out.println("---- Summer Mango ----");
        m1.taste();
        m1.season();

        System.out.println("\n---- Winter Mango ----");
        m2.taste();
        m2.season();
    }
}
