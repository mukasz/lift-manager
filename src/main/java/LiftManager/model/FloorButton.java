package LiftManager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class FloorButton {
    private final int floorNumber;
    private ButtonState state;
}
