package androidx.compose.ui.graphics;

import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InlineClassHelperKt {
    public static final void requirePrecondition(boolean z, a<String> aVar) {
        if (z) {
            return;
        }
        throwIllegalArgumentException(aVar.invoke());
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }
}
