package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DrawerPredictiveBackState {
    public static final int $stable = 0;
    private final MutableState swipeEdgeMatchesDrawer$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private final MutableFloatState scaleXDistance$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    private final MutableFloatState scaleYDistance$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    public final void clear() {
        setSwipeEdgeMatchesDrawer(true);
        setScaleXDistance(0.0f);
        setScaleYDistance(0.0f);
    }

    public final float getScaleXDistance() {
        return this.scaleXDistance$delegate.getFloatValue();
    }

    public final float getScaleYDistance() {
        return this.scaleYDistance$delegate.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSwipeEdgeMatchesDrawer() {
        return ((Boolean) this.swipeEdgeMatchesDrawer$delegate.getValue()).booleanValue();
    }

    public final void setScaleXDistance(float f2) {
        this.scaleXDistance$delegate.setFloatValue(f2);
    }

    public final void setScaleYDistance(float f2) {
        this.scaleYDistance$delegate.setFloatValue(f2);
    }

    public final void setSwipeEdgeMatchesDrawer(boolean z) {
        this.swipeEdgeMatchesDrawer$delegate.setValue(Boolean.valueOf(z));
    }

    public final void update(float f2, boolean z, boolean z2, float f3, float f4, float f5) {
        setSwipeEdgeMatchesDrawer(z != z2);
        if (true != getSwipeEdgeMatchesDrawer()) {
            f3 = f4;
        }
        setScaleXDistance(MathHelpersKt.lerp(0.0f, f3, f2));
        setScaleYDistance(MathHelpersKt.lerp(0.0f, f5, f2));
    }
}
