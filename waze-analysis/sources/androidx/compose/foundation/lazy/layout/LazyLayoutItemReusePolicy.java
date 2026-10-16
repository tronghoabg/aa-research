package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableOrderedScatterSet;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.SieveCacheKt;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LazyLayoutItemReusePolicy implements SubcomposeSlotReusePolicy {
    private final MutableObjectIntMap<Object> countPerType = ObjectIntMapKt.mutableObjectIntMapOf();
    private final LazyLayoutItemContentFactory factory;

    public LazyLayoutItemReusePolicy(LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        this.factory = lazyLayoutItemContentFactory;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(Object obj, Object obj2) {
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.factory;
        return x.n(lazyLayoutItemContentFactory.getContentType(obj), lazyLayoutItemContentFactory.getContentType(obj2));
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        this.countPerType.clear();
        MutableOrderedScatterSet<Object> set = slotIdsSet.getSet();
        Object[] objArr = set.elements;
        long[] jArr = set.nodes;
        int i2 = set.tail;
        while (i2 != Integer.MAX_VALUE) {
            long j2 = jArr[i2] >> 31;
            Object obj = objArr[i2];
            Object contentType = this.factory.getContentType(obj);
            int orDefault = this.countPerType.getOrDefault(contentType, 0);
            int i3 = (int) (j2 & SieveCacheKt.NodeLinkMask);
            if (orDefault == 7) {
                slotIdsSet.remove(obj);
            } else {
                this.countPerType.set(contentType, orDefault + 1);
            }
            i2 = i3;
        }
    }
}
