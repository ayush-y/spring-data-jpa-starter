package org.example.springdatajpasetup;

import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Integer id;

    String title;

    Boolean completed;
}
