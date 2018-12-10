package com.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public abstract class BaseEntity<T> {

    protected T id;

    protected LocalDate dateCreated;

}