package org.nextstop.backend.domain.station.repository;

import org.nextstop.backend.domain.station.entity.StationLine;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StationLineRepository extends JpaRepository<StationLine, Long> {
}
