package org.ddiachenko.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at")
    @NotNull
    private Timestamp createdAt;

    @Column(name = "client_id")
    @NotNull
    private Long clientId;

    @Column(name = "from_planet_id")
    @NotNull
    @Size(min = 1, max = 10, message = "Incorrect size 'fromPlanetId'")
    private String fromPlanetId;

    @Column(name = "to_planet_id")
    @NotNull
    @Size(min = 1, max = 10, message = "Incorrect size 'toPlanetId'")
    private String toPlanetId;
}