package ql.vn.qlsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ql.vn.qlsp.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
