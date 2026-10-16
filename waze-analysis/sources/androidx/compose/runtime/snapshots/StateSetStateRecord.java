package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StateSetStateRecord<T> extends StateRecord {
    public static final int $stable = 8;
    private int modification;
    private PersistentSet<? extends T> set;

    public StateSetStateRecord(long j2, PersistentSet<? extends T> persistentSet) {
        super(j2);
        this.set = persistentSet;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public void assign(StateRecord stateRecord) {
        synchronized (SnapshotStateSetKt.sync) {
            x.d(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.StateSetStateRecord>");
            StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) stateRecord;
            this.set = stateSetStateRecord.set;
            this.modification = stateSetStateRecord.modification;
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public StateRecord create() {
        return new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.set);
    }

    public final int getModification$runtime() {
        return this.modification;
    }

    public final PersistentSet<T> getSet$runtime() {
        return this.set;
    }

    public final void setModification$runtime(int i2) {
        this.modification = i2;
    }

    public final void setSet$runtime(PersistentSet<? extends T> persistentSet) {
        this.set = persistentSet;
    }

    @Override // androidx.compose.runtime.snapshots.StateRecord
    public StateRecord create(long j2) {
        return new StateSetStateRecord(j2, this.set);
    }
}
