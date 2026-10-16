package androidx.compose.material.internal;

import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class LayoutUtilKt {
    public static final int subtractConstraintSafely(int i2, int i3) {
        if (i2 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return n.h(i2 - i3, 0);
    }
}
