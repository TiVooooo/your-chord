//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(
        name = "Orders"
)
public class Order {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long orderId;
    @Column(
            name = "Price"
    )
    private Double price;
    @Column(
            name = "Date"
    )
    private LocalDateTime createdAt;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(
            name = "userOrder"
    )
    private User userOrder;
    @OneToMany(
            mappedBy = "orderBeat"
    )
    @JsonIgnore
    @JsonInclude(Include.NON_NULL)
    private List<Beat> beats = new ArrayList();

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }

    public Order() {
    }

    public void setOrderId(final Long orderId) {
        this.orderId = orderId;
    }

    public void setPrice(final Double price) {
        this.price = price;
    }

    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @JsonIgnore
    public void setUserOrder(final User userOrder) {
        this.userOrder = userOrder;
    }

    @JsonIgnore
    public void setBeats(final List<Beat> beats) {
        this.beats = beats;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public Double getPrice() {
        return this.price;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public User getUserOrder() {
        return this.userOrder;
    }

    public List<Beat> getBeats() {
        return this.beats;
    }
}
