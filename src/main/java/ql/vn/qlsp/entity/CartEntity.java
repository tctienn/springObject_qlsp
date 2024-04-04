package ql.vn.qlsp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "cart")
@Data
public class CartEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "ngaythem")
    private Date createTime;

    @OneToMany(mappedBy = "cart")
    @JsonIgnore
    private List<CartItemEntity> cariItems;


}
