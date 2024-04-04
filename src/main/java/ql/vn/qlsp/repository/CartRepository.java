package ql.vn.qlsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ql.vn.qlsp.entity.CartEntity;

public interface CartRepository extends JpaRepository<CartEntity,Integer> {
}
