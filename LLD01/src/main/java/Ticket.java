import lombok.Data;

import java.time.Duration;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
class Ticket{
private Customer customer;
private  ParkingSlot parkingSlot;

    public Ticket(Customer customer, ParkingSlot parkingSlot) {
        this.customer = customer;
        this.parkingSlot = parkingSlot;
    }

    private long billAmount;
private boolean isBillPaid;
// calculate bill amount
    public long getBillAmount(){
        Duration duration=Duration.between(customer.getExitTime(),customer.getEntryTime());
        long hours = Math.abs(duration.toHours());
        Integer chargePerHr = customer.getVehicleDetail().getVehicleType().getChargePerHr();
        return    this.billAmount = chargePerHr * hours;
    }

    public static ParkingSlot getParkingSlot(VehicleType vehicleType){
        List<ParkingSlot> slots = Repository.getSlots();
        // consider the id of entry gate is 0-000
        // to find the nearest available slot last three digits are important and should be considered
        Stream<String> stream = slots.stream().filter(s -> s.isSlotAvailable()).filter(type->type.equals(vehicleType)).map(ParkingSlot::getParkingSlotNumber);
        List<String> list = stream.map(input -> input.substring(0, 1) + input.substring(2, 5)).collect(Collectors.toList());
        System.out.println(list);
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.addAll(list);
        System.out.println(pq.peek());
        return null;
    }

}
