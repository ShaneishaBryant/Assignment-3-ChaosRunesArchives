public class ChaosRune {
    int id;
    String name;
    RuneElement element;
    double energyLevel;

    ChaosRune(String name, double energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
    }


    public String toString() {
        return this.name; // Returns the actual name instead of the memory hash
    }

    public double getEnergyLevel() {
        return energyLevel;
    }
}