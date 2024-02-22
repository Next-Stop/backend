package org.nextstop.backend.domain.line.repository;

import org.nextstop.backend.domain.line.entity.Line;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LineRepository extends JpaRepository<Line, Long> {
}
