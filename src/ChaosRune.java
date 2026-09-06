
public class ChaosRune {
    private int id;
    private String name;
    private RuneElement element;
    private double energyLevel;
    private RuneCore core;

    //All Constructor
    public ChaosRune(int id, String name, RuneElement element, double energyLevel, RuneCore core){
        this.id = id;
        this.name = name;
        this.element = element;
        this.energyLevel = energyLevel;
        this.core = core;
    }

    public int getId() {return id;}
    public String getName() {return name;}
    public RuneElement getElement() {return element;}
    public double getEnergyLevel() { return energyLevel; }
    public RuneCore getCore() { return core; }

    public String toString(){
        return name;
    }

}