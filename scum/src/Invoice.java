import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private String number;
    private List<CarPart> carParts = new ArrayList<>();

    public Invoice(String number) {
        this.number = number;
    }

    public void addCarPart(CarPart newCarPart) {
        if(!carParts.contains(newCarPart)) {
            carParts.add(newCarPart);

            newCarPart.addInvoice(this);
        }
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    @Override
    public String toString() {
        var info = "Invoice: " + number + "\n";

        for(CarPart carPart : carParts) {
            info += "   " + carPart.getName() + "\n";
        }
        return info;
    }
}
