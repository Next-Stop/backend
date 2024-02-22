package org.nextstop.backend.domain.station.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import org.nextstop.backend.domain.line.entity.Line;

import java.util.List;


@Entity
@Getter
public class StationLine {

    @Id
    @Column(name = "station_line_id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "station_id", nullable = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private Station station;

    @JoinColumn(name = "line_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Line line;

    @Column(nullable = false)
    private String doorDirection;

    @JoinColumn(name = "previous_station_line_id", nullable = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private StationLine previous;

    @OneToMany(mappedBy = "previous", fetch = FetchType.LAZY)
    private List<StationLine> previousStationLines;

    @JoinColumn(name = "next_station_line_id", nullable = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private StationLine next;

    @OneToMany(mappedBy = "next", fetch = FetchType.LAZY)
    private List<StationLine> nextStationLines;
}
