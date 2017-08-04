package com.yuhao.common;

import com.yuhao.common.utils.FileUtil;





/**
 * Unit test for simple App.
 */
public class AppTest{
	@org.junit.Test
	public void test() throws Exception {
		//Map<String,String>params=new HashMap<String,String>();
		//params.put("grant_type", "client_credentials");
		//params.put("client_id", "Vbv7BLgbB3ss6ZLNb0FaydgZ");
		//params.put("client_secret", "zuIpNNBSUjuWpynX0Y74XqmTEePCCAye");
		//HttpUtil.httpRequest("post","https://aip.baidubce.com/oauth/2.0/token",null,params);
		System.out.println(FileUtil.readFile("api.properties", "baidu.grant_type"));
	}
}
