package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import h.g.a.a;
import h.g.a.l;
import h.g.b.aq;
import h.g.b.y;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class NestedScrollNodeKt {
    private static final a<af> EmptyScope = NestedScrollNodeKt$EmptyScope$1.INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$findNearestAttachedAncestor$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l {
        final /* synthetic */ aq $node;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(aq aqVar) {
            super(1);
            this.$node = aqVar;
        }

        @Override // h.g.a.l
        public final Boolean invoke(TraversableNode traversableNode) {
            boolean z;
            if (traversableNode.getNode().isAttached()) {
                this.$node.f48105a = traversableNode;
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends TraversableNode> T findNearestAttachedAncestor(T t) {
        aq aqVar = new aq();
        TraversableNodeKt.traverseAncestors(t, new AnonymousClass1(aqVar));
        return (T) aqVar.f48105a;
    }

    public static final DelegatableNode nestedScrollModifierNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        return new NestedScrollNode(nestedScrollConnection, nestedScrollDispatcher);
    }
}
