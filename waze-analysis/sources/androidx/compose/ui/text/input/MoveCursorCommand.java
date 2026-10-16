package androidx.compose.ui.text.input;

import androidx.compose.ui.text.CharHelpers_androidKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MoveCursorCommand implements EditCommand {
    public static final int $stable = 0;
    private final int amount;

    public MoveCursorCommand(int i2) {
        this.amount = i2;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.getCursor$ui_text() == -1) {
            editingBuffer.setCursor$ui_text(editingBuffer.getSelectionStart$ui_text());
        }
        int selectionStart$ui_text = editingBuffer.getSelectionStart$ui_text();
        String string = editingBuffer.toString();
        int i2 = this.amount;
        int i3 = 0;
        if (i2 <= 0) {
            int i4 = -i2;
            while (i3 < i4) {
                int iFindPrecedingBreak = CharHelpers_androidKt.findPrecedingBreak(string, selectionStart$ui_text);
                if (iFindPrecedingBreak == -1) {
                    break;
                }
                i3++;
                selectionStart$ui_text = iFindPrecedingBreak;
            }
        } else {
            while (i3 < i2) {
                int iFindFollowingBreak = CharHelpers_androidKt.findFollowingBreak(string, selectionStart$ui_text);
                if (iFindFollowingBreak == -1) {
                    break;
                }
                i3++;
                selectionStart$ui_text = iFindFollowingBreak;
            }
        }
        editingBuffer.setCursor$ui_text(selectionStart$ui_text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoveCursorCommand) && this.amount == ((MoveCursorCommand) obj).amount;
    }

    public final int getAmount() {
        return this.amount;
    }

    public int hashCode() {
        return this.amount;
    }

    public String toString() {
        return "MoveCursorCommand(amount=" + this.amount + ')';
    }
}
