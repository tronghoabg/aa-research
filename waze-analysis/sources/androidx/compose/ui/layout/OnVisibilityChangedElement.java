package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class OnVisibilityChangedElement extends ModifierNodeElement<OnVisibilityChangedNode> {
    private final l<Boolean, ab> callback;
    private final long minDurationMs;
    private final float minFractionVisible;
    private final LayoutBoundsHolder viewportBounds;

    /* JADX WARN: Multi-variable type inference failed */
    public OnVisibilityChangedElement(long j2, float f2, LayoutBoundsHolder layoutBoundsHolder, l<? super Boolean, ab> lVar) {
        this.minDurationMs = j2;
        this.minFractionVisible = f2;
        this.viewportBounds = layoutBoundsHolder;
        this.callback = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OnVisibilityChangedNode create() {
        return new OnVisibilityChangedNode(this.minDurationMs, this.minFractionVisible, this.viewportBounds, this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            OnVisibilityChangedElement onVisibilityChangedElement = (OnVisibilityChangedElement) obj;
            return this.minDurationMs == onVisibilityChangedElement.minDurationMs && this.minFractionVisible == onVisibilityChangedElement.minFractionVisible && x.n(this.viewportBounds, onVisibilityChangedElement.viewportBounds) && this.callback == onVisibilityChangedElement.callback;
        }
        return false;
    }

    public final l<Boolean, ab> getCallback() {
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
        int iM = (OnVisibilityChangedElement$$ExternalSyntheticBackport0.m(this.minDurationMs) * 31) + Float.floatToIntBits(this.minFractionVisible);
        LayoutBoundsHolder layoutBoundsHolder = this.viewportBounds;
        return (((iM * 31) + (layoutBoundsHolder != null ? layoutBoundsHolder.hashCode() : 0)) * 31) + this.callback.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onViewportVisibilityChanged");
        inspectorInfo.getProperties().set("minDurationMs", Long.valueOf(this.minDurationMs));
        inspectorInfo.getProperties().set("minFractionVisible", Float.valueOf(this.minFractionVisible));
        inspectorInfo.getProperties().set("viewportRef", this.viewportBounds);
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OnVisibilityChangedNode onVisibilityChangedNode) {
        onVisibilityChangedNode.setMinDurationMs(this.minDurationMs);
        onVisibilityChangedNode.setMinFractionVisible(this.minFractionVisible);
        onVisibilityChangedNode.setCallback(this.callback);
        onVisibilityChangedNode.setViewportBounds(this.viewportBounds);
        onVisibilityChangedNode.forceUpdate();
    }
}
