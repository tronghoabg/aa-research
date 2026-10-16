package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ToCharArray_androidKt {
    public static final void toCharArray(CharSequence charSequence, char[] cArr, int i2, int i3, int i4) {
        if (charSequence instanceof TextFieldCharSequence) {
            ((TextFieldCharSequence) charSequence).toCharArray(cArr, i2, i3, i4);
            return;
        }
        while (i3 < i4) {
            cArr[i2] = charSequence.charAt(i3);
            i3++;
            i2++;
        }
    }
}
