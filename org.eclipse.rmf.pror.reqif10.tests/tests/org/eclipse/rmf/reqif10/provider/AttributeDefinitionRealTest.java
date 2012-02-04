/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.provider;

import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.Reqif10Factory;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Attribute Definition Real</b></em>'.
 */
public class AttributeDefinitionRealTest extends AttributeDefinitionSimpleTest {

	/**
	 * Returns the fixture for this Attribute Definition Real test case.
	 */
	@Override
	protected AttributeDefinitionReal getFixture() {
		return (AttributeDefinitionReal)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpAttributeDefinitionRealTest() throws Exception {
		setFixture(Reqif10Factory.eINSTANCE.createAttributeDefinitionReal());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownAttributeDefinitionRealTest() throws Exception {
		setFixture(null);
	}

} //AttributeDefinitionRealTest
