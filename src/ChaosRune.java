public class ChaosRune {
    int id;
    String name;
    RuneElement element;

    public ChaosRune(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name; // Returns the actual name instead of the memory hash
    }
}