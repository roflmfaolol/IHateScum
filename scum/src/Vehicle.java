import java.util.*;

public class Vehicle {
    private String vin;
    private List<Insurance> insurances = new ArrayList<>();
    private static Set<Insurance> allInsurances = new HashSet<>();


    public Vehicle(String vin) {
        this.vin = vin;
    }
    public void addInsurance(Insurance insurance) {
        if(!insurances.stream().anyMatch(ti -> ti.getId() == insurance.getId())) {
            if (!allInsurances.stream().anyMatch(ti -> ti.getId() == insurance.getId())) {
                insurances.add(insurance);
                allInsurances.add(insurance);
            }
            else {
                System.out.println("Insurance " + insurance.getId() + " is already assigned to a vehicle\n");
            }
        }
    }
    @Override
    public String toString() {
        String info = "Vehicle: " + vin + "\n";
        for(Insurance insurance : insurances) {
            info += "   " + insurance.getId() + "\n";
        }
        return info;
    }
    public Insurance createInsurance(String id) {
        Insurance insurance = new Insurance(id);
        return insurance;
    }

    public class Insurance {
        private String id;

        private Insurance(String id) {
            this.id = id;
        }

        public Vehicle getVehicle() {
            return Vehicle.this;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        @Override
        public String toString() {
            return "Insurance id: " + id;
        }
    }
}
