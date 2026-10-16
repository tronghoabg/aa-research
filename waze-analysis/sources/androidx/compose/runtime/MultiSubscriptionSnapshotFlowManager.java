package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.a.ag;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MultiSubscriptionSnapshotFlowManager extends SnapshotFlowManagerImpl {
    private MutableScatterMap<Object, Object> subscriptions = ScopeMap.m7383constructorimpl$default(null, 1, null);
    private final List<SubscriptionChange> pendingChanges = new ArrayList();
    private final MutableScatterSet<ag<ab>> toNotify = ScatterSetKt.mutableScatterSetOf();
    private final MutableScatterMap<ag<ab>, l<Object, ab>> readObserverCache = ScatterMapKt.mutableScatterMapOf();
    private final ObserverHandle unregisterApplyObserver = Snapshot.Companion.registerApplyObserver(new p() { // from class: androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager$$ExternalSyntheticLambda2
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return MultiSubscriptionSnapshotFlowManager.unregisterApplyObserver$lambda$0(this.f$0, (Set) obj, (Snapshot) obj2);
        }
    });

    /* compiled from: WazeSource */
    final class Add implements SubscriptionChange {
        private final ag<ab> channel;
        private final Object obj;

        /* JADX WARN: Multi-variable type inference failed */
        public Add(Object obj, ag<? super ab> agVar) {
            this.obj = obj;
            this.channel = agVar;
        }

        public final ag<ab> getChannel() {
            return this.channel;
        }

        public final Object getObj() {
            return this.obj;
        }
    }

    /* compiled from: WazeSource */
    final class RemoveScope implements SubscriptionChange {
        private final ag<ab> channel;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoveScope(ag<? super ab> agVar) {
            this.channel = agVar;
        }

        public final ag<ab> getChannel() {
            return this.channel;
        }
    }

    /* compiled from: WazeSource */
    interface SubscriptionChange {
    }

    static final ab readObserverFor$lambda$0(MultiSubscriptionSnapshotFlowManager multiSubscriptionSnapshotFlowManager, ag agVar, Object obj) {
        multiSubscriptionSnapshotFlowManager.watch$runtime(agVar, obj);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final h.ab unregisterApplyObserver$lambda$0(final androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager r17, final java.util.Set r18, androidx.compose.runtime.snapshots.Snapshot r19) {
        /*
            r0 = r17
            java.lang.Object r1 = r0.getLock()
            monitor-enter(r1)
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r2 = r0.subscriptions     // Catch: java.lang.Throwable -> L67
            androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager$$ExternalSyntheticLambda1 r3 = new androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L67
            r4 = r18
            r3.<init>()     // Catch: java.lang.Throwable -> L67
            androidx.compose.runtime.collection.ScopeMap.m7388forEachKeyimpl(r2, r3)     // Catch: java.lang.Throwable -> L67
            androidx.collection.MutableScatterSet<kotlinx.coroutines.a.ag<h.ab>> r2 = r0.toNotify     // Catch: java.lang.Throwable -> L67
            androidx.collection.ScatterSet r2 = (androidx.collection.ScatterSet) r2     // Catch: java.lang.Throwable -> L67
            java.lang.Object[] r3 = r2.elements     // Catch: java.lang.Throwable -> L67
            long[] r2 = r2.metadata     // Catch: java.lang.Throwable -> L67
            int r4 = r2.length     // Catch: java.lang.Throwable -> L67
            int r4 = r4 + (-2)
            if (r4 < 0) goto L5e
            r5 = 0
            r6 = r5
        L22:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L67
            long r9 = ~r7     // Catch: java.lang.Throwable -> L67
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L59
            int r9 = r6 - r4
            r10 = r5
        L35:
            int r11 = ~r9     // Catch: java.lang.Throwable -> L67
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L53
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L67
            kotlinx.coroutines.a.ag r11 = (kotlinx.coroutines.a.ag) r11     // Catch: java.lang.Throwable -> L67
            h.ab r13 = h.ab.f48028a     // Catch: java.lang.Throwable -> L67
            r11.i(r13)     // Catch: java.lang.Throwable -> L67
        L53:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L35
        L57:
            if (r11 != r12) goto L5e
        L59:
            if (r6 == r4) goto L5e
            int r6 = r6 + 1
            goto L22
        L5e:
            androidx.collection.MutableScatterSet<kotlinx.coroutines.a.ag<h.ab>> r0 = r0.toNotify     // Catch: java.lang.Throwable -> L67
            r0.clear()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r1)
            h.ab r0 = h.ab.f48028a
            return r0
        L67:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager.unregisterApplyObserver$lambda$0(androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager, java.util.Set, androidx.compose.runtime.snapshots.Snapshot):h.ab");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final h.ab unregisterApplyObserver$lambda$0$0$0(java.util.Set r13, androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager r14, java.lang.Object r15) {
        /*
            boolean r13 = r13.contains(r15)
            if (r13 == 0) goto L64
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r13 = r14.subscriptions
            java.lang.Object r13 = r13.get(r15)
            if (r13 == 0) goto L64
            boolean r15 = r13 instanceof androidx.collection.MutableScatterSet
            if (r15 == 0) goto L5d
            androidx.collection.MutableScatterSet r13 = (androidx.collection.MutableScatterSet) r13
            androidx.collection.ScatterSet r13 = (androidx.collection.ScatterSet) r13
            java.lang.Object[] r15 = r13.elements
            long[] r13 = r13.metadata
            int r0 = r13.length
            int r0 = r0 + (-2)
            if (r0 < 0) goto L64
            r1 = 0
            r2 = r1
        L21:
            r3 = r13[r2]
            long r5 = ~r3
            r7 = 7
            long r5 = r5 << r7
            long r5 = r5 & r3
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L58
            int r5 = r2 - r0
            r6 = r1
        L34:
            int r7 = ~r5
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            if (r6 >= r7) goto L56
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r3
            r11 = 128(0x80, double:6.3E-322)
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 >= 0) goto L52
            int r7 = r2 << 3
            int r7 = r7 + r6
            r7 = r15[r7]
            kotlinx.coroutines.a.ag r7 = (kotlinx.coroutines.a.ag) r7
            androidx.collection.MutableScatterSet<kotlinx.coroutines.a.ag<h.ab>> r9 = r14.toNotify
            r9.add(r7)
        L52:
            long r3 = r3 >> r8
            int r6 = r6 + 1
            goto L34
        L56:
            if (r7 != r8) goto L64
        L58:
            if (r2 == r0) goto L64
            int r2 = r2 + 1
            goto L21
        L5d:
            kotlinx.coroutines.a.ag r13 = (kotlinx.coroutines.a.ag) r13
            androidx.collection.MutableScatterSet<kotlinx.coroutines.a.ag<h.ab>> r14 = r14.toNotify
            r14.add(r13)
        L64:
            h.ab r13 = h.ab.f48028a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager.unregisterApplyObserver$lambda$0$0$0(java.util.Set, androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager, java.lang.Object):h.ab");
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void clearWatchSet$runtime(ag<? super ab> agVar) {
        this.pendingChanges.add(new RemoveScope(agVar));
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void commitSubscriptionChanges$runtime() {
        synchronized (getLock()) {
            List<SubscriptionChange> list = this.pendingChanges;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                SubscriptionChange subscriptionChange = list.get(i2);
                if (subscriptionChange instanceof Add) {
                    Add add = (Add) subscriptionChange;
                    ScopeMap.m7376addimpl(this.subscriptions, add.getObj(), add.getChannel());
                } else {
                    if (!(subscriptionChange instanceof RemoveScope)) {
                        throw new i();
                    }
                    ScopeMap.m7398removeScopeimpl(this.subscriptions, ((RemoveScope) subscriptionChange).getChannel());
                }
            }
        }
        this.pendingChanges.clear();
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void dispose$runtime() {
        this.unregisterApplyObserver.dispose();
        this.pendingChanges.clear();
        this.readObserverCache.clear();
        synchronized (getLock()) {
            ScopeMap.m7381clearimpl(this.subscriptions);
        }
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public l<Object, ab> readObserverFor$runtime(final ag<? super ab> agVar) {
        l<Object, ab> lVar = this.readObserverCache.get(agVar);
        if (lVar != null) {
            return lVar;
        }
        l<Object, ab> lVar2 = new l() { // from class: androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return MultiSubscriptionSnapshotFlowManager.readObserverFor$lambda$0(this.f$0, agVar, obj);
            }
        };
        this.readObserverCache.put(agVar, lVar2);
        return lVar2;
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void reportSnapshotFlowCancellation$runtime(ag<? super ab> agVar) {
        this.readObserverCache.remove(agVar);
        clearWatchSet$runtime(agVar);
        commitSubscriptionChanges$runtime();
    }

    @Override // androidx.compose.runtime.SnapshotFlowManagerImpl
    public void watch$runtime(ag<? super ab> agVar, Object obj) {
        this.pendingChanges.add(new Add(obj, agVar));
    }
}
