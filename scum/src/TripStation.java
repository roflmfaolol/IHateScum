import java.time.LocalDateTime;
import java.util.EventListener;

public class TripStation {
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;
    private Trip trip;
    private Station station;

    public TripStation(Trip trip, Station station, LocalDateTime arrivalTime, LocalDateTime departureTime) {
        setTrip(trip);
        setStation(station);
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public void setTrip(Trip newTrip) {
        if(trip != null) {
            trip.removeTripStation(this);
        }
        else if(trip==null ? newTrip!=null : newTrip.equals(trip)) {
            trip = newTrip;
            newTrip.addTripStation(this);
        }
    }
    public void setStation(Station newStation) {
        if(station != null) {
            station.removeTripStation(this);
        }
        else if(station==null ? newStation!=null : newStation.equals(station)) {
            station = newStation;

            newStation.addTripStation(this);
        }
    }
    @Override
    public String toString() {
        return String.format("Station: '%s', arrival time: %s, departure time: %s, total trip duration: %s",
                station.getName(),
                arrivalTime,
                departureTime,
                trip.getDuration()) + "\n";
    }
}
