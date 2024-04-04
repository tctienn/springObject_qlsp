package ql.vn.qlsp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="product")
@Data
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    private String alias;
    private String name;
    private String mota;

    @Column(name="mota_ngan")
    private String motaNgan;

    @ManyToOne
//    @JsonIgnore
    @JoinColumn(name = "brands",insertable = false, updatable = false)
    private BrandsEntity brandss;
    @Column(name="brands")
    private int brandId;

//    tag liên kết 1 nhiều của nó đặt false để tránh lỗi thuộc tính được ánh sạ nhiều lần mà vẫn lấy được id trong khi không được phép lấy giá trị bị jsonigone
    @ManyToOne
//    @JsonIgnore
    @JoinColumn(name = "tags", insertable = false , updatable = false)
    private TagEntity tags;
//    @Column(name = "tags")
//    private int tagId;

    @ManyToMany
    @JoinTable(
            name = "product_catergory",
            joinColumns = @JoinColumn(name = "id_product"),
            inverseJoinColumns = @JoinColumn(name = "id_catergory")
    )
    private List<CatergoryEntity> catergorys;


    @OneToMany(mappedBy = "productss")
    private List<ImagesEntity> images;

    @ManyToMany
    @JoinTable(name = "product_size", joinColumns = @JoinColumn(name = "id_product"), inverseJoinColumns = @JoinColumn(name = "id_size"))
    List<SizeEntity> sizes;

    private float cost;
    private float gia;
    @Column(name="main_img")
    private String mainImg;
    @Column(name="create_at")
    private Date createAt;
    private int start;
    @Column(name="update_at")
    private Date updateAt;
    private int enable;
    @Column(name="in_stock")
    private int inStock;


    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<CartItemEntity> cartItems;




}
