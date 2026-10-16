package androidx.compose.runtime.collection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ArrayUtils_androidKt {
    public static final <T> T[] fastCopyInto(T[] tArr, T[] tArr2, int i2, int i3, int i4) {
        System.arraycopy(tArr, i3, tArr2, i2, i4 - i3);
        return tArr2;
    }
}
