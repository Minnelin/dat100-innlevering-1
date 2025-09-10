import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static javax.swing.JOptionPane.showInputDialog;

// public class InnleveringEn {
//     public static void main(String[] args) {
//         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//         int tax = 0;
//         try {
//             System.out.print("Skriv inn din årsinntekt: ");
//             tax = Integer.parseInt(in.readLine());
//         } catch (IOException e) {
//             System.out.println("Error reading input: " + e.getMessage());
//             return;
//         }
//         int i = tax;
//         if (i < 217000) {
//             System.out.println("ingen trinnskatt");
//         } else if (i <= 306050) {
//             System.out.println("Trinn 1");
//         } else if (i <= 697150) {
//             System.out.println("Trinn 2");
//         } else if (i <= 942400) {
//             System.out.println("Trinn 3");
//         } else if (i <= 1410750) {
//             System.out.println("Trinn 4");
//         } else {
//             System.out.println("Trinn 5");
//         }
//     }
// }


public class InnleveringEn {
    public static void main(String[] args) {
        try {
            String userTax = showInputDialog("Skriv inn din årsinntekt: ");
            int tax = Integer.parseInt(userTax);
            String trinnSkatt;
            int i = tax;
            if (i < 217000) {
                trinnSkatt = "ingen trinnskatt";
            } else if (i <= 306050) {
                trinnSkatt = "Trinn 1";
            } else if (i <= 697150) {
                trinnSkatt = "Trinn 2";
            } else if (i <= 942400) {
                trinnSkatt = "Trinn 3";
            } else if (i <= 1410750) {
                trinnSkatt = "Trinn 4";
            } else {
                trinnSkatt = "Trinn 5";
            }
            System.out.println(trinnSkatt);
        } catch (Exception e) {
            System.out.println("Noe gikk galt med innlesingen.");
            if (e instanceof NumberFormatException)
                System.out.println("Feil: Du må skrive inn et tall.");
            else
                System.out.println("Error: " + e.getMessage());
        }
    }

}
  
    
