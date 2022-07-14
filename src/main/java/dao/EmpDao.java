package dao;

import entity.Condition;
import entity.Emp;
import entity.Param;

import java.util.HashMap;
import java.util.List;

/**
 * @author chumeng
 * @date 2022/7/11 15:06
 */
//@MybatisRepository
public interface EmpDao {
    List<Emp> findAll();

    List<Emp> findByDept(Condition condition);

    List<Emp> findBySalary(Condition condition);

    List<Emp> findByDeptAndSalary(Condition condition);

    List<Emp> findByDeptAndSalary2(Condition condition);

    List<Emp> findByDeptno(Param param);

    List<Emp> findBymgr(Param param);

    List<Emp> findBymgrTwo(Param param);

    List<HashMap<String, Object>> findBySal();

    List<Emp> test();

    void update(Emp emp);

    void save(Emp emp);

    Emp findByIdReorm(int id);

    List<Emp> findByIdResultOrm(int id);


}
