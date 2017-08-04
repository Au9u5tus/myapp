package com.yuhao.model.api.baidu;

public class TokenRespVo {
	private String access_token;
	private String session_key;
	private String scope;
	private String refresh_token;
	private String session_secret;
	private Integer expires_in;
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getSession_key() {
		return session_key;
	}
	public void setSession_key(String session_key) {
		this.session_key = session_key;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getRefresh_token() {
		return refresh_token;
	}
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	public String getSession_secret() {
		return session_secret;
	}
	public void setSession_secret(String session_secret) {
		this.session_secret = session_secret;
	}
	public Integer getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(Integer expires_in) {
		this.expires_in = expires_in;
	}
	@Override
	public String toString() {
		return "TokenRespVo [access_token=" + access_token + ", session_key=" + session_key + ", scope=" + scope
				+ ", refresh_token=" + refresh_token + ", session_secret=" + session_secret + ", expires_in="
				+ expires_in + "]";
	}
	

}
