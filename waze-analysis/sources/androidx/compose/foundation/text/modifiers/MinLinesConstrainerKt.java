package androidx.compose.foundation.text.modifiers;

import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MinLinesConstrainerKt {
    private static final int DefaultWidthCharCount = 10;
    private static final String EmptyTextReplacement;
    private static final String TwoLineTextReplacement;

    static {
        String strJ = o.j("H", 10);
        EmptyTextReplacement = strJ;
        TwoLineTextReplacement = strJ + '\n' + strJ;
    }
}
