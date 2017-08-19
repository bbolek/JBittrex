package jbittrex.model;

public class APIResponse<T> {

	private boolean success;
	private String message;
	public T result;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "APIResponse [success=" + success + ", message=" + message + ", result=" + result.toString() + "]";
	}
}
