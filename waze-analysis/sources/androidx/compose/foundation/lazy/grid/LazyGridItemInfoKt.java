package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridItemInfoKt {
    public static final int lineIndex(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        return orientation == Orientation.Vertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn();
    }
}
