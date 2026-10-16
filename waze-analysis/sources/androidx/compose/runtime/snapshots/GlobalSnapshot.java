package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import h.ab;
import h.e;
import h.g.a.l;
import h.k;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GlobalSnapshot extends MutableSnapshot {
    public static final int $stable = 8;

    public GlobalSnapshot(long j2, SnapshotIdSet snapshotIdSet) {
        super(j2, snapshotIdSet, null, new l() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return GlobalSnapshot._init_$lambda$0(obj);
            }
        });
    }

    static final ab _init_$lambda$0(Object obj) {
        synchronized (SnapshotKt.getLock()) {
            List list = SnapshotKt.globalWriteObservers;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((l) list.get(i2)).invoke(obj);
            }
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime();
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo7620nestedActivated$runtime(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new e();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo7621nestedDeactivated$runtime(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new e();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
        SnapshotKt.advanceGlobalSnapshot();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot takeNestedMutableSnapshot(final l<Object, ab> lVar, l<Object, ab> lVar2) {
        final l<Object, ab> lVar3;
        Map map;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            k<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> kVarMergeObservers = SnapshotObserverKt.mergeObservers(persistentList, null, false, lVar, lVar2);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) kVarMergeObservers.c();
            l<Object, ab> readObserver = snapshotInstanceObservers.getReadObserver();
            l<Object, ab> writeObserver = snapshotInstanceObservers.getWriteObserver();
            map = (Map) kVarMergeObservers.d();
            lVar = readObserver;
            lVar3 = writeObserver;
        } else {
            lVar3 = lVar2;
            map = null;
        }
        MutableSnapshot mutableSnapshot = (MutableSnapshot) SnapshotKt.takeNewSnapshot(new l<SnapshotIdSet, MutableSnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedMutableSnapshot$1$1
            @Override // h.g.a.l
            public final MutableSnapshot invoke(SnapshotIdSet snapshotIdSet) {
                long j2;
                synchronized (SnapshotKt.getLock()) {
                    j2 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId++;
                }
                return new MutableSnapshot(j2, snapshotIdSet, lVar, lVar3);
            }
        });
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, null, mutableSnapshot, map);
        }
        return mutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(final l<Object, ab> lVar) {
        Map map;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            k<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> kVarMergeObservers = SnapshotObserverKt.mergeObservers(persistentList, null, true, lVar, null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) kVarMergeObservers.c();
            l<Object, ab> readObserver = snapshotInstanceObservers.getReadObserver();
            snapshotInstanceObservers.getWriteObserver();
            map = (Map) kVarMergeObservers.d();
            lVar = readObserver;
        } else {
            map = null;
        }
        ReadonlySnapshot readonlySnapshot = (ReadonlySnapshot) SnapshotKt.takeNewSnapshot(new l<SnapshotIdSet, ReadonlySnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedSnapshot$1$1
            @Override // h.g.a.l
            public final ReadonlySnapshot invoke(SnapshotIdSet snapshotIdSet) {
                long j2;
                synchronized (SnapshotKt.getLock()) {
                    j2 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId++;
                }
                return new ReadonlySnapshot(j2, snapshotIdSet, lVar);
            }
        });
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, null, readonlySnapshot, map);
        }
        return readonlySnapshot;
    }
}
