package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Canvas;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1 extends y implements a<ab> {
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1(NodeCoordinator nodeCoordinator) {
        super(0);
        this.this$0 = nodeCoordinator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NodeCoordinator nodeCoordinator = this.this$0;
        Canvas canvas = nodeCoordinator.drawBlockCanvas;
        if (canvas == null) {
            x.g();
        }
        nodeCoordinator.drawContainedDrawModifiers(canvas, this.this$0.drawBlockParentLayer);
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
