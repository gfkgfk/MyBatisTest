package com.test.maybatis.guide.dao;

import com.test.maybatis.guide.bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    public Long addEmp(Employee employee);

    public Employee getEmpById(Integer id);

    public Long updateEmp(Employee employee);

    public Long deleteEmpById(Integer id);

    public List<Employee> getEmpLikeLastName(String lastName);

    public List<Employee> getEmpsOrderByIdDesc();

    public List<Employee> getEmpsByPage(RowBounds rowBounds);

    public Long updateTime(Employee employee);

    public Long addList(List<String> list);

    public Map<String, Object> getAllEmps();

    @MapKey("id")//键是每个员工的id，值是所查询出的对象
    public Map<String, Employee> getAllEmpsList();

    public Employee getEmpByIdWithDep();

    public Employee getEmpByIdWithDep2();

    public Employee getEmpByIdWithDep3();

    public Employee getEmpByDepId(int depId);

    public Employee getDepWithGirl(int id);

    public Map<String, Object> getSqlTag(int id);

    public List<Employee> getSqlTag2();

    public List<Employee> getDynamicSql(int id);

    public List<Employee> getDynamicSql2(Employee employee);

    public Long updateDynamicSql3(Employee employee);

    public List<Employee> getDynamicSqlTrim(Employee employee);

    public Long updateDynamicSqlTrim(Employee employee);

    public List<Employee> getDynamicSqlChoose(Employee employee);

    public List<Employee> getDynamicSqlForeach(Map params);

    public List<Employee> getDynamicSqlBind(Employee employee);

    public List<Employee> getDynamicSqlInnerParams(Employee employee);




}