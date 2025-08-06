package petshop;

//import javax.swing.JFrame;
import controller.login;
import petshop.models.Dog;
import petshop.models.Pet;

/**
 *
 * @author NTA
 */
public class PetShop {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }
}
