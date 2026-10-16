package androidx.compose.runtime.snapshots;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class StateRecord {
    public static final int $stable = 8;
    private StateRecord next;
    private long snapshotId;

    public StateRecord() {
        this(SnapshotKt.currentSnapshot().getSnapshotId());
    }

    public abstract void assign(StateRecord stateRecord);

    public abstract StateRecord create();

    public /* synthetic */ StateRecord create(int i2) {
        StateRecord stateRecordCreate = create();
        stateRecordCreate.snapshotId = SnapshotId_jvmKt.toSnapshotId(i2);
        return stateRecordCreate;
    }

    public final StateRecord getNext$runtime() {
        return this.next;
    }

    public final long getSnapshotId$runtime() {
        return this.snapshotId;
    }

    public final void setNext$runtime(StateRecord stateRecord) {
        this.next = stateRecord;
    }

    public final void setSnapshotId$runtime(long j2) {
        this.snapshotId = j2;
    }

    public StateRecord create(long j2) {
        StateRecord stateRecordCreate = create();
        stateRecordCreate.snapshotId = j2;
        return stateRecordCreate;
    }

    public StateRecord(long j2) {
        this.snapshotId = j2;
    }

    public StateRecord(int i2) {
        this(SnapshotId_jvmKt.toSnapshotId(i2));
    }
}
