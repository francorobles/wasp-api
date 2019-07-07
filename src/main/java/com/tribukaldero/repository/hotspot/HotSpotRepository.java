package com.tribukaldero.repository.hotspot;

import com.tribukaldero.model.hotspot.HotSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotSpotRepository extends JpaRepository<HotSpot, Integer> {

}
