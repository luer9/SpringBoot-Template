//package com.example.demo.controller;
//
//import com.example.demo.mapper.DepartmentMapper;
//import com.example.demo.pojo.Department;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class DepartmentController {
//
//    @Autowired
//    DepartmentMapper departmentMapper;
//
//
//    //query
//    @GetMapping("/queryLists")
//    public List<Department> queryDpList() {
//        List<Department> departments = departmentMapper.departmentList();
//        return departments;
//    }
//}
