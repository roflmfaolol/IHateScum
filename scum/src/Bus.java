import java.util.ArrayList;
import java.util.List;

public class Bus {
    private String model;
    private List<Repair> repairs = new ArrayList<>();

    public Bus(String model) {
        this.model = model;
    }

    public void addRepair(Repair newRepair) {
        if(!repairs.contains(newRepair)) {
            repairs.add(newRepair);

            newRepair.setBus(this);
        }
    }
    public void removeRepair(Repair repair) {
        if(repairs.contains(repair)) {
            repairs.remove(repair);
            repair.removeBus();
        }
    }
    public String getModel() throws Exception {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        var info = "Bus: " + model + "\n";

        for(Repair r : repairs) {
            info += "   " + r.getName() + "\n";
        }
        return info;
    }
}
