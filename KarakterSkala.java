
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class KarakterSkala {
    public static void main(String[] args) {
        final int ANT_STUDENTS = 10;
        for (int student = 1; student <= ANT_STUDENTS; student++) {
            String karakterBokstav = "";
            String userPoeng;
            Integer poeng = null;
            do {
                if (karakterBokstav == "" && poeng != null) {
                    if (poeng < 0) {
                        showMessageDialog(null, "Poeng kan ikke være negativ.");
                    }
                    else {
                        showMessageDialog(null, "Poeng kan ikke være over 100.");
                    }
                }
                userPoeng = showInputDialog("Skriv inn poengsum for student " + student + " (0-100): ");
                poeng = Integer.parseInt(userPoeng);
                if (poeng <= 100 && poeng >= 90) {
                    karakterBokstav = "A";
                }
                if (poeng <= 89 && poeng >= 80) {
                    karakterBokstav = "B";
                }
                if (poeng <= 79 && poeng >= 60) {
                    karakterBokstav = "C";
                }
                if (poeng <= 59 && poeng >= 50) {
                    karakterBokstav = "D";
                }
                if (poeng <= 49 && poeng >= 40) {
                    karakterBokstav = "E";
                }
                if (poeng <= 39 && poeng >= 0) {
                    karakterBokstav = "F";
                }
            } while (karakterBokstav == "");
            
            showMessageDialog(null, "Din karakter er: " + karakterBokstav);
        }
    }

}
