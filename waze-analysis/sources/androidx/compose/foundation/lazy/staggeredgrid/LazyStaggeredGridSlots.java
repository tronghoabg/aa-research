package androidx.compose.foundation.lazy.staggeredgrid;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridSlots {
    public static final int $stable = 8;
    private final int[] positions;
    private final int[] sizes;

    public LazyStaggeredGridSlots(int[] iArr, int[] iArr2) {
        this.positions = iArr;
        this.sizes = iArr2;
    }

    public final int[] getPositions() {
        return this.positions;
    }

    public final int[] getSizes() {
        return this.sizes;
    }
}
