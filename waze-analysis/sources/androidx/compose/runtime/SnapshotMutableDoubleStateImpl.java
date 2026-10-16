package androidx.compose.runtime;

import androidx.compose.runtime.MutableDoubleState;
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
public class SnapshotMutableDoubleStateImpl extends StateObjectImpl implements MutableDoubleState, SnapshotMutableState<Double> {
    public static final int $stable = 0;
    private DoubleStateStateRecord next;

    public SnapshotMutableDoubleStateImpl(double d2) {
        Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
        DoubleStateStateRecord doubleStateStateRecord = new DoubleStateStateRecord(snapshotCurrentSnapshot.getSnapshotId(), d2);
        if (!(snapshotCurrentSnapshot instanceof GlobalSnapshot)) {
            doubleStateStateRecord.setNext$runtime(new DoubleStateStateRecord(SnapshotId_jvmKt.toSnapshotId(1), d2));
        }
        this.next = doubleStateStateRecord;
    }

    static final ab component2$lambda$0(SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl, double d2) {
        snapshotMutableDoubleStateImpl.setDoubleValue(d2);
        return ab.f48028a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public Double component1() {
        return Double.valueOf(getDoubleValue());
    }

    @Override // androidx.compose.runtime.MutableState
    public l<Double, ab> component2() {
        return new l() { // from class: androidx.compose.runtime.SnapshotMutableDoubleStateImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SnapshotMutableDoubleStateImpl.component2$lambda$0(this.f$0, ((Double) obj).doubleValue());
            }
        };
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState
    public double getDoubleValue() {
        return ((DoubleStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<Double> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    public /* synthetic */ Double getValue() {
        return MutableDoubleState.CC.$default$getValue((MutableDoubleState) this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObjectImpl, androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        x.d(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        x.d(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        if (((DoubleStateStateRecord) stateRecord2).getValue() == ((DoubleStateStateRecord) stateRecord3).getValue()) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        x.d(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.next = (DoubleStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableDoubleState
    public void setDoubleValue(double d2) {
        Snapshot current;
        DoubleStateStateRecord doubleStateStateRecord = (DoubleStateStateRecord) SnapshotKt.current(this.next);
        if (doubleStateStateRecord.getValue() == d2) {
            return;
        }
        DoubleStateStateRecord doubleStateStateRecord2 = this.next;
        SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl = this;
        DoubleStateStateRecord doubleStateStateRecord3 = doubleStateStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            ((DoubleStateStateRecord) SnapshotKt.overwritableRecord(doubleStateStateRecord2, snapshotMutableDoubleStateImpl, current, doubleStateStateRecord3)).setValue(d2);
        }
        SnapshotKt.notifyWrite(current, snapshotMutableDoubleStateImpl);
    }

    @Override // androidx.compose.runtime.MutableDoubleState
    public /* synthetic */ void setValue(double d2) {
        setDoubleValue(d2);
    }

    public String toString() {
        return "MutableDoubleState(value=" + ((DoubleStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.MutableState
    public /* bridge */ /* synthetic */ void setValue(Double d2) {
        setValue(d2.doubleValue());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Double, java.lang.Object] */
    @Override // androidx.compose.runtime.State
    public /* bridge */ /* synthetic */ Double getValue() {
        return getValue();
    }

    /* compiled from: WazeSource */
    final class DoubleStateStateRecord extends StateRecord {
        private double value;

        public DoubleStateStateRecord(long j2, double d2) {
            super(j2);
            this.value = d2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            x.d(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.value = ((DoubleStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long j2) {
            return new DoubleStateStateRecord(j2, this.value);
        }

        public final double getValue() {
            return this.value;
        }

        public final void setValue(double d2) {
            this.value = d2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return create(getSnapshotId$runtime());
        }
    }
}
