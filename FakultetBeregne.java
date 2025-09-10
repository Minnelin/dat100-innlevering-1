import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class FakultetBeregne {
    public static void main(String[] args) {
        Integer userNumber = null;
        do {
            if (userNumber != null && userNumber >= 0) {
                showMessageDialog(null, "Tallet må være et positivt heltall");
            }
            String response = showInputDialog("Skriv inn et heltall");
            userNumber = Integer.parseInt(response);
        } while (userNumber < 0);
        Integer sum = userNumber;
        for (int i = 1; i < userNumber; i++) {
            sum = sum * i;
        }
        showMessageDialog(null, "Resultatet av " + userNumber + "! er: "+ sum);
    }
}
