package X;

import ff.AbstractC2641B;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3339j;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;
import uf.InterfaceC4294d;
import uf.InterfaceC4296f;

/* loaded from: classes.dex */
public final class n implements Set, InterfaceC4296f {

    /* renamed from: a, reason: collision with root package name */
    public final s f15727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15728b;

    public n(s sVar, int i5) {
        this.f15728b = i5;
        this.f15727a = sVar;
    }

    private final boolean a(Collection collection) {
        Q.d dVar;
        int i5;
        boolean z2;
        g gVarK;
        Collection<Map.Entry> collection2 = collection;
        int iD = AbstractC2641B.D(ff.p.a0(collection2, 10));
        if (iD < 16) {
            iD = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        s sVar = this.f15727a;
        boolean z10 = false;
        do {
            synchronized (q.f15734b) {
                r rVar = sVar.f15737a;
                AbstractC3340k.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) m.i(rVar);
                dVar = rVar2.f15735c;
                i5 = rVar2.f15736d;
            }
            AbstractC3340k.b(dVar);
            Q.c cVarBuilder = dVar.builder();
            Iterator it = sVar.f15738b.iterator();
            while (true) {
                z2 = true;
                if (!((x) it).hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) ((x) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC3340k.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    cVarBuilder.remove(entry2.getKey());
                    z10 = true;
                }
            }
            Q.d dVarBuild = cVarBuilder.build();
            if (AbstractC3340k.a(dVarBuild, dVar)) {
                break;
            }
            r rVar3 = sVar.f15737a;
            AbstractC3340k.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                r rVar4 = (r) m.x(rVar3, sVar, gVarK);
                synchronized (q.f15734b) {
                    int i10 = rVar4.f15736d;
                    if (i10 == i5) {
                        rVar4.f15735c = dVarBuild;
                        rVar4.f15736d = i10 + 1;
                    } else {
                        z2 = false;
                    }
                }
            }
            m.o(gVarK, sVar);
        } while (!z2);
        return z10;
    }

    private final boolean c(Collection collection) {
        Q.d dVar;
        int i5;
        boolean z2;
        g gVarK;
        Set setX0 = ff.o.X0(collection);
        s sVar = this.f15727a;
        boolean z10 = false;
        do {
            synchronized (q.f15734b) {
                r rVar = sVar.f15737a;
                AbstractC3340k.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) m.i(rVar);
                dVar = rVar2.f15735c;
                i5 = rVar2.f15736d;
            }
            AbstractC3340k.b(dVar);
            Q.c cVarBuilder = dVar.builder();
            Iterator it = sVar.f15738b.iterator();
            while (true) {
                z2 = true;
                if (!((x) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((x) it).next();
                if (!setX0.contains(entry.getKey())) {
                    cVarBuilder.remove(entry.getKey());
                    z10 = true;
                }
            }
            Q.d dVarBuild = cVarBuilder.build();
            if (AbstractC3340k.a(dVarBuild, dVar)) {
                break;
            }
            r rVar3 = sVar.f15737a;
            AbstractC3340k.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                r rVar4 = (r) m.x(rVar3, sVar, gVarK);
                synchronized (q.f15734b) {
                    int i10 = rVar4.f15736d;
                    if (i10 == i5) {
                        rVar4.f15735c = dVarBuild;
                        rVar4.f15736d = i10 + 1;
                    } else {
                        z2 = false;
                    }
                }
            }
            m.o(gVarK, sVar);
        } while (!z2);
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f15728b) {
            case 0:
                q.f();
                throw null;
            case 1:
                q.f();
                throw null;
            default:
                q.f();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f15728b) {
            case 0:
                q.f();
                throw null;
            case 1:
                q.f();
                throw null;
            default:
                q.f();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f15727a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f15728b) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof InterfaceC4291a) && !(obj instanceof InterfaceC4294d))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC3340k.a(this.f15727a.get(entry.getKey()), entry.getValue());
            case 1:
                return this.f15727a.containsKey(obj);
            default:
                return this.f15727a.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f15728b) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!this.f15727a.containsKey(it2.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!this.f15727a.containsValue(it3.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f15727a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f15728b) {
            case 0:
                s sVar = this.f15727a;
                return new x(sVar, ((Q.b) sVar.a().f15735c.entrySet()).iterator(), 0);
            case 1:
                s sVar2 = this.f15727a;
                return new x(sVar2, ((Q.b) sVar2.a().f15735c.entrySet()).iterator(), 1);
            default:
                s sVar3 = this.f15727a;
                return new x(sVar3, ((Q.b) sVar3.a().f15735c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        switch (this.f15728b) {
            case 0:
                if ((obj instanceof Map.Entry) && (!(obj instanceof InterfaceC4291a) || (obj instanceof InterfaceC4294d))) {
                    if (this.f15727a.remove(((Map.Entry) obj).getKey()) != null) {
                        break;
                    }
                }
                break;
            case 1:
                if (this.f15727a.remove(obj) != null) {
                }
                break;
            default:
                s sVar = this.f15727a;
                Iterator it = sVar.f15738b.iterator();
                while (true) {
                    if (((x) it).hasNext()) {
                        next = ((x) it).next();
                        if (AbstractC3340k.a(((Map.Entry) next).getValue(), obj)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    sVar.remove(entry.getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Q.d dVar;
        int i5;
        boolean z2;
        g gVarK;
        switch (this.f15728b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z10 = false;
                    while (it.hasNext()) {
                        if (this.f15727a.remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                            z10 = true;
                        }
                    }
                    return z10;
                    break;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z11 = false;
                    while (it2.hasNext()) {
                        if (this.f15727a.remove(it2.next()) != null || z11) {
                            z11 = true;
                        }
                    }
                    return z11;
                    break;
                }
                break;
            default:
                Set setX0 = ff.o.X0(collection);
                s sVar = this.f15727a;
                boolean z12 = false;
                do {
                    synchronized (q.f15734b) {
                        r rVar = sVar.f15737a;
                        AbstractC3340k.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        r rVar2 = (r) m.i(rVar);
                        dVar = rVar2.f15735c;
                        i5 = rVar2.f15736d;
                    }
                    AbstractC3340k.b(dVar);
                    Q.c cVarBuilder = dVar.builder();
                    Iterator it3 = sVar.f15738b.iterator();
                    while (true) {
                        z2 = true;
                        if (!((x) it3).hasNext()) {
                            Q.d dVarBuild = cVarBuilder.build();
                            if (!AbstractC3340k.a(dVarBuild, dVar)) {
                                r rVar3 = sVar.f15737a;
                                AbstractC3340k.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                                synchronized (m.f15718b) {
                                    gVarK = m.k();
                                    r rVar4 = (r) m.x(rVar3, sVar, gVarK);
                                    synchronized (q.f15734b) {
                                        int i10 = rVar4.f15736d;
                                        if (i10 == i5) {
                                            rVar4.f15735c = dVarBuild;
                                            rVar4.f15736d = i10 + 1;
                                        } else {
                                            z2 = false;
                                        }
                                    }
                                }
                                m.o(gVarK, sVar);
                            }
                            return z12;
                        }
                        Map.Entry entry = (Map.Entry) ((x) it3).next();
                        if (setX0.contains(entry.getValue())) {
                            cVarBuilder.remove(entry.getKey());
                            z12 = true;
                        }
                    }
                } while (!z2);
                return z12;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Q.d dVar;
        int i5;
        boolean z2;
        g gVarK;
        switch (this.f15728b) {
            case 0:
                return a(collection);
            case 1:
                return c(collection);
            default:
                Set setX0 = ff.o.X0(collection);
                s sVar = this.f15727a;
                boolean z10 = false;
                do {
                    synchronized (q.f15734b) {
                        r rVar = sVar.f15737a;
                        AbstractC3340k.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        r rVar2 = (r) m.i(rVar);
                        dVar = rVar2.f15735c;
                        i5 = rVar2.f15736d;
                    }
                    AbstractC3340k.b(dVar);
                    Q.c cVarBuilder = dVar.builder();
                    Iterator it = sVar.f15738b.iterator();
                    while (true) {
                        z2 = true;
                        if (!((x) it).hasNext()) {
                            Q.d dVarBuild = cVarBuilder.build();
                            if (!AbstractC3340k.a(dVarBuild, dVar)) {
                                r rVar3 = sVar.f15737a;
                                AbstractC3340k.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                                synchronized (m.f15718b) {
                                    gVarK = m.k();
                                    r rVar4 = (r) m.x(rVar3, sVar, gVarK);
                                    synchronized (q.f15734b) {
                                        int i10 = rVar4.f15736d;
                                        if (i10 == i5) {
                                            rVar4.f15735c = dVarBuild;
                                            rVar4.f15736d = i10 + 1;
                                        } else {
                                            z2 = false;
                                        }
                                    }
                                }
                                m.o(gVarK, sVar);
                            }
                            return z10;
                        }
                        Map.Entry entry = (Map.Entry) ((x) it).next();
                        if (!setX0.contains(entry.getValue())) {
                            cVarBuilder.remove(entry.getKey());
                            z10 = true;
                        }
                    }
                } while (!z2);
                return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f15727a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3339j.b(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3339j.c(this, objArr);
    }
}
