package androidx.compose.ui.unit;

import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InlineClassHelperKt {
    public static final long DualFloatSignBit = -9223372034707292160L;

    public static final void checkPrecondition(boolean z, a<String> aVar) {
        if (z) {
            return;
        }
        throwIllegalStateException(aVar.invoke());
    }

    public static final void requirePrecondition(boolean z, a<String> aVar) {
        if (z) {
            return;
        }
        throwIllegalArgumentException(aVar.invoke());
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }
}
