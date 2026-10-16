package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import h.g.b.o;
import h.g.b.x;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OnPositionedDispatcher {
    private static final int MinArraySize = 16;
    private LayoutNode[] cachedNodes;
    private final MutableVector<LayoutNode> layoutNodes = new MutableVector<>(new LayoutNode[16], 0);
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private final void dispatchHierarchy(LayoutNode layoutNode) {
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            layoutNode.dispatchOnPositionedCallbacks$ui();
            layoutNode.setNeedsOnGloballyPositionedDispatch$ui(false);
            MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                dispatchHierarchy(layoutNodeArr[i2]);
            }
        }
    }

    public final void dispatch() {
        MutableVector<LayoutNode> mutableVector;
        this.layoutNodes.sortWith(Companion.DepthComparator.INSTANCE);
        int size = this.layoutNodes.getSize();
        LayoutNode[] layoutNodeArr = this.cachedNodes;
        if (layoutNodeArr == null || layoutNodeArr.length < size) {
            layoutNodeArr = new LayoutNode[Math.max(16, this.layoutNodes.getSize())];
        }
        this.cachedNodes = null;
        int i2 = 0;
        while (true) {
            mutableVector = this.layoutNodes;
            if (i2 >= size) {
                break;
            }
            layoutNodeArr[i2] = mutableVector.content[i2];
            i2++;
        }
        mutableVector.clear();
        while (true) {
            size--;
            if (size < 0) {
                this.cachedNodes = layoutNodeArr;
                return;
            }
            LayoutNode layoutNode = layoutNodeArr[size];
            if (layoutNode == null) {
                x.g();
            }
            if (layoutNode.getNeedsOnGloballyPositionedDispatch$ui()) {
                dispatchHierarchy(layoutNode);
            }
            layoutNodeArr[size] = null;
        }
    }

    public final boolean isNotEmpty() {
        return this.layoutNodes.getSize() != 0;
    }

    public final void onNodePositioned(LayoutNode layoutNode) {
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            this.layoutNodes.add(layoutNode);
            layoutNode.setNeedsOnGloballyPositionedDispatch$ui(true);
        }
    }

    public final void onRootNodePositioned(LayoutNode layoutNode) {
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            this.layoutNodes.clear();
            this.layoutNodes.add(layoutNode);
            layoutNode.setNeedsOnGloballyPositionedDispatch$ui(true);
        }
    }

    public final void remove(LayoutNode layoutNode) {
        this.layoutNodes.remove(layoutNode);
    }

    /* compiled from: WazeSource */
    public final class Companion {

        /* compiled from: WazeSource */
        final class DepthComparator implements Comparator<LayoutNode> {
            public static final DepthComparator INSTANCE = new DepthComparator();

            private DepthComparator() {
            }

            @Override // java.util.Comparator
            public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                int iA = x.a(layoutNode2.getDepth$ui(), layoutNode.getDepth$ui());
                return iA != 0 ? iA : x.a(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
