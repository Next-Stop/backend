package org.nextstop.backend.domain.station.repository;

import org.nextstop.backend.domain.station.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StationRepository extends JpaRepository<Station, Long> {
}
