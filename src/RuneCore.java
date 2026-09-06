public class RuneCore {
    private String powerSource;

    public RuneCore(String powerSource){
        this.powerSource = powerSource;
    }

    public String getPowerSource(){
        return powerSource;
    }
    public void setPowerSource(String powerSource){
        this.powerSource = powerSource;
    }
    public String toString(){
        return powerSource;
    }

}
