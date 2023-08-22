import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Station {
    private String name;
    private List<TripStation> tripStations = new ArrayList<TripStation>();

    public Station(String name) {
        this.name = name;
    }

    public void addTripStation(TripStation newTripStation) {
        if(!tripStations.contains(newTripStation)) {
            tripStations.add(newTripStation);

            newTripStation.setStation(this);
        }
    }
    public void removeTripStation(TripStation tripStation) {
        tripStations.remove(tripStation);
    }
    public String getName() {
        return name;
    }
}
