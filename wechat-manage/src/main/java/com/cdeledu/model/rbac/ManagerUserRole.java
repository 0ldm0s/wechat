package com.cdeledu.model.rbac;

import com.cdeledu.common.base.BaseEntity;

/**
 * @类描述: 用户角色实体类
 * @创建者: 独泪了无痕
 * @创建时间: 2015-8-22 上午01:20:34
 * @版本: V1.0
 * @since: JDK 1.7
 */
public class ManagerUserRole extends BaseEntity<ManagerUserRole> {
	private static final long serialVersionUID = 1L;
	// 管理员id
	private Integer userId;
	// 角色id
	private Integer roleId;
	// 角色名称
	private String roleName;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
