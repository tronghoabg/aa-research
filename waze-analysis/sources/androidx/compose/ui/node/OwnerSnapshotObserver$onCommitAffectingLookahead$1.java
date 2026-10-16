package androidx.compose.ui.node;

import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class OwnerSnapshotObserver$onCommitAffectingLookahead$1 extends y implements l<LayoutNode, ab> {
    public static final OwnerSnapshotObserver$onCommitAffectingLookahead$1 INSTANCE = new OwnerSnapshotObserver$onCommitAffectingLookahead$1();

    OwnerSnapshotObserver$onCommitAffectingLookahead$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutNode layoutNode) {
        if (layoutNode.isValidOwnerScope()) {
            layoutNode.requestLookaheadRelayout$ui(1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)));
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(LayoutNode layoutNode) {
        invoke2(layoutNode);
        return ab.f48028a;
    }
}
