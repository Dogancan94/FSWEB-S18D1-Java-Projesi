package com.workintech.burgerapp.dao;

import com.workintech.burgerapp.entity.BreadType;
import com.workintech.burgerapp.entity.Burger;

import java.util.List;

public interface BurgerDao {
    Burger save(Burger burger);
    List<Burger> findAll();
    Burger findById(long id);
    Burger update(Burger burger);
    Burger remove(long id);
    List<Burger> findByPrice(int price);
    List<Burger> findByBreadType(BreadType breadType);
    List<Burger> findByContent(String content);
}
