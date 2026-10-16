package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DepthSortedSet {
    public static final int $stable = 8;
    private final boolean extraAssertions;
    private MutableObjectIntMap<LayoutNode> mapOfOriginalDepth;
    private final SortedSet<LayoutNode> set = new SortedSet<>(DepthSortedSetKt.DepthComparator);

    public DepthSortedSet(boolean z) {
        this.extraAssertions = z;
    }

    private final MutableObjectIntMap<LayoutNode> safeMapOfOriginalDepth() {
        MutableObjectIntMap<LayoutNode> mutableObjectIntMapMutableObjectIntMapOf = this.mapOfOriginalDepth;
        if (mutableObjectIntMapMutableObjectIntMapOf == null) {
            mutableObjectIntMapMutableObjectIntMapOf = ObjectIntMapKt.mutableObjectIntMapOf();
            this.mapOfOriginalDepth = mutableObjectIntMapMutableObjectIntMapOf;
        }
        if (mutableObjectIntMapMutableObjectIntMapOf == null) {
            x.g();
        }
        return mutableObjectIntMapMutableObjectIntMapOf;
    }

    public final void add(LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            MutableObjectIntMap<LayoutNode> mutableObjectIntMapSafeMapOfOriginalDepth = safeMapOfOriginalDepth();
            int orDefault = mutableObjectIntMapSafeMapOfOriginalDepth.getOrDefault(layoutNode, Integer.MAX_VALUE);
            if (orDefault == Integer.MAX_VALUE) {
                mutableObjectIntMapSafeMapOfOriginalDepth.set(layoutNode, layoutNode.getDepth$ui());
            } else if (orDefault != layoutNode.getDepth$ui()) {
                InlineClassHelperKt.throwIllegalStateException("invalid node depth");
            }
        }
        this.set.add(layoutNode);
    }

    public final boolean contains(LayoutNode layoutNode) {
        boolean z = this.extraAssertions;
        boolean zContains = this.set.contains(layoutNode);
        if (z && zContains != safeMapOfOriginalDepth().containsKey(layoutNode)) {
            InlineClassHelperKt.throwIllegalStateException("inconsistency in TreeSet");
        }
        return zContains;
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final LayoutNode pop() {
        LayoutNode layoutNodeFirst = this.set.first();
        remove(layoutNodeFirst);
        return layoutNodeFirst;
    }

    public final void popEach(l<? super LayoutNode, ab> lVar) {
        while (!isEmpty()) {
            lVar.invoke(pop());
        }
    }

    public final boolean remove(LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.set.remove(layoutNode);
        if (this.extraAssertions) {
            MutableObjectIntMap<LayoutNode> mutableObjectIntMapSafeMapOfOriginalDepth = safeMapOfOriginalDepth();
            if (mutableObjectIntMapSafeMapOfOriginalDepth.containsKey(layoutNode)) {
                int i2 = mutableObjectIntMapSafeMapOfOriginalDepth.get(layoutNode);
                mutableObjectIntMapSafeMapOfOriginalDepth.remove(layoutNode);
                if (i2 != (zRemove ? layoutNode.getDepth$ui() : Integer.MAX_VALUE)) {
                    InlineClassHelperKt.throwIllegalStateException("invalid node depth");
                }
            }
        }
        return zRemove;
    }

    public String toString() {
        return this.set.toString();
    }
}
