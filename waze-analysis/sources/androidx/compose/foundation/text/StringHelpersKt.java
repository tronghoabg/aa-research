package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextRangeKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StringHelpersKt {
    public static final int findParagraphEnd(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        while (i2 < length) {
            if (charSequence.charAt(i2) == '\n') {
                return i2;
            }
            i2++;
        }
        return charSequence.length();
    }

    public static final int findParagraphStart(CharSequence charSequence, int i2) {
        while (i2 > 0) {
            int i3 = i2 - 1;
            if (charSequence.charAt(i3) == '\n') {
                return i2;
            }
            i2 = i3;
        }
        return 0;
    }

    public static final long getParagraphBoundary(CharSequence charSequence, int i2) {
        return TextRangeKt.TextRange(findParagraphStart(charSequence, i2), findParagraphEnd(charSequence, i2));
    }
}
