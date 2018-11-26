package controleur;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import modele.Etudiant;



public class MainApp extends Application
{
    private Stage primaryStage;
    private BorderPane rootLayout;
 
    // …

private ObservableList<Etudiant> EtudiantDonnee = FXCollections.observableArrayList();
 
/**
* Constructeur
*/
//oscour
public MainApp() {
// Add some sample data
EtudiantDonnee.add(new Etudiant("Armand", "Julien", "SLAM", "Demi pensionnaire"));
EtudiantDonnee.add(new Etudiant("Bernard", "Paul", "SLAM", "Externe"));
EtudiantDonnee.add(new Etudiant("Castets", "Samuel", "SLAM", "Demi pensionnaire"));
EtudiantDonnee.add(new Etudiant("Daniel", "Anne", "SLAM", "Demi pensionnaire"));
EtudiantDonnee.add(new Etudiant("Estier", "Jean", "SLAM", "Interne"));
EtudiantDonnee.add(new Etudiant("Framer", "Sabrina", "SLAM", "Demi pensionnaire"));
EtudiantDonnee.add(new Etudiant("Gregoire", "Corentin", "SLAM", "Demi pensionnaire"));
EtudiantDonnee.add(new Etudiant("Herdin", "Valentine", "SLAM", "Externe"));
EtudiantDonnee.add(new Etudiant("Irles", "Julien", "SLAM", "Demi pensionnaire"));
 
}
 
/**
* Retourne la donnée sous forme d'une observable list d'Etudiant.
*
*/
public ObservableList<Etudiant> getEtudiantDonnee()
{
return EtudiantDonnee;
}
     
   @Override
   public void start(Stage primaryStage)
    {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Coordonnees etudiants SIO");
 
        try
        {
            // Chargement du layout racine à partir du fichier fxml file
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/vue/FenFXML_NoeudRacine.fxml"));
            rootLayout = (BorderPane) loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e)
        {
            // Exception qui intervient si le fichier fxml file n'a pas pu être chargé
            e.printStackTrace();
        }
        affichageCoordonneesSIO();
    }
 
    public Stage getPrimaryStage()
    {
        return primaryStage;
    }
 
    /**
     * Ouvre la scene d'affichage des etudiants.
     */
   

/**

   * Ouvre la scene d'affichage des etudiants.

   */

  public void affichageCoordonneesSIO()
  {
     try
     {
        // Charge le fichier fxml (FenFXML_Coordo) et le place au centre du layout principal
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/vue/FenFXML_Coordo.fxml"));
        AnchorPane overviewPage = (AnchorPane) loader.load();
        rootLayout.setCenter(overviewPage);
       
        // Donne accès au MainApp pour le controleur
        FenFXML_Coordo_Controller controller = loader.getController();
        controller.setMainApp(this);
     }
     catch (IOException e)
     {
        //Exception qui intervient si le fichier fxml n'a pas pu être chargé
        e.printStackTrace();
     }
  }
 
    public static void main(String[] args)
    {
        launch(args);
    }
}