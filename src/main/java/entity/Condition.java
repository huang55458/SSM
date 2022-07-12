package entity;

import java.util.List;

/**
 * @author chumeng
 * @date 2022/7/11 17:03
 */
public class Condition {
    private Integer deptno;
    private Double salary;
    private List<Integer> empnos;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Integer> getEmpnos() {
        return empnos;
    }

    public void setEmpnos(List<Integer> empnos) {
        this.empnos = empnos;
    }
}
