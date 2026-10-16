package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i2, int i3) {
        this.lengthBeforeCursor = i2;
        this.lengthAfterCursor = i3;
        if (i2 < 0 || i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i3 + " respectively.");
        }
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int i2 = 0;
        int i3 = 0;
        int selectionStart$ui_text = 0;
        while (true) {
            if (i3 < this.lengthBeforeCursor) {
                int i4 = selectionStart$ui_text + 1;
                if (editingBuffer.getSelectionStart$ui_text() <= i4) {
                    selectionStart$ui_text = editingBuffer.getSelectionStart$ui_text();
                    break;
                } else {
                    selectionStart$ui_text = EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text((editingBuffer.getSelectionStart$ui_text() - i4) + (-1)), editingBuffer.get$ui_text(editingBuffer.getSelectionStart$ui_text() - i4)) ? selectionStart$ui_text + 2 : i4;
                    i3++;
                }
            } else {
                break;
            }
        }
        int i5 = this.lengthAfterCursor;
        int length$ui_text = 0;
        while (true) {
            if (i2 >= i5) {
                break;
            }
            int i6 = length$ui_text + 1;
            if (editingBuffer.getSelectionEnd$ui_text() + i6 >= editingBuffer.getLength$ui_text()) {
                length$ui_text = editingBuffer.getLength$ui_text() - editingBuffer.getSelectionEnd$ui_text();
                break;
            } else {
                length$ui_text = EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text((editingBuffer.getSelectionEnd$ui_text() + i6) + (-1)), editingBuffer.get$ui_text(editingBuffer.getSelectionEnd$ui_text() + i6)) ? length$ui_text + 2 : i6;
                i2++;
            }
        }
        editingBuffer.delete$ui_text(editingBuffer.getSelectionEnd$ui_text(), editingBuffer.getSelectionEnd$ui_text() + length$ui_text);
        editingBuffer.delete$ui_text(editingBuffer.getSelectionStart$ui_text() - selectionStart$ui_text, editingBuffer.getSelectionStart$ui_text());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        return this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor;
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
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
