import lombok.Data;

import java.time.Duration;
import java.time.LocalDateTime;

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

}
