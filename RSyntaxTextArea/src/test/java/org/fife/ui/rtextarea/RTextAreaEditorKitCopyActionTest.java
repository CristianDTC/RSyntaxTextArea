/*
 * This library is distributed under a modified BSD license.  See the included
 * LICENSE file for details.
 */
package org.fife.ui.rtextarea;

import org.junit.Assert;
import org.junit.Test;


/**
 * Unit tests for the {@link RTextAreaEditorKit.CopyAction} class.
 *
 * @author Robert Futrell
 * @version 1.0
 */
public class RTextAreaEditorKitCopyActionTest {


	@Test
	public void testConstructor_multiArg() {
		RTextAreaEditorKit.CopyAction action = new RTextAreaEditorKit.CopyAction(
			"copy", null, "Description", 0, null);
		Assert.assertEquals("copy", action.getName());
		Assert.assertEquals("Description", action.getDescription());
	}


	@Test
	public void testActionPerformedImpl() {

		RTextArea textArea = new RTextArea("Hello world");
		textArea.setSelectionStart(2);
		textArea.setSelectionEnd(9);

		RTextAreaEditorKit.CopyAction action = new RTextAreaEditorKit.CopyAction();
		action.actionPerformedImpl(null, textArea);

	}


	@Test
	public void testGetMacroID() {
		Assert.assertEquals(RTextAreaEditorKit.copyAction,
			new RTextAreaEditorKit.CopyAction().getMacroID());
	}
}
