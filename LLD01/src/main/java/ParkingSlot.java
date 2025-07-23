import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class ParkingSlot{
private String parkingSlotNumber; // id
private boolean  isSlotAvailable;
}