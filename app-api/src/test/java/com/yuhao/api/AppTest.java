package com.yuhao.api;

import java.io.IOException;

import org.junit.Test;

import com.yuhao.api.baidu.Token;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
    public void Test() throws IOException {
		Token.getToken();
    }
}
