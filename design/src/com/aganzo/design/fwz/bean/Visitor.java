/**
 * 
 */
package com.aganzo.design.fwz.bean;

/**
 * @author chenming
 *
 */
public abstract class Visitor {

	public abstract void visitConcreteElementA(ConcreteElementA cea);
	public abstract void visitConcreteElementB(ConcreteElementB ceb);
	
}
