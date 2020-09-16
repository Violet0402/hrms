package com.sumaojin.suzhenping.hrms.service.impl;

import com.sumaojin.suzhenping.hrms.entity.Employee;
import com.sumaojin.suzhenping.hrms.mapper.EmployeeMapper;
import com.sumaojin.suzhenping.hrms.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author SMJ
 * @since 2020-09-16
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
