package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.WeakReference;
import h.a.i;
import h.ab;
import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapshotKt {
    private static final long INVALID_SNAPSHOT = 0;
    private static final GlobalSnapshot globalSnapshot;
    private static SnapshotIdSet openSnapshots;
    private static AtomicInt pendingApplyObserverCount;
    private static final Snapshot snapshotInitializer;
    private static final l<SnapshotIdSet, ab> emptyLambda = new l() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ab.f48028a;
        }
    };
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();
    private static final Object lock = new Object();
    private static long nextSnapshotId = SnapshotId_jvmKt.toSnapshotId(1) + 1;
    private static final SnapshotDoubleIndexHeap pinningTable = new SnapshotDoubleIndexHeap();
    private static final SnapshotWeakSet<StateObject> extraStateObjects = new SnapshotWeakSet<>();
    private static List<? extends p<? super Set<? extends Object>, ? super Snapshot, ab>> applyObservers = i.h();
    private static List<? extends l<Object, ab>> globalWriteObservers = i.h();

    static {
        openSnapshots = SnapshotIdSet.Companion.getEMPTY();
        nextSnapshotId++;
        GlobalSnapshot globalSnapshot2 = new GlobalSnapshot(nextSnapshotId, SnapshotIdSet.Companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot2.getSnapshotId());
        globalSnapshot = globalSnapshot2;
        snapshotInitializer = globalSnapshot2;
        pendingApplyObserverCount = new AtomicInt(0);
    }

    public static final SnapshotIdSet addRange(SnapshotIdSet snapshotIdSet, long j2, long j3) {
        while (x.b(j2, j3) < 0) {
            snapshotIdSet = snapshotIdSet.set(j2);
            j2++;
        }
        return snapshotIdSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T advanceGlobalSnapshot(h.g.a.l<? super androidx.compose.runtime.snapshots.SnapshotIdSet, ? extends T> r17) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot(h.g.a.l):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkAndOverwriteUnusedRecordsLocked() {
        SnapshotWeakSet<StateObject> snapshotWeakSet = extraStateObjects;
        int size$runtime = snapshotWeakSet.getSize$runtime();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= size$runtime) {
                break;
            }
            WeakReference<StateObject> weakReference = snapshotWeakSet.getValues$runtime()[i2];
            Object obj = weakReference != null ? weakReference.get() : null;
            if (obj != null && overwriteUnusedRecordsLocked((StateObject) obj)) {
                if (i3 != i2) {
                    snapshotWeakSet.getValues$runtime()[i3] = weakReference;
                    snapshotWeakSet.getHashes$runtime()[i3] = snapshotWeakSet.getHashes$runtime()[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < size$runtime; i4++) {
            snapshotWeakSet.getValues$runtime()[i4] = null;
            snapshotWeakSet.getHashes$runtime()[i4] = 0;
        }
        if (i3 != size$runtime) {
            snapshotWeakSet.setSize$runtime(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, l<Object, ab> lVar, boolean z) {
        boolean z2 = snapshot instanceof MutableSnapshot;
        if (z2 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z2 ? (MutableSnapshot) snapshot : null, lVar, null, false, z);
        }
        return new TransparentObserverSnapshot(snapshot, lVar, false, z);
    }

    static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, l lVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, lVar, z & ((i2 & 4) == 0));
    }

    public static final <T extends StateRecord> T current(T t) {
        T t2;
        Snapshot current = Snapshot.Companion.getCurrent();
        T t3 = (T) readable(t, current.getSnapshotId(), current.getInvalid$runtime());
        if (t3 != null) {
            return t3;
        }
        synchronized (getLock()) {
            Snapshot current2 = Snapshot.Companion.getCurrent();
            t2 = (T) readable(t, current2.getSnapshotId(), current2.getInvalid$runtime());
        }
        if (t2 != null) {
            return t2;
        }
        readError();
        throw new e();
    }

    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        return snapshot == null ? globalSnapshot : snapshot;
    }

    private static final StateRecord findYoungestOr(StateRecord stateRecord, l<? super StateRecord, Boolean> lVar) {
        StateRecord stateRecord2 = stateRecord;
        while (stateRecord != null) {
            if (lVar.invoke(stateRecord).booleanValue()) {
                return stateRecord;
            }
            if (x.b(stateRecord2.getSnapshotId$runtime(), stateRecord.getSnapshotId$runtime()) < 0) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.getNext$runtime();
        }
        return stateRecord2;
    }

    public static final Object getLock() {
        return lock;
    }

    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    public static final l<Object, ab> mergedReadObserver(final l<Object, ab> lVar, final l<Object, ab> lVar2, boolean z) {
        if (true != z) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new l() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SnapshotKt.mergedReadObserver$lambda$0(lVar, lVar2, obj);
            }
        };
    }

    static final ab mergedReadObserver$lambda$0(l lVar, l lVar2, Object obj) {
        lVar.invoke(obj);
        lVar2.invoke(obj);
        return ab.f48028a;
    }

    public static final l<Object, ab> mergedWriteObserver(final l<Object, ab> lVar, final l<Object, ab> lVar2) {
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new l() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SnapshotKt.mergedWriteObserver$lambda$0(lVar, lVar2, obj);
            }
        };
    }

    static final ab mergedWriteObserver$lambda$0(l lVar, l lVar2, Object obj) {
        lVar.invoke(obj);
        lVar2.invoke(obj);
        return ab.f48028a;
    }

    public static final <T extends StateRecord> T newOverwritableRecordLocked(T t, StateObject stateObject) {
        T t2 = (T) usedLocked(stateObject);
        if (t2 != null) {
            t2.setSnapshotId$runtime(Long.MAX_VALUE);
            return t2;
        }
        T t3 = (T) t.create(Long.MAX_VALUE);
        t3.setNext$runtime(stateObject.getFirstStateRecord());
        x.d(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        stateObject.prependStateRecord(t3);
        x.d(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t3;
    }

    public static final <T extends StateRecord> T newWritableRecord(T t, StateObject stateObject, Snapshot snapshot) {
        T t2;
        synchronized (getLock()) {
            t2 = (T) newWritableRecordLocked(t, stateObject, snapshot);
        }
        return t2;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t, StateObject stateObject, Snapshot snapshot) {
        T t2 = (T) newOverwritableRecordLocked(t, stateObject);
        t2.assign(t);
        t2.setSnapshotId$runtime(snapshot.getSnapshotId());
        return t2;
    }

    public static final void notifyWrite(Snapshot snapshot, StateObject stateObject) {
        snapshot.setWriteCount$runtime(snapshot.getWriteCount$runtime() + 1);
        l<Object, ab> writeObserver$runtime = snapshot.getWriteObserver$runtime();
        if (writeObserver$runtime != null) {
            writeObserver$runtime.invoke(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<StateRecord, StateRecord> optimisticMerges(long j2, MutableSnapshot mutableSnapshot, SnapshotIdSet snapshotIdSet) {
        HashMap map;
        long[] jArr;
        SnapshotIdSet snapshotIdSet2;
        Object[] objArr;
        int i2;
        long[] jArr2;
        SnapshotIdSet snapshotIdSet3;
        Object[] objArr2;
        int i3;
        char c2;
        MutableScatterSet<StateObject> modified$runtime = mutableSnapshot.getModified$runtime();
        if (modified$runtime == null) {
            return null;
        }
        long snapshotId = mutableSnapshot.getSnapshotId();
        SnapshotIdSet snapshotIdSetOr = mutableSnapshot.getInvalid$runtime().set(snapshotId).or(mutableSnapshot.getPreviousIds$runtime());
        MutableScatterSet<StateObject> mutableScatterSet = modified$runtime;
        Object[] objArr3 = mutableScatterSet.elements;
        long[] jArr3 = mutableScatterSet.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            HashMap map2 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = i4 - length;
                    int i6 = 0;
                    while (true) {
                        int i7 = 8 - ((~i5) >>> 31);
                        if (i6 >= i7) {
                            jArr = jArr3;
                            snapshotIdSet2 = snapshotIdSetOr;
                            objArr = objArr3;
                            i2 = i4;
                            if (i7 != 8) {
                                break;
                            }
                        } else {
                            if ((j3 & 255) < 128) {
                                StateObject stateObject = (StateObject) objArr3[(i4 << 3) + i6];
                                StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                                jArr2 = jArr3;
                                i3 = i4;
                                c2 = '\b';
                                StateRecord stateRecord = readable(firstStateRecord, j2, snapshotIdSet);
                                if (stateRecord != null) {
                                    objArr2 = objArr3;
                                    StateRecord stateRecord2 = readable(firstStateRecord, snapshotId, snapshotIdSetOr);
                                    if (stateRecord2 == null || x.n(stateRecord, stateRecord2)) {
                                        snapshotIdSet3 = snapshotIdSetOr;
                                    } else {
                                        snapshotIdSet3 = snapshotIdSetOr;
                                        StateRecord stateRecord3 = readable(firstStateRecord, snapshotId, mutableSnapshot.getInvalid$runtime());
                                        if (stateRecord3 == null) {
                                            readError();
                                            throw new e();
                                        }
                                        StateRecord stateRecordMergeRecords = stateObject.mergeRecords(stateRecord2, stateRecord, stateRecord3);
                                        if (stateRecordMergeRecords == null) {
                                            return null;
                                        }
                                        HashMap map3 = map2;
                                        if (map3 == null) {
                                            HashMap map4 = new HashMap();
                                            map2 = map4;
                                            map3 = map4;
                                        }
                                        map3.put(stateRecord, stateRecordMergeRecords);
                                    }
                                } else {
                                    snapshotIdSet3 = snapshotIdSetOr;
                                    objArr2 = objArr3;
                                }
                            } else {
                                jArr2 = jArr3;
                                snapshotIdSet3 = snapshotIdSetOr;
                                objArr2 = objArr3;
                                i3 = i4;
                                c2 = '\b';
                            }
                            j3 >>= c2;
                            i6++;
                            i4 = i3;
                            jArr3 = jArr2;
                            objArr3 = objArr2;
                            snapshotIdSetOr = snapshotIdSet3;
                        }
                    }
                } else {
                    jArr = jArr3;
                    snapshotIdSet2 = snapshotIdSetOr;
                    objArr = objArr3;
                    i2 = i4;
                }
                int i8 = i2;
                if (i8 == length) {
                    break;
                }
                i4 = i8 + 1;
                jArr3 = jArr;
                objArr3 = objArr;
                snapshotIdSetOr = snapshotIdSet2;
            }
            map = map2;
        } else {
            map = null;
        }
        return map;
    }

    public static final <T extends StateRecord, R> R overwritable(T t, StateObject stateObject, T t2, l<? super T, ? extends R> lVar) {
        Snapshot current;
        R rInvoke;
        synchronized (getLock()) {
            current = Snapshot.Companion.getCurrent();
            rInvoke = lVar.invoke(overwritableRecord(t, stateObject, current, t2));
        }
        notifyWrite(current, stateObject);
        return rInvoke;
    }

    public static final <T extends StateRecord> T overwritableRecord(T t, StateObject stateObject, Snapshot snapshot, T t2) {
        T t3;
        if (snapshot.getReadOnly()) {
            snapshot.mo7622recordModified$runtime(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        if (t2.getSnapshotId$runtime() == snapshotId) {
            return t2;
        }
        synchronized (getLock()) {
            t3 = (T) newOverwritableRecordLocked(t, stateObject);
        }
        t3.setSnapshotId$runtime(snapshotId);
        if (t2.getSnapshotId$runtime() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo7622recordModified$runtime(stateObject);
        }
        return t3;
    }

    private static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        long jLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId);
        StateRecord stateRecord = null;
        int i2 = 0;
        StateRecord firstStateRecord = null;
        for (StateRecord firstStateRecord2 = stateObject.getFirstStateRecord(); firstStateRecord2 != null; firstStateRecord2 = firstStateRecord2.getNext$runtime()) {
            long snapshotId$runtime = firstStateRecord2.getSnapshotId$runtime();
            if (snapshotId$runtime != INVALID_SNAPSHOT) {
                if (x.b(snapshotId$runtime, jLowestOrDefault) >= 0) {
                    i2++;
                } else if (stateRecord == null) {
                    i2++;
                    stateRecord = firstStateRecord2;
                } else {
                    int iB = x.b(firstStateRecord2.getSnapshotId$runtime(), stateRecord.getSnapshotId$runtime());
                    StateRecord stateRecord2 = iB < 0 ? firstStateRecord2 : stateRecord;
                    if (iB >= 0) {
                        stateRecord = firstStateRecord2;
                    }
                    if (firstStateRecord == null) {
                        firstStateRecord = stateObject.getFirstStateRecord();
                        StateRecord stateRecord3 = firstStateRecord;
                        while (true) {
                            if (firstStateRecord == null) {
                                firstStateRecord = stateRecord3;
                                break;
                            }
                            if (x.b(firstStateRecord.getSnapshotId$runtime(), jLowestOrDefault) >= 0) {
                                break;
                            }
                            if (x.b(stateRecord3.getSnapshotId$runtime(), firstStateRecord.getSnapshotId$runtime()) < 0) {
                                stateRecord3 = firstStateRecord;
                            }
                            firstStateRecord = firstStateRecord.getNext$runtime();
                        }
                    }
                    stateRecord2.setSnapshotId$runtime(INVALID_SNAPSHOT);
                    stateRecord2.assign(firstStateRecord);
                }
            }
        }
        return i2 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processForUnusedRecordsLocked(StateObject stateObject) {
        if (overwriteUnusedRecordsLocked(stateObject)) {
            extraStateObjects.add(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final <T extends StateRecord> T readable(T t, StateObject stateObject) {
        T t2;
        Snapshot current = Snapshot.Companion.getCurrent();
        l<Object, ab> readObserver = current.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t3 = (T) readable(t, current.getSnapshotId(), current.getInvalid$runtime());
        if (t3 != null) {
            return t3;
        }
        synchronized (getLock()) {
            Snapshot current2 = Snapshot.Companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            x.d(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t2 = (T) readable(firstStateRecord, current2.getSnapshotId(), current2.getInvalid$runtime());
            if (t2 == null) {
                readError();
                throw new e();
            }
        }
        return t2;
    }

    public static final void releasePinningLocked(int i2) {
        pinningTable.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T resetGlobalSnapshotLocked(GlobalSnapshot globalSnapshot2, l<? super SnapshotIdSet, ? extends T> lVar) {
        long snapshotId = globalSnapshot2.getSnapshotId();
        T tInvoke = lVar.invoke(openSnapshots.clear(snapshotId));
        long j2 = nextSnapshotId;
        nextSnapshotId = 1 + j2;
        openSnapshots = openSnapshots.clear(snapshotId);
        globalSnapshot2.setSnapshotId$runtime(j2);
        globalSnapshot2.setInvalid$runtime(openSnapshots);
        globalSnapshot2.setWriteCount$runtime(0);
        globalSnapshot2.setModified$runtime(null);
        globalSnapshot2.releasePinnedSnapshotLocked$runtime();
        openSnapshots = openSnapshots.set(j2);
        return tInvoke;
    }

    public static final <T> T sync(a<? extends T> aVar) {
        T tInvoke;
        synchronized (getLock()) {
            tInvoke = aVar.invoke();
        }
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Snapshot> T takeNewSnapshot(final l<? super SnapshotIdSet, ? extends T> lVar) {
        return (T) advanceGlobalSnapshot(new l() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SnapshotKt.takeNewSnapshot$lambda$0(lVar, (SnapshotIdSet) obj);
            }
        });
    }

    static final Snapshot takeNewSnapshot$lambda$0(l lVar, SnapshotIdSet snapshotIdSet) {
        Snapshot snapshot = (Snapshot) lVar.invoke(snapshotIdSet);
        synchronized (getLock()) {
            openSnapshots = openSnapshots.set(snapshot.getSnapshotId());
        }
        return snapshot;
    }

    public static final int trackPinning(long j2, SnapshotIdSet snapshotIdSet) {
        int iAdd;
        long jLowest = snapshotIdSet.lowest(j2);
        synchronized (getLock()) {
            iAdd = pinningTable.add(jLowest);
        }
        return iAdd;
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        long jLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.Companion.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime()) {
            if (firstStateRecord.getSnapshotId$runtime() != INVALID_SNAPSHOT) {
                if (valid(firstStateRecord, jLowestOrDefault, empty)) {
                    if (stateRecord == null) {
                        stateRecord = firstStateRecord;
                    } else if (x.b(firstStateRecord.getSnapshotId$runtime(), stateRecord.getSnapshotId$runtime()) >= 0) {
                        return stateRecord;
                    }
                }
            }
            return firstStateRecord;
        }
        return null;
    }

    private static final boolean valid(long j2, long j3, SnapshotIdSet snapshotIdSet) {
        return (j3 == INVALID_SNAPSHOT || x.b(j3, j2) > 0 || snapshotIdSet.get(j3)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOpen(Snapshot snapshot) {
        long jLowestOrDefault;
        if (openSnapshots.get(snapshot.getSnapshotId())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(snapshot.getSnapshotId());
        sb.append(", disposed=");
        sb.append(snapshot.getDisposed$runtime());
        sb.append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        sb.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.getApplied$runtime()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (getLock()) {
            jLowestOrDefault = pinningTable.lowestOrDefault(-1L);
        }
        sb.append(jLowestOrDefault);
        throw new IllegalStateException(sb.toString());
    }

    public static final <T extends StateRecord, R> R withCurrent(T t, l<? super T, ? extends R> lVar) {
        return lVar.invoke(current(t));
    }

    public static final <T extends StateRecord, R> R writable(T t, StateObject stateObject, l<? super T, ? extends R> lVar) {
        Snapshot current;
        R rInvoke;
        synchronized (getLock()) {
            current = Snapshot.Companion.getCurrent();
            rInvoke = lVar.invoke(writableRecord(t, stateObject, current));
        }
        notifyWrite(current, stateObject);
        return rInvoke;
    }

    public static final <T extends StateRecord> T writableRecord(T t, StateObject stateObject, Snapshot snapshot) {
        T t2;
        StateRecord stateRecord;
        if (snapshot.getReadOnly()) {
            snapshot.mo7622recordModified$runtime(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        T t3 = (T) readable(t, snapshotId, snapshot.getInvalid$runtime());
        if (t3 == null) {
            synchronized (getLock()) {
                Snapshot current = Snapshot.Companion.getCurrent();
                StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                x.d(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
                stateRecord = readable(firstStateRecord, current.getSnapshotId(), current.getInvalid$runtime());
                if (stateRecord == null) {
                    readError();
                    throw new e();
                }
            }
            t3 = (T) stateRecord;
        }
        if (t3.getSnapshotId$runtime() == snapshot.getSnapshotId()) {
            return t3;
        }
        synchronized (getLock()) {
            t2 = (T) readable(stateObject.getFirstStateRecord(), snapshotId, snapshot.getInvalid$runtime());
            if (t2 == null) {
                readError();
                throw new e();
            }
            if (t2.getSnapshotId$runtime() != snapshotId) {
                t2 = (T) newWritableRecordLocked(t2, stateObject, snapshot);
            }
        }
        x.d(t2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (t3.getSnapshotId$runtime() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo7622recordModified$runtime(stateObject);
        }
        return t2;
    }

    public static /* synthetic */ void getLock$annotations() {
    }

    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    private static final boolean valid(StateRecord stateRecord, long j2, SnapshotIdSet snapshotIdSet) {
        return valid(j2, stateRecord.getSnapshotId$runtime(), snapshotIdSet);
    }

    public static final <T extends StateRecord, R> R writable(T t, StateObject stateObject, Snapshot snapshot, l<? super T, ? extends R> lVar) {
        R rInvoke;
        synchronized (getLock()) {
            rInvoke = lVar.invoke(writableRecord(t, stateObject, snapshot));
        }
        notifyWrite(snapshot, stateObject);
        return rInvoke;
    }

    public static final <T extends StateRecord> T current(T t, Snapshot snapshot) {
        T t2;
        T t3 = (T) readable(t, snapshot.getSnapshotId(), snapshot.getInvalid$runtime());
        if (t3 != null) {
            return t3;
        }
        synchronized (getLock()) {
            t2 = (T) readable(t, snapshot.getSnapshotId(), snapshot.getInvalid$runtime());
        }
        if (t2 != null) {
            return t2;
        }
        readError();
        throw new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends StateRecord> T readable(T t, long j2, SnapshotIdSet snapshotIdSet) {
        T t2 = null;
        while (t != null) {
            if (valid(t, j2, snapshotIdSet) && (t2 == null || x.b(t2.getSnapshotId$runtime(), t.getSnapshotId$runtime()) < 0)) {
                t2 = t;
            }
            t = (T) t.getNext$runtime();
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final <T extends StateRecord> T readable(T t, StateObject stateObject, Snapshot snapshot) {
        T t2;
        l<Object, ab> readObserver = snapshot.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t3 = (T) readable(t, snapshot.getSnapshotId(), snapshot.getInvalid$runtime());
        if (t3 != null) {
            return t3;
        }
        synchronized (getLock()) {
            Snapshot current = Snapshot.Companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            x.d(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t2 = (T) readable(firstStateRecord, current.getSnapshotId(), current.getInvalid$runtime());
            if (t2 == null) {
                readError();
                throw new e();
            }
        }
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(emptyLambda);
    }
}
