package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import h.a.c;
import h.a.i;
import h.ab;
import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class MutableSnapshot extends Snapshot {
    private boolean applied;
    private List<? extends StateObject> merged;
    private MutableScatterSet<StateObject> modified;
    private SnapshotIdSet previousIds;
    private int[] previousPinnedSnapshots;
    private final l<Object, ab> readObserver;
    private int snapshots;
    private int writeCount;
    private final l<Object, ab> writeObserver;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] EmptyIntArray = new int[0];

    public MutableSnapshot(long j2, SnapshotIdSet snapshotIdSet, l<Object, ab> lVar, l<Object, ab> lVar2) {
        super(j2, snapshotIdSet, (o) null);
        this.readObserver = lVar;
        this.writeObserver = lVar2;
        this.previousIds = SnapshotIdSet.Companion.getEMPTY();
        this.previousPinnedSnapshots = EmptyIntArray;
        this.snapshots = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void abandon() {
        /*
            r18 = this;
            r0 = r18
            androidx.collection.MutableScatterSet r1 = r0.getModified$runtime()
            if (r1 == 0) goto L83
            r0.validateNotApplied()
            r2 = 0
            r0.setModified$runtime(r2)
            long r2 = r0.getSnapshotId()
            androidx.collection.ScatterSet r1 = (androidx.collection.ScatterSet) r1
            java.lang.Object[] r4 = r1.elements
            long[] r1 = r1.metadata
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L83
            r6 = 0
            r7 = r6
        L20:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L7e
            int r10 = r7 - r5
            r11 = r6
        L33:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L7c
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L78
            int r12 = r7 << 3
            int r12 = r12 + r11
            r12 = r4[r12]
            androidx.compose.runtime.snapshots.StateObject r12 = (androidx.compose.runtime.snapshots.StateObject) r12
            androidx.compose.runtime.snapshots.StateRecord r12 = r12.getFirstStateRecord()
        L50:
            if (r12 == 0) goto L78
            long r14 = r12.getSnapshotId$runtime()
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L6c
            androidx.compose.runtime.snapshots.SnapshotIdSet r14 = r0.previousIds
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            long r15 = r12.getSnapshotId$runtime()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            boolean r14 = h.a.i.ax(r14, r15)
            if (r14 == 0) goto L73
        L6c:
            long r14 = androidx.compose.runtime.snapshots.SnapshotKt.access$getINVALID_SNAPSHOT$p()
            r12.setSnapshotId$runtime(r14)
        L73:
            androidx.compose.runtime.snapshots.StateRecord r12 = r12.getNext$runtime()
            goto L50
        L78:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L33
        L7c:
            if (r12 != r13) goto L83
        L7e:
            if (r7 == r5) goto L83
            int r7 = r7 + 1
            goto L20
        L83:
            r0.closeAndReleasePinning$runtime()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.abandon():void");
    }

    private final void releasePreviouslyPinnedSnapshotsLocked() {
        int length = this.previousPinnedSnapshots.length;
        for (int i2 = 0; i2 < length; i2++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i2]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, l lVar, l lVar2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        if ((i2 & 2) != 0) {
            lVar2 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(lVar, lVar2);
    }

    private final void validateNotApplied() {
        if (this.applied) {
            PreconditionsKt.throwIllegalStateException("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void validateNotAppliedOrPinned() {
        if (!this.applied || ((Snapshot) this).pinningTrackingHandle >= 0) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
    }

    public final <T> T advance$runtime(a<? extends T> aVar) {
        recordPrevious$runtime(getSnapshotId());
        T tInvoke = aVar.invoke();
        if (getApplied$runtime() || getDisposed$runtime()) {
            return tInvoke;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            long j2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            setSnapshotId$runtime(j2);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
        }
        setInvalid$runtime(SnapshotKt.addRange(getInvalid$runtime(), snapshotId + 1, getSnapshotId()));
        return tInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getSnapshotId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime()) {
            return;
        }
        super.dispose();
        MutableSnapshot mutableSnapshot = this;
        mo7621nestedDeactivated$runtime(mutableSnapshot);
        SnapshotObserverKt.dispatchObserverOnPreDispose(mutableSnapshot);
    }

    public final boolean getApplied$runtime() {
        return this.applied;
    }

    public final List<StateObject> getMerged$runtime() {
        return this.merged;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime() {
        return this.modified;
    }

    public final SnapshotIdSet getPreviousIds$runtime() {
        return this.previousIds;
    }

    public final int[] getPreviousPinnedSnapshots$runtime() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime, reason: merged with bridge method [inline-methods] */
    public l<Object, ab> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public l<Object, ab> getWriteObserver$runtime() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        MutableScatterSet<StateObject> modified$runtime = getModified$runtime();
        return modified$runtime != null && modified$runtime.isNotEmpty();
    }

    public final SnapshotApplyResult innerApplyLocked$runtime(long j2, MutableScatterSet<StateObject> mutableScatterSet, Map<StateRecord, ? extends StateRecord> map, SnapshotIdSet snapshotIdSet) {
        ArrayList arrayListAf;
        SnapshotIdSet snapshotIdSet2;
        long[] jArr;
        Object[] objArr;
        SnapshotIdSet snapshotIdSet3;
        Object[] objArr2;
        int i2;
        ArrayList arrayList;
        long j3;
        int i3;
        StateRecord stateRecordMergeRecords;
        SnapshotIdSet snapshotIdSetOr = getInvalid$runtime().set(getSnapshotId()).or(this.previousIds);
        MutableScatterSet<StateObject> mutableScatterSet2 = mutableScatterSet;
        Object[] objArr3 = mutableScatterSet2.elements;
        long[] jArr2 = mutableScatterSet2.metadata;
        int length = jArr2.length - 2;
        ArrayList arrayList2 = null;
        if (length >= 0) {
            arrayListAf = null;
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                ArrayList arrayList3 = arrayList2;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = i4 - length;
                    jArr = jArr2;
                    arrayList2 = arrayList3;
                    int i6 = 0;
                    while (true) {
                        int i7 = 8 - ((~i5) >>> 31);
                        if (i6 >= i7) {
                            snapshotIdSet2 = snapshotIdSetOr;
                            objArr = objArr3;
                            if (i7 != 8) {
                                break;
                            }
                        } else {
                            if ((j4 & 255) < 128) {
                                StateObject stateObject = (StateObject) objArr3[(i4 << 3) + i6];
                                objArr2 = objArr3;
                                StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                                i2 = i5;
                                arrayList = arrayList2;
                                StateRecord stateRecord = SnapshotKt.readable(firstStateRecord, j2, snapshotIdSet);
                                if (stateRecord != null) {
                                    j3 = j4;
                                    StateRecord stateRecord2 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), snapshotIdSetOr);
                                    if (stateRecord2 != null) {
                                        if (stateRecord2.getSnapshotId$runtime() != SnapshotId_jvmKt.toSnapshotId(1) && !x.n(stateRecord, stateRecord2)) {
                                            i3 = i6;
                                            snapshotIdSet3 = snapshotIdSetOr;
                                            StateRecord stateRecord3 = SnapshotKt.readable(firstStateRecord, getSnapshotId(), getInvalid$runtime());
                                            if (stateRecord3 == null) {
                                                SnapshotKt.readError();
                                                throw new e();
                                            }
                                            if (map == null || (stateRecordMergeRecords = map.get(stateRecord)) == null) {
                                                stateRecordMergeRecords = stateObject.mergeRecords(stateRecord2, stateRecord, stateRecord3);
                                            }
                                            if (stateRecordMergeRecords == null) {
                                                return new SnapshotApplyResult.Failure(this);
                                            }
                                            if (!x.n(stateRecordMergeRecords, stateRecord3)) {
                                                if (x.n(stateRecordMergeRecords, stateRecord)) {
                                                    ArrayList arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                                    arrayList4.add(new k(stateObject, stateRecord.create(getSnapshotId())));
                                                    if (arrayListAf == null) {
                                                        arrayListAf = new ArrayList();
                                                    }
                                                    arrayListAf.add(stateObject);
                                                    arrayList2 = arrayList4;
                                                } else {
                                                    arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                                                    arrayList2.add(!x.n(stateRecordMergeRecords, stateRecord2) ? new k(stateObject, stateRecordMergeRecords) : new k(stateObject, stateRecord2.create(getSnapshotId())));
                                                }
                                            }
                                            j4 = j3 >> 8;
                                            i6 = i3 + 1;
                                            objArr3 = objArr2;
                                            i5 = i2;
                                            snapshotIdSetOr = snapshotIdSet3;
                                        }
                                    }
                                    snapshotIdSet3 = snapshotIdSetOr;
                                } else {
                                    snapshotIdSet3 = snapshotIdSetOr;
                                    j3 = j4;
                                }
                                i3 = i6;
                            } else {
                                snapshotIdSet3 = snapshotIdSetOr;
                                objArr2 = objArr3;
                                i2 = i5;
                                arrayList = arrayList2;
                                j3 = j4;
                                i3 = i6;
                            }
                            arrayList2 = arrayList;
                            j4 = j3 >> 8;
                            i6 = i3 + 1;
                            objArr3 = objArr2;
                            i5 = i2;
                            snapshotIdSetOr = snapshotIdSet3;
                        }
                    }
                } else {
                    snapshotIdSet2 = snapshotIdSetOr;
                    jArr = jArr2;
                    objArr = objArr3;
                    arrayList2 = arrayList3;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                jArr2 = jArr;
                objArr3 = objArr;
                snapshotIdSetOr = snapshotIdSet2;
            }
        } else {
            arrayListAf = null;
        }
        if (arrayList2 != null) {
            advance$runtime();
            int size = arrayList2.size();
            for (int i8 = 0; i8 < size; i8++) {
                k kVar = (k) arrayList2.get(i8);
                StateObject stateObject2 = (StateObject) kVar.a();
                StateRecord stateRecord4 = (StateRecord) kVar.b();
                stateRecord4.setSnapshotId$runtime(j2);
                synchronized (SnapshotKt.getLock()) {
                    stateRecord4.setNext$runtime(stateObject2.getFirstStateRecord());
                    stateObject2.prependStateRecord(stateRecord4);
                }
            }
        }
        if (arrayListAf != null) {
            int size2 = arrayListAf.size();
            for (int i9 = 0; i9 < size2; i9++) {
                mutableScatterSet.remove(arrayListAf.get(i9));
            }
            List<? extends StateObject> list = this.merged;
            if (list != null) {
                arrayListAf = i.af(list, arrayListAf);
            }
            this.merged = arrayListAf;
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime */
    public void mo7620nestedActivated$runtime(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime */
    public void mo7621nestedDeactivated$runtime(Snapshot snapshot) {
        if (this.snapshots <= 0) {
            PreconditionsKt.throwIllegalArgumentException("no pending nested snapshots");
        }
        int i2 = this.snapshots - 1;
        this.snapshots = i2;
        if (i2 != 0 || this.applied) {
            return;
        }
        abandon();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime() {
        if (this.applied || getDisposed$runtime()) {
            return;
        }
        advance$runtime();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime */
    public void mo7622recordModified$runtime(StateObject stateObject) {
        MutableScatterSet<StateObject> modified$runtime = getModified$runtime();
        if (modified$runtime == null) {
            modified$runtime = ScatterSetKt.mutableScatterSetOf();
            setModified$runtime(modified$runtime);
        }
        modified$runtime.add(stateObject);
    }

    public final void recordPrevious$runtime(long j2) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(j2);
        }
    }

    public final void recordPreviousList$runtime(SnapshotIdSet snapshotIdSet) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.or(snapshotIdSet);
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime(int i2) {
        if (i2 >= 0) {
            int[] iArr = this.previousPinnedSnapshots;
            x.f(iArr, "<this>");
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
            iArrCopyOf[length] = i2;
            if (iArrCopyOf == null) {
                x.g();
            }
            this.previousPinnedSnapshots = iArrCopyOf;
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.previousPinnedSnapshots;
        if (iArr2.length != 0) {
            iArr = c.o(iArr2, iArr);
        }
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime() {
        releasePreviouslyPinnedSnapshotsLocked();
        super.releasePinnedSnapshotsForCloseLocked$runtime();
    }

    public final void setApplied$runtime(boolean z) {
        this.applied = z;
    }

    public final void setMerged$runtime(List<? extends StateObject> list) {
        this.merged = list;
    }

    public void setModified$runtime(MutableScatterSet<StateObject> mutableScatterSet) {
        this.modified = mutableScatterSet;
    }

    public final void setPreviousIds$runtime(SnapshotIdSet snapshotIdSet) {
        this.previousIds = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime(int[] iArr) {
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime(int i2) {
        this.writeCount = i2;
    }

    public MutableSnapshot takeNestedMutableSnapshot(l<Object, ab> lVar, l<Object, ab> lVar2) {
        l<Object, ab> lVar3;
        l<Object, ab> writeObserver;
        Map map;
        NestedMutableSnapshot nestedMutableSnapshot;
        validateNotDisposed$runtime();
        validateNotAppliedOrPinned();
        MutableSnapshot mutableSnapshot = this;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            k<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> kVarMergeObservers = SnapshotObserverKt.mergeObservers(persistentList, mutableSnapshot, false, lVar, lVar2);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) kVarMergeObservers.c();
            l<Object, ab> readObserver = snapshotInstanceObservers.getReadObserver();
            writeObserver = snapshotInstanceObservers.getWriteObserver();
            map = (Map) kVarMergeObservers.d();
            lVar3 = readObserver;
        } else {
            lVar3 = lVar;
            writeObserver = lVar2;
            map = null;
        }
        recordPrevious$runtime(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            long j2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(j2);
            SnapshotIdSet invalid$runtime = getInvalid$runtime();
            setInvalid$runtime(invalid$runtime.set(j2));
            nestedMutableSnapshot = new NestedMutableSnapshot(j2, SnapshotKt.addRange(invalid$runtime, getSnapshotId() + 1, j2), SnapshotKt.mergedReadObserver(lVar3, getReadObserver(), false | (!((4 & 4) == 0))), SnapshotKt.mergedWriteObserver(writeObserver, getWriteObserver$runtime()), this);
        }
        if (!getApplied$runtime() && !getDisposed$runtime()) {
            long snapshotId = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                long j3 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId++;
                setSnapshotId$runtime(j3);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
            }
            setInvalid$runtime(SnapshotKt.addRange(getInvalid$runtime(), snapshotId + 1, getSnapshotId()));
        }
        NestedMutableSnapshot nestedMutableSnapshot2 = nestedMutableSnapshot;
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, mutableSnapshot, nestedMutableSnapshot2, map);
        }
        return nestedMutableSnapshot2;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(l<Object, ab> lVar) {
        l<Object, ab> lVar2;
        Map map;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        validateNotDisposed$runtime();
        validateNotAppliedOrPinned();
        boolean z = this instanceof GlobalSnapshot;
        long snapshotId = getSnapshotId();
        MutableSnapshot mutableSnapshot = true != z ? this : null;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            k<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> kVarMergeObservers = SnapshotObserverKt.mergeObservers(persistentList, mutableSnapshot, true, lVar, null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) kVarMergeObservers.c();
            l<Object, ab> readObserver = snapshotInstanceObservers.getReadObserver();
            snapshotInstanceObservers.getWriteObserver();
            map = (Map) kVarMergeObservers.d();
            lVar2 = readObserver;
        } else {
            lVar2 = lVar;
            map = null;
        }
        recordPrevious$runtime(getSnapshotId());
        synchronized (SnapshotKt.getLock()) {
            long j2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(j2);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(j2, SnapshotKt.addRange(getInvalid$runtime(), snapshotId + 1, j2), SnapshotKt.mergedReadObserver(lVar2, getReadObserver(), false | (!((4 & 4) == 0))), this);
        }
        if (!getApplied$runtime() && !getDisposed$runtime()) {
            long snapshotId2 = getSnapshotId();
            synchronized (SnapshotKt.getLock()) {
                long j3 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId++;
                setSnapshotId$runtime(j3);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
            }
            setInvalid$runtime(SnapshotKt.addRange(getInvalid$runtime(), snapshotId2 + 1, getSnapshotId()));
        }
        NestedReadonlySnapshot nestedReadonlySnapshot2 = nestedReadonlySnapshot;
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, mutableSnapshot, nestedReadonlySnapshot2, map);
        }
        return nestedReadonlySnapshot2;
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final void advance$runtime() {
        recordPrevious$runtime(getSnapshotId());
        if (getApplied$runtime() || getDisposed$runtime()) {
            return;
        }
        long snapshotId = getSnapshotId();
        synchronized (SnapshotKt.getLock()) {
            long j2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            setSnapshotId$runtime(j2);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
        }
        setInvalid$runtime(SnapshotKt.addRange(getInvalid$runtime(), snapshotId + 1, getSnapshotId()));
    }
}
