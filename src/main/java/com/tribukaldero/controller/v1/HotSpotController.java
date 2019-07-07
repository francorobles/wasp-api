package com.tribukaldero.controller.v1;


import com.tribukaldero.model.hotspot.HotSpot;
import com.tribukaldero.service.HotSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1/hotspot")
public class HotSpotController {

    @Autowired
    private HotSpotService hotSpotService;

    @GetMapping(value = "/hotspots")
    public @ResponseBody List<HotSpot> hotSpots() {
        return hotSpotService.listAll();
    }


}
