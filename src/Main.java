public class Main {
    public static void main(String[] args) {
        try {
            //String eingabe = "21 Jahre";
            int i = 17 / 0; //Integer.parseInt(eingabe);
            System.out.println(i);
        }
        catch (ArithmeticException e) {
            // was soll ich tun, wenn ein Fehler aufgetreten ist?
            System.err.println("Habs gefangen :)");
            System.err.println( e.getMessage() );
            e.printStackTrace();
        }
        System.out.println("Puh, aber jetzt sind wir durch");
    }
}
