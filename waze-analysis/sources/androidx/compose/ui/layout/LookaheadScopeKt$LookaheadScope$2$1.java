package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LookaheadScopeKt$LookaheadScope$2$1 extends y implements l<LayoutNode, ab> {
    public static final LookaheadScopeKt$LookaheadScope$2$1 INSTANCE = new LookaheadScopeKt$LookaheadScope$2$1();

    LookaheadScopeKt$LookaheadScope$2$1() {
        super(1);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(LayoutNode layoutNode) {
        invoke2(layoutNode);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutNode layoutNode) {
        layoutNode.setVirtualLookaheadRoot$ui(true);
    }
}
