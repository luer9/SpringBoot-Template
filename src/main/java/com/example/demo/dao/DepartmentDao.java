package com.example.demo.dao;

import com.example.demo.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {

    // 模拟数据库中的数据
    private static Map<Integer, Department> departments = null;

    static {
        departments = new HashMap<>();
        departments.put(101, new Department(101, "管理部"));
        departments.put(102, new Department(102, "管理部1"));
        departments.put(103, new Department(103, "管理部2"));
        departments.put(104, new Department(104, "管理部3"));
        departments.put(105, new Department(105, "管理部4"));
    }
    // 获得所有的部门信息
    public Collection<Department> getDepartments() {
        return departments.values();
    }

    // 通过id得到部门
    public Department getDepartmentById(Integer id) {
        return departments.get(id);
    }

}
