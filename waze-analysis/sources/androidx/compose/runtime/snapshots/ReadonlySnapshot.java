package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.b.o;
import h.k;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;
    private final l<Object, ab> readObserver;
    private int snapshots;

    public ReadonlySnapshot(long j2, SnapshotIdSet snapshotIdSet, l<Object, ab> lVar) {
        super(j2, snapshotIdSet, (o) null);
        this.readObserver = lVar;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime()) {
            return;
        }
        ReadonlySnapshot readonlySnapshot = this;
        mo7621nestedDeactivated$runtime(readonlySnapshot);
        super.dispose();
        SnapshotObserverKt.dispatchObserverOnPreDispose(readonlySnapshot);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime, reason: merged with bridge method [inline-methods] */
    public l<Object, ab> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public l<Object, ab> getWriteObserver$runtime() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime */
    public void mo7620nestedActivated$runtime(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime */
    public void mo7621nestedDeactivated$runtime(Snapshot snapshot) {
        int i2 = this.snapshots - 1;
        this.snapshots = i2;
        if (i2 == 0) {
            closeAndReleasePinning$runtime();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime */
    public void mo7622recordModified$runtime(StateObject stateObject) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new e();
    }

    public void setModified$runtime(MutableScatterSet<StateObject> mutableScatterSet) {
        SnapshotStateMapKt.unsupported();
        throw new e();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(l<Object, ab> lVar) {
        Object obj;
        Map map;
        ReadonlySnapshot readonlySnapshot = this;
        SnapshotKt.validateOpen(readonlySnapshot);
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            k<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> kVarMergeObservers = SnapshotObserverKt.mergeObservers(persistentList, readonlySnapshot, true, lVar, null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) kVarMergeObservers.c();
            l<Object, ab> readObserver = snapshotInstanceObservers.getReadObserver();
            snapshotInstanceObservers.getWriteObserver();
            map = (Map) kVarMergeObservers.d();
            obj = null;
            lVar = readObserver;
        } else {
            obj = null;
            map = null;
        }
        NestedReadonlySnapshot nestedReadonlySnapshot = new NestedReadonlySnapshot(getSnapshotId(), getInvalid$runtime(), SnapshotKt.mergedReadObserver(lVar, getReadObserver(), false | (!((4 & 4) == 0))), readonlySnapshot);
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, readonlySnapshot, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
    }
}
