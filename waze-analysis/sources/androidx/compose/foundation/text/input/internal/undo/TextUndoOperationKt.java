package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.ui.text.TextRange;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextUndoOperationKt {
    public static final void redo(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        mainBuffer$foundation.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPreText().length(), textUndoOperation.getPostText());
        TextFieldBufferKt.setSelectionCoerced(mainBuffer$foundation, TextRange.m10546getStartimpl(textUndoOperation.m3770getPostSelectiond9O1mEE()), TextRange.m10541getEndimpl(textUndoOperation.m3770getPostSelectiond9O1mEE()));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation(), TextFieldBuffer.m3472toTextFieldCharSequencewFTz33Y$foundation$default(textFieldState.getMainBuffer$foundation(), 0L, null, null, null, 15, null), true);
    }

    public static final void undo(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        mainBuffer$foundation.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPostText().length(), textUndoOperation.getPreText());
        TextFieldBufferKt.setSelectionCoerced(mainBuffer$foundation, TextRange.m10546getStartimpl(textUndoOperation.m3771getPreSelectiond9O1mEE()), TextRange.m10541getEndimpl(textUndoOperation.m3771getPreSelectiond9O1mEE()));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation(), TextFieldBuffer.m3472toTextFieldCharSequencewFTz33Y$foundation$default(textFieldState.getMainBuffer$foundation(), 0L, null, null, null, 15, null), true);
    }
}
