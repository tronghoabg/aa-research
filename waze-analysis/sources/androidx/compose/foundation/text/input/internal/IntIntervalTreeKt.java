package androidx.compose.foundation.text.input.internal;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntIntervalTreeKt {
    public static final int LeftVisited = 1;
    public static final int RightVisited = 2;
    public static final int TreeColorBlack = 1;
    public static final int TreeColorRed = 0;
    public static final int Unvisited = 0;

    public static final boolean intersect(int i2, int i3, int i4, int i5) {
        return ((i2 < i5) & (i4 < i3)) | (((i2 == i3) | (i4 == i5)) & (i2 == i4));
    }
}
