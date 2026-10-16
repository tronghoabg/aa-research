package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4295e;

/* loaded from: classes.dex */
public final class s implements y, Map, InterfaceC4295e {

    /* renamed from: a, reason: collision with root package name */
    public r f15737a;

    /* renamed from: b, reason: collision with root package name */
    public final n f15738b;

    /* renamed from: c, reason: collision with root package name */
    public final n f15739c;

    /* renamed from: d, reason: collision with root package name */
    public final n f15740d;

    public s() {
        S.c cVar = S.c.f10799c;
        r rVar = new r(cVar);
        if (m.f15717a.E() != null) {
            r rVar2 = new r(cVar);
            rVar2.f15664a = 1;
            rVar.f15665b = rVar2;
        }
        this.f15737a = rVar;
        this.f15738b = new n(this, 0);
        this.f15739c = new n(this, 1);
        this.f15740d = new n(this, 2);
    }

    public final r a() {
        r rVar = this.f15737a;
        AbstractC3340k.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (r) m.u(rVar, this);
    }

    @Override // X.y
    public final void c(A a5) {
        AbstractC3340k.c(a5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f15737a = (r) a5;
    }

    @Override // java.util.Map
    public final void clear() {
        g gVarK;
        r rVar = this.f15737a;
        AbstractC3340k.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        r rVar2 = (r) m.i(rVar);
        S.c cVar = S.c.f10799c;
        if (cVar != rVar2.f15735c) {
            r rVar3 = this.f15737a;
            AbstractC3340k.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                r rVar4 = (r) m.x(rVar3, this, gVarK);
                synchronized (q.f15734b) {
                    rVar4.f15735c = cVar;
                    rVar4.f15736d++;
                }
            }
            m.o(gVarK, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return a().f15735c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return a().f15735c.containsValue(obj);
    }

    @Override // X.y
    public final A e() {
        return this.f15737a;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f15738b;
    }

    @Override // X.y
    public final /* synthetic */ A f(A a5, A a10, A a11) {
        return null;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return a().f15735c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return a().f15735c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f15739c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Q.d dVar;
        int i5;
        Object objPut;
        g gVarK;
        boolean z2;
        do {
            Object obj3 = q.f15734b;
            synchronized (obj3) {
                r rVar = this.f15737a;
                AbstractC3340k.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) m.i(rVar);
                dVar = rVar2.f15735c;
                i5 = rVar2.f15736d;
            }
            AbstractC3340k.b(dVar);
            S.e eVar = (S.e) dVar.builder();
            objPut = eVar.put(obj, obj2);
            Q.d dVarBuild = eVar.build();
            if (AbstractC3340k.a(dVarBuild, dVar)) {
                break;
            }
            r rVar3 = this.f15737a;
            AbstractC3340k.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                r rVar4 = (r) m.x(rVar3, this, gVarK);
                synchronized (obj3) {
                    int i10 = rVar4.f15736d;
                    if (i10 == i5) {
                        rVar4.f15735c = dVarBuild;
                        rVar4.f15736d = i10 + 1;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            m.o(gVarK, this);
        } while (!z2);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        Q.d dVar;
        int i5;
        g gVarK;
        boolean z2;
        do {
            Object obj = q.f15734b;
            synchronized (obj) {
                r rVar = this.f15737a;
                AbstractC3340k.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) m.i(rVar);
                dVar = rVar2.f15735c;
                i5 = rVar2.f15736d;
            }
            AbstractC3340k.b(dVar);
            S.e eVar = (S.e) dVar.builder();
            eVar.putAll(map);
            Q.d dVarBuild = eVar.build();
            if (AbstractC3340k.a(dVarBuild, dVar)) {
                return;
            }
            r rVar3 = this.f15737a;
            AbstractC3340k.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                r rVar4 = (r) m.x(rVar3, this, gVarK);
                synchronized (obj) {
                    int i10 = rVar4.f15736d;
                    if (i10 == i5) {
                        rVar4.f15735c = dVarBuild;
                        rVar4.f15736d = i10 + 1;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            m.o(gVarK, this);
        } while (!z2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Q.d dVar;
        int i5;
        Object objRemove;
        g gVarK;
        boolean z2;
        do {
            Object obj2 = q.f15734b;
            synchronized (obj2) {
                r rVar = this.f15737a;
                AbstractC3340k.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) m.i(rVar);
                dVar = rVar2.f15735c;
                i5 = rVar2.f15736d;
            }
            AbstractC3340k.b(dVar);
            Q.c cVarBuilder = dVar.builder();
            objRemove = cVarBuilder.remove(obj);
            Q.d dVarBuild = cVarBuilder.build();
            if (AbstractC3340k.a(dVarBuild, dVar)) {
                break;
            }
            r rVar3 = this.f15737a;
            AbstractC3340k.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                r rVar4 = (r) m.x(rVar3, this, gVarK);
                synchronized (obj2) {
                    int i10 = rVar4.f15736d;
                    if (i10 == i5) {
                        rVar4.f15735c = dVarBuild;
                        rVar4.f15736d = i10 + 1;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            m.o(gVarK, this);
        } while (!z2);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return a().f15735c.size();
    }

    public final String toString() {
        r rVar = this.f15737a;
        AbstractC3340k.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((r) m.i(rVar)).f15735c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f15740d;
    }
}
