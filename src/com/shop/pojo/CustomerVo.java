package com.shop.pojo;

public class CustomerVo {

    private Product  product;
    private User  user;

    @Override
    public String toString() {
        return "CustomerVo{" +
                "product=" + product +
                ", user=" + user +
                '}';
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
