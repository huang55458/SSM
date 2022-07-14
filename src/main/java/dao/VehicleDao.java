package dao;

import entity.Vehicle;

import java.util.List;

/**
 * @author chumeng
 * @date 2022/7/13 15:56
 */
//@MybatisRepository
public interface VehicleDao {
    List<Vehicle> findAll();
}
