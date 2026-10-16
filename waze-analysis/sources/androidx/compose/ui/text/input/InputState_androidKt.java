package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InputState_androidKt {
    public static final ExtractedText toExtractedText(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m10544getMinimpl(textFieldValue.m10831getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m10543getMaximpl(textFieldValue.m10831getSelectiond9O1mEE());
        extractedText.flags = !o.O(textFieldValue.getText(), '\n') ? 1 : 0;
        return extractedText;
    }
}
