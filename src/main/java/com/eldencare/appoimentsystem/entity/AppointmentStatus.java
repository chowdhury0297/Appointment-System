package com.eldencare.appoimentsystem.entity;

public enum AppointmentStatus {
    REQUESTED,   // Patient requested an appointment
    BOOKED,      // Confirmed by doctor/system
    COMPLETED,   // Appointment took place successfully
    CANCELLED,   // Cancelled by patient or doctor
    PENDING,     // Waiting for approval/confirmation
    DECLINED     // Doctor rejected request

}
