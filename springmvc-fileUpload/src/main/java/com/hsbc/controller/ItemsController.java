package com.hsbc.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ItemsController {
	
	@RequestMapping("upload.shtml")
	public void upload(@RequestParam("file") MultipartFile file,HttpServletRequest request,HttpServletResponse response) throws Exception{
		String filename = file.getOriginalFilename();
		//相对路径
		String path = "\\upload\\" + filename;
		String url = request.getSession().getServletContext().getRealPath("")+path;
		file.transferTo(new File(url));
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("url",url );
		response.setContentType("text/html;charset = utf-8");
		response.getWriter().write(jsonObject.toString());
	}
	
}
