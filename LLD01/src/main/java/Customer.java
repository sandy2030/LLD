import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
class Customer{
private VehicleDetail vehicleDetail;
private String customerEmail;
private String customerMobile;
private LocalDateTime entryTime;
private LocalDateTime exitTime;
}