package androidx.compose.foundation.text.input;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class UndoState {
    public static final int $stable = 0;
    private final TextFieldState state;

    public UndoState(TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final void clearHistory() {
        this.state.getTextUndoManager$foundation().clearHistory();
    }

    public final boolean getCanRedo() {
        return this.state.getTextUndoManager$foundation().getCanRedo();
    }

    public final boolean getCanUndo() {
        return this.state.getTextUndoManager$foundation().getCanUndo();
    }

    public final void redo() {
        TextFieldState textFieldState = this.state;
        textFieldState.getTextUndoManager$foundation().redo(textFieldState);
    }

    public final void undo() {
        TextFieldState textFieldState = this.state;
        textFieldState.getTextUndoManager$foundation().undo(textFieldState);
    }

    public static /* synthetic */ void getCanRedo$annotations() {
    }

    public static /* synthetic */ void getCanUndo$annotations() {
    }
}
