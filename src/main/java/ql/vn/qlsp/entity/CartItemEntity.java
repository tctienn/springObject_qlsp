package ql.vn.qlsp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cart_item")
@Data
public class CartItemEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
//    @Column(name = "id_cart")
//    private Integer idCart;
    @ManyToOne
    @JoinColumn(name = "id_cart")
    CartEntity cart;


//    @Column(name = "id_product")
//    private Integer idProduct;
    @ManyToOne
    @JoinColumn(name = "id_product")
    CartEntity product;

    private int quantity;
    private float price;


}
