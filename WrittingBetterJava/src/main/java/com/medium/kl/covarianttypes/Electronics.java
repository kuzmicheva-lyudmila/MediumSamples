package com.medium.kl.covarianttypes;

public class Electronics implements CustomCloneable {

    private final String product;

    public Electronics(String product) {
        this.product = product;
    }

    @Override
    public Electronics customClone() {
        return new Electronics(this.product);
    }

    public String getProduct() {
        return this.product;
    }
}
