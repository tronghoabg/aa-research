package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import h.g.b.x;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CommitTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    /* JADX WARN: Multi-variable type inference failed */
    public CommitTextCommand(String str, int i2) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), i2);
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition$ui_text()) {
            editingBuffer.replace$ui_text(editingBuffer.getCompositionStart$ui_text(), editingBuffer.getCompositionEnd$ui_text(), getText());
        } else {
            editingBuffer.replace$ui_text(editingBuffer.getSelectionStart$ui_text(), editingBuffer.getSelectionEnd$ui_text(), getText());
        }
        int cursor$ui_text = editingBuffer.getCursor$ui_text();
        int i2 = this.newCursorPosition;
        int i3 = cursor$ui_text + i2;
        editingBuffer.setCursor$ui_text(n.j(i2 > 0 ? i3 - 1 : i3 - getText().length(), 0, editingBuffer.getLength$ui_text()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) obj;
        return x.n(getText(), commitTextCommand.getText()) && this.newCursorPosition == commitTextCommand.newCursorPosition;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.newCursorPosition;
    }

    public String toString() {
        return "CommitTextCommand(text='" + getText() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }

    public CommitTextCommand(AnnotatedString annotatedString, int i2) {
        this.annotatedString = annotatedString;
        this.newCursorPosition = i2;
    }
}
