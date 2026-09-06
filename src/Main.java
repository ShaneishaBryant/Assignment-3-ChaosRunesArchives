public class Main {

    public static void main(String[] args){

        final int CAPACITY = 5;

        //declare array then create object and assign
        ChaosRune[] record = new ChaosRune[CAPACITY];

        record[0] = new ChaosRune("Opal",56.78);
        record[1] = new ChaosRune("Moonstone", 97.23);
        record[2] = new ChaosRune("Amethyst", 45.23);

        /*why was this returning the memory hash, ask question in class*/
        System.out.println("---The GAFS Chaos Runes Archieve---");
        System.out.println("Record 1: " + record[0]);
        System.out.println("Record 2: " + record[1]);
        System.out.println("Record 3: " + record[2]);
        System.out.println("Record 3: " + record[3]);
        System.out.println("Record 3: " + record[4]);
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

        /*System.out.println("Energy Level --> " + record[0] + " " + truncatedEnergy);
        System.out.println("Energy Level --> " + record[1] + " " + truncatedEnergy);
        System.out.println("Energy Level --> " + record[1] + " " + truncatedEnergy);*/



    }


}
