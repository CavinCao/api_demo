package com.cavin.springboot.api_demo.controller;

import com.cavin.springboot.api_demo.common.Result;
import com.cavin.springboot.api_demo.common.ResultGenerator;
import com.cavin.springboot.api_demo.model.Employee;
import com.cavin.springboot.api_demo.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/03/29.
*/
@RestController
@RequestMapping("/employee")
@Api(value="/employee", tags="employee接口模块")
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;

    @PostMapping
    @ApiOperation(value="新增employee服务", notes="")
    public Result add(@RequestBody Employee employee) {
        employeeService.save(employee);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value="根据Id删除employee服务", notes="")
    public Result delete(@PathVariable Long id) {
        employeeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    @ApiOperation(value="根据Id修改employee服务", notes="")
    public Result update(@RequestBody Employee employee) {
        employeeService.update(employee);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    @ApiOperation(value="根据Id查询employee服务", notes="")
    public Result detail(@PathVariable Long id) {
        Employee employee = employeeService.findById(id);
        return ResultGenerator.genSuccessResult(employee);
    }

    @GetMapping
    @ApiOperation(value="分页查询employee服务", notes="")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Employee> list = employeeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
