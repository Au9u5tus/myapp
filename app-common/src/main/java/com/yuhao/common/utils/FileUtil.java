package com.yuhao.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileUtil {
	public static String readFile(String file,String key) throws IOException{
		Properties p=new Properties();
		InputStream is=ClassLoader.getSystemResourceAsStream(file);
		p.load(is);
		String value=p.getProperty(key);
		is.close();
		return value;
	}
}
