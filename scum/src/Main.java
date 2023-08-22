import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) throws Exception {
//        var repair1 = new Repair(
//                "Brake work",
//                LocalDateTime.of(2023, Month.APRIL,20,19,30,.00),
//                LocalDateTime.of(2023, Month.APRIL,27,19,30,00)
//        );
        var repair2 = new Repair(
                "Oil changes",
                LocalDateTime.of(2023, Month.APRIL,20,19,30,00),
                LocalDateTime.of(2023, Month.APRIL,27,19,30,00)
        );
        var repair3 = new Repair(
                "Engine check",
                LocalDateTime.of(2023, Month.APRIL,21,19,30,00),
                LocalDateTime.of(2023, Month.APRIL,28,19,30,00)
        );
        var bus1 = new Bus("24.460 R40");

        //bus1.addRepair(repair1);
        bus1.addRepair(repair2);
        bus1.addRepair(repair3);
        bus1.removeRepair(repair2);

        System.out.println(bus1);
        //System.out.println(repair1);
        System.out.println(repair2);


        var trip1 = new Trip(LocalTime.of(5,30));
        var trip2 = new Trip(LocalTime.of(3,15));
        var station1 = new Station("Warszawa Zachodnia");
        var station2 = new Station("Warszawa Ochota");

        var tripStation1 = new TripStation(
                null,
                station1,
                LocalDateTime.of(2023, Month.APRIL,20,19,30,00),
                LocalDateTime.of(2023, Month.APRIL,20,19,45,00)
        );
trip2.addTripStation(tripStation1);

        System.out.println(tripStation1);

        var carPart1 = new CarPart("Blotnik abc");
        var carPart2 = new CarPart("Engine abc");
        var invoice1 = new Invoice("A-12345");
        var invoice2 = new Invoice("B-23456");
        var invoice3 = new Invoice("C-34567");
        var invoice4 = new Invoice("D-45678");

        carPart1.addInvoice(invoice1);
        carPart1.addInvoice(invoice2);
        carPart1.addInvoice(invoice3);
        carPart2.addInvoice(invoice2);
        carPart2.addInvoice(invoice4);

        System.out.println(invoice1);
        System.out.println(invoice2);
        System.out.println(invoice3);
        System.out.println(invoice4);

        var invoice5 = carPart1.findInvoice("B-23456");
        var invoice6 = carPart2.findInvoice("B-23456");
        System.out.println(invoice5);
        System.out.println(invoice6);

        var vehicle1 = new Vehicle("4Y1SL65848Z411439");
        var vehicle2 = new Vehicle("5S342342342342343");
        vehicle1.addInsurance(vehicle1.createInsurance("QQ123456C"));
        vehicle1.addInsurance(vehicle1.createInsurance("QQ123456C"));
        vehicle2.addInsurance(vehicle2.createInsurance("QQ123456C"));
        System.out.println(vehicle1);
        System.out.println(vehicle2);
    }
}