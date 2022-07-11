package dao;

import annotation.MybatisRepository;
import entity.Emp;

import java.util.List;

/**
 * @author chumeng
 * @date 2022/7/11 15:06
 */
@MybatisRepository
public interface EmpDao {
    List<Emp> findAll();
}
