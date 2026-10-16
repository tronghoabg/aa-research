package androidx.compose.runtime.snapshots.tooling;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import e.c.d.a;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.k;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SnapshotObserverKt {
    private static PersistentList<? extends SnapshotObserver> observers;

    public static final <R extends Snapshot> R creatingSnapshot(Snapshot snapshot, l<Object, ab> lVar, l<Object, ab> lVar2, boolean z, p<? super l<Object, ab>, ? super l<Object, ab>, ? extends R> pVar) {
        Map map;
        PersistentList persistentList = observers;
        if (persistentList != null) {
            k<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> kVarMergeObservers = mergeObservers(persistentList, snapshot, z, lVar, lVar2);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) kVarMergeObservers.c();
            l<Object, ab> readObserver = snapshotInstanceObservers.getReadObserver();
            lVar2 = snapshotInstanceObservers.getWriteObserver();
            map = (Map) kVarMergeObservers.d();
            lVar = readObserver;
        } else {
            map = null;
        }
        R rInvoke = pVar.invoke(lVar, lVar2);
        if (persistentList != null) {
            dispatchCreatedObservers(persistentList, snapshot, rInvoke, map);
        }
        return rInvoke;
    }

    public static final void dispatchCreatedObservers(PersistentList<? extends SnapshotObserver> persistentList, Snapshot snapshot, Snapshot snapshot2, Map<SnapshotObserver, SnapshotInstanceObservers> map) {
        PersistentList<? extends SnapshotObserver> persistentList2 = persistentList;
        int size = persistentList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            SnapshotObserver snapshotObserver = persistentList2.get(i2);
            snapshotObserver.onCreated(snapshot2, snapshot, map != null ? map.get(snapshotObserver) : null);
        }
    }

    public static final void dispatchObserverOnApplied(Snapshot snapshot, ScatterSet<StateObject> scatterSet) {
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        PersistentList<? extends SnapshotObserver> persistentList2 = persistentList;
        if (persistentList2 == null || persistentList2.isEmpty()) {
            return;
        }
        Set<? extends Object> setWrapIntoSet = scatterSet != null ? ScatterSetWrapperKt.wrapIntoSet(scatterSet) : a.p();
        PersistentList<? extends SnapshotObserver> persistentList3 = persistentList;
        int size = persistentList3.size();
        for (int i2 = 0; i2 < size; i2++) {
            persistentList3.get(i2).onApplied(snapshot, setWrapIntoSet);
        }
    }

    public static final void dispatchObserverOnPreDispose(Snapshot snapshot) {
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        if (persistentList != null) {
            PersistentList<? extends SnapshotObserver> persistentList2 = persistentList;
            int size = persistentList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                persistentList2.get(i2).onPreDispose(snapshot);
            }
        }
    }

    public static final k<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers(PersistentList<? extends SnapshotObserver> persistentList, Snapshot snapshot, boolean z, l<Object, ab> lVar, l<Object, ab> lVar2) {
        PersistentList<? extends SnapshotObserver> persistentList2 = persistentList;
        int size = persistentList2.size();
        LinkedHashMap linkedHashMap = null;
        for (int i2 = 0; i2 < size; i2++) {
            SnapshotObserver snapshotObserver = persistentList2.get(i2);
            SnapshotInstanceObservers snapshotInstanceObserversOnPreCreate = snapshotObserver.onPreCreate(snapshot, z);
            if (snapshotInstanceObserversOnPreCreate != null) {
                lVar = mergeObservers(snapshotInstanceObserversOnPreCreate.getReadObserver(), lVar);
                lVar2 = mergeObservers(snapshotInstanceObserversOnPreCreate.getWriteObserver(), lVar2);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(snapshotObserver, snapshotInstanceObserversOnPreCreate);
            }
        }
        return new k<>(new SnapshotInstanceObservers(lVar, lVar2), linkedHashMap);
    }

    static final ab mergeObservers$lambda$1(l lVar, l lVar2, Object obj) {
        lVar.invoke(obj);
        lVar2.invoke(obj);
        return ab.f48028a;
    }

    public static final ObserverHandle observeSnapshots(Snapshot.Companion companion, final SnapshotObserver snapshotObserver) {
        synchronized (SnapshotKt.getLock()) {
            PersistentList<? extends SnapshotObserver> persistentListPersistentListOf = observers;
            if (persistentListPersistentListOf == null) {
                persistentListPersistentListOf = ExtensionsKt.persistentListOf();
            }
            observers = persistentListPersistentListOf.add((PersistentList<? extends SnapshotObserver>) snapshotObserver);
        }
        return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt$$ExternalSyntheticLambda1
            @Override // androidx.compose.runtime.snapshots.ObserverHandle
            public final void dispose() {
                SnapshotObserverKt.observeSnapshots$lambda$1(snapshotObserver);
            }
        };
    }

    static final void observeSnapshots$lambda$1(SnapshotObserver snapshotObserver) {
        synchronized (SnapshotKt.getLock()) {
            PersistentList<? extends SnapshotObserver> persistentList = observers;
            PersistentList<? extends SnapshotObserver> persistentList2 = null;
            PersistentList<? extends SnapshotObserver> persistentListRemove = persistentList != null ? persistentList.remove((PersistentList<? extends SnapshotObserver>) snapshotObserver) : null;
            if (persistentListRemove != null && !persistentListRemove.isEmpty()) {
                persistentList2 = persistentListRemove;
            }
            observers = persistentList2;
        }
    }

    private static /* synthetic */ void getObservers$annotations() {
    }

    private static final l<Object, ab> mergeObservers(final l<Object, ab> lVar, final l<Object, ab> lVar2) {
        if (lVar == null || lVar2 == null) {
            return lVar == null ? lVar2 : lVar;
        }
        return new l() { // from class: androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SnapshotObserverKt.mergeObservers$lambda$1(lVar, lVar2, obj);
            }
        };
    }
}
