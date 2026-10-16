package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LayoutAwareModifierNode extends MeasuredSizeAwareModifierNode, DelegatableNode {
    void onPlaced(LayoutCoordinates layoutCoordinates);

    @Override // androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    void mo2116onRemeasuredozmzZPI(long j2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.node.LayoutAwareModifierNode$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onPlaced(LayoutAwareModifierNode layoutAwareModifierNode, LayoutCoordinates layoutCoordinates) {
        }

        /* renamed from: $default$onRemeasured-ozmzZPI, reason: not valid java name */
        public static void m9968$default$onRemeasuredozmzZPI(LayoutAwareModifierNode layoutAwareModifierNode, long j2) {
        }
    }
}
