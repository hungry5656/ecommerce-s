package com.hungry5656.ecommerce_s.userservice.repository.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;


/**
 * @author: Sizhuo Sun
 * @date: 2024-03-28
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"time_created", "time_updated"},
        allowGetters = true
)
@Getter
@Setter
public abstract class BaseDataEntity implements Serializable {
    @CreatedDate
    @Column(name = "TIME_CREATED")
    private Instant TimeCreated;

    @LastModifiedDate
    @Column(name = "TIME_UPDATED")
    private Instant timeUpdated;
}
