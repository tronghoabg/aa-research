package androidx.compose.ui.text.input;

import h.g.b.ar;
import h.g.b.m;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DeleteAllCommand implements EditCommand {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        editingBuffer.replace$ui_text(0, editingBuffer.getLength$ui_text(), "");
    }

    public boolean equals(Object obj) {
        return obj instanceof DeleteAllCommand;
    }

    public int hashCode() {
        int i2 = ar.f48106a;
        return new m(getClass()).hashCode();
    }

    public String toString() {
        return "DeleteAllCommand()";
    }
}
