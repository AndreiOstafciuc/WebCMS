package com.cms.apps.pageManagerApp;

import com.cms.utility.JspPathConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by andre on 03/03/17.
 */
@Controller
@RequestMapping("/web")
public class PageController {

    @RequestMapping("/{group}/{pageName}")
    public ModelAndView getPage(@PathVariable("group") String group  , @PathVariable("pageName")  String pageName ) {
        return new ModelAndView(JspPathConstants.PAGE_DISPATCHER, "pageName", "/"+group+"/" + pageName);
    }

}

