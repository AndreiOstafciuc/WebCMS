package com.cms.rest;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by andre on 03/03/17.
 */

@RestController("pageServiceController")
@RequestMapping("/service/page/")
public class PageRestService {

    @RequestMapping(value = "/{groupId}/{pageName}", method = RequestMethod.PUT,headers="Accept=application/json")
    public @ResponseBody
    String createPage(HttpServletRequest request, @PathVariable int groupId, @PathVariable String pageName) {
        String result="";
        String jspPath=request.getSession().getServletContext().getRealPath("WEB-INF"+ File.separator+"jsp"+File.separator+"pages");
        String newFilePath=jspPath+File.separator+groupId+File.separator+pageName+".jsp";
        File f=new File(newFilePath);
        if(!f.exists()){
            try {
                f.createNewFile();
                if(f.exists()){
                    PrintWriter writer = new PrintWriter(f);
                    writer.println("The first line\n");
                    writer.println("The second line");
                    writer.close();
                    result=newFilePath;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}