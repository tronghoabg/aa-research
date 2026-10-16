package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OnPlacedNode extends Modifier.Node implements LayoutAwareModifierNode {
    public static final int $stable = 8;
    private l<? super LayoutCoordinates, ab> callback;

    public OnPlacedNode(l<? super LayoutCoordinates, ab> lVar) {
        this.callback = lVar;
    }

    public final l<LayoutCoordinates, ab> getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }

    public final void setCallback(l<? super LayoutCoordinates, ab> lVar) {
        this.callback = lVar;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public /* synthetic */ void mo2116onRemeasuredozmzZPI(long j2) {
    }
}
