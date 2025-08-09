import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
class ParkingSlot{
private String parkingSlotNumber; // id
private boolean  isSlotAvailable;
}