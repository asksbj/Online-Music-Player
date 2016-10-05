/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.ssh.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ssh.domain.Users;
import com.ssh.interfaces.UserServiceInterface;
import com.ssh.web.form.RegisterForm;

/** 
 * MyEclipse Struts
 * Creation date: 09-15-2016
 * 
 * XDoclet definition:
 * @struts.action path="/register" name="registerForm" scope="request" validate="true"
 */
public class RegisterAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		RegisterForm registerForm = (RegisterForm) form;
		if(!registerForm.getPassword1().equals(registerForm.getPassword2())){
			return mapping.findForward("ERR");
		}
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServlet().getServletContext());
		UserServiceInterface usi = (UserServiceInterface)ctx.getBean("userservice1");
		Users user = new Users();
		user.setUsername(registerForm.getName());
		user.setPassword(registerForm.getPassword1());
		usi.addUser(user);
		return mapping.findForward("OK");
	}
}