import java.util.Arrays;
import java.util.List;
import java.util.List;

public class Repository {
    public static List<ParkingSlot> getSlots(){
        // slots format constitute of floor number,type of vehicle,slot number/id
        // 1F001,2T123
        // consider this method is working as a db and  providing the data
        return Arrays.asList(
                ParkingSlot.builder().parkingSlotNumber("1F001").isSlotAvailable(true).build(),
                ParkingSlot.builder().parkingSlotNumber("0F001").isSlotAvailable(false).build(),
                ParkingSlot.builder().parkingSlotNumber("0T011").isSlotAvailable(true).build(),
                ParkingSlot.builder().parkingSlotNumber("1F012").isSlotAvailable(true).build(),
                ParkingSlot.builder().parkingSlotNumber("1F101").isSlotAvailable(true).build(),
                ParkingSlot.builder().parkingSlotNumber("1F110").isSlotAvailable(true).build(),
                ParkingSlot.builder().parkingSlotNumber("1F125").isSlotAvailable(true).build(),
                ParkingSlot.builder().parkingSlotNumber("1T130").isSlotAvailable(true).build(),
                ParkingSlot.builder().parkingSlotNumber("1T135").isSlotAvailable(true).build(),
                ParkingSlot.builder().parkingSlotNumber("1T150").isSlotAvailable(true).build(),
                ParkingSlot.builder().parkingSlotNumber("2T110").isSlotAvailable(true).build(),
                ParkingSlot.builder().parkingSlotNumber("2F120").isSlotAvailable(true).build()
        );
    }
}
