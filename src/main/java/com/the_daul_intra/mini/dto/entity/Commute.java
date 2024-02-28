package com.the_daul_intra.mini.dto.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "COMMUTE")
public class Commute {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                    // 출퇴근 기록 인덱스

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_PROFILE_ID", referencedColumnName = "ID")
    private EmployeeProfile employeeProfileID;   // 사원 ID

    @Column(name = "ONWORK_TIME", nullable = true)
    private LocalDateTime onWorkTime;     // 츌근 시간

    @Column(name = "ONWORK_LATITUDE", nullable = true)
    private String onWorkLatitude;      // 출근 위도

    @Column(name = "ONWORK_LONGITUDE", nullable = true)
    private String onWorkLongitude;     // 출근 경도

    @Column(name = "ONWORK_IP_ADDRESS", nullable = true)
    private String onWorkIPAddress;     // 출근 IP 주소

    @Enumerated(EnumType.STRING)
    private YesNo onWorkStatus;        // 출근 여부 Y/N

    @Column(name = "OFFWORK_TIME", nullable = true)
    private LocalDateTime offWorkTime;    // 퇴근 시간

    @Column(name = "OFFWORK_LATITUDE", nullable = true)
    private String offWorkLatitude;     // 퇴근 위도

    @Column(name = "OFFWORK_LONGITUDE", nullable = true)
    private String offWorkLongitude;    // 퇴근 경도

    @Column(name = "OFFWORK_IP_ADDRESS", nullable = true)
    private String offWorkIPAddress;     // 퇴근 IP 주소

    @Enumerated(EnumType.STRING)
    private YesNo offWorkStatus;       // 퇴근 여부 Y/N

}