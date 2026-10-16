package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.HeightForSingleLineFieldProvider;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import h.h.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldDefaultSizeModifierKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int computeHeightFromThreeLines(float f2, float f3, float f4, int i2) {
        if (i2 == 1) {
            return a.b((f2 + f4) - f3);
        }
        if (i2 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        int i3 = i2 - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        return a.b(f2 + (f3 * i3) + (f4 * (i2 - 1 <= 1 ? r5 : 1)));
    }

    public static final Modifier textFieldSize(Modifier modifier, TextStyle textStyle, HeightForSingleLineFieldProvider heightForSingleLineFieldProvider, int i2, int i3, boolean z) {
        HeightInLinesModifierKt.validateMinMaxLines(i2, i3);
        return modifier.then(new TextFieldSizeConstrainerElement(textStyle, i2, i3, z, heightForSingleLineFieldProvider));
    }
}
