package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DerivedSnapshotState<T> extends StateObjectImpl implements DerivedState<T> {
    private final a<T> calculation;
    private ResultRecord<T> first = new ResultRecord<>(SnapshotKt.currentSnapshot().getSnapshotId());
    private final SnapshotMutationPolicy<T> policy;

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedSnapshotState(a<? extends T> aVar, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.calculation = aVar;
        this.policy = snapshotMutationPolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ResultRecord<T> currentRecord(ResultRecord<T> resultRecord, Snapshot snapshot, boolean z, a<? extends T> aVar) {
        SnapshotMutationPolicy<T> policy;
        long[] jArr;
        int i2;
        char c2;
        ResultRecord<T> resultRecord2 = resultRecord;
        DerivedSnapshotState<T> derivedSnapshotState = this;
        int i3 = 0;
        if (!resultRecord2.isValid(derivedSnapshotState, snapshot)) {
            final MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
            final IntRef intRef = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
            if (intRef == null) {
                intRef = new IntRef(0);
                SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(intRef);
            }
            final int element = intRef.getElement();
            MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
            DerivedStateObserver[] derivedStateObserverArr = mutableVectorDerivedStateObservers.content;
            int size = mutableVectorDerivedStateObservers.getSize();
            for (int i4 = 0; i4 < size; i4++) {
                derivedStateObserverArr[i4].start(derivedSnapshotState);
            }
            try {
                intRef.setElement(element + 1);
                Object objObserve = Snapshot.Companion.observe(new l() { // from class: androidx.compose.runtime.DerivedSnapshotState$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DerivedSnapshotState.currentRecord$lambda$1$0$0(this.f$0, intRef, mutableObjectIntMap, element, obj);
                    }
                }, null, aVar);
                intRef.setElement(element);
                DerivedStateObserver[] derivedStateObserverArr2 = mutableVectorDerivedStateObservers.content;
                int size2 = mutableVectorDerivedStateObservers.getSize();
                for (int i5 = 0; i5 < size2; i5++) {
                    derivedStateObserverArr2[i5].done(derivedSnapshotState);
                }
                synchronized (SnapshotKt.getLock()) {
                    Snapshot current = Snapshot.Companion.getCurrent();
                    if (resultRecord2.getResult() == ResultRecord.Companion.getUnset() || (policy = getPolicy()) == 0 || !policy.equivalent(objObserve, resultRecord2.getResult())) {
                        resultRecord2 = (ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current);
                        resultRecord2.setDependencies(mutableObjectIntMap);
                        resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
                        resultRecord2.setResult(objObserve);
                    } else {
                        resultRecord2.setDependencies(mutableObjectIntMap);
                        resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
                    }
                }
                IntRef intRef2 = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                if (intRef2 == null || intRef2.getElement() != 0) {
                    return resultRecord2;
                }
                Snapshot.Companion.notifyObjectsInitialized();
                synchronized (SnapshotKt.getLock()) {
                    Snapshot current2 = Snapshot.Companion.getCurrent();
                    resultRecord2.setValidSnapshotId(current2.getSnapshotId());
                    resultRecord2.setValidSnapshotWriteCount(current2.getWriteCount$runtime());
                }
                return resultRecord2;
            } catch (Throwable th) {
                DerivedStateObserver[] derivedStateObserverArr3 = mutableVectorDerivedStateObservers.content;
                int size3 = mutableVectorDerivedStateObservers.getSize();
                for (int i6 = 0; i6 < size3; i6++) {
                    derivedStateObserverArr3[i6].done(derivedSnapshotState);
                }
                throw th;
            }
        }
        if (z) {
            MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
            DerivedStateObserver[] derivedStateObserverArr4 = mutableVectorDerivedStateObservers2.content;
            int size4 = mutableVectorDerivedStateObservers2.getSize();
            for (int i7 = 0; i7 < size4; i7++) {
                derivedStateObserverArr4[i7].start(derivedSnapshotState);
            }
            try {
                ObjectIntMap<StateObject> dependencies = resultRecord2.getDependencies();
                IntRef intRef3 = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                if (intRef3 == null) {
                    intRef3 = new IntRef(0);
                    SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(intRef3);
                }
                int element2 = intRef3.getElement();
                Object[] objArr = dependencies.keys;
                int[] iArr = dependencies.values;
                long[] jArr2 = dependencies.metadata;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j2 = jArr2[i8];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = i8 - length;
                            int i10 = i3;
                            while (true) {
                                jArr = jArr2;
                                i2 = 8 - ((~i9) >>> 31);
                                if (i10 >= i2) {
                                    break;
                                }
                                if ((j2 & 255) < 128) {
                                    int i11 = (i8 << 3) + i10;
                                    c2 = '\b';
                                    StateObject stateObject = (StateObject) objArr[i11];
                                    intRef3.setElement(iArr[i11] + element2);
                                    l<Object, ab> readObserver = snapshot.getReadObserver();
                                    if (readObserver != null) {
                                        readObserver.invoke(stateObject);
                                    }
                                } else {
                                    c2 = '\b';
                                }
                                j2 >>= c2;
                                i10++;
                                jArr2 = jArr;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        } else {
                            jArr = jArr2;
                        }
                        if (i8 == length) {
                            break;
                        }
                        i8++;
                        jArr2 = jArr;
                        i3 = 0;
                    }
                }
                intRef3.setElement(element2);
            } finally {
                DerivedStateObserver[] derivedStateObserverArr5 = mutableVectorDerivedStateObservers2.content;
                int size5 = mutableVectorDerivedStateObservers2.getSize();
                for (int i12 = 0; i12 < size5; i12++) {
                    derivedStateObserverArr5[i12].done(derivedSnapshotState);
                }
            }
        }
        return resultRecord2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab currentRecord$lambda$1$0$0(DerivedSnapshotState derivedSnapshotState, IntRef intRef, MutableObjectIntMap mutableObjectIntMap, int i2, Object obj) {
        if (obj == derivedSnapshotState) {
            throw new IllegalStateException("A derived state calculation cannot read itself");
        }
        if (obj instanceof StateObject) {
            mutableObjectIntMap.set(obj, Math.min(intRef.getElement() - i2, mutableObjectIntMap.getOrDefault(obj, Integer.MAX_VALUE)));
        }
        return ab.f48028a;
    }

    private final String displayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        return resultRecord.isValid(this, Snapshot.Companion.getCurrent()) ? String.valueOf(resultRecord.getResult()) : "<Not calculated>";
    }

    public final ResultRecord<?> current(Snapshot snapshot) {
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, snapshot), snapshot, false, this.calculation);
    }

    @Override // androidx.compose.runtime.DerivedState
    public DerivedState.Record<T> getCurrentRecord() {
        Snapshot current = Snapshot.Companion.getCurrent();
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, current), current, false, this.calculation);
    }

    public final T getDebuggerDisplayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.Companion.getCurrent())) {
            return (T) resultRecord.getResult();
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.DerivedState
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        l<Object, ab> readObserver = Snapshot.Companion.getCurrent().getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(this);
        }
        Snapshot current = Snapshot.Companion.getCurrent();
        return (T) currentRecord((ResultRecord) SnapshotKt.current(this.first, current), current, true, this.calculation).getResult();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        x.d(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.first = (ResultRecord) stateRecord;
    }

    public String toString() {
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }

    /* compiled from: WazeSource */
    public final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {
        private ObjectIntMap<StateObject> dependencies;
        private Object result;
        private int resultHash;
        private long validSnapshotId;
        private int validSnapshotWriteCount;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Object Unset = new Object();

        public ResultRecord(long j2) {
            super(j2);
            this.dependencies = ObjectIntMapKt.emptyObjectIntMap();
            this.result = Unset;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            x.d(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            ResultRecord resultRecord = (ResultRecord) stateRecord;
            setDependencies(resultRecord.getDependencies());
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public T getCurrentValue() {
            return (T) this.result;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public ObjectIntMap<StateObject> getDependencies() {
            return this.dependencies;
        }

        public final Object getResult() {
            return this.result;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final long getValidSnapshotId() {
            return this.validSnapshotId;
        }

        public final int getValidSnapshotWriteCount() {
            return this.validSnapshotWriteCount;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean isValid(androidx.compose.runtime.DerivedState<?> r6, androidx.compose.runtime.snapshots.Snapshot r7) {
            /*
                r5 = this;
                java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
                monitor-enter(r0)
                long r1 = r5.validSnapshotId     // Catch: java.lang.Throwable -> L4a
                long r3 = r7.getSnapshotId()     // Catch: java.lang.Throwable -> L4a
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L1c
                int r1 = r5.validSnapshotWriteCount     // Catch: java.lang.Throwable -> L4a
                int r4 = r7.getWriteCount$runtime()     // Catch: java.lang.Throwable -> L4a
                if (r1 == r4) goto L1a
                goto L1c
            L1a:
                r1 = r2
                goto L1d
            L1c:
                r1 = r3
            L1d:
                monitor-exit(r0)
                java.lang.Object r0 = r5.result
                java.lang.Object r4 = androidx.compose.runtime.DerivedSnapshotState.ResultRecord.Unset
                if (r0 == r4) goto L2f
                if (r1 == 0) goto L2e
                int r0 = r5.resultHash
                int r6 = r5.readableHash(r6, r7)
                if (r0 != r6) goto L2f
            L2e:
                r2 = r3
            L2f:
                if (r2 == 0) goto L49
                if (r1 == 0) goto L49
                java.lang.Object r6 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
                monitor-enter(r6)
                long r0 = r7.getSnapshotId()     // Catch: java.lang.Throwable -> L46
                r5.validSnapshotId = r0     // Catch: java.lang.Throwable -> L46
                int r7 = r7.getWriteCount$runtime()     // Catch: java.lang.Throwable -> L46
                r5.validSnapshotWriteCount = r7     // Catch: java.lang.Throwable -> L46
                monitor-exit(r6)
                return r2
            L46:
                r5 = move-exception
                monitor-exit(r6)
                throw r5
            L49:
                return r2
            L4a:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DerivedSnapshotState.ResultRecord.isValid(androidx.compose.runtime.DerivedState, androidx.compose.runtime.snapshots.Snapshot):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00ce A[PHI: r12
  0x00ce: PHI (r12v1 int) = (r12v0 int), (r12v2 int) binds: [B:30:0x00a1, B:38:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int readableHash(androidx.compose.runtime.DerivedState<?> r32, androidx.compose.runtime.snapshots.Snapshot r33) {
            /*
                Method dump skipped, instructions count: 367
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DerivedSnapshotState.ResultRecord.readableHash(androidx.compose.runtime.DerivedState, androidx.compose.runtime.snapshots.Snapshot):int");
        }

        public void setDependencies(ObjectIntMap<StateObject> objectIntMap) {
            this.dependencies = objectIntMap;
        }

        public final void setResult(Object obj) {
            this.result = obj;
        }

        public final void setResultHash(int i2) {
            this.resultHash = i2;
        }

        public final void setValidSnapshotId(long j2) {
            this.validSnapshotId = j2;
        }

        public final void setValidSnapshotWriteCount(int i2) {
            this.validSnapshotWriteCount = i2;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final Object getUnset() {
                return ResultRecord.Unset;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long j2) {
            return new ResultRecord(j2);
        }
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }
}
