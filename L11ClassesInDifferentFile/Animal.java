package L11ClassesInDifferentFile;

// Private means: only the class can access
public class Animal {
    private String name;
    private String species;
    private String owner;
    private int months; // cannot be negative, cannot be 0 month
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getMonths() {
        return months;
    }
    public void setMonths(int months) {
        if (months <=0) {
            return;
        }
        this.months = months;
    }

    public double getAgeInYears() {
        return months/12.0;
    }
}