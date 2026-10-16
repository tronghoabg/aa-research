package androidx.compose.material3.pulltorefresh;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PullToRefreshElement extends ModifierNodeElement<PullToRefreshModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final boolean isRefreshing;
    private final a<ab> onRefresh;
    private final PullToRefreshState state;
    private final float threshold;

    private PullToRefreshElement(boolean z, a<ab> aVar, boolean z2, PullToRefreshState pullToRefreshState, float f2) {
        this.isRefreshing = z;
        this.onRefresh = aVar;
        this.enabled = z2;
        this.state = pullToRefreshState;
        this.threshold = f2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PullToRefreshModifierNode create() {
        return new PullToRefreshModifierNode(this.isRefreshing, this.onRefresh, this.enabled, this.state, this.threshold, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.isRefreshing == pullToRefreshElement.isRefreshing && this.enabled == pullToRefreshElement.enabled && this.onRefresh == pullToRefreshElement.onRefresh && x.n(this.state, pullToRefreshElement.state) && Dp.m11169equalsimpl0(this.threshold, pullToRefreshElement.threshold);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final a<ab> getOnRefresh() {
        return this.onRefresh;
    }

    public final PullToRefreshState getState() {
        return this.state;
    }

    /* renamed from: getThreshold-D9Ej5fM, reason: not valid java name */
    public final float m6419getThresholdD9Ej5fM() {
        return this.threshold;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((PullToRefreshElement$$ExternalSyntheticBackport0.m(this.isRefreshing) * 31) + PullToRefreshElement$$ExternalSyntheticBackport0.m(this.enabled)) * 31) + this.onRefresh.hashCode()) * 31) + this.state.hashCode()) * 31) + Dp.m11170hashCodeimpl(this.threshold);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("PullToRefreshModifierNode");
        inspectorInfo.getProperties().set("isRefreshing", Boolean.valueOf(this.isRefreshing));
        inspectorInfo.getProperties().set("onRefresh", this.onRefresh);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("threshold", Dp.m11162boximpl(this.threshold));
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PullToRefreshModifierNode pullToRefreshModifierNode) {
        pullToRefreshModifierNode.setOnRefresh(this.onRefresh);
        pullToRefreshModifierNode.setEnabled(this.enabled);
        pullToRefreshModifierNode.setState(this.state);
        pullToRefreshModifierNode.m6429setThreshold0680j_4(this.threshold);
        boolean zIsRefreshing = pullToRefreshModifierNode.isRefreshing();
        boolean z = this.isRefreshing;
        if (zIsRefreshing != z) {
            pullToRefreshModifierNode.setRefreshing(z);
            pullToRefreshModifierNode.update();
        }
    }

    public /* synthetic */ PullToRefreshElement(boolean z, a aVar, boolean z2, PullToRefreshState pullToRefreshState, float f2, o oVar) {
        this(z, aVar, z2, pullToRefreshState, f2);
    }
}
