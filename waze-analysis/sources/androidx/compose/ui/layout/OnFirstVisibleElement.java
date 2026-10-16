package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class OnFirstVisibleElement extends ModifierNodeElement<OnFirstVisibleNode> {
    private final h.g.a.a<ab> callback;
    private final long minDurationMs;
    private final float minFractionVisible;
    private final LayoutBoundsHolder viewportBounds;

    public OnFirstVisibleElement(long j2, float f2, LayoutBoundsHolder layoutBoundsHolder, h.g.a.a<ab> aVar) {
        this.minDurationMs = j2;
        this.minFractionVisible = f2;
        this.viewportBounds = layoutBoundsHolder;
        this.callback = aVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OnFirstVisibleNode create() {
        return new OnFirstVisibleNode(this.minDurationMs, this.minFractionVisible, this.viewportBounds, this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            OnFirstVisibleElement onFirstVisibleElement = (OnFirstVisibleElement) obj;
            return this.minDurationMs == onFirstVisibleElement.minDurationMs && this.minFractionVisible == onFirstVisibleElement.minFractionVisible && x.n(this.viewportBounds, onFirstVisibleElement.viewportBounds) && this.callback == onFirstVisibleElement.callback;
        }
        return false;
    }

    public final h.g.a.a<ab> getCallback() {
        return this.callback;
    }

    public final long getMinDurationMs() {
        return this.minDurationMs;
    }

    public final float getMinFractionVisible() {
        return this.minFractionVisible;
    }

    public final LayoutBoundsHolder getViewportBounds() {
        return this.viewportBounds;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iM = (OnFirstVisibleElement$$ExternalSyntheticBackport0.m(this.minDurationMs) * 31) + Float.floatToIntBits(this.minFractionVisible);
        LayoutBoundsHolder layoutBoundsHolder = this.viewportBounds;
        return (((iM * 31) + (layoutBoundsHolder != null ? layoutBoundsHolder.hashCode() : 0)) * 31) + this.callback.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFirstVisible");
        inspectorInfo.getProperties().set("minDurationMs", Long.valueOf(this.minDurationMs));
        inspectorInfo.getProperties().set("minFractionVisible", Float.valueOf(this.minFractionVisible));
        inspectorInfo.getProperties().set("viewportBounds", this.viewportBounds);
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OnFirstVisibleNode onFirstVisibleNode) {
        onFirstVisibleNode.setMinDurationMs(this.minDurationMs);
        onFirstVisibleNode.setMinFractionVisible(this.minFractionVisible);
        onFirstVisibleNode.setCallback(this.callback);
        onFirstVisibleNode.setViewportBounds(this.viewportBounds);
        onFirstVisibleNode.forceUpdate();
    }
}
