package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import h.ab;
import h.g.a.p;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LookaheadScopeKt$LookaheadScope$2$2 extends y implements p<LayoutNode, LookaheadScopeImpl, ab> {
    public static final LookaheadScopeKt$LookaheadScope$2$2 INSTANCE = new LookaheadScopeKt$LookaheadScope$2$2();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements h.g.a.a<LayoutCoordinates> {
        final /* synthetic */ LayoutNode $this_set;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LayoutNode layoutNode) {
            super(0);
            this.$this_set = layoutNode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final LayoutCoordinates invoke() {
            LayoutNode parent$ui = this.$this_set.getParent$ui();
            if (parent$ui == null) {
                x.g();
            }
            return parent$ui.getInnerCoordinator$ui().getCoordinates();
        }
    }

    LookaheadScopeKt$LookaheadScope$2$2() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl) {
        lookaheadScopeImpl.setScopeCoordinates(new AnonymousClass1(layoutNode));
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(LayoutNode layoutNode, LookaheadScopeImpl lookaheadScopeImpl) {
        invoke2(layoutNode, lookaheadScopeImpl);
        return ab.f48028a;
    }
}
