package ql.vn.qlsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ql.vn.qlsp.entity.ProductEntity;

@Repository
public interface ProductRepository  extends JpaRepository<ProductEntity,Integer> {
}
