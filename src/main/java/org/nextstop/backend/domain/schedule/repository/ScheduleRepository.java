package org.nextstop.backend.domain.schedule.repository;

import org.nextstop.backend.domain.schedule.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
