package androidx.compose.ui.text.input;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GapBuffer_jvmAndAndroidKt {
    public static final void toCharArray(String str, char[] cArr, int i2, int i3, int i4) {
        x.d(str, "null cannot be cast to non-null type java.lang.String");
        str.getChars(i3, i4, cArr, i2);
    }
}
