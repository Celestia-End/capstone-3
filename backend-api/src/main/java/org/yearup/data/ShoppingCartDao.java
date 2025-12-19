package org.yearup.data;

import org.yearup.models.Product;
import org.yearup.models.ShoppingCart;
import org.yearup.models.ShoppingCartItem;
import org.yearup.models.User;

public interface ShoppingCartDao
{
    ShoppingCart getByUserId(int userId);
    // add additional method signatures here
    ShoppingCart addShoppingCartItem(ShoppingCartItem item, User user);

    ShoppingCart updateShoppingCartItem(ShoppingCartItem item, User user);

    void clearCart(User user);

    ShoppingCart addShoppingCartItem(Product item, User user);
}
