package org.nextstop.backend.domain.exit.repository;

import org.nextstop.backend.domain.exit.entity.Exit;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExitRepository extends JpaRepository<Exit, Long> {
}
