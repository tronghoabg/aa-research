package androidx.compose.ui.node;

import h.ab;
import h.e;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class NodeCoordinator$Companion$onCommitAffectingLayerParams$1 extends y implements l<NodeCoordinator, ab> {
    public static final NodeCoordinator$Companion$onCommitAffectingLayerParams$1 INSTANCE = new NodeCoordinator$Companion$onCommitAffectingLayerParams$1();

    NodeCoordinator$Companion$onCommitAffectingLayerParams$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NodeCoordinator nodeCoordinator) throws Throwable {
        LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
        try {
            if (nodeCoordinator.isValidOwnerScope()) {
                NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
            }
        } catch (Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            throw new e();
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(NodeCoordinator nodeCoordinator) throws Throwable {
        invoke2(nodeCoordinator);
        return ab.f48028a;
    }
}
