package com.test.controller;

import javax.servlet.ServletContext;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.test.controller.base.ControllerTestBase;

public class JsonControllerJuit extends ControllerTestBase {
	
	@Autowired
    public ServletContext context;

    public  MockMvc mockMvc;
    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.standaloneSetup(context).build();
    }
	
	@Test
    public void getArticleListTest() throws Exception{
        //准备参数
        String  postJson  = "{\"mac\":\"h\",\"dtClient\":\"2015-06-03 13:20:10\"}";
        
        //发送请求
        ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.post("/json/test.do")
                .accept(MediaType.APPLICATION_JSON).param("jsonValue",postJson));
        MvcResult mvcResult = resultActions.andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        System.out.println("=====客户端获得反馈数据:" + result);

        
    }
}
