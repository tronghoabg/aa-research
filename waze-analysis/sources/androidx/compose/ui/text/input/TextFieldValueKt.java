package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldValueKt {
    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        return textFieldValue.getAnnotatedString().m10381subSequence5zctL8(textFieldValue.m10831getSelectiond9O1mEE());
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i2) {
        AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
        int iM10543getMaximpl = TextRange.m10543getMaximpl(textFieldValue.m10831getSelectiond9O1mEE());
        int iM10543getMaximpl2 = TextRange.m10543getMaximpl(textFieldValue.m10831getSelectiond9O1mEE());
        int length = iM10543getMaximpl2 + i2;
        if (((i2 ^ length) & (iM10543getMaximpl2 ^ length)) < 0) {
            length = textFieldValue.getText().length();
        }
        return annotatedString.subSequence(iM10543getMaximpl, Math.min(length, textFieldValue.getText().length()));
    }

    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i2) {
        AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
        int iM10544getMinimpl = TextRange.m10544getMinimpl(textFieldValue.m10831getSelectiond9O1mEE());
        int i3 = iM10544getMinimpl - i2;
        if (((i2 ^ iM10544getMinimpl) & (iM10544getMinimpl ^ i3)) < 0) {
            i3 = 0;
        }
        return annotatedString.subSequence(Math.max(0, i3), TextRange.m10544getMinimpl(textFieldValue.m10831getSelectiond9O1mEE()));
    }
}
