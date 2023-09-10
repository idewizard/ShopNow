package br.com.shopnow.serviceproduct.modals;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(nullable = false, updatable = false, unique = true)
    private Long id;

    @Column(nullable = false, updatable = false, unique = true)
    private Long code;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String longDescription;

    @Column(nullable = false)
    private String shortDescription;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private String seller;

    @Column(nullable = false)
    private String manufacturer;

    @Column
    private String rating;

    @Column
    private List<String> tags;

    @Column
    private String color;

    @Column
    private String material;
}
