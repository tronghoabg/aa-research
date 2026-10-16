package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StateListStateRecord<T> extends StateRecord {
    public static final int $stable = 8;
    private PersistentList<? extends T> list;
    private int modification;
    private int structuralChange;

    public StateListStateRecord(long j2, PersistentList<? extends T> persistentList) {
        super(j2);
        this.list = persistentList;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public void assign(StateRecord stateRecord) {
        synchronized (SnapshotStateListKt.sync) {
            x.d(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            StateListStateRecord stateListStateRecord = (StateListStateRecord) stateRecord;
            this.list = stateListStateRecord.list;
            this.modification = stateListStateRecord.modification;
            this.structuralChange = stateListStateRecord.structuralChange;
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public StateRecord create() {
        return create(SnapshotKt.currentSnapshot().getSnapshotId());
    }

    public final PersistentList<T> getList$runtime() {
        return this.list;
    }

    public final int getModification$runtime() {
        return this.modification;
    }

    public final int getStructuralChange$runtime() {
        return this.structuralChange;
    }

    public final void setList$runtime(PersistentList<? extends T> persistentList) {
        this.list = persistentList;
    }

    public final void setModification$runtime(int i2) {
        this.modification = i2;
    }

    public final void setStructuralChange$runtime(int i2) {
        this.structuralChange = i2;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public StateRecord create(long j2) {
        return new StateListStateRecord(j2, this.list);
    }
}
