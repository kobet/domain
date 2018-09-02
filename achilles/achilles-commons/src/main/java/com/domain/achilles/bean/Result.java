package com.domain.achilles.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> implements Serializable {

	private static final long serialVersionUID = 3997124446365032582L;

	/**
	 * 错误码
	 */
	private Integer code = HttpStatus.OK.value();

	@JsonInclude(JsonInclude.Include.ALWAYS)
	private T data;
	private String msg;
	private Boolean ok = true;

	public Result() {
		super();
	}

	public Result(T data, Boolean ok) {
		this.data = data;
		this.ok = ok;
	}

	public Result(Integer code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public Result(Integer code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public static  Result success(){
		Result successObj = new Result();
		return successObj;
	}

	public static <E> Result<E> success(E data){
		Result result = new Result();
		result.setData(data);
		return result;
	}

	public static Result fail(Integer code, String msg){
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
		result.setOk(false);
		return result;
	}
	public static Result fail(String msg){
		Result result = new Result();
		result.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		result.setMsg(msg);
		result.setOk(false);
		return result;
	}


	
}
