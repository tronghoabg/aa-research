package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.layout.MeasurePolicy;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntrinsicsPolicy {
    public static final int $stable = 8;
    private final LayoutNode layoutNode;
    private final MutableState measurePolicyState$delegate;

    public IntrinsicsPolicy(LayoutNode layoutNode, MeasurePolicy measurePolicy) {
        this.layoutNode = layoutNode;
        this.measurePolicyState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(measurePolicy, null, 2, null);
    }

    private final MeasurePolicy getMeasurePolicyState() {
        return (MeasurePolicy) this.measurePolicyState$delegate.getValue();
    }

    private final void setMeasurePolicyState(MeasurePolicy measurePolicy) {
        this.measurePolicyState$delegate.setValue(measurePolicy);
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final int maxIntrinsicHeight(int i2) {
        return getMeasurePolicyState().maxIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), i2);
    }

    public final int maxIntrinsicWidth(int i2) {
        return getMeasurePolicyState().maxIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), i2);
    }

    public final int maxLookaheadIntrinsicHeight(int i2) {
        return getMeasurePolicyState().maxIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), i2);
    }

    public final int maxLookaheadIntrinsicWidth(int i2) {
        return getMeasurePolicyState().maxIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), i2);
    }

    public final int minIntrinsicHeight(int i2) {
        return getMeasurePolicyState().minIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), i2);
    }

    public final int minIntrinsicWidth(int i2) {
        return getMeasurePolicyState().minIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildMeasurables$ui(), i2);
    }

    public final int minLookaheadIntrinsicHeight(int i2) {
        return getMeasurePolicyState().minIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), i2);
    }

    public final int minLookaheadIntrinsicWidth(int i2) {
        return getMeasurePolicyState().minIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui(), this.layoutNode.getChildLookaheadMeasurables$ui(), i2);
    }

    public final void updateFrom(MeasurePolicy measurePolicy) {
        setMeasurePolicyState(measurePolicy);
    }
}
