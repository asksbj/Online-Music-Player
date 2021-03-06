/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.ssh.web.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ssh.domain.Musics;
import com.ssh.domain.Singer;
import com.ssh.interfaces.MusicServiceInterface;
import com.ssh.interfaces.SingerServiceInterface;
import com.ssh.web.form.SingerMusicsForm;

/** 
 * MyEclipse Struts
 * Creation date: 09-22-2016
 * 
 * XDoclet definition:
 * @struts.action path="/singermusics" name="singerMusicsForm" scope="request" validate="true"
 */
public class SingermusicsAction extends Action {
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
		SingerMusicsForm singerMusicsForm = (SingerMusicsForm) form;// TODO Auto-generated method stub
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServlet().getServletContext());
		MusicServiceInterface msi = (MusicServiceInterface)ctx.getBean("musicservice1");
		SingerServiceInterface ssi = (SingerServiceInterface)ctx.getBean("singerservice1");
		Singer singer = ssi.getSinger(Integer.parseInt(singerMusicsForm.getId()));
		List<Musics> list = msi.getMusicbySinger(singer);
		String singerpath = msi.getSingerpath(singer);
		request.setAttribute("musics", list);
		request.setAttribute("path",singerpath);
		return mapping.findForward("OK");
	}
}