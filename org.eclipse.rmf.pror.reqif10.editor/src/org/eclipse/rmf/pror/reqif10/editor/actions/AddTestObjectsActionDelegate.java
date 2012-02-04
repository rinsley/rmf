/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.pror.reqif10.editor.actions;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.rmf.pror.reqif10.editor.presentation.SpecificationEditor;
import org.eclipse.rmf.reqif10.Reqif10Factory;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.util.Reqif10Util;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * @author jastram
 *
 */
public class AddTestObjectsActionDelegate implements IEditorActionDelegate,
		IWorkbenchWindowActionDelegate {

	private IStructuredSelection selection;
	private IEditorPart editor;
	private IWorkbenchWindow window;

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {
		if (selection.size() != 1)
			return;
		if (!(selection.getFirstElement() instanceof SpecHierarchy))
			return;
		SpecHierarchy specHierarchy = (SpecHierarchy) selection
				.getFirstElement();
		if (specHierarchy.getObject() == null)
			return;
		SpecType type = specHierarchy.getObject().getType();
		if (type == null)
			return;
		if (!(editor instanceof SpecificationEditor))
			return;
		SpecificationEditor specificationEditor = (SpecificationEditor) editor;

		Shell shell = window != null ? window.getShell() : editor.getSite()
				.getShell();
		InputDialog dialog = new InputDialog(
				shell,
				"How many objects to create?",
				"DEBUGGING OBJECT CREATION: This function generates dummy elements, using the currently selected one as the template and origin. NOTE: If you want to add actual value, you need to configure a Plugin to do so (i.e. IdConfiguration)",
				"10", null);
		int status = dialog.open();
		if (status != Dialog.OK) {
			return;
		}
		int count = Integer.parseInt(dialog.getValue());
		
		CompoundCommand cmd = new CompoundCommand("Inserting " + count
				+ " Test objects");
		EditingDomain ed = specificationEditor.getEditingDomain();
		for (int i = 0; i < count; i++) {
			SpecHierarchy newSpecHierarchy = Reqif10Factory.eINSTANCE
					.createSpecHierarchy();
			SpecObject newSpecObject = Reqif10Factory.eINSTANCE
					.createSpecObject();
			cmd.append(AddCommand.create(ed, Reqif10Util
					.getReqIf(specHierarchy).getCoreContent(),
					Reqif10Package.Literals.REQ_IF_CONTENT__SPEC_OBJECTS,
					newSpecObject));
			cmd.append(SetCommand.create(ed, newSpecHierarchy,
					Reqif10Package.Literals.SPEC_HIERARCHY__OBJECT,
					newSpecObject));
			cmd.append(SetCommand.create(ed, newSpecObject,
					Reqif10Package.Literals.SPEC_OBJECT__TYPE, type));
			cmd.append(AddCommand.create(ed, specHierarchy,
					Reqif10Package.Literals.SPEC_HIERARCHY__CHILDREN,
					newSpecHierarchy));
		}
		ed.getCommandStack().execute(cmd);

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#dispose()
	 */
	@Override
	public void dispose() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#init(org.eclipse.ui.IWorkbenchWindow)
	 */
	@Override
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorActionDelegate#setActiveEditor(org.eclipse.jface.action.IAction, org.eclipse.ui.IEditorPart)
	 */
	@Override
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		this.editor = targetEditor;
	}

}