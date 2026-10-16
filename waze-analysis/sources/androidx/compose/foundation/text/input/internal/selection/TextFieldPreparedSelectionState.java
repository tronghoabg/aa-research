package androidx.compose.foundation.text.input.internal.selection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldPreparedSelectionState {
    public static final int $stable = 8;
    private float cachedX = Float.NaN;

    public final float getCachedX() {
        return this.cachedX;
    }

    public final void resetCachedX() {
        this.cachedX = Float.NaN;
    }

    public final void setCachedX(float f2) {
        this.cachedX = f2;
    }
}
