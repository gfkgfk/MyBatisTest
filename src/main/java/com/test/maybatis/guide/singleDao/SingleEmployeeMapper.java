package com.test.maybatis.guide.singleDao;

import com.test.maybatis.guide.bean.Employee;

public interface SingleEmployeeMapper {
    public Long addEmp(Employee employee);

    public Employee getEmpById(Integer id);

    public Long updateEmp(Employee employee);

    public Long deleteEmpById(Integer id);
}