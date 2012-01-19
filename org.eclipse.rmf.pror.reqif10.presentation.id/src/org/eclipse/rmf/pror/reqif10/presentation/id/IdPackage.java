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

package org.eclipse.rmf.pror.reqif10.presentation.id;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.rmf.pror.reqif10.configuration.ConfigPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.pror.reqif10.presentation.id.IdFactory
 * @model kind="package"
 * @generated
 */
public interface IdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "id";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pror.org/presentation/id";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "id";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdPackage eINSTANCE = org.eclipse.rmf.pror.reqif10.presentation.id.impl.IdPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.pror.reqif10.presentation.id.impl.IdConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.pror.reqif10.presentation.id.impl.IdConfigurationImpl
	 * @see org.eclipse.rmf.pror.reqif10.presentation.id.impl.IdPackageImpl#getIdConfiguration()
	 * @generated
	 */
	int ID_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CONFIGURATION__DATATYPE = ConfigPackage.PROR_PRESENTATION_CONFIGURATION__DATATYPE;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CONFIGURATION__PREFIX = ConfigPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CONFIGURATION__COUNT = ConfigPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CONFIGURATION_FEATURE_COUNT = ConfigPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.pror.reqif10.presentation.id.IdConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.eclipse.rmf.pror.reqif10.presentation.id.IdConfiguration
	 * @generated
	 */
	EClass getIdConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.pror.reqif10.presentation.id.IdConfiguration#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.eclipse.rmf.pror.reqif10.presentation.id.IdConfiguration#getPrefix()
	 * @see #getIdConfiguration()
	 * @generated
	 */
	EAttribute getIdConfiguration_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.pror.reqif10.presentation.id.IdConfiguration#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.eclipse.rmf.pror.reqif10.presentation.id.IdConfiguration#getCount()
	 * @see #getIdConfiguration()
	 * @generated
	 */
	EAttribute getIdConfiguration_Count();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdFactory getIdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.pror.reqif10.presentation.id.impl.IdConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.pror.reqif10.presentation.id.impl.IdConfigurationImpl
		 * @see org.eclipse.rmf.pror.reqif10.presentation.id.impl.IdPackageImpl#getIdConfiguration()
		 * @generated
		 */
		EClass ID_CONFIGURATION = eINSTANCE.getIdConfiguration();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_CONFIGURATION__PREFIX = eINSTANCE.getIdConfiguration_Prefix();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_CONFIGURATION__COUNT = eINSTANCE.getIdConfiguration_Count();

	}

} //IdPackage
