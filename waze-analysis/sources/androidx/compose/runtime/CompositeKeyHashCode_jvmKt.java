package androidx.compose.runtime;

import h.g.b.x;
import h.m.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CompositeKeyHashCode_jvmKt {
    public static final int CompositeKeyHashSizeBits = 64;
    public static final long EmptyCompositeKeyHashCode = 0;

    public static final long CompositeKeyHashCode(int i2) {
        return i2;
    }

    public static final long bottomUpCompoundWith(long j2, int i2, int i3) {
        return j2 ^ Long.rotateLeft(i2, i3);
    }

    public static final long compoundWith(long j2, int i2, int i3) {
        return Long.rotateLeft(j2, i3) ^ i2;
    }

    public static final String toString(long j2, int i2) {
        k.y(i2);
        String string = Long.toString(j2, i2);
        x.e(string, "toString(...)");
        return string;
    }

    public static final long unCompoundWith(long j2, int i2, int i3) {
        return Long.rotateRight(j2 ^ i2, i3);
    }

    public static final long bottomUpCompoundWith(long j2, long j3, int i2) {
        return j2 ^ Long.rotateLeft(j3, i2);
    }

    public static /* synthetic */ void CompositeKeyHashCode$annotations() {
    }

    public static final long toLong(long j2) {
        return j2;
    }
}
