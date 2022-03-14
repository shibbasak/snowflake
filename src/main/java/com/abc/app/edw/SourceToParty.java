package com.abc.app.edw;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOURCE_TO_PARTY")
@Getter
@Setter
public class SourceToParty {
    @Id
    @Column(name = "SOURCE_CUSTOMER_ID")
    private Long sourceCustomerId;

    @Column(name = "GLOBAL_CUSTOMER_ID")
    private String globalCustomerId;

    @Column(name = "PARTY_ID")
    private String partyId;

}