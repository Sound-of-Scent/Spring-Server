package com.scent.perfume.domain.perfume.entity;

import com.scent.perfume.common.entity.BaseEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Production extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "perfume_id", nullable = false)
    private Perfume perfume;

    @Enumerated(EnumType.STRING)
    private ProductionStatus status;

    @Column(nullable = false)
    private LocalDateTime startTime;

    private LocalDateTime endTime;

    public void complete() {
        this.status = ProductionStatus.COMPLETED;
        this.endTime = LocalDateTime.now();
        this.perfume.incrementProductionCount();
    }

    public void setError() {
        this.status = ProductionStatus.ERROR;
        this.endTime = LocalDateTime.now();
    }
}
