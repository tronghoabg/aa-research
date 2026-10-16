package androidx.compose.ui.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.spatial.RelativeLayoutBounds;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutBoundsHolder {
    public static final int $stable = 0;
    private final MutableState bounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public final RelativeLayoutBounds getBounds() {
        return (RelativeLayoutBounds) this.bounds$delegate.getValue();
    }

    public final void setBounds$ui(RelativeLayoutBounds relativeLayoutBounds) {
        this.bounds$delegate.setValue(relativeLayoutBounds);
    }
}
