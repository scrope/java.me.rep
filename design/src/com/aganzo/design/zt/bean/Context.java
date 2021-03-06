/**
 * 
 */
package com.aganzo.design.zt.bean;

/**
 * @author chenming
 * 
 */
public class Context {

	private State state;

	/**
	 * 定义Context的初始状态
	 * @param state
	 */
	public Context(State state) {
		this.state = state;
	}

	/**
	 * 状态模式中心
	 * 处理请求，并设置下一个状态
	 */
	public void request() {
		state.handle(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
