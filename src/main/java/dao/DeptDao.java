package dao;

import entity.Dept;

import java.util.List;

/**
 * @author chumeng
 * @date 2022/7/12 19:37
 */
public interface DeptDao {
    Dept findByIdReorm(int id);

    List<Dept> findAll();
}
