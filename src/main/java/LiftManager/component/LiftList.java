package LiftManager.component;

import LiftManager.model.Lift;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Component
public class LiftList {
    private List<Lift> lifts;

    public Lift getLiftByID(int id) {
        return lifts.stream()
                .filter(lift -> id == lift.getId())
                .findAny()
                .orElseThrow(() ->
                        new RuntimeException(String.format("Lift with id:%s not found", id))
                );
    }
}
