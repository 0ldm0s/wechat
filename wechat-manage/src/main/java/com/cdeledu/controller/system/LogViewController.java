package com.cdeledu.controller.system;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cdeledu.controller.BaseController;

/**
 * @类描述: 日志处理类
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2016年4月4日 下午5:47:15
 * @版本: V1.0
 * @since: JDK 1.7
 */
@Controller
@RequestMapping("/logController")
public class LogViewController  extends BaseController{
	/** ----------------------------------------------------- Fields start */

	private static final long serialVersionUID = 1L;

	/** ----------------------------------------------------- Fields end */
	/**
	 * @方法:日志列表页面跳转
	 * @创建人:独泪了无痕
	 * @return
	 */
	@RequestMapping(params = "init")
	public ModelAndView log() {
		ModelAndView mv = this.getModelAndView();
		mv.setViewName("system/log/logInit");
		return mv;
	}

	/**
	 * @方法:用户浏览器使用统计图
	 * @创建人:独泪了无痕
	 * @param request
	 * @param response
	 * @param reportType
	 *            : 统计图类型
	 * @return
	 */
	// @RequestMapping(value = "userBroswer")
	@RequestMapping(params = "userBroswer")
	public ModelAndView userBroswer(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "reportType", required = true) String reportType) {
		// request.setAttribute("reportType", reportType);
		ModelAndView mv = this.getModelAndView();
		mv.addObject("reportType", reportType);
		mv.setViewName("system/log/userBroswer/userBroswerInit");
		return mv;
	}
}
