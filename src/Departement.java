import java.util.Objects;

public class Departement {
    int id;
    String nom;
    int nombreEmployes;

    public Departement() {}

    public Departement(int id, String nom, int nombreEmployes) {
        this.id = id;
        this.nom = nom;
        this.nombreEmployes = nombreEmployes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        return id == ((Departement) obj).id && nom.equals(((Departement) obj).nom);
    }

    @Override
    public String toString() {
        return "id=" + id + ", nom='" + nom + "', nombreEmployes=" + nombreEmployes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }
}
