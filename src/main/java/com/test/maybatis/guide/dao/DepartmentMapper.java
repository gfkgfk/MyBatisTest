package com.test.maybatis.guide.dao;

import com.test.maybatis.guide.bean.Department;

import java.util.List;

public interface DepartmentMapper {
    public Department getDepById(int id);

    public Department getDepByIdWithEmps1(int id);

    public Department getDepByIdWithEmps2(int id);

}
