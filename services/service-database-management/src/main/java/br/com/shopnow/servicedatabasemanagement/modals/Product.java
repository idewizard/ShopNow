package br.com.shopnow.servicedatabasemanagement.modals;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

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

    @OneToMany
    @Column(nullable = false)
    private Seller seller;

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
