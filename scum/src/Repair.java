import java.time.LocalDateTime;
import java.util.List;

public class Repair {
    private LocalDateTime startDate;
    private LocalDateTime finishDate;
    private String name;
    private Bus bus;

    public Repair(String name, LocalDateTime startDate, LocalDateTime finishDate) {
        this.name = name;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public void setBus(Bus newBus) {
        if(bus != null) {
            bus.removeRepair(this);
        }
        else if(bus==null ? newBus!=null : newBus.equals(bus)) {
            bus = newBus;

            newBus.addRepair(this);
        }
    }
    public void removeBus() {
        if(bus != null) {
            bus.removeRepair(this);
            bus = null;
        }
    }
    public LocalDateTime getStartDate() {
        return startDate;
    }
    public LocalDateTime getFinishDate() {
        return finishDate;
    }
    public String getName() {
        return name;
    }
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setFinishDate(LocalDateTime finishDate) {
        this.finishDate = finishDate;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        var info = "Repair: " + getName();
        try {
            if(this.bus.getModel() != null) {
                info += " assigned to: " + bus.getModel() + "\n";
            }
        } catch (Exception e) {
            info += " doesn't have an assigned bus\n";
        }
        return info;
    }
}
