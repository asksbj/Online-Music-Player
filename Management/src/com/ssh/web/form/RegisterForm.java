/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.ssh.web.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 09-15-2016
 * 
 * XDoclet definition:
 * @struts.form name="registerForm"
 */
public class RegisterForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** password1 property */
	private String password1;

	/** password2 property */
	private String password2;

	/** name property */
	private String name;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the password1.
	 * @return String
	 */
	public String getPassword1() {
		return password1;
	}

	/** 
	 * Set the password1.
	 * @param password1 The password1 to set
	 */
	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	/** 
	 * Returns the password2.
	 * @return String
	 */
	public String getPassword2() {
		return password2;
	}

	/** 
	 * Set the password2.
	 * @param password2 The password2 to set
	 */
	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	/** 
	 * Returns the name.
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/** 
	 * Set the name.
	 * @param name The name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}