package com.eldencare.appoimentsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name="appointments")

public class Appointment {


    @Id
    @GeneratedValue(generator = "UUID")
    @org.hibernate.annotations.GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false)
    private UUID id;

    @Getter
    @Setter
    @Column(nullable = false)
    private UUID patientId;

    @Getter
    @Setter
    @Column(nullable = false)
    private UUID doctorId;

    @Getter
    @Setter
    // Store UTC instants (future-proof, no DST surprises)
    @Column(name = "start_at", nullable = false, columnDefinition = "DATETIME(6)")
    private Instant startAt;

    @Getter
    @Setter
    @Column(name = "end_at", nullable = false, columnDefinition = "DATETIME(6)")
    private Instant endAt;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AppointmentStatus status;

    @Getter
    @Setter
    @Column(nullable = false, length = 500)
    private String description;

}
