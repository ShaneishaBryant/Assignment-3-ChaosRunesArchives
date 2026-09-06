public class Main {

    public static void main(String[] args){

        final int CAPACITY = 5;

        //declare array then create object and assign
        ChaosRune[] record = new ChaosRune[CAPACITY];

        //declaring and instantiate sharedCore//
        RuneCore sharedCore = new RuneCore("Aether Well");

        record[0] = new ChaosRune(1001, "Opal", RuneElement.ARCANE, 56.78, sharedCore);
        record[1] = new ChaosRune(1002, "Amethyst", RuneElement.FIRE, 97.23, sharedCore);
        record[2] = new ChaosRune(1003, "Moonstone", RuneElement.VOID, 45.23, null);

        /*why was this returning the memory hash, ask question in class*/
        System.out.println("---The GAFS Chaos Runes Archive---");
        System.out.println("Record 1: " + record[0]);
        System.out.println("Record 2: " + record[1]);
        System.out.println("Record 3: " + record[2]);
        System.out.println("Record 4: " + record[3]);
        System.out.println("Record 5: " + record[4]);
        System.out.println();

        System.out.println("--High-Precision Energy Level--");

        //for loop to run through the energy levels//
        for (int i = 0; i < record.length; i++){
            if (record[i] != null){
                double myDoubleValue = record[i].getEnergyLevel(); //access object//
                int truncatedEnergy = (int) myDoubleValue;//explicit narrowing - double to int//


                System.out.println("Energy Level for " + record[i] + " = " + truncatedEnergy);
            }else{
                System.out.println("Energy Level " + i + " --> " + "not record");
            }
        }
        System.out.println();

        //testing shared reference - RuneCore and ChaosRune//
        System.out.println("---Shared Power Source---");
        System.out.println("Record 1 Core BEFORE mutation: " + record[0].getCore().getPowerSource());
        System.out.println("Record 2 Core BEFORE mutation: " + record[1].getCore().getPowerSource());


        //mutate//
        record[0].getCore().setPowerSource("Void Rift");
        System.out.println("Record 2 Core AFTER mutation: " + record[1].getCore().getPowerSource());

        System.out.println();

        //for loop to run through the energy levels//
        for (int i = 0; i <record.length; i++){
            int displayIndex = i + 1;

            if (record[i] != null) {
                double myDoubleValue = record[i].getEnergyLevel();
                int truncatedEnergy = (int) myDoubleValue;

                //prevents NullPointerException
                String corePower;
                if (record[i].getCore() != null) {
                    corePower = record[i].getCore().getPowerSource();
                }else {
                    corePower = "Null";
                }

                System.out.println("Rune: " + displayIndex + " --> "
                        + "ID: " + record[i].getId()
                        + " | Name: " + record[i].getName()
                        + " | Element: " + record[i].getElement()
                        + " | Truncated Energy: " + truncatedEnergy
                        + " | Connected Core Power Source: " + corePower);
            }else {
                System.out.println("Slot " + displayIndex + " is empty / phased out."); //null guard
            }
        }

    }


}
