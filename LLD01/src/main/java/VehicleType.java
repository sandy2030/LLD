import lombok.Data;
public enum VehicleType {
    TWOWHEELER("twoWheeler",25),
    FOURWHEELER("fourWheeler",80);
    private final String vehicleType;
    private final Integer chargePerHr;

    VehicleType(String vehicleType, Integer chargePerHr) {
        this.vehicleType = vehicleType;
        this.chargePerHr = chargePerHr;
    }
   public String getVehicleType(){
        return vehicleType;
   }
   public Integer getChargePerHr(){
        return chargePerHr;
   }
}
