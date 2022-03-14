package com.abc.app.edw;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SourceToPartyRepository extends CrudRepository<SourceToParty, Long> {

    @Query(value = "SELECT SOURCE_CUSTOMER_ID as \"source_customer_id\", GLOBAL_CUSTOMER_ID as \"global_customer_id\", PARTY_ID as \"party_id\" FROM SOURCE_TO_PARTY WHERE STUDENT_ID = ?", nativeQuery = true)
    SourceToParty findStudentById(Long studentId);
    
    @Query(value = "SELECT SOURCE_CUSTOMER_ID as \"source_customer_id\", GLOBAL_CUSTOMER_ID as \"global_customer_id\", PARTY_ID as \"party_id\" FROM SOURCE_TO_PARTY", nativeQuery = true)
    List<SourceToParty> findAll();

}