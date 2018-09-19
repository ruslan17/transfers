package com.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class BaseEntity<T> {

    @Id
    @GeneratedValue
    protected T id;

    protected LocalDate dateCreated;

}