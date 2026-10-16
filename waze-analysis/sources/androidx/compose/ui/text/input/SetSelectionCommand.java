package androidx.compose.ui.text.input;

import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SetSelectionCommand implements EditCommand {
    public static final int $stable = 0;
    private final int end;
    private final int start;

    public SetSelectionCommand(int i2, int i3) {
        this.start = i2;
        this.end = i3;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int iJ = n.j(this.start, 0, editingBuffer.getLength$ui_text());
        int iJ2 = n.j(this.end, 0, editingBuffer.getLength$ui_text());
        if (iJ < iJ2) {
            editingBuffer.setSelection$ui_text(iJ, iJ2);
        } else {
            editingBuffer.setSelection$ui_text(iJ2, iJ);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetSelectionCommand)) {
            return false;
        }
        SetSelectionCommand setSelectionCommand = (SetSelectionCommand) obj;
        return this.start == setSelectionCommand.start && this.end == setSelectionCommand.end;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.start + ", end=" + this.end + ')';
    }
}
