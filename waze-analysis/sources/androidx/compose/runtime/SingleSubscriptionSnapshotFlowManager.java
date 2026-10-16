package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.Set;
import kotlinx.coroutines.a.ag;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SingleSubscriptionSnapshotFlowManager extends SnapshotFlowManagerImpl {
    private Object soleWatchedObject;
    private ag<? super ab> subscribedChannel;
    private MutableScatterSet<Object> watchSet;
    private Object workingSoleWatchedObject;
    private MutableScatterSet<Object> workingWatchSet;
    private final l<Object, ab> readObserverCache = new l() { // from class: androidx.compose.runtime.SingleSubscriptionSnapshotFlowManager$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SingleSubscriptionSnapshotFlowManager.readObserverCache$lambda$0(this.f$0, obj);
        }
    };
    private final ObserverHandle unregisterApplyObserver = Snapshot.Companion.registerApplyObserver(new p() { // from class: androidx.compose.runtime.SingleSubscriptionSnapshotFlowManager$$ExternalSyntheticLambda1
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return SingleSubscriptionSnapshotFlowManager.unregisterApplyObserver$lambda$0(this.f$0, (Set) obj, (Snapshot) obj2);
        }
    });

    private final void clearWatchSetImpl() {
        this.workingSoleWatchedObject = null;
        this.workingWatchSet = null;
    }

    static final ab readObserverCache$lambda$0(SingleSubscriptionSnapshotFlowManager singleSubscriptionSnapshotFlowManager, Object obj) {
        ag<? super ab> agVar = singleSubscriptionSnapshotFlowManager.subscribedChannel;
        x.c(agVar);
        singleSubscriptionSnapshotFlowManager.watch$runtime(agVar, obj);
        return ab.f48028a;
    }

    static final ab unregisterApplyObserver$lambda$0(SingleSubscriptionSnapshotFlowManager singleSubscriptionSnapshotFlowManager, Set set, Snapshot snapshot) {
        ag<? super ab> agVar;
        synchronized (singleSubscriptionSnapshotFlowManager.getLock()) {
            MutableScatterSet<Object> mutableScatterSet = singleSubscriptionSnapshotFlowManager.watchSet;
            agVar = null;
            if (mutableScatterSet != null) {
                MutableScatterSet<Object> mutableScatterSet2 = mutableScatterSet;
                Object[] objArr = mutableScatterSet2.elements;
                long[] jArr = mutableScatterSet2.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    loop0: while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                int i5 = 8 - ((~i3) >>> 31);
                                if (i4 >= i5) {
                                    if (i5 != 8) {
                                        break;
                                    }
                                } else {
                                    if ((255 & j2) < 128 && set.contains(objArr[(i2 << 3) + i4])) {
                                        agVar = singleSubscriptionSnapshotFlowManager.subscribedChannel;
                                        break loop0;
                                    }
                                    j2 >>= 8;
                                    i4++;
                                }
                            }
                        }
                    }
                }
            } else if (i.ax(set, singleSubscriptionSnapshotFlowManager.soleWatchedObject)) {
                agVar = singleSubscriptionSnapshotFlowManager.subscribedChannel;
            }
        }
        if (agVar != null) {
            agVar.i(ab.f48028a);
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void clearWatchSet$runtime(ag<? super ab> agVar) {
        clearWatchSetImpl();
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void commitSubscriptionChanges$runtime() {
        synchronized (getLock()) {
            this.soleWatchedObject = this.workingSoleWatchedObject;
            if (this.workingWatchSet == null) {
                this.watchSet = null;
            } else {
                MutableScatterSet<Object> mutableScatterSetMutableScatterSetOf = this.watchSet;
                if (mutableScatterSetMutableScatterSetOf == null) {
                    mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
                    this.watchSet = mutableScatterSetMutableScatterSetOf;
                }
                this.watchSet = this.workingWatchSet;
                this.workingWatchSet = mutableScatterSetMutableScatterSetOf;
            }
        }
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void dispose$runtime() {
        this.unregisterApplyObserver.dispose();
        clearWatchSetImpl();
        synchronized (getLock()) {
            this.subscribedChannel = null;
            this.soleWatchedObject = null;
            this.watchSet = null;
        }
    }

    public final ag<ab> getSubscribedChannel() {
        return this.subscribedChannel;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager promote() {
        /*
            r18 = this;
            r0 = r18
            androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager r1 = new androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager
            r1.<init>()
            kotlinx.coroutines.a.ag<? super h.ab> r2 = r0.subscribedChannel
            if (r2 != 0) goto L10
            java.lang.String r3 = "promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second"
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(r3)
        L10:
            androidx.collection.MutableScatterSet<java.lang.Object> r3 = r0.watchSet
            if (r3 != 0) goto L1d
            java.lang.Object r3 = r0.soleWatchedObject
            h.g.b.x.c(r3)
            r1.watch$runtime(r2, r3)
            goto L62
        L1d:
            androidx.collection.ScatterSet r3 = (androidx.collection.ScatterSet) r3
            java.lang.Object[] r4 = r3.elements
            long[] r3 = r3.metadata
            int r5 = r3.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L62
            r6 = 0
            r7 = r6
        L2a:
            r8 = r3[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5d
            int r10 = r7 - r5
            r11 = r6
        L3d:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L5b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r7 << 3
            int r12 = r12 + r11
            r12 = r4[r12]
            r1.watch$runtime(r2, r12)
        L57:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L3d
        L5b:
            if (r12 != r13) goto L62
        L5d:
            if (r7 == r5) goto L62
            int r7 = r7 + 1
            goto L2a
        L62:
            r1.commitSubscriptionChanges$runtime()
            r0.dispose$runtime()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SingleSubscriptionSnapshotFlowManager.promote():androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager");
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public l<Object, ab> readObserverFor$runtime(ag<? super ab> agVar) {
        ag<? super ab> agVar2 = this.subscribedChannel;
        if (agVar2 != null && !x.n(agVar2, agVar)) {
            PreconditionsKt.throwIllegalStateException("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.subscribedChannel = agVar;
        return this.readObserverCache;
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void reportSnapshotFlowCancellation$runtime(ag<? super ab> agVar) {
        this.subscribedChannel = null;
        clearWatchSet$runtime(agVar);
        commitSubscriptionChanges$runtime();
    }

    public final void setSubscribedChannel(ag<? super ab> agVar) {
        this.subscribedChannel = agVar;
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void watch$runtime(ag<? super ab> agVar, Object obj) {
        if (!x.n(this.subscribedChannel, agVar)) {
            PreconditionsKt.throwIllegalStateException("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        MutableScatterSet<Object> mutableScatterSet = this.workingWatchSet;
        Object obj2 = this.workingSoleWatchedObject;
        if (mutableScatterSet != null) {
            if (obj2 != null) {
                PreconditionsKt.throwIllegalStateException("workingSoleWatchedObject must be null when workingWatchSet is non-null");
            }
            mutableScatterSet.add(obj);
        } else {
            if (obj2 == null) {
                this.workingSoleWatchedObject = obj;
                return;
            }
            MutableScatterSet<Object> mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            mutableScatterSetMutableScatterSetOf.add(obj2);
            mutableScatterSetMutableScatterSetOf.add(obj);
            this.workingWatchSet = mutableScatterSetMutableScatterSetOf;
            this.workingSoleWatchedObject = null;
        }
    }
}
