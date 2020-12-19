package com.project.stockzoombackend.dto;

import com.project.stockzoombackend.domain.entity.TestEntity;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestTable {

    private int id;
    private String name;
    private String ouccupation;
    private int height;
    private String profile;
    private String date;

    public TestEntity toEntity() {
        return TestEntity.builder()
                .id(id).name(name).ouccupation(ouccupation).height(height).profile(profile).date(date)
                .build();
    }
}
