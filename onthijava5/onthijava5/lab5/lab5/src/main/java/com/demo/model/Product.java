package com.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="Products")
public class Product {
    @Id @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    Integer id;
    String name;
    int price;

    @Temporal(TemporalType.DATE)
    @Column(name="Createdate")
    Date createDate = new Date();

    @ManyToOne @JoinColumn(name="Categoryid")
    Category category;

    // TODO: List<OrderDetail>
}
