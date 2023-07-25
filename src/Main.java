import java.io.FileReader;

public class Main {

    public static void fieseMethode(int x) {
        if (x < 0) return;
        fieseMethode(x+1);
    }

    public static int irgendeineMethode(int divisor) throws HeyDasGehtNichtException {
        if (divisor == 0)
            throw new HeyDasGehtNichtException();
        int x = 21 / divisor;
        return 3*x;
    }

    public static void main(String[] args) {
        try {
            fieseMethode(25);
            int y = irgendeineMethode(0);
            String eingabe = "21 Jahre";
            int i = Integer.parseInt(eingabe);
            System.out.println(i);
            return; // obwohl return, wird der finally-Block ausgeführt
        }
        catch (NumberFormatException e) {
            System.out.println("Ja, da war was falsch mit dem Text!");
        }
        catch (ArithmeticException e) {
            // was soll ich tun, wenn ein Fehler aufgetreten ist?
            System.err.println("Habs gefangen :)");
            System.err.println( e.getMessage() );
            e.printStackTrace();
        }
        catch (IllegalArgumentException ignored) {}
        catch (Exception e) {
            System.out.println("Das gabs wohl ein Fehler!?");
        }
        // Sollte nicht benutzt werden, da die JavaVM leicht verwirrt ist
//        catch (Error e) {
//            System.out.println("Autsch, das tut echt weh!");
//        }
        finally {
            System.out.println("Was hier steht, wird immer ausgeführt");
            System.out.println("Egal ob Fehler oder kein Fehler!");
        }
        System.out.println("Puh, aber jetzt sind wir durch");
    }
}
