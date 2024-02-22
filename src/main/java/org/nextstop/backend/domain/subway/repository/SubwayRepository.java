package org.nextstop.backend.domain.subway.repository;

import org.nextstop.backend.domain.subway.entity.Subway;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SubwayRepository extends JpaRepository<Subway, Long> {
}
