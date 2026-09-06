
public class ChaosRune {
    private int id;
    private String name;
    private RuneElement element;
    private double energyLevel;
    private RuneCore core;

    // 2-argument constructor//
    public ChaosRune(String name, double energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
    }
    //3 argument constructor//
    public ChaosRune(String name, double energyLevel, RuneCore core) {
        this.name = name;
        this.energyLevel = energyLevel;
        this.core = core;
    }

    public double getEnergyLevel() { return energyLevel; }
    public RuneCore getCore() { return core; }
    public String toString() { return name; }
}