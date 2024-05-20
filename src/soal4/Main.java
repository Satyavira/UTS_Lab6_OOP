package soal4;

public class Main {
    public static void main(String[] args) {
    RelativisticKineticEnergy relativisticKineticEnergy = new RelativisticKineticEnergy(10, 1000);
    RelativisticKineticEnergy relativisticKineticEnergy1 = new RelativisticKineticEnergy( 100000);
    RelativisticKineticEnergy relativisticKineticEnergy2 = new RelativisticKineticEnergy( 409792459);
    try {
    double kineticEnergy = relativisticKineticEnergy.calculateRelativisticKineticEnergy();
    double kineticEnergy1 = relativisticKineticEnergy1.calculateRelativisticKineticEnergy();
    double kineticEnergy2 = relativisticKineticEnergy2.calculateRelativisticKineticEnergy(); //Throw error because velocity bigger or equal with speed of light

    System.out.println("The relativistic kinetic energy is: " + kineticEnergy + " joules");
    System.out.println("The relativistic kinetic energy is: " + kineticEnergy1 + " joules");
    System.out.println("The relativistic kinetic energy is: " + kineticEnergy2 + " joules");
    } catch (IllegalArgumentException illegalArgumentException) {
        System.out.println(illegalArgumentException.getMessage());
    }
    }
}
