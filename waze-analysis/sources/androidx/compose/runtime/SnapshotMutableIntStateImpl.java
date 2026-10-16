package androidx.compose.runtime;

import androidx.compose.runtime.MutableIntState;
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
public class SnapshotMutableIntStateImpl extends StateObjectImpl implements MutableIntState, SnapshotMutableState<Integer> {
    public static final int $stable = 0;
    private IntStateStateRecord next;

    public SnapshotMutableIntStateImpl(int i2) {
        Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
        IntStateStateRecord intStateStateRecord = new IntStateStateRecord(snapshotCurrentSnapshot.getSnapshotId(), i2);
        if (!(snapshotCurrentSnapshot instanceof GlobalSnapshot)) {
            intStateStateRecord.setNext$runtime(new IntStateStateRecord(SnapshotId_jvmKt.toSnapshotId(1), i2));
        }
        this.next = intStateStateRecord;
    }

    static final ab component2$lambda$0(SnapshotMutableIntStateImpl snapshotMutableIntStateImpl, int i2) {
        snapshotMutableIntStateImpl.setIntValue(i2);
        return ab.f48028a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public Integer component1() {
        return Integer.valueOf(getIntValue());
    }

    @Override // androidx.compose.runtime.MutableState
    public l<Integer, ab> component2() {
        return new l() { // from class: androidx.compose.runtime.SnapshotMutableIntStateImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SnapshotMutableIntStateImpl.component2$lambda$0(this.f$0, ((Integer) obj).intValue());
            }
        };
    }

    public final int getDebuggerDisplayValue() {
        return ((IntStateStateRecord) SnapshotKt.current(this.next)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableIntState, androidx.compose.runtime.IntState
    public int getIntValue() {
        return ((IntStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<Integer> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableIntState, androidx.compose.runtime.IntState, androidx.compose.runtime.State
    public /* synthetic */ Integer getValue() {
        return MutableIntState.CC.$default$getValue((MutableIntState) this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObjectImpl, androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        x.d(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        x.d(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((IntStateStateRecord) stateRecord2).getValue() == ((IntStateStateRecord) stateRecord3).getValue()) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        x.d(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.next = (IntStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableIntState
    public void setIntValue(int i2) {
        Snapshot current;
        IntStateStateRecord intStateStateRecord = (IntStateStateRecord) SnapshotKt.current(this.next);
        if (intStateStateRecord.getValue() != i2) {
            IntStateStateRecord intStateStateRecord2 = this.next;
            SnapshotMutableIntStateImpl snapshotMutableIntStateImpl = this;
            IntStateStateRecord intStateStateRecord3 = intStateStateRecord;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                ((IntStateStateRecord) SnapshotKt.overwritableRecord(intStateStateRecord2, snapshotMutableIntStateImpl, current, intStateStateRecord3)).setValue(i2);
            }
            SnapshotKt.notifyWrite(current, snapshotMutableIntStateImpl);
        }
    }

    @Override // androidx.compose.runtime.MutableIntState
    public /* synthetic */ void setValue(int i2) {
        setIntValue(i2);
    }

    public String toString() {
        return "MutableIntState(value=" + ((IntStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.MutableState
    public /* bridge */ /* synthetic */ void setValue(Integer num) {
        setValue(num.intValue());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Integer, java.lang.Object] */
    @Override // androidx.compose.runtime.State
    public /* bridge */ /* synthetic */ Integer getValue() {
        return getValue();
    }

    /* compiled from: WazeSource */
    final class IntStateStateRecord extends StateRecord {
        private int value;

        public IntStateStateRecord(long j2, int i2) {
            super(j2);
            this.value = i2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            x.d(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.value = ((IntStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i2) {
            this.value = i2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long j2) {
            return new IntStateStateRecord(j2, this.value);
        }
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }
}
