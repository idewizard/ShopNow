package br.com.shopnow.serviceproduct.repositories;

import br.com.shopnow.serviceproduct.modals.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
