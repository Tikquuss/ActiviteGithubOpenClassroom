package Activite_OpenClassroomLocal;

/**
 *
 * @author Tikquuss
 * 
 * Un utilisateur est caratérisé par son nom et son prenom qui son tous des chaines de caracteres
 */
public class Utilisateur {
    private String nom;
    private String prenom;
    
    public Utilisateur(String nom , String prenom){
	this.nom = nom;
        this.prenom = prenom;
    }

    public Utilisateur() {}
    
    public String toString(){
        return "Votre nom complet est "+nom+" "+prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    

    public static void main(String[] args){
        Utilisateur u;
        Scanner sc = new Scanner(System.in)
        u = new Utilisateur();
        System.out.println("Entrez votre nom : ");
        u.setNom(sc.nextLine());
        System.out.println("Entrez votre prenom : ");
        u.setPrenom(sc.nextLine());
        System.out.println(u);
    }
}
