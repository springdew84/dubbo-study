package com.cassey.ggsddu.ms.consumer.common.data;

public class Result<T> {
    protected String code;
    protected String msg;
    protected T data;

    public static Result SUCCEED = succeed(null);

    public static <S> Result<S> succeed() {
        return SUCCEED;
    }

    public static <S> Result<S> succeed(S data) {
        Result<S> result = new Result<>();
        result.data = data;
        result.code = "0000";
        result.msg = "操作成功";
        return result;
    }

    public static <S> Result<S> succeed(String msg, S data) {
        Result<S> result = new Result<>();
        result.data = data;
        result.code = "0000";
        result.msg = msg;
        return result;
    }

    public static <S> Result<S> fail() {
        Result<S> result = new Result<>();
        result.code = "1000";
        result.msg = "操作失败";
        return result;
    }

    public static <S> Result<S> fail(String msg) {
        Result<S> result = new Result<>();
        result.code = "1000";
        result.msg = "操作失败";
        return result;
    }

    public static <S> Result<S> fail(String code, String msg) {
        Result<S> result = new Result<>();
        result.code = code;
        result.msg = msg;
        return result;
    }

    public static <S> Result<S> fail(String code, String msg, S data) {
        Result<S> result = new Result<>();
        result.msg = msg;
        result.code = code;
        result.data = data;
        return result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
