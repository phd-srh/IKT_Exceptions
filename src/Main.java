public class Main {
    public static void main(String[] args) {
        try {
            String eingabe = "21 Jahre";
            int i = Integer.parseInt(eingabe);
            System.out.println(i);
        }
        finally {
            System.out.println("Was hier passiert wird immer ausgeführt");
            System.out.println("Egal ob Fehler oder kein Fehler!");
        }
        System.out.println("Puh, aber jetzt sind wir durch");
    }
}
