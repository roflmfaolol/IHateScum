import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Trip {

    private LocalTime duration;
    private List<TripStation> tripStations = new ArrayList<>();

    public Trip(LocalTime duration) {
        this.duration = duration;
    }

    public void addTripStation(TripStation newTripStation) {
        if(!tripStations.contains(newTripStation)) {
            tripStations.add(newTripStation);

            newTripStation.setTrip(this);
        }
    }
    public void removeTripStation(TripStation tripStation) {
        tripStations.remove(tripStation);
    }
    public LocalTime getDuration() {
        return duration;
    }
    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }
}
