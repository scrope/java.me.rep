package com.aganzo.design.gc.bean;

public class DivFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
