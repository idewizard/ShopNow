package br.com.shopnow.servicedatabasemanagement.repositories;


import br.com.shopnow.servicedatabasemanagement.modals.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
