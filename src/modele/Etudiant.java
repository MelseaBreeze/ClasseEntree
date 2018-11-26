package modele;
public class Etudiant
{
    private String nom;
    private String prenom;
    private String specialite;
    private String regime;
 
    public Etudiant()  { }
    public Etudiant(String nom, String prenom, String specialite, String regime)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.regime = regime;
    }
    public String getNom()
    {
        return nom;
    }
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    public String getPrenom()
    {
        return prenom;
    }
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }
    public String getSpecialite()
    {
        return specialite;
    }
    public void setSpecialite(String specialite)
    {
        this.specialite = specialite;
    }
    public String getRegime()
    {
        return regime;
    }
    public void setRegime(String regime)
    {
        this.regime = regime;
    }
}