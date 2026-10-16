package androidx.compose.foundation.lazy.grid;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridSlots {
    public static final int $stable = 8;
    private final int[] positions;
    private final int[] sizes;

    public LazyGridSlots(int[] iArr, int[] iArr2) {
        this.sizes = iArr;
        this.positions = iArr2;
    }

    public final int[] getPositions() {
        return this.positions;
    }

    public final int[] getSizes() {
        return this.sizes;
    }
}
