import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Departement dep1 = new Departement(1, "Informatique", 10);
        Departement dep2 = new Departement(2, "Ressources humaines", 20);
        Departement dep3 = new Departement(3, "Marketing", 30);
        Departement dep4 = new Departement(4, "Juridique", 40);


        DepartementHashSet departementHashSet = new DepartementHashSet();

        departementHashSet.ajouterDepartement(dep1);
        departementHashSet.ajouterDepartement(dep2);
        departementHashSet.ajouterDepartement(dep3);
        departementHashSet.ajouterDepartement(dep4);

        System.out.println("Liste des departements: ");
        departementHashSet.displayDepartement();

        System.out.println("Département avec is=2 existe? : " + departementHashSet.rechercherDepartement(dep2));

        departementHashSet.supprimerDepartement(dep2);

        System.out.println("Liste des departements restantes: ");
        departementHashSet.displayDepartement();

        System.out.println("Tri des departements: ");
        TreeSet<Departement> sortedDepartements = departementHashSet.trierDepartementById();
        System.out.println(sortedDepartements);
    }
}
