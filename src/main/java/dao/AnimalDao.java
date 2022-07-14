package dao;

import entity.Animal;

import java.util.List;

/**
 * @author chumeng
 * @date 2022/7/13 19:31
 */
public interface AnimalDao {
    List<Animal> findAll();
}
