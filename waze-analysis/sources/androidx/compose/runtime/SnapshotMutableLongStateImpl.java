package androidx.compose.runtime;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class SnapshotMutableLongStateImpl extends StateObjectImpl implements MutableLongState, SnapshotMutableState<Long> {
    public static final int $stable = 0;
    private LongStateStateRecord next;

    public SnapshotMutableLongStateImpl(long j2) {
        Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
        LongStateStateRecord longStateStateRecord = new LongStateStateRecord(snapshotCurrentSnapshot.getSnapshotId(), j2);
        if (!(snapshotCurrentSnapshot instanceof GlobalSnapshot)) {
            longStateStateRecord.setNext$runtime(new LongStateStateRecord(SnapshotId_jvmKt.toSnapshotId(1), j2));
        }
        this.next = longStateStateRecord;
    }

    static final ab component2$lambda$0(SnapshotMutableLongStateImpl snapshotMutableLongStateImpl, long j2) {
        snapshotMutableLongStateImpl.setLongValue(j2);
        return ab.f48028a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public Long component1() {
        return Long.valueOf(getLongValue());
    }

    @Override // androidx.compose.runtime.MutableState
    public l<Long, ab> component2() {
        return new l() { // from class: androidx.compose.runtime.SnapshotMutableLongStateImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SnapshotMutableLongStateImpl.component2$lambda$0(this.f$0, ((Long) obj).longValue());
            }
        };
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState
    public long getLongValue() {
        return ((LongStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<Long> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState, androidx.compose.runtime.State
    public /* synthetic */ Long getValue() {
        return MutableLongState.CC.$default$getValue((MutableLongState) this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObjectImpl, androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        x.d(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        x.d(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((LongStateStateRecord) stateRecord2).getValue() == ((LongStateStateRecord) stateRecord3).getValue()) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        x.d(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.next = (LongStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableLongState
    public void setLongValue(long j2) {
        Snapshot current;
        LongStateStateRecord longStateStateRecord = (LongStateStateRecord) SnapshotKt.current(this.next);
        if (longStateStateRecord.getValue() != j2) {
            LongStateStateRecord longStateStateRecord2 = this.next;
            SnapshotMutableLongStateImpl snapshotMutableLongStateImpl = this;
            LongStateStateRecord longStateStateRecord3 = longStateStateRecord;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                ((LongStateStateRecord) SnapshotKt.overwritableRecord(longStateStateRecord2, snapshotMutableLongStateImpl, current, longStateStateRecord3)).setValue(j2);
            }
            SnapshotKt.notifyWrite(current, snapshotMutableLongStateImpl);
        }
    }

    @Override // androidx.compose.runtime.MutableLongState
    public /* synthetic */ void setValue(long j2) {
        setLongValue(j2);
    }

    public String toString() {
        return "MutableLongState(value=" + ((LongStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.MutableState
    public /* bridge */ /* synthetic */ void setValue(Long l2) {
        setValue(l2.longValue());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Long, java.lang.Object] */
    @Override // androidx.compose.runtime.State
    public /* bridge */ /* synthetic */ Long getValue() {
        return getValue();
    }

    /* compiled from: WazeSource */
    final class LongStateStateRecord extends StateRecord {
        private long value;

        public LongStateStateRecord(long j2, long j3) {
            super(j2);
            this.value = j3;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            x.d(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.value = ((LongStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        public final long getValue() {
            return this.value;
        }

        public final void setValue(long j2) {
            this.value = j2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long j2) {
            return new LongStateStateRecord(j2, this.value);
        }
    }
}
