package androidx.compose.ui.node;

import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class NodeCoordinator$Companion$onCommitAffectingLayer$1 extends y implements l<NodeCoordinator, ab> {
    public static final NodeCoordinator$Companion$onCommitAffectingLayer$1 INSTANCE = new NodeCoordinator$Companion$onCommitAffectingLayer$1();

    NodeCoordinator$Companion$onCommitAffectingLayer$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NodeCoordinator nodeCoordinator) {
        OwnedLayer layer = nodeCoordinator.getLayer();
        if (layer != null) {
            layer.invalidate();
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(NodeCoordinator nodeCoordinator) {
        invoke2(nodeCoordinator);
        return ab.f48028a;
    }
}
