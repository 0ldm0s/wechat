package com.cdeledu.model.rbac;

import com.cdeledu.common.base.BaseEntity;

/**
 * @类描述: 功能操作表 实体类
 * @创建者: 独泪了无痕
 * @创建时间: 2016年6月2日 上午10:32:51
 * @版本: V1.0
 * @since: JDK 1.7
 */
public class OperationInfo extends BaseEntity<OperationInfo> {
	private static final long serialVersionUID = 1L;
	// 菜单ID
	private String functionid;
	// 操作名称
	private String opName;
	// 操作编码
	private String opEncode;
	// 操作图标
	private String opIcon;
	// 拦截URL前缀
	private String intercept;

	public String getFunctionid() {
		return functionid;
	}

	public void setFunctionid(String functionid) {
		this.functionid = functionid;
	}

	public String getOpName() {
		return opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public String getOpEncode() {
		return opEncode;
	}

	public void setOpEncode(String opEncode) {
		this.opEncode = opEncode;
	}

	public String getOpIcon() {
		return opIcon;
	}

	public void setOpIcon(String opIcon) {
		this.opIcon = opIcon;
	}

	public String getIntercept() {
		return intercept;
	}

	public void setIntercept(String intercept) {
		this.intercept = intercept;
	}
}
