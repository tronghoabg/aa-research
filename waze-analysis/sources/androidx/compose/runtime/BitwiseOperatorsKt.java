package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BitwiseOperatorsKt {
    public static final int rol(int i2, int i3) {
        return Integer.rotateLeft(i2, i3);
    }

    public static final int ror(int i2, int i3) {
        return Integer.rotateRight(i2, i3);
    }

    public static final long rol(long j2, int i2) {
        return Long.rotateLeft(j2, i2);
    }

    public static final long ror(long j2, int i2) {
        return Long.rotateRight(j2, i2);
    }
}
