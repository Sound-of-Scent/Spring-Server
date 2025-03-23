package com.scent.perfume.domain.perfume.entity;

import com.scent.perfume.common.entity.BaseEntity;
import com.scent.perfume.exception.custom.InsufficientIngredientException;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ingredients")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Ingredient extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    // TODO type=json
    @Column(columnDefinition = "json")
    private String keywords;

    @Column(nullable = false)
    private Float remainingAmount; // TODO 왜 float?

    @Column(nullable = false)
    private Float maxCapacity;

    @Column(nullable = false)
    private Float lowThreshold;

    @Column(nullable = false)
    private boolean isActive;

    @Column(nullable = false)
    private LocalDateTime lastRefilledAt;

    @OneToMany(mappedBy = "ingredient", cascade = CascadeType.ALL) // TODO orphan remove 는 언제?
    private List<PerfumeIngredient> PerfumesContainedIn = new ArrayList<>();

    public boolean isLow() {
        return remainingAmount < lowThreshold;
    }

    public void refill() {
        remainingAmount = maxCapacity;
        lastRefilledAt = LocalDateTime.now();
    }

    public void decreaseAmount(Float amount) {
        if (this.remainingAmount < amount) {
            throw new InsufficientIngredientException();
        }
        this.remainingAmount -= amount;
    }


}
