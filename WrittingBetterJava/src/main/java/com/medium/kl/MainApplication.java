package com.medium.kl;

import com.medium.kl.covarianttypes.Circle;
import com.medium.kl.covarianttypes.Electronics;
import com.medium.kl.covarianttypes.ShapeDrawer;
import com.medium.kl.covarianttypes.Square;

public class MainApplication {
    public static void main(String[] args) {
        ShapeDrawer.draw(new Square());
        ShapeDrawer.draw(new Circle());

        Electronics originalProduct = new Electronics("Mobile Phone");
        Electronics clonedProduct = originalProduct.customClone();
        System.out.println(clonedProduct.getProduct());

        Object clonedObjectProduct = originalProduct.customClone();
        System.out.println(((Electronics) clonedObjectProduct).getProduct());
    }
}
