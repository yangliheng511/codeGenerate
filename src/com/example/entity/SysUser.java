package com.example.entity;

import com.base.entity.BaseEntity;


public class SysUser extends BaseEntity {
	
	
	
	private Integer superAdmin;//超级管理员
	
	private String roleStr;//用户权限, 按","区分
	
	
	
		return roleStr;
	}
	public void setRoleStr(String roleStr) {
		this.roleStr = roleStr;
	}
	public Integer getId() {
	public Integer getSuperAdmin() {
		return superAdmin;
	}
	public void setSuperAdmin(Integer superAdmin) {
		this.superAdmin = superAdmin;
	}
}