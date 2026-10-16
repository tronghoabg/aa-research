package androidx.compose.ui.node;

import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class OwnerSnapshotObserver$onCommitAffectingSemantics$1 extends y implements l<LayoutNode, ab> {
    public static final OwnerSnapshotObserver$onCommitAffectingSemantics$1 INSTANCE = new OwnerSnapshotObserver$onCommitAffectingSemantics$1();

    OwnerSnapshotObserver$onCommitAffectingSemantics$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutNode layoutNode) {
        if (layoutNode.isValidOwnerScope()) {
            layoutNode.invalidateSemantics$ui();
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(LayoutNode layoutNode) {
        invoke2(layoutNode);
        return ab.f48028a;
    }
}
