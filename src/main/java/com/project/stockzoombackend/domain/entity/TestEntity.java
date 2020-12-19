package com.project.stockzoombackend.domain.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
@Builder
@AllArgsConstructor
@Entity
@Table(name ="testtable")
public class TestEntity {
    // 필드 정의
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private String ouccupation;
    @Column
    private int height;
    @Column
    private String profile;
    @Column
    private String date;
}