package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import h.a.i;
import h.ab;
import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.au;
import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    private ObserverHandle applyUnsubscribe;
    private ObservedScopeMap currentMap;
    private boolean isPaused;
    private final l<a<ab>, ab> onChangedExecutor;
    private boolean sendingNotifications;
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);
    private final p<Set<? extends Object>, Snapshot, ab> applyObserver = new p() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$$ExternalSyntheticLambda3
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return SnapshotStateObserver.applyObserver$lambda$0(this.f$0, (Set) obj, (Snapshot) obj2);
        }
    };
    private final l<Object, ab> readObserver = new l() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$$ExternalSyntheticLambda4
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SnapshotStateObserver.readObserver$lambda$0(this.f$0, obj);
        }
    };
    private final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    private final Object observedScopeMapsLock = new Object();
    private long currentMapThreadId = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(l<? super a<ab>, ab> lVar) {
        this.onChangedExecutor = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addChanges(Set<? extends Object> set) {
        Object obj;
        List listAf;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                listAf = set;
            } else if (obj instanceof Set) {
                listAf = i.i(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new e();
                }
                List listSingletonList = Collections.singletonList(set);
                x.e(listSingletonList, "singletonList(...)");
                listAf = i.af((Collection) obj, listSingletonList);
            }
        } while (!SnapshotStateObserver$$ExternalSyntheticBackportWithForwarding1.m(this.pendingChanges, obj, listAf));
    }

    static final ab applyObserver$lambda$0(SnapshotStateObserver snapshotStateObserver, Set set, Snapshot snapshot) {
        snapshotStateObserver.addChanges(set);
        if (snapshotStateObserver.drainChanges()) {
            snapshotStateObserver.sendNotifications();
        }
        return ab.f48028a;
    }

    private final boolean drainChanges() {
        boolean z;
        synchronized (this.observedScopeMapsLock) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> setRemoveChanges = removeChanges();
            if (setRemoveChanges == null) {
                return z2;
            }
            synchronized (this.observedScopeMapsLock) {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i2 = 0; i2 < size; i2++) {
                    z2 = observedScopeMapArr[i2].recordInvalidation(setRemoveChanges) || z2;
                }
            }
        }
    }

    private final <T> ObservedScopeMap ensureMap(l<? super T, ab> lVar) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
        int size = mutableVector.getSize();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                observedScopeMap = null;
                break;
            }
            observedScopeMap = observedScopeMapArr[i2];
            if (observedScopeMap.getOnChanged() == lVar) {
                break;
            }
            i2++;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        x.d(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        au.h(lVar, 1);
        ObservedScopeMap observedScopeMap3 = new ObservedScopeMap(lVar);
        this.observedScopeMaps.add(observedScopeMap3);
        return observedScopeMap3;
    }

    private final void forEachScopeMap(l<? super ObservedScopeMap, ab> lVar) {
        synchronized (this.observedScopeMapsLock) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                lVar.invoke(observedScopeMapArr[i2]);
            }
        }
    }

    static final ab readObserver$lambda$0(SnapshotStateObserver snapshotStateObserver, Object obj) {
        if (!snapshotStateObserver.isPaused) {
            synchronized (snapshotStateObserver.observedScopeMapsLock) {
                ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                if (observedScopeMap == null) {
                    x.g();
                }
                observedScopeMap.recordRead(obj);
            }
        }
        return ab.f48028a;
    }

    private final Set<Object> removeChanges() {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new e();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!SnapshotStateObserver$$ExternalSyntheticBackportWithForwarding1.m(this.pendingChanges, obj, objSubList));
        return set;
    }

    private final void removeScopeMapIf(l<? super ObservedScopeMap, Boolean> lVar) {
        synchronized (this.observedScopeMapsLock) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                if (lVar.invoke(mutableVector.content[i3]).booleanValue()) {
                    i2++;
                } else if (i2 > 0) {
                    ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                    observedScopeMapArr[i3 - i2] = observedScopeMapArr[i3];
                }
            }
            ObservedScopeMap[] observedScopeMapArr2 = mutableVector.content;
            int i4 = size - i2;
            x.f(observedScopeMapArr2, "<this>");
            Arrays.fill(observedScopeMapArr2, i4, size, (Object) null);
            mutableVector.setSize(i4);
        }
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new e();
    }

    private final void sendNotifications() {
        this.onChangedExecutor.invoke(new a() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return SnapshotStateObserver.sendNotifications$lambda$0(this.f$0);
            }
        });
    }

    static final ab sendNotifications$lambda$0(SnapshotStateObserver snapshotStateObserver) {
        do {
            synchronized (snapshotStateObserver.observedScopeMapsLock) {
                if (!snapshotStateObserver.sendingNotifications) {
                    snapshotStateObserver.sendingNotifications = true;
                    try {
                        MutableVector<ObservedScopeMap> mutableVector = snapshotStateObserver.observedScopeMaps;
                        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                        int size = mutableVector.getSize();
                        for (int i2 = 0; i2 < size; i2++) {
                            observedScopeMapArr[i2].notifyInvalidatedScopes();
                        }
                        snapshotStateObserver.sendingNotifications = false;
                    } finally {
                    }
                }
            }
        } while (snapshotStateObserver.drainChanges());
        return ab.f48028a;
    }

    private final <T> T withScopeMapLock(a<? extends T> aVar) {
        T tInvoke;
        synchronized (this.observedScopeMapsLock) {
            tInvoke = aVar.invoke();
        }
        return tInvoke;
    }

    public final void clear(Object obj) {
        synchronized (this.observedScopeMapsLock) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ObservedScopeMap observedScopeMap = mutableVector.content[i3];
                observedScopeMap.clearScopeObservations(obj);
                if (!observedScopeMap.hasScopeObservations()) {
                    i2++;
                } else if (i2 > 0) {
                    ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                    observedScopeMapArr[i3 - i2] = observedScopeMapArr[i3];
                }
            }
            ObservedScopeMap[] observedScopeMapArr2 = mutableVector.content;
            int i4 = size - i2;
            x.f(observedScopeMapArr2, "<this>");
            Arrays.fill(observedScopeMapArr2, i4, size, (Object) null);
            mutableVector.setSize(i4);
        }
    }

    public final void clearIf(l<Object, Boolean> lVar) {
        synchronized (this.observedScopeMapsLock) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ObservedScopeMap observedScopeMap = mutableVector.content[i3];
                observedScopeMap.removeScopeIf(lVar);
                if (!observedScopeMap.hasScopeObservations()) {
                    i2++;
                } else if (i2 > 0) {
                    ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                    observedScopeMapArr[i3 - i2] = observedScopeMapArr[i3];
                }
            }
            ObservedScopeMap[] observedScopeMapArr2 = mutableVector.content;
            int i4 = size - i2;
            x.f(observedScopeMapArr2, "<this>");
            Arrays.fill(observedScopeMapArr2, i4, size, (Object) null);
            mutableVector.setSize(i4);
        }
    }

    public final void notifyChanges(Set<? extends Object> set, Snapshot snapshot) {
        this.applyObserver.invoke(set, snapshot);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> void observeReads(T r23, h.g.a.l<? super T, h.ab> r24, h.g.a.a<h.ab> r25) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.observeReads(java.lang.Object, h.g.a.l, h.g.a.a):void");
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.Companion.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    public final void withNoObservations(a<ab> aVar) {
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            aVar.invoke();
        } finally {
            this.isPaused = z;
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMapsLock) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                observedScopeMapArr[i2].clear();
            }
        }
    }

    /* compiled from: WazeSource */
    final class ObservedScopeMap {
        private Object currentScope;
        private MutableObjectIntMap<Object> currentScopeReads;
        private int deriveStateScopeCount;
        private final MutableScatterSet<Object> invalidated;
        private final l<Object, ab> onChanged;
        private boolean readingDerivedStates;
        private final MutableScatterMap<Object, MutableObjectIntMap<Object>> scopeToValues;
        private int currentToken = -1;
        private final MutableScatterMap<Object, Object> valueToScopes = ScopeMap.m7383constructorimpl$default(null, 1, null);
        private final MutableVector<DerivedState<?>> statesToReread = new MutableVector<>(new DerivedState[16], 0);
        private final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                this.this$0.deriveStateScopeCount--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                this.this$0.deriveStateScopeCount++;
            }
        };
        private final MutableScatterMap<Object, Object> dependencyToDerivedStates = ScopeMap.m7383constructorimpl$default(null, 1, null);
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();

        public ObservedScopeMap(l<Object, ab> lVar) {
            this.onChanged = lVar;
            o oVar = null;
            int i2 = 1;
            int i3 = 0;
            this.scopeToValues = new MutableScatterMap<>(i3, i2, oVar);
            this.invalidated = new MutableScatterSet<>(i3, i2, oVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void clearObsoleteStateReads(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                int r1 = r0.currentToken
                androidx.collection.MutableObjectIntMap<java.lang.Object> r2 = r0.currentScopeReads
                if (r2 == 0) goto L61
                r3 = r2
                androidx.collection.ObjectIntMap r3 = (androidx.collection.ObjectIntMap) r3
                long[] r3 = r3.metadata
                int r4 = r3.length
                int r4 = r4 + (-2)
                if (r4 < 0) goto L61
                r5 = 0
                r6 = r5
            L14:
                r7 = r3[r6]
                long r9 = ~r7
                r11 = 7
                long r9 = r9 << r11
                long r9 = r9 & r7
                r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r9 = r9 & r11
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r9 == 0) goto L5a
                int r9 = r6 - r4
                r10 = r5
            L27:
                int r11 = ~r9
                int r11 = r11 >>> 31
                r12 = 8
                int r11 = 8 - r11
                if (r10 >= r11) goto L55
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r7
                r15 = 128(0x80, double:6.3E-322)
                int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r11 >= 0) goto L4f
                int r11 = r6 << 3
                int r11 = r11 + r10
                java.lang.Object[] r13 = r2.keys
                r13 = r13[r11]
                int[] r14 = r2.values
                r14 = r14[r11]
                if (r14 == r1) goto L4f
                r14 = r18
                r0.removeObservation(r14, r13)
                r2.removeValueAt(r11)
                goto L51
            L4f:
                r14 = r18
            L51:
                long r7 = r7 >> r12
                int r10 = r10 + 1
                goto L27
            L55:
                r14 = r18
                if (r11 != r12) goto L61
                goto L5c
            L5a:
                r14 = r18
            L5c:
                if (r6 == r4) goto L61
                int r6 = r6 + 1
                goto L14
            L61:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.clearObsoleteStateReads(java.lang.Object):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void recordRead(java.lang.Object r20, int r21, java.lang.Object r22, androidx.collection.MutableObjectIntMap<java.lang.Object> r23) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                int r3 = r0.deriveStateScopeCount
                if (r3 <= 0) goto Lc
                goto L9b
            Lc:
                r3 = -1
                r4 = r23
                int r4 = r4.put(r1, r2, r3)
                boolean r5 = r1 instanceof androidx.compose.runtime.DerivedState
                r6 = 2
                if (r5 == 0) goto L87
                if (r4 == r2) goto L87
                r2 = r1
                androidx.compose.runtime.DerivedState r2 = (androidx.compose.runtime.DerivedState) r2
                androidx.compose.runtime.DerivedState$Record r2 = r2.getCurrentRecord()
                java.util.HashMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> r5 = r0.recordedDerivedStateValues
                java.util.Map r5 = (java.util.Map) r5
                java.lang.Object r7 = r2.getCurrentValue()
                r5.put(r1, r7)
                androidx.collection.ObjectIntMap r2 = r2.getDependencies()
                androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r5 = r0.dependencyToDerivedStates
                androidx.compose.runtime.collection.ScopeMap.m7398removeScopeimpl(r5, r1)
                java.lang.Object[] r7 = r2.keys
                long[] r2 = r2.metadata
                int r8 = r2.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto L87
                r10 = 0
            L3f:
                r11 = r2[r10]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto L7f
                int r13 = r10 - r8
                int r13 = ~r13
                r14 = 0
            L53:
                int r15 = r13 >>> 31
                r9 = 8
                int r15 = 8 - r15
                if (r14 >= r15) goto L7d
                r15 = 255(0xff, double:1.26E-321)
                long r15 = r15 & r11
                r17 = 128(0x80, double:6.3E-322)
                int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                if (r15 >= 0) goto L78
                int r15 = r10 << 3
                int r15 = r15 + r14
                r15 = r7[r15]
                androidx.compose.runtime.snapshots.StateObject r15 = (androidx.compose.runtime.snapshots.StateObject) r15
                boolean r3 = r15 instanceof androidx.compose.runtime.snapshots.StateObjectImpl
                if (r3 == 0) goto L75
                r3 = r15
                androidx.compose.runtime.snapshots.StateObjectImpl r3 = (androidx.compose.runtime.snapshots.StateObjectImpl) r3
                r3.m7636recordReadInh_f27i8$runtime(r6)
            L75:
                androidx.compose.runtime.collection.ScopeMap.m7376addimpl(r5, r15, r1)
            L78:
                long r11 = r11 >> r9
                int r14 = r14 + 1
                r3 = -1
                goto L53
            L7d:
                if (r15 != r9) goto L85
            L7f:
                if (r10 == r8) goto L85
                int r10 = r10 + 1
                r3 = -1
                goto L3f
            L85:
                r2 = -1
                goto L88
            L87:
                r2 = r3
            L88:
                if (r4 != r2) goto L9b
                boolean r2 = r1 instanceof androidx.compose.runtime.snapshots.StateObjectImpl
                if (r2 == 0) goto L94
                r2 = r1
                androidx.compose.runtime.snapshots.StateObjectImpl r2 = (androidx.compose.runtime.snapshots.StateObjectImpl) r2
                r2.m7636recordReadInh_f27i8$runtime(r6)
            L94:
                androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r0 = r0.valueToScopes
                r2 = r22
                androidx.compose.runtime.collection.ScopeMap.m7376addimpl(r0, r1, r2)
            L9b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.recordRead(java.lang.Object, int, java.lang.Object, androidx.collection.MutableObjectIntMap):void");
        }

        private final void removeObservation(Object obj, Object obj2) {
            ScopeMap.m7396removeimpl(this.valueToScopes, obj2, obj);
            if (!(obj2 instanceof DerivedState) || ScopeMap.m7384containsimpl(this.valueToScopes, obj2)) {
                return;
            }
            ScopeMap.m7398removeScopeimpl(this.dependencyToDerivedStates, obj2);
            this.recordedDerivedStateValues.remove(obj2);
        }

        public final void clear() {
            ScopeMap.m7381clearimpl(this.valueToScopes);
            this.scopeToValues.clear();
            ScopeMap.m7381clearimpl(this.dependencyToDerivedStates);
            this.recordedDerivedStateValues.clear();
        }

        public final void clearScopeObservations(Object obj) {
            int i2;
            MutableObjectIntMap<Object> mutableObjectIntMapRemove = this.scopeToValues.remove(obj);
            if (mutableObjectIntMapRemove == null) {
                return;
            }
            MutableObjectIntMap<Object> mutableObjectIntMap = mutableObjectIntMapRemove;
            Object[] objArr = mutableObjectIntMap.keys;
            int[] iArr = mutableObjectIntMap.values;
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i2 = 8 - ((~i4) >>> 31);
                        if (i5 >= i2) {
                            break;
                        }
                        if ((255 & j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj2 = objArr[i6];
                            int i7 = iArr[i6];
                            removeObservation(obj, obj2);
                        }
                        j2 >>= 8;
                        i5++;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i3 == length) {
                    return;
                } else {
                    i3++;
                }
            }
        }

        public final DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        public final l<Object, ab> getOnChanged() {
            return this.onChanged;
        }

        public final boolean getReadingDerivedStates() {
            return this.readingDerivedStates;
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.isNotEmpty();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void notifyInvalidatedScopes() {
            /*
                r17 = this;
                r0 = r17
                androidx.collection.MutableScatterSet<java.lang.Object> r1 = r0.invalidated
                r2 = r1
                androidx.collection.ScatterSet r2 = (androidx.collection.ScatterSet) r2
                java.lang.Object[] r3 = r2.elements
                long[] r2 = r2.metadata
                int r4 = r2.length
                int r4 = r4 + (-2)
                if (r4 < 0) goto L4c
                r5 = 0
                r6 = r5
            L12:
                r7 = r2[r6]
                long r9 = ~r7
                r11 = 7
                long r9 = r9 << r11
                long r9 = r9 & r7
                r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r9 = r9 & r11
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r9 == 0) goto L47
                int r9 = r6 - r4
                r10 = r5
            L25:
                int r11 = ~r9
                int r11 = r11 >>> 31
                r12 = 8
                int r11 = 8 - r11
                if (r10 >= r11) goto L45
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r7
                r15 = 128(0x80, double:6.3E-322)
                int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r11 >= 0) goto L41
                h.g.a.l<java.lang.Object, h.ab> r11 = r0.onChanged
                int r13 = r6 << 3
                int r13 = r13 + r10
                r13 = r3[r13]
                r11.invoke(r13)
            L41:
                long r7 = r7 >> r12
                int r10 = r10 + 1
                goto L25
            L45:
                if (r11 != r12) goto L4c
            L47:
                if (r6 == r4) goto L4c
                int r6 = r6 + 1
                goto L12
            L4c:
                r1.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.notifyInvalidatedScopes():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void observe(java.lang.Object r12, h.g.a.l<java.lang.Object, h.ab> r13, h.g.a.a<h.ab> r14) {
            /*
                r11 = this;
                java.lang.Object r0 = access$getCurrentScope$p(r11)
                androidx.collection.MutableObjectIntMap r1 = access$getCurrentScopeReads$p(r11)
                int r2 = access$getCurrentToken$p(r11)
                access$setCurrentScope$p(r11, r12)
                androidx.collection.MutableScatterMap r3 = access$getScopeToValues$p(r11)
                java.lang.Object r12 = r3.get(r12)
                androidx.collection.MutableObjectIntMap r12 = (androidx.collection.MutableObjectIntMap) r12
                access$setCurrentScopeReads$p(r11, r12)
                int r12 = access$getCurrentToken$p(r11)
                r3 = -1
                if (r12 != r3) goto L32
                androidx.compose.runtime.snapshots.Snapshot r12 = androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot()
                long r4 = r12.getSnapshotId()
                int r12 = androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$$ExternalSyntheticBackport0.m(r4)
                access$setCurrentToken$p(r11, r12)
            L32:
                androidx.compose.runtime.DerivedStateObserver r12 = r11.getDerivedStateObserver()
                androidx.compose.runtime.collection.MutableVector r4 = androidx.compose.runtime.SnapshotStateKt.derivedStateObservers()
                r4.add(r12)     // Catch: java.lang.Throwable -> Le5
                if (r13 != 0) goto L44
                r14.invoke()     // Catch: java.lang.Throwable -> Le5
                goto Lbb
            L44:
                androidx.compose.runtime.internal.SnapshotThreadLocal r12 = androidx.compose.runtime.snapshots.SnapshotKt.access$getThreadSnapshot$p()     // Catch: java.lang.Throwable -> Le5
                java.lang.Object r12 = r12.get()     // Catch: java.lang.Throwable -> Le5
                androidx.compose.runtime.snapshots.Snapshot r12 = (androidx.compose.runtime.snapshots.Snapshot) r12     // Catch: java.lang.Throwable -> Le5
                boolean r5 = r12 instanceof androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot     // Catch: java.lang.Throwable -> Le5
                r6 = 0
                if (r5 == 0) goto L8f
                r5 = r12
                androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot r5 = (androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot) r5     // Catch: java.lang.Throwable -> Le5
                long r7 = r5.getThreadId$runtime()     // Catch: java.lang.Throwable -> Le5
                long r9 = androidx.compose.runtime.internal.Thread_jvmKt.currentThreadId()     // Catch: java.lang.Throwable -> Le5
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 != 0) goto L8f
                h.g.a.l r7 = r5.getReadObserver()     // Catch: java.lang.Throwable -> Le5
                h.g.a.l r8 = r5.getWriteObserver$runtime()     // Catch: java.lang.Throwable -> Le5
                r9 = 0
                r10 = 4
                h.g.a.l r13 = androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver$default(r13, r7, r9, r10, r6)     // Catch: java.lang.Throwable -> L84
                r5.setReadObserver$runtime(r13)     // Catch: java.lang.Throwable -> L84
                h.g.a.l r13 = androidx.compose.runtime.snapshots.SnapshotKt.mergedWriteObserver(r6, r8)     // Catch: java.lang.Throwable -> L84
                r5.setWriteObserver$runtime(r13)     // Catch: java.lang.Throwable -> L84
                r14.invoke()     // Catch: java.lang.Throwable -> L84
                r5.setReadObserver$runtime(r7)     // Catch: java.lang.Throwable -> Le5
                r5.setWriteObserver$runtime(r8)     // Catch: java.lang.Throwable -> Le5
                goto Lbb
            L84:
                r0 = move-exception
                r11 = r0
                androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot r12 = (androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot) r12     // Catch: java.lang.Throwable -> Le5
                r12.setReadObserver$runtime(r7)     // Catch: java.lang.Throwable -> Le5
                r12.setWriteObserver$runtime(r8)     // Catch: java.lang.Throwable -> Le5
                throw r11     // Catch: java.lang.Throwable -> Le5
            L8f:
                if (r12 == 0) goto L9b
                boolean r5 = r12 instanceof androidx.compose.runtime.snapshots.MutableSnapshot     // Catch: java.lang.Throwable -> Le5
                if (r5 == 0) goto L96
                goto L9b
            L96:
                androidx.compose.runtime.snapshots.Snapshot r12 = r12.takeNestedSnapshot(r13)     // Catch: java.lang.Throwable -> Le5
                goto Lae
            L9b:
                androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot r5 = new androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot     // Catch: java.lang.Throwable -> Le5
                boolean r7 = r12 instanceof androidx.compose.runtime.snapshots.MutableSnapshot     // Catch: java.lang.Throwable -> Le5
                if (r7 == 0) goto La4
                r6 = r12
                androidx.compose.runtime.snapshots.MutableSnapshot r6 = (androidx.compose.runtime.snapshots.MutableSnapshot) r6     // Catch: java.lang.Throwable -> Le5
            La4:
                r9 = 1
                r10 = 0
                r8 = 0
                r7 = r13
                r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Le5
                r12 = r5
                androidx.compose.runtime.snapshots.Snapshot r12 = (androidx.compose.runtime.snapshots.Snapshot) r12     // Catch: java.lang.Throwable -> Le5
            Lae:
                androidx.compose.runtime.snapshots.Snapshot r13 = r12.makeCurrent()     // Catch: java.lang.Throwable -> Ldf
                r14.invoke()     // Catch: java.lang.Throwable -> Ld9
                r12.restoreCurrent(r13)     // Catch: java.lang.Throwable -> Ldf
                r12.dispose()     // Catch: java.lang.Throwable -> Le5
            Lbb:
                int r12 = r4.getSize()
                int r12 = r12 + r3
                r4.removeAt(r12)
                java.lang.Object r12 = access$getCurrentScope$p(r11)
                if (r12 != 0) goto Lcc
                h.g.b.x.g()
            Lcc:
                access$clearObsoleteStateReads(r11, r12)
                access$setCurrentScope$p(r11, r0)
                access$setCurrentScopeReads$p(r11, r1)
                access$setCurrentToken$p(r11, r2)
                return
            Ld9:
                r0 = move-exception
                r11 = r0
                r12.restoreCurrent(r13)     // Catch: java.lang.Throwable -> Ldf
                throw r11     // Catch: java.lang.Throwable -> Ldf
            Ldf:
                r0 = move-exception
                r11 = r0
                r12.dispose()     // Catch: java.lang.Throwable -> Le5
                throw r11     // Catch: java.lang.Throwable -> Le5
            Le5:
                r0 = move-exception
                r11 = r0
                int r12 = r4.getSize()
                int r12 = r12 + r3
                r4.removeAt(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.observe(java.lang.Object, h.g.a.l, h.g.a.a):void");
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:130:0x02a7 A[EDGE_INSN: B:290:0x02a7->B:130:0x02a7 BREAK  A[LOOP:6: B:115:0x0259->B:126:0x028e], PHI: r21 r27 r29 r31 r33 r37 r38 r44
  0x02a7: PHI (r21v36 boolean) = (r21v35 boolean), (r21v38 boolean), (r21v38 boolean), (r21v41 boolean) binds: [B:129:0x029b, B:109:0x0245, B:113:0x0256, B:290:0x02a7] A[DONT_GENERATE, DONT_INLINE]
  0x02a7: PHI (r27v18 java.lang.Object[]) = (r27v17 java.lang.Object[]), (r27v21 java.lang.Object[]), (r27v21 java.lang.Object[]), (r27v21 java.lang.Object[]) binds: [B:129:0x029b, B:109:0x0245, B:113:0x0256, B:290:0x02a7] A[DONT_GENERATE, DONT_INLINE]
  0x02a7: PHI (r29v6 int) = (r29v5 int), (r29v9 int), (r29v9 int), (r29v9 int) binds: [B:129:0x029b, B:109:0x0245, B:113:0x0256, B:290:0x02a7] A[DONT_GENERATE, DONT_INLINE]
  0x02a7: PHI (r31v7 long) = (r31v6 long), (r31v10 long), (r31v10 long), (r31v10 long) binds: [B:129:0x029b, B:109:0x0245, B:113:0x0256, B:290:0x02a7] A[DONT_GENERATE, DONT_INLINE]
  0x02a7: PHI (r33v5 int) = (r33v4 int), (r33v8 int), (r33v8 int), (r33v8 int) binds: [B:129:0x029b, B:109:0x0245, B:113:0x0256, B:290:0x02a7] A[DONT_GENERATE, DONT_INLINE]
  0x02a7: PHI (r37v17 java.lang.String) = (r37v16 java.lang.String), (r37v20 java.lang.String), (r37v20 java.lang.String), (r37v20 java.lang.String) binds: [B:129:0x029b, B:109:0x0245, B:113:0x0256, B:290:0x02a7] A[DONT_GENERATE, DONT_INLINE]
  0x02a7: PHI (r38v2 int) = (r38v1 int), (r38v5 int), (r38v5 int), (r38v5 int) binds: [B:129:0x029b, B:109:0x0245, B:113:0x0256, B:290:0x02a7] A[DONT_GENERATE, DONT_INLINE]
  0x02a7: PHI (r44v20 long[]) = (r44v19 long[]), (r44v23 long[]), (r44v23 long[]), (r44v23 long[]) binds: [B:129:0x029b, B:109:0x0245, B:113:0x0256, B:290:0x02a7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:225:0x04ac A[PHI: r21
  0x04ac: PHI (r21v14 boolean) = (r21v13 boolean), (r21v15 boolean) binds: [B:216:0x0483, B:224:0x04aa] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:230:0x04bc  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x0553 A[LOOP:10: B:268:0x0551->B:269:0x0553, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0210 A[PHI: r21
  0x0210: PHI (r21v49 boolean) = (r21v48 boolean), (r21v50 boolean) binds: [B:88:0x01e8, B:96:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean recordInvalidation(java.util.Set<? extends java.lang.Object> r44) {
            /*
                Method dump skipped, instructions count: 1379
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.recordInvalidation(java.util.Set):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void removeScopeIf(h.g.a.l<java.lang.Object, java.lang.Boolean> r35) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.removeScopeIf(h.g.a.l):void");
        }

        public final void rereadDerivedState(DerivedState<?> derivedState) {
            long[] jArr;
            int i2;
            long[] jArr2;
            char c2;
            MutableObjectIntMap<Object> mutableObjectIntMap;
            int iM = SnapshotStateObserver$ObservedScopeMap$$ExternalSyntheticBackport0.m(SnapshotKt.currentSnapshot().getSnapshotId());
            Object obj = this.valueToScopes.get(derivedState);
            if (obj == null) {
                return;
            }
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            int i3 = 1;
            int i4 = 0;
            if (!(obj instanceof MutableScatterSet)) {
                MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableScatterMap.get(obj);
                if (mutableObjectIntMap2 == null) {
                    mutableObjectIntMap2 = new MutableObjectIntMap<>(i4, i3, null);
                    mutableScatterMap.set(obj, mutableObjectIntMap2);
                }
                recordRead(derivedState, iM, obj, mutableObjectIntMap2);
                return;
            }
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr3 = mutableScatterSet.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                long j2 = jArr3[i5];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = i5 - length;
                    int i7 = 0;
                    while (true) {
                        i2 = 8 - ((~i6) >>> 31);
                        if (i7 >= i2) {
                            break;
                        }
                        if ((j2 & 255) < 128) {
                            Object obj2 = objArr[(i5 << 3) + i7];
                            MutableObjectIntMap<Object> mutableObjectIntMap3 = mutableScatterMap.get(obj2);
                            if (mutableObjectIntMap3 == null) {
                                c2 = '\b';
                                jArr2 = jArr3;
                                mutableObjectIntMap = new MutableObjectIntMap<>(i4, i3, null);
                                mutableScatterMap.set(obj2, mutableObjectIntMap);
                            } else {
                                jArr2 = jArr3;
                                c2 = '\b';
                                mutableObjectIntMap = mutableObjectIntMap3;
                            }
                            recordRead(derivedState, iM, obj2, mutableObjectIntMap);
                        } else {
                            jArr2 = jArr3;
                            c2 = '\b';
                        }
                        j2 >>= c2;
                        i7++;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i2 != 8) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i5 == length) {
                    return;
                }
                i5++;
                jArr3 = jArr;
            }
        }

        public final void setReadingDerivedStates(boolean z) {
            this.readingDerivedStates = z;
        }

        public final void recordRead(Object obj) {
            Object obj2 = this.currentScope;
            if (obj2 == null) {
                x.g();
            }
            int i2 = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                this.currentScopeReads = mutableObjectIntMap;
                this.scopeToValues.set(obj2, mutableObjectIntMap);
            }
            recordRead(obj, i2, obj2, mutableObjectIntMap);
        }
    }
}
