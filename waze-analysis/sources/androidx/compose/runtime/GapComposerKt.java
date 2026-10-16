package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.KeyInfo;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GapComposerKt {
    private static final Comparator<Invalidation> InvalidationLocationAscending = new Comparator() { // from class: androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return x.a(((Invalidation) obj).getLocation(), ((Invalidation) obj2).getLocation());
        }
    };
    public static final int nodeKey = 125;
    public static final int rootKey = 100;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i2) {
        return i2 != 0;
    }

    public static final GapRememberObserverHolder asGapRememberObserverHolder(RememberObserverHolder rememberObserverHolder) {
        GapRememberObserverHolder gapRememberObserverHolder = rememberObserverHolder instanceof GapRememberObserverHolder ? (GapRememberObserverHolder) rememberObserverHolder : null;
        if (gapRememberObserverHolder != null) {
            return gapRememberObserverHolder;
        }
        ComposerKt.composeRuntimeError("Inconsistent composition");
        throw new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> collectNodesFrom(SlotTable slotTable, GapAnchor gapAnchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$0$collectFromGroup(slotReaderOpenReader, arrayList, slotTable.anchorIndex(gapAnchor));
            return arrayList;
        } finally {
            slotReaderOpenReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$0$collectFromGroup(SlotReader slotReader, List<Object> list, int i2) {
        if (slotReader.isNode(i2)) {
            list.add(slotReader.node(i2));
            return;
        }
        int iGroupSize = i2 + 1;
        int iGroupSize2 = i2 + slotReader.groupSize(i2);
        while (iGroupSize < iGroupSize2) {
            collectNodesFrom$lambda$0$collectFromGroup(slotReader, list, iGroupSize);
            iGroupSize += slotReader.groupSize(iGroupSize);
        }
    }

    public static final void deactivateCurrentGroup(final SlotWriter slotWriter, final RememberManager rememberManager) {
        slotWriter.forAllDataInRememberOrder(slotWriter.getCurrentGroup(), new p() { // from class: androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return GapComposerKt.deactivateCurrentGroup$lambda$0(rememberManager, slotWriter, ((Integer) obj).intValue(), obj2);
            }
        });
    }

    static final ab deactivateCurrentGroup$lambda$0(RememberManager rememberManager, SlotWriter slotWriter, int i2, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            rememberManager.deactivating((ComposeNodeLifecycleCallback) obj);
        } else if (!(obj instanceof ReusableRememberObserverHolder)) {
            if (obj instanceof RememberObserverHolder) {
                removeData(slotWriter, i2, obj);
                rememberManager.forgetting((RememberObserverHolder) obj);
            } else if (obj instanceof RecomposeScopeImpl) {
                removeData(slotWriter, i2, obj);
                ((RecomposeScopeImpl) obj).release();
            }
        }
        return ab.f48028a;
    }

    private static final int distanceFrom(SlotReader slotReader, int i2, int i3) {
        int i4 = 0;
        while (i2 > 0 && i2 != i3) {
            i2 = slotReader.parent(i2);
            i4++;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int findInsertLocation(List<Invalidation> list, int i2) {
        int iFindLocation = findLocation(list, i2);
        return iFindLocation < 0 ? -(iFindLocation + 1) : iFindLocation;
    }

    private static final int findLocation(List<Invalidation> list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iA = x.a(list.get(i4).getLocation(), i2);
            if (iA < 0) {
                i3 = i4 + 1;
            } else {
                if (iA <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation firstInRange(List<Invalidation> list, int i2, int i3) {
        int iFindInsertLocation = findInsertLocation(list, i2);
        if (iFindInsertLocation >= list.size()) {
            return null;
        }
        Invalidation invalidation = list.get(iFindInsertLocation);
        if (invalidation.getLocation() < i3) {
            return invalidation;
        }
        return null;
    }

    private static final void forEachInRange(List<Invalidation> list, int i2, int i3, l<? super Invalidation, ab> lVar) {
        for (int iFindInsertLocation = findInsertLocation(list, i2); iFindInsertLocation < list.size(); iFindInsertLocation++) {
            Invalidation invalidation = list.get(iFindInsertLocation);
            if (invalidation.getLocation() >= i3) {
                return;
            }
            lVar.invoke(invalidation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if (x.n(joinedKey.getLeft(), obj2) && x.n(joinedKey.getRight(), obj3)) {
            return obj;
        }
        Object key = getKey(joinedKey.getLeft(), obj2, obj3);
        return key == null ? getKey(joinedKey.getRight(), obj2, obj3) : key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIfMissing(List<Invalidation> list, int i2, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int iFindLocation = findLocation(list, i2);
        if (iFindLocation < 0) {
            int i3 = iFindLocation + 1;
            if (true != (obj instanceof DerivedState)) {
                obj = null;
            }
            list.add(-i3, new Invalidation(recomposeScopeImpl, i2, obj));
            return;
        }
        Invalidation invalidation = list.get(iFindLocation);
        if (!(obj instanceof DerivedState)) {
            invalidation.setInstances(null);
            return;
        }
        Object instances = invalidation.getInstances();
        if (instances == null) {
            invalidation.setInstances(obj);
        } else if (instances instanceof MutableScatterSet) {
            ((MutableScatterSet) instances).add(obj);
        } else {
            invalidation.setInstances(ScatterSetKt.mutableScatterSetOf(instances, obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> MutableScatterMap<Object, Object> multiMap(int i2) {
        return new MutableScatterMap<>(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(SlotReader slotReader, int i2, int i3, int i4) {
        if (i2 != i3) {
            if (i2 == i4 || i3 == i4) {
                return i4;
            }
            if (slotReader.parent(i2) == i3) {
                return i3;
            }
            if (slotReader.parent(i3) != i2) {
                if (slotReader.parent(i2) == slotReader.parent(i3)) {
                    return slotReader.parent(i2);
                }
                int iDistanceFrom = distanceFrom(slotReader, i2, i4);
                int iDistanceFrom2 = distanceFrom(slotReader, i3, i4);
                int i5 = iDistanceFrom - iDistanceFrom2;
                for (int i6 = 0; i6 < i5; i6++) {
                    i2 = slotReader.parent(i2);
                }
                int i7 = iDistanceFrom2 - iDistanceFrom;
                for (int i8 = 0; i8 < i7; i8++) {
                    i3 = slotReader.parent(i3);
                }
                while (i2 != i3) {
                    i2 = slotReader.parent(i2);
                    i3 = slotReader.parent(i3);
                }
                return i2;
            }
        }
        return i2;
    }

    private static final void removeData(SlotWriter slotWriter, int i2, Object obj) {
        Object objClear = slotWriter.clear(i2);
        if (obj == objClear) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError("Slot table is out of sync (expected " + obj + ", got " + objClear + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation removeLocation(List<Invalidation> list, int i2) {
        int iFindLocation = findLocation(list, i2);
        if (iFindLocation >= 0) {
            return list.remove(iFindLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(List<Invalidation> list, int i2, int i3) {
        int iFindInsertLocation = findInsertLocation(list, i2);
        while (iFindInsertLocation < list.size() && list.get(iFindInsertLocation).getLocation() < i3) {
            list.remove(iFindInsertLocation);
        }
    }

    public static final ReusableGapRememberObserverHolder asGapRememberObserverHolder(ReusableGapRememberObserverHolder reusableGapRememberObserverHolder) {
        if (true != (reusableGapRememberObserverHolder instanceof ReusableGapRememberObserverHolder)) {
            reusableGapRememberObserverHolder = null;
        }
        if (reusableGapRememberObserverHolder != null) {
            return reusableGapRememberObserverHolder;
        }
        ComposerKt.composeRuntimeError("Inconsistent composition");
        throw new e();
    }
}
