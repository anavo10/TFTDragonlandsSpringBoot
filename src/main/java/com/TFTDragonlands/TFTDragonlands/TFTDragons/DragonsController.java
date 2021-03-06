package com.TFTDragonlands.TFTDragonlands.TFTDragons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/dragons")
public class DragonsController {

    private final DragonsService dragonsService;

    @Autowired
    public DragonsController(DragonsService dragonsService) {
        this.dragonsService = dragonsService;
    }

    @GetMapping
    public List<Dragons> getDragons() {
        return dragonsService.getDragons();
    }
}
