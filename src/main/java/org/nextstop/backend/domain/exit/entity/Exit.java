package org.nextstop.backend.domain.exit.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.nextstop.backend.domain.station.entity.Station;


@Entity
@Getter
@Table(name = "exits")
public class Exit {
    @Id
    @Column(name = "exits_id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Station station;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long number;

}
