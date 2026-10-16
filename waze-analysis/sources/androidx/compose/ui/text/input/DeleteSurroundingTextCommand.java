package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DeleteSurroundingTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextCommand(int i2, int i3) {
        this.lengthBeforeCursor = i2;
        this.lengthAfterCursor = i3;
        if (i2 < 0 || i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i3 + " respectively.");
        }
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int selectionEnd$ui_text = editingBuffer.getSelectionEnd$ui_text();
        int i2 = this.lengthAfterCursor;
        int length$ui_text = selectionEnd$ui_text + i2;
        if (((selectionEnd$ui_text ^ length$ui_text) & (i2 ^ length$ui_text)) < 0) {
            length$ui_text = editingBuffer.getLength$ui_text();
        }
        editingBuffer.delete$ui_text(editingBuffer.getSelectionEnd$ui_text(), Math.min(length$ui_text, editingBuffer.getLength$ui_text()));
        int selectionStart$ui_text = editingBuffer.getSelectionStart$ui_text();
        int i3 = this.lengthBeforeCursor;
        int i4 = selectionStart$ui_text - i3;
        if (((i3 ^ selectionStart$ui_text) & (selectionStart$ui_text ^ i4)) < 0) {
            i4 = 0;
        }
        editingBuffer.delete$ui_text(Math.max(0, i4), editingBuffer.getSelectionStart$ui_text());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        DeleteSurroundingTextCommand deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) obj;
        return this.lengthBeforeCursor == deleteSurroundingTextCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextCommand.lengthAfterCursor;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
