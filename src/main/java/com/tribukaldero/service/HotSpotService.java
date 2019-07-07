package com.tribukaldero.service;

import com.tribukaldero.model.hotspot.HotSpot;
import com.tribukaldero.repository.hotspot.HotSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HotSpotService {

    @Autowired
    private HotSpotRepository hotSpotRepository;

    public List<HotSpot> listAll() {
        return hotSpotRepository.findAll();
    }

}
