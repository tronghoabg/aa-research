package androidx.navigationevent;

import androidx.collection.MutableOrderedScatterSet;
import androidx.collection.OrderedScatterSet;
import androidx.collection.OrderedScatterSetKt;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavigationEventDispatcherKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> OrderedScatterSet<T> toOrderedScatterSet(OrderedScatterSet<T> orderedScatterSet) {
        if (orderedScatterSet.isEmpty()) {
            return OrderedScatterSetKt.emptyOrderedScatterSet();
        }
        MutableOrderedScatterSet mutableOrderedScatterSet = new MutableOrderedScatterSet(orderedScatterSet.getSize());
        mutableOrderedScatterSet.addAll(orderedScatterSet);
        return mutableOrderedScatterSet;
    }
}
