package webprj;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
// 컨트롤러 파일
public class indexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("index");
		// 모델을 "data"에 넣어서 index.jsp에 있는 {data} 자리에 쏙
		mv.addObject("data", "Hello Spring MVC~");
//		mv.setViewName("/WEB-INF/view/index.jsp"); // template호출
		return mv;
	}

}
