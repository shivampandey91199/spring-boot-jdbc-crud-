package com.user;

public class Response<T> {

	T data;
	int status;
	String msg;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static <T> Response<T> getData(T data, String msg, int status) {
		Response<T> r = new Response<>();
		r.setData(data);
		r.setMsg(msg);
		r.setStatus(status);
		return r;
	}
}
