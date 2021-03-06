/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.rif12.ExchangeFile.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinition;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValue;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinition;
import org.eclipse.rmf.rif12.ExchangeFile.RelationGroup;
import org.eclipse.rmf.rif12.ExchangeFile.SpecGroup;
import org.eclipse.rmf.rif12.ExchangeFile.SpecGroupHierarchyRoot;
import org.eclipse.rmf.rif12.ExchangeFile.SpecHierarchy;
import org.eclipse.rmf.rif12.ExchangeFile.SpecHierarchyRoot;
import org.eclipse.rmf.rif12.ExchangeFile.SpecObject;
import org.eclipse.rmf.rif12.ExchangeFile.SpecRelation;
import org.eclipse.rmf.rif12.ExchangeFile.SpecType;


/**
 * A sample validator interface for {@link org.eclipse.rmf.rif12.ExchangeFile.AccessPolicy}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AccessPolicyValidator {
	boolean validate();

	boolean validateAccessMode(AccessPolicyAccessModeEnum value);

	boolean validateAccessMode(int value);
	boolean validateSpecGroupHierarchyRoots(EList<SpecGroupHierarchyRoot> value);
	boolean validateSpecGroups(EList<SpecGroup> value);
	boolean validateAttributeDefinitions(EList<AttributeDefinition> value);
	boolean validateRelationGroups(EList<RelationGroup> value);
	boolean validateDatatypeDefinitions(EList<DatatypeDefinition> value);
	boolean validateSpecRelations(EList<SpecRelation> value);
	boolean validateAttributeValues(EList<AttributeValue> value);
	boolean validateSpecTypes(EList<SpecType> value);
	boolean validateSpecHierarchies(EList<SpecHierarchy> value);
	boolean validateSpecObjects(EList<SpecObject> value);
	boolean validateSpecHierarchyRoots(EList<SpecHierarchyRoot> value);
}
