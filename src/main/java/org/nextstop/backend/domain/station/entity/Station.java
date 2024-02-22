package org.nextstop.backend.domain.station.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import lombok.Getter;


@Entity
@Getter
public class Station {

    @Id
    @Column(name = "station_id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false, precision = 21, scale = 18)
    private BigDecimal latitude;

    @Column(nullable = false, precision = 21, scale = 18)
    private BigDecimal longitude;

}
