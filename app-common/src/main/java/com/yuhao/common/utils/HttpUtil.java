package com.yuhao.common.utils;

import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpUtil{
	public static String httpRequest(String type, String url, Map<String, String> headers, Map<String, String> params)
			throws Exception {
		HttpClient client = HttpClients.createDefault();
		HttpUriRequest request = null;
		RequestBuilder builder = null;
		switch (type) {
		case "post":
			builder = RequestBuilder.post();
			if (params != null && params.size() > 0) {
				for (String key : params.keySet()) {
					builder.addParameter(new BasicNameValuePair(key, params.get(key)));
				}
			}
			break;
		case "get":
			builder = RequestBuilder.get();
			url += getParams(params);
			break;
		default:
			throw new Exception("暂时不支持该类型请求!");
		}
		builder.setUri(url);
		if (params != null && params.size() > 0) {
			for (String key : params.keySet()) {
				builder.addHeader(new BasicHeader(key, params.get(key)));
			}
		}
		request=builder.build();
		HttpResponse response = client.execute(request);
		String result = EntityUtils.toString(response.getEntity(), "UTF-8");
		return result;
	}

	private static String getParams(Map<String, String> params) {
		String param = "?";
		for (String key : params.keySet()) {
			param += params.get(key) + "&";
		}
		param = param.substring(0, param.length() - 1);
		return param;
	}
}
