package androidx.compose.ui.text.input;

import androidx.compose.ui.text.CharHelpers_androidKt;
import h.g.b.ar;
import h.g.b.m;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BackspaceCommand implements EditCommand {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition$ui_text()) {
            editingBuffer.delete$ui_text(editingBuffer.getCompositionStart$ui_text(), editingBuffer.getCompositionEnd$ui_text());
            return;
        }
        if (editingBuffer.getCursor$ui_text() != -1) {
            if (editingBuffer.getCursor$ui_text() == 0) {
                return;
            }
            editingBuffer.delete$ui_text(CharHelpers_androidKt.findPrecedingBreak(editingBuffer.toString(), editingBuffer.getCursor$ui_text()), editingBuffer.getCursor$ui_text());
        } else {
            int selectionStart$ui_text = editingBuffer.getSelectionStart$ui_text();
            int selectionEnd$ui_text = editingBuffer.getSelectionEnd$ui_text();
            editingBuffer.setCursor$ui_text(editingBuffer.getSelectionStart$ui_text());
            editingBuffer.delete$ui_text(selectionStart$ui_text, selectionEnd$ui_text);
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof BackspaceCommand;
    }

    public int hashCode() {
        int i2 = ar.f48106a;
        return new m(getClass()).hashCode();
    }

    public String toString() {
        return "BackspaceCommand()";
    }
}
