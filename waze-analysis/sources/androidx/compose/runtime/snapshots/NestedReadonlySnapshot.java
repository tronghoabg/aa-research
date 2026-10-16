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
public final class NestedReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;
    private final Snapshot parent;
    private final l<Object, ab> readObserver;

    public NestedReadonlySnapshot(long j2, SnapshotIdSet snapshotIdSet, l<Object, ab> lVar, Snapshot snapshot) {
        super(j2, snapshotIdSet, (o) null);
        this.readObserver = lVar;
        this.parent = snapshot;
        snapshot.mo7620nestedActivated$runtime(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime()) {
            return;
        }
        if (getSnapshotId() != this.parent.getSnapshotId()) {
            closeAndReleasePinning$runtime();
        }
        NestedReadonlySnapshot nestedReadonlySnapshot = this;
        this.parent.mo7621nestedDeactivated$runtime(nestedReadonlySnapshot);
        super.dispose();
        SnapshotObserverKt.dispatchObserverOnPreDispose(nestedReadonlySnapshot);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime() {
        return null;
    }

    public final Snapshot getParent() {
        return this.parent;
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
        return this.parent.getRoot();
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
    /* renamed from: nestedActivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo7620nestedActivated$runtime(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new e();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo7621nestedDeactivated$runtime(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new e();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime, reason: merged with bridge method [inline-methods] */
    public Void mo7622recordModified$runtime(StateObject stateObject) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new e();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public NestedReadonlySnapshot takeNestedSnapshot(l<Object, ab> lVar) {
        Map map;
        NestedReadonlySnapshot nestedReadonlySnapshot = this;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            k<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> kVarMergeObservers = SnapshotObserverKt.mergeObservers(persistentList, nestedReadonlySnapshot, true, lVar, null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) kVarMergeObservers.c();
            l<Object, ab> readObserver = snapshotInstanceObservers.getReadObserver();
            snapshotInstanceObservers.getWriteObserver();
            map = (Map) kVarMergeObservers.d();
            lVar = readObserver;
        } else {
            map = null;
        }
        NestedReadonlySnapshot nestedReadonlySnapshot2 = new NestedReadonlySnapshot(getSnapshotId(), getInvalid$runtime(), SnapshotKt.mergedReadObserver(lVar, getReadObserver(), false | (!((4 & 4) == 0))), getParent());
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, nestedReadonlySnapshot, nestedReadonlySnapshot2, map);
        }
        return nestedReadonlySnapshot2;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public /* bridge */ /* synthetic */ Snapshot takeNestedSnapshot(l lVar) {
        return takeNestedSnapshot((l<Object, ab>) lVar);
    }
}
