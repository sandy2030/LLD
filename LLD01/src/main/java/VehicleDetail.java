import lombok.Data;

@Data
public class VehicleDetail {
    public VehicleDetail(String vehicleNumber, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
private String vehicleNumber;
private VehicleType    vehicleType;
}
