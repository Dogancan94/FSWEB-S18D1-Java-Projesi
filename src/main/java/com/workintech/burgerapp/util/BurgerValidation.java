package com.workintech.burgerapp.util;

import com.workintech.burgerapp.entity.Burger;
import com.workintech.burgerapp.exceptions.BurgerException;
import org.springframework.http.HttpStatus;

public class BurgerValidation {

    public static void checkBurgerCredentials(Burger burger){
        System.out.println(burger);
        if(burger.getName() == null || burger.getName().isEmpty() || burger.getPrice() <= 0){
            throw new BurgerException("Burger credentials are not valid", HttpStatus.BAD_REQUEST);
        }
    }

}
