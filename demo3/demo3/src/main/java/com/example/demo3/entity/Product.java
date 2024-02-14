package com.example.demo3.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "name",nullable = false)
    private String name ;
    @Column(name = "prix")
    private int prix;
    public Product(){

    }
    public Product( String name,Integer prix){
      super();
        this.name = name;
        this.prix = prix;

    }



    public Long getId() {
        return id;
    }

    public int getPrix() {
        return prix;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getName() {
        return name;
    }
}

