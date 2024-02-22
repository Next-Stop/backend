package org.nextstop.backend.domain.schedule.entity;

import jakarta.persistence.*;

import java.time.LocalTime;
import lombok.Getter;
import org.nextstop.backend.domain.station.entity.StationLine;
import org.nextstop.backend.domain.subway.entity.Subway;


@Entity
@Getter
public class Schedule {

    @Id
    @Column(name = "schedule_id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "staiton_line_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private StationLine stationLine;

    @JoinColumn(name = "subway_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Subway subway;

    @Column(nullable = false)
    private String dayStatus;

    @Column(nullable = false)
    private LocalTime arriveTime;

    @Column(nullable = false)
    private String direction;

}
