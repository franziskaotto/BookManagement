package exercises.taschenrechner;

/**
 * Methode die 2 Zahlen addiert und das Ergebnis ausgiebt.
 * Methode die 2 Zahlen subtrahiert und das Ergebnis ausgiebt.
 * Methode die eine Zahl durch die andere dividiert und das Ergebnis ausgiebt.
 * Methode die eine Zahl mit einer anderen Multipliziert und das Ergebnis ausgiebt.
 *
 *
 * Erweiterung um eine Memory Funktion.
 */
public class Taschenrechner {

    double memory = 0;



    public Taschenrechner() {
        if(memory != 0) {
            this.memory = 0;
        }
    }

    public Taschenrechner(int memory) {
        this.memory = memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getMemory() {
        return this.memory;
    }


    public void addition(double first, double second) {

        System.out.println(memory);
        memory = first + second;
    }

    public void subtraktion(double first, double second) {
        memory = first - second;
        System.out.println(memory);
    }

    public void division(double first, double second) {
        memory = first / second;
        System.out.println(memory);
    }

    public void multiplikation(double first, double second) {
        memory = first * second;
        System.out.println(memory);
    }

    public void clearMemory() {
        this.memory = 0;
    }
}