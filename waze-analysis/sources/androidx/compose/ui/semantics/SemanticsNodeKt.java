package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SemanticsNodeKt {
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073 A[LOOP:0: B:5:0x0011->B:35:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078 A[EDGE_INSN: B:45:0x0078->B:36:0x0078 BREAK  A[LOOP:0: B:5:0x0011->B:35:0x0073], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.semantics.SemanticsNode SemanticsNode(androidx.compose.ui.node.LayoutNode r9, boolean r10) {
        /*
            androidx.compose.ui.node.NodeChain r0 = r9.getNodes$ui()
            int r1 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r0)
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L78
            androidx.compose.ui.Modifier$Node r0 = r0.getHead$ui()
        L11:
            if (r0 == 0) goto L78
            int r1 = r0.getKindSet$ui()
            r1 = r1 & 8
            if (r1 == 0) goto L6b
            r1 = r0
            r3 = r2
        L1d:
            if (r1 == 0) goto L6b
            boolean r4 = r1 instanceof androidx.compose.ui.node.SemanticsModifierNode
            if (r4 != 0) goto L69
            int r4 = r1.getKindSet$ui()
            r4 = r4 & 8
            if (r4 == 0) goto L64
            boolean r4 = r1 instanceof androidx.compose.ui.node.DelegatingNode
            if (r4 == 0) goto L64
            r4 = r1
            androidx.compose.ui.node.DelegatingNode r4 = (androidx.compose.ui.node.DelegatingNode) r4
            androidx.compose.ui.Modifier$Node r4 = r4.getDelegate$ui()
            r5 = 0
            r6 = r5
        L38:
            r7 = 1
            if (r4 == 0) goto L62
            int r8 = r4.getKindSet$ui()
            r8 = r8 & 8
            if (r8 == 0) goto L5d
            int r6 = r6 + 1
            if (r6 != r7) goto L49
            r1 = r4
            goto L5d
        L49:
            if (r3 != 0) goto L54
            androidx.compose.runtime.collection.MutableVector r3 = new androidx.compose.runtime.collection.MutableVector
            r7 = 16
            androidx.compose.ui.Modifier$Node[] r7 = new androidx.compose.ui.Modifier.Node[r7]
            r3.<init>(r7, r5)
        L54:
            if (r1 == 0) goto L59
            r3.add(r1)
        L59:
            r3.add(r4)
            r1 = r2
        L5d:
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui()
            goto L38
        L62:
            if (r6 == r7) goto L1d
        L64:
            androidx.compose.ui.Modifier$Node r1 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r3)
            goto L1d
        L69:
            r2 = r1
            goto L78
        L6b:
            int r1 = r0.getAggregateChildKindSet$ui()
            r1 = r1 & 8
            if (r1 == 0) goto L78
            androidx.compose.ui.Modifier$Node r0 = r0.getChild$ui()
            goto L11
        L78:
            if (r2 != 0) goto L7d
            h.g.b.x.g()
        L7d:
            androidx.compose.ui.node.SemanticsModifierNode r2 = (androidx.compose.ui.node.SemanticsModifierNode) r2
            androidx.compose.ui.Modifier$Node r0 = r2.getNode()
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r9.getSemanticsConfiguration()
            if (r1 != 0) goto L8e
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = new androidx.compose.ui.semantics.SemanticsConfiguration
            r1.<init>()
        L8e:
            androidx.compose.ui.semantics.SemanticsNode r2 = new androidx.compose.ui.semantics.SemanticsNode
            r2.<init>(r0, r10, r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsNodeKt.SemanticsNode(androidx.compose.ui.node.LayoutNode, boolean):androidx.compose.ui.semantics.SemanticsNode");
    }

    public static /* synthetic */ SemanticsNode SemanticsNode$default(SemanticsModifierNode semanticsModifierNode, boolean z, LayoutNode layoutNode, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            layoutNode = DelegatableNodeKt.requireLayoutNode(semanticsModifierNode);
        }
        return SemanticsNode(semanticsModifierNode, z, layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int contentDescriptionFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, l<? super LayoutNode, Boolean> lVar) {
        for (LayoutNode parent$ui = layoutNode.getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if (lVar.invoke(parent$ui).booleanValue()) {
                return parent$ui;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Role getRole(SemanticsNode semanticsNode) {
        return (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getRole());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int roleFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 1000000000;
    }

    public static final SemanticsNode SemanticsNode(SemanticsModifierNode semanticsModifierNode, boolean z, LayoutNode layoutNode) {
        Modifier.Node node = semanticsModifierNode.getNode();
        SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
        if (semanticsConfiguration == null) {
            semanticsConfiguration = new SemanticsConfiguration();
        }
        return new SemanticsNode(node, z, layoutNode, semanticsConfiguration);
    }
}
