package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNodeKt;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusTargetModifierNodeKt {
    public static final /* synthetic */ FocusTargetModifierNode FocusTargetModifierNode() {
        return new FocusTargetNode(0, false, null, new AnonymousClass1(InvalidateSemantics.INSTANCE), 7, null);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc, reason: not valid java name */
    public static final FocusTargetModifierNode m7891FocusTargetModifierNodePYyLHbc(int i2, p<? super FocusState, ? super FocusState, ab> pVar) {
        return new FocusTargetNode(i2, false, pVar, null, 10, null);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc$default, reason: not valid java name */
    public static /* synthetic */ FocusTargetModifierNode m7892FocusTargetModifierNodePYyLHbc$default(int i2, p pVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = Focusability.Companion.m7914getAlwaysLCbbffg();
        }
        if ((i3 & 2) != 0) {
            pVar = null;
        }
        return m7891FocusTargetModifierNodePYyLHbc(i2, pVar);
    }

    public static final Rect getFocusedRect(FocusTargetModifierNode focusTargetModifierNode) {
        if (focusTargetModifierNode.getNode().isAttached()) {
            FocusState focusState = focusTargetModifierNode.getFocusState();
            if (focusState.getHasFocus()) {
                if (focusState.isFocused()) {
                    x.d(focusTargetModifierNode, "null cannot be cast to non-null type androidx.compose.ui.focus.FocusTargetNode");
                    return FocusTargetNode.fetchFocusRect$ui$default((FocusTargetNode) focusTargetModifierNode, null, 1, null);
                }
                FocusTargetModifierNode focusTargetModifierNode2 = focusTargetModifierNode;
                FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(focusTargetModifierNode2).getFocusOwner().getActiveFocusTargetNode();
                if (activeFocusTargetNode != null) {
                    return activeFocusTargetNode.fetchFocusRect$ui(DelegatableNodeKt.requireLayoutCoordinates(focusTargetModifierNode2));
                }
            }
        }
        return null;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.focus.FocusTargetModifierNodeKt$FocusTargetModifierNode$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends u implements l<FocusTargetNode, ab> {
        AnonymousClass1(Object obj) {
            super(1, obj, InvalidateSemantics.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FocusTargetNode focusTargetNode) {
            ((InvalidateSemantics) this.receiver).onDispatchEventsCompleted(focusTargetNode);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(FocusTargetNode focusTargetNode) {
            invoke2(focusTargetNode);
            return ab.f48028a;
        }
    }
}
