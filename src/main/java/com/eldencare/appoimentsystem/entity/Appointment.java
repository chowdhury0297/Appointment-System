package com.eldencare.appoimentsystem.entity;

import jakarta.persistence.*;

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

    @Column(nullable = false)
    private UUID patientId;

    @Column(nullable = false)
    private UUID doctorId;

    // Store UTC instants (future-proof, no DST surprises)
    @Column(name = "start_at", nullable = false, columnDefinition = "DATETIME(6)")
    private Instant startAt;

    @Column(name = "end_at", nullable = false, columnDefinition = "DATETIME(6)")
    private Instant endAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AppointmentStatus status;

    @Column(nullable = false, length = 500)
    private String description;
}
