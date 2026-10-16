package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRange;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldCharSequenceKt {
    public static final CharSequence getSelectedText(TextFieldCharSequence textFieldCharSequence) {
        return textFieldCharSequence.subSequence(TextRange.m10544getMinimpl(textFieldCharSequence.m3484getSelectiond9O1mEE()), TextRange.m10543getMaximpl(textFieldCharSequence.m3484getSelectiond9O1mEE()));
    }

    public static final CharSequence getTextAfterSelection(TextFieldCharSequence textFieldCharSequence, int i2) {
        int iM10543getMaximpl = TextRange.m10543getMaximpl(textFieldCharSequence.m3484getSelectiond9O1mEE());
        int iM10543getMaximpl2 = TextRange.m10543getMaximpl(textFieldCharSequence.m3484getSelectiond9O1mEE());
        int length = iM10543getMaximpl2 + i2;
        if (((i2 ^ length) & (iM10543getMaximpl2 ^ length)) < 0) {
            length = textFieldCharSequence.length();
        }
        return textFieldCharSequence.subSequence(iM10543getMaximpl, Math.min(length, textFieldCharSequence.length()));
    }

    public static final CharSequence getTextBeforeSelection(TextFieldCharSequence textFieldCharSequence, int i2) {
        int iM10544getMinimpl = TextRange.m10544getMinimpl(textFieldCharSequence.m3484getSelectiond9O1mEE());
        int i3 = iM10544getMinimpl - i2;
        if (((i2 ^ iM10544getMinimpl) & (iM10544getMinimpl ^ i3)) < 0) {
            i3 = 0;
        }
        return textFieldCharSequence.subSequence(Math.max(0, i3), TextRange.m10544getMinimpl(textFieldCharSequence.m3484getSelectiond9O1mEE()));
    }
}
