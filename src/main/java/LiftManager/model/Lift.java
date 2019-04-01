package LiftManager.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Lift {
    private final int florCount;
    private final int maxWeight;

    private int id;
    private int currentFlor;
    private int currentWeight;
    private List<FloorButton> floorButtons;
    private LiftState state;
    private int nextFlor;

    public boolean isStatnding() {
        return state == LiftState.STANDING;
    }
}
