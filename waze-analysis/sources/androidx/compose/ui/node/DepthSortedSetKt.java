package androidx.compose.ui.node;

import h.g.b.x;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DepthSortedSetKt {
    private static final Comparator<LayoutNode> DepthComparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSetKt$DepthComparator$1
        @Override // java.util.Comparator
        public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
            int iA = x.a(layoutNode.getDepth$ui(), layoutNode2.getDepth$ui());
            return iA != 0 ? iA : x.a(layoutNode.hashCode(), layoutNode2.hashCode());
        }
    };
}
