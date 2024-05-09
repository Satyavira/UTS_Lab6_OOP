package UTS.soal4;

public class RelativisticKineticEnergy {
    double mass;
    double velocity;
    final double c = 299792458;
    RelativisticKineticEnergy(double mass, double velocity) {
        this.mass = mass;
        this.velocity = velocity;
    }
    RelativisticKineticEnergy(double velocity) {
        this.mass = 1;
        this.velocity = velocity;
    }
    public double calculateRelativisticKineticEnergy() {
        if (velocity >= c) {
            throw new IllegalArgumentException("Velocity must be less than the speed of light.");
        }

        return mass * c * c * (1 / Math.sqrt(1 - ((velocity * velocity) / (c * c))) - 1);
    }
}
