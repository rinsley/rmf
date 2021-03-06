/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Lukas Ladenberger - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.provider;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ DatatypeDefinitionBooleanTest.class,
		DatatypeDefinitionDateTest.class,
		DatatypeDefinitionEnumerationTest.class,
		DatatypeDefinitionIntegerTest.class, DatatypeDefinitionRealTest.class,
		DatatypeDefinitionStringTest.class, DatatypeDefinitionXhtmlTest.class })
public class AllItemProviderDatatypeDefinitionTests {

}
