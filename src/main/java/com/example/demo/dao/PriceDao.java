package com.example.demo.dao;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "acution")
@Setter
@Getter
public class PriceDao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String price;
}
