package androidx.compose.foundation.text.selection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextPreparedSelectionState {
    public static final int $stable = 8;
    private Float cachedX;

    public final Float getCachedX() {
        return this.cachedX;
    }

    public final void resetCachedX() {
        this.cachedX = null;
    }

    public final void setCachedX(Float f2) {
        this.cachedX = f2;
    }
}
