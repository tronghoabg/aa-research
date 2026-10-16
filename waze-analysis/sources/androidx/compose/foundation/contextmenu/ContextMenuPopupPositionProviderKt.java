package androidx.compose.foundation.contextmenu;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProviderKt {
    private static final int alignEndEdges(int i2, int i3, boolean z) {
        return alignStartEdges(i2, i3, !z);
    }

    public static final int alignPopupAxis(int i2, int i3, int i4, boolean z) {
        return i3 >= i4 ? alignStartEdges(i3, i4, z) : popupFitsBetweenPositionAndEndEdge(i2, i3, i4, z) ? alignPopupStartEdgeToPosition(i2, i3, z) : popupFitsBetweenPositionAndStartEdge(i2, i3, i4, z) ? alignPopupEndEdgeToPosition(i2, i3, z) : alignEndEdges(i3, i4, z);
    }

    private static final int alignPopupEndEdgeToPosition(int i2, int i3, boolean z) {
        return alignPopupStartEdgeToPosition(i2, i3, !z);
    }

    private static final int alignPopupStartEdgeToPosition(int i2, int i3, boolean z) {
        return z ? i2 : i2 - i3;
    }

    private static final int alignStartEdges(int i2, int i3, boolean z) {
        if (z) {
            return 0;
        }
        return i3 - i2;
    }

    private static final boolean popupFitsBetweenPositionAndEndEdge(int i2, int i3, int i4, boolean z) {
        return popupFitsBetweenPositionAndStartEdge(i2, i3, i4, !z);
    }

    private static final boolean popupFitsBetweenPositionAndStartEdge(int i2, int i3, int i4, boolean z) {
        return z ? i3 <= i2 : i4 - i3 > i2;
    }
}
