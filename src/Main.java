public class Main {

    public static void main(String[] args){

        final int CAPACITY = 5;

        //declare array then create object and assign
        ChaosRune[] record = new ChaosRune[CAPACITY];

        record[0] = new ChaosRune("Opal Rune");
        record[1] = new ChaosRune("Moonstone Rune");
        record[2] = new ChaosRune("Amethyst");

        /*why was this returning the memory hash- ask question in class*/
        System.out.println("Record 1: " + record[0]);
        System.out.println("Record 2: " + record[1]);
        System.out.println("Record 3: " + record[2]);
        System.out.println("Record 3: " + record[3]);
        System.out.println("Record 3: " + record[4]);
    }


}
