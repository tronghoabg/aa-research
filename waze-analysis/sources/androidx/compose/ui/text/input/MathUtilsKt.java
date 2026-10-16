package androidx.compose.ui.text.input;

import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i2, int i3, a<Integer> aVar) {
        int i4 = i2 + i3;
        return ((i2 ^ i4) & (i3 ^ i4)) < 0 ? aVar.invoke().intValue() : i4;
    }

    public static final int subtractExactOrElse(int i2, int i3, a<Integer> aVar) {
        int i4 = i2 - i3;
        return ((i2 ^ i4) & (i3 ^ i2)) < 0 ? aVar.invoke().intValue() : i4;
    }
}
