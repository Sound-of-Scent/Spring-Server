package com.scent.perfume.domain.perfume.entity;

import com.scent.perfume.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "perfumes")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Perfume extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "TEXT")
    private String imageUrl;

    // TODO type=json
    @Column(columnDefinition = "json")
    private String keywords;

    @Column(nullable = false)
    private Integer productionCount;

    @Column(nullable = false)
    private boolean isActive; // TODO 왜 박싱 없이 원시값?

    @OneToMany(
            mappedBy = "perfume",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<PerfumeIngredient> ingredientList = new ArrayList<>();

    @OneToMany(mappedBy = "perfume") // TODO 왜 cascade 없이?
    private List<Production> productions = new ArrayList<>();

    public void incrementProductionCount() {
        this.productionCount += 1;
    }

}
