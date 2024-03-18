package com.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.user.emp;

@Repository
public class empDao {

	@Autowired
	JdbcTemplate stmt;

	public void insertEmp(emp emp) {
		stmt.update("insert into emp(empID,eName,salary)values(?,?,?)", emp.getEmpID(), emp.geteName(),
				emp.getSalary());
	}
	public List<emp> getAllEmp() {
		return stmt.query("select * from emp", new BeanPropertyRowMapper<emp>(emp.class));
	}
	public boolean deleteEmpById(int empID) {
		int i = stmt.update("delete from emp where empid=?", empID);
		if (i == 0) {
			return false;
		} else {
			return true;
		}
	}
	public int updateEmp(emp emp) {
		return stmt.update("update emp set eName=?,salary = ? where empid=? ", emp.geteName(), emp.getSalary(),
				emp.getEmpID());
	}
	public emp getEmpById(int empId) {
		emp emp = null;
		try {
			emp = stmt.queryForObject("select * from emp where empid=?", new Object[] { empId },
					new BeanPropertyRowMapper<emp>(emp.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
}
