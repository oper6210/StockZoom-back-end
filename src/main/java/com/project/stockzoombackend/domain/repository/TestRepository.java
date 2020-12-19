package com.project.stockzoombackend.domain.repository;

import com.project.stockzoombackend.dto.TestTable;
import com.project.stockzoombackend.domain.entity.TestEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<TestEntity, Long>{
}
