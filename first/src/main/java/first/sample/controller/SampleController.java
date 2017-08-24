package first.sample.controller;


import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // 어노테이션 
public class SampleController {
    Logger log = Logger.getLogger(this.getClass()); // Log4j 로그 선언
  
    //어노테이션, 어떤 컨트롤러의 메서드가 호출될지를 value값을 기준으로 결정
    @RequestMapping(value="/sample/openSampleList.do") 
    public ModelAndView openSampleList(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("");
        log.debug("interceptor test"); //컨트롤러가 실행되는지와 log4j의 로거가 동작하는지 보려고 적음
       
        return mv;
    }
}
