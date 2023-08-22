import java.util.Map;
import java.util.TreeMap;

public class CarPart {
    private Map<String, Invoice> invoices = new TreeMap<>();
    private String name;

    public CarPart(String name) {
        this.name = name;
    }

    public void addInvoice(Invoice newInvoice) {
        if(!invoices.containsKey(newInvoice.getNumber())) {
            invoices.put(newInvoice.getNumber(), newInvoice);

            newInvoice.addCarPart(this);
        }
    }
    public Invoice findInvoice(String number) throws Exception {
        if(!invoices.containsKey(number)) {
            throw new Exception("Cant find the invoice" + number);
        }

        return invoices.get(number);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
