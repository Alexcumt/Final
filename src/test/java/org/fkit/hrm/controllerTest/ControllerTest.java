package org.fkit.hrm.controllerTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class ControllerTest extends BaseJunitTest{
	protected MockMvc mockMvc;
	@Autowired
	protected WebApplicationContext wac;
	
	@Before
	public void SetUp(){
		mockMvc=MockMvcBuilders.webAppContextSetup(wac).build();
	}
	@Test
	public void loginControllertest()throws Exception{

        String  responseString=mockMvc.perform(post("/login")//请求的url,请求的方法是post
				.contentType(MediaType.APPLICATION_FORM_URLENCODED)//数据的格式
				.param("username","徐莹") //添加参数(可以添加多个)
				.param("password","123456"))
				.andExpect(status().isOk())//返回的状态是200
				.andDo(print()) //打印出请求和相应的内容
				.andReturn().getResponse().getContentAsString();//将相应的数据转换为字符串
		System.out.println(responseString);
	}
}
