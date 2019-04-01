package LiftManager.controller;

import LiftManager.component.LiftList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lift")
public class LiftController {
    @Autowired
    private LiftList lifts;
}
