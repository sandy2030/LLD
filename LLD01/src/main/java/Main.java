import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args)
    {
        VehicleDetail v1=new VehicleDetail("TS01",VehicleType.TWOWHEELER);
        VehicleDetail v2=new VehicleDetail("TS02",VehicleType.FOURWHEELER);
        Customer c1=new Customer(v1,"c1@gmail.com","123456", LocalDateTime.now().minusHours(6),LocalDateTime.now().plusHours(3));
        Customer c2=new Customer(v1,"c2@gmail.com","123987", LocalDateTime.now().minusHours(2),LocalDateTime.now().plusHours(9));
        ParkingSlot ps1=new ParkingSlot("X01",true);
        ParkingSlot ps2=new ParkingSlot("X02",true);
        Ticket t1=new Ticket(c1,ps1);
        Ticket t2=new Ticket(c2,ps2);

        System.out.println(t1.getBillAmount());
    }

    private static void allocateSlotToVehicle(){

    }
}
