package androidx.compose.ui.relocation;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.unit.IntSizeKt;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BringIntoViewModifierNodeKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements a<Rect> {
        final /* synthetic */ a<Rect> $bounds;
        final /* synthetic */ LayoutCoordinates $layoutCoordinates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(a<Rect> aVar, LayoutCoordinates layoutCoordinates) {
            super(0);
            this.$bounds = aVar;
            this.$layoutCoordinates = layoutCoordinates;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final Rect invoke() {
            Rect rectInvoke;
            a<Rect> aVar = this.$bounds;
            if (aVar != null && (rectInvoke = aVar.invoke()) != null) {
                return rectInvoke;
            }
            LayoutCoordinates layoutCoordinates = this.$layoutCoordinates;
            if (true != layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates == null) {
                return null;
            }
            return SizeKt.m8070toRectuvyYCjk(IntSizeKt.m11351toSizeozmzZPI(layoutCoordinates.mo9743getSizeYbymL2g()));
        }
    }

    public static final Object bringIntoView(DelegatableNode delegatableNode, a<Rect> aVar, e<? super ab> eVar) {
        Object obj;
        LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates;
        Object objBringIntoView;
        NodeChain nodes$ui;
        if (delegatableNode.getNode().isAttached()) {
            if (!delegatableNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
            loop0: while (true) {
                obj = null;
                if (layoutNodeRequireLayoutNode == null) {
                    break;
                }
                if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 524288) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 524288) != 0) {
                            Modifier.Node nodePop = parent$ui;
                            MutableVector mutableVector = null;
                            while (nodePop != null) {
                                if (nodePop instanceof BringIntoViewModifierNode) {
                                    obj = nodePop;
                                    break loop0;
                                }
                                if ((nodePop.getKindSet$ui() & 524288) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i2 = 0;
                                    for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                        if ((delegate$ui.getKindSet$ui() & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nodePop = delegate$ui;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector.add(nodePop);
                                                }
                                                mutableVector.add(delegate$ui);
                                                nodePop = null;
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            BringIntoViewModifierNode bringIntoViewModifierNode = (BringIntoViewModifierNode) obj;
            if (bringIntoViewModifierNode != null && (objBringIntoView = bringIntoViewModifierNode.bringIntoView((layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(delegatableNode)), new AnonymousClass2(aVar, layoutCoordinatesRequireLayoutCoordinates), eVar)) == h.c.a.a.f48038a) {
                return objBringIntoView;
            }
        }
        return ab.f48028a;
    }

    public static /* synthetic */ Object bringIntoView$default(DelegatableNode delegatableNode, a aVar, e eVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            aVar = null;
        }
        return bringIntoView(delegatableNode, aVar, eVar);
    }
}
