/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.EnumValue#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getEnumValue()
 * @model extendedMetaData="name='ENUM-VALUE' kind='elementOnly'"
 * @generated
 */
public interface EnumValue extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #isSetProperties()
	 * @see #unsetProperties()
	 * @see #setProperties(EmbeddedValue)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getEnumValue_Properties()
	 * @model containment="true" unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='PROPERTIES' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EmbeddedValue getProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.EnumValue#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #isSetProperties()
	 * @see #unsetProperties()
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(EmbeddedValue value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.EnumValue#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProperties()
	 * @see #getProperties()
	 * @see #setProperties(EmbeddedValue)
	 * @generated
	 */
	void unsetProperties();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.EnumValue#getProperties <em>Properties</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Properties</em>' containment reference is set.
	 * @see #unsetProperties()
	 * @see #getProperties()
	 * @see #setProperties(EmbeddedValue)
	 * @generated
	 */
	boolean isSetProperties();

} // EnumValue
