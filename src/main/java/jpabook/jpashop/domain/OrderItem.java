package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class OrderItem {

    @Id @GeneratedValue
    @Column(name="ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="ORDER_ID")
    private Order order;

    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    private Item item;

    private int orderPrice;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    private int count;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

//    @Column(name="ORDER_ID")
//    private Long orderId;
//
//    @Column(name="ITEM_ID")
//    private Long itemID;

//   public Long getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(Long orderId) {
//        this.orderId = orderId;
//    }
//
//    public Long getItemID() {
//        return itemID;
//    }
//
//    public void setItemID(Long itemID) {
//        this.itemID = itemID;
//    }