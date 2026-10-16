package X;

import N.C0718d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3339j;
import kotlin.jvm.internal.AbstractC3340k;
import o1.C3642d;
import uf.InterfaceC4293c;

/* loaded from: classes.dex */
public final class p implements y, List, RandomAccess, InterfaceC4293c {

    /* renamed from: a, reason: collision with root package name */
    public o f15732a;

    public final o a() {
        o oVar = this.f15732a;
        AbstractC3340k.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (o) m.u(oVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i5;
        R.c cVar;
        boolean z2;
        g gVarK;
        do {
            Object obj2 = q.f15733a;
            synchronized (obj2) {
                o oVar = this.f15732a;
                AbstractC3340k.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o oVar2 = (o) m.i(oVar);
                i5 = oVar2.f15730d;
                cVar = oVar2.f15729c;
            }
            AbstractC3340k.b(cVar);
            R.c cVarC = cVar.c(obj);
            z2 = false;
            if (cVarC.equals(cVar)) {
                return false;
            }
            o oVar3 = this.f15732a;
            AbstractC3340k.c(oVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                o oVar4 = (o) m.x(oVar3, this, gVarK);
                synchronized (obj2) {
                    int i10 = oVar4.f15730d;
                    if (i10 == i5) {
                        oVar4.f15729c = cVarC;
                        oVar4.f15731e++;
                        oVar4.f15730d = i10 + 1;
                        z2 = true;
                    }
                }
            }
            m.o(gVarK, this);
        } while (!z2);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        return g(new C3642d(i5, collection));
    }

    @Override // X.y
    public final void c(A a5) {
        a5.f15665b = this.f15732a;
        this.f15732a = (o) a5;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        g gVarK;
        o oVar = this.f15732a;
        AbstractC3340k.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (m.f15718b) {
            gVarK = m.k();
            o oVar2 = (o) m.x(oVar, this, gVarK);
            synchronized (q.f15733a) {
                oVar2.f15729c = R.j.f10033b;
                oVar2.f15730d++;
                oVar2.f15731e++;
            }
        }
        m.o(gVarK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return a().f15729c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return a().f15729c.containsAll(collection);
    }

    public final int d() {
        o oVar = this.f15732a;
        AbstractC3340k.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((o) m.i(oVar)).f15731e;
    }

    @Override // X.y
    public final A e() {
        return this.f15732a;
    }

    @Override // X.y
    public final /* synthetic */ A f(A a5, A a10, A a11) {
        return null;
    }

    public final boolean g(tf.l lVar) {
        int i5;
        R.c cVar;
        Object objInvoke;
        g gVarK;
        boolean z2;
        do {
            Object obj = q.f15733a;
            synchronized (obj) {
                o oVar = this.f15732a;
                AbstractC3340k.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o oVar2 = (o) m.i(oVar);
                i5 = oVar2.f15730d;
                cVar = oVar2.f15729c;
            }
            AbstractC3340k.b(cVar);
            R.g gVarE = cVar.e();
            objInvoke = lVar.invoke(gVarE);
            R.c cVarD = gVarE.d();
            if (AbstractC3340k.a(cVarD, cVar)) {
                break;
            }
            o oVar3 = this.f15732a;
            AbstractC3340k.c(oVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                o oVar4 = (o) m.x(oVar3, this, gVarK);
                synchronized (obj) {
                    int i10 = oVar4.f15730d;
                    if (i10 == i5) {
                        oVar4.f15729c = cVarD;
                        oVar4.f15730d = i10 + 1;
                        z2 = true;
                        oVar4.f15731e++;
                    } else {
                        z2 = false;
                    }
                }
            }
            m.o(gVarK, this);
        } while (!z2);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final Object get(int i5) {
        return a().f15729c.get(i5);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return a().f15729c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return a().f15729c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return a().f15729c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new v(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        int i10;
        R.c cVar;
        g gVarK;
        boolean z2;
        Object obj = get(i5);
        do {
            Object obj2 = q.f15733a;
            synchronized (obj2) {
                o oVar = this.f15732a;
                AbstractC3340k.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o oVar2 = (o) m.i(oVar);
                i10 = oVar2.f15730d;
                cVar = oVar2.f15729c;
            }
            AbstractC3340k.b(cVar);
            R.c cVarG = cVar.g(i5);
            if (cVarG.equals(cVar)) {
                break;
            }
            o oVar3 = this.f15732a;
            AbstractC3340k.c(oVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                o oVar4 = (o) m.x(oVar3, this, gVarK);
                synchronized (obj2) {
                    int i11 = oVar4.f15730d;
                    if (i11 == i10) {
                        oVar4.f15729c = cVarG;
                        z2 = true;
                        oVar4.f15731e++;
                        oVar4.f15730d = i11 + 1;
                    } else {
                        z2 = false;
                    }
                }
            }
            m.o(gVarK, this);
        } while (!z2);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i5;
        R.c cVar;
        boolean z2;
        g gVarK;
        do {
            Object obj = q.f15733a;
            synchronized (obj) {
                o oVar = this.f15732a;
                AbstractC3340k.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o oVar2 = (o) m.i(oVar);
                i5 = oVar2.f15730d;
                cVar = oVar2.f15729c;
            }
            AbstractC3340k.b(cVar);
            R.c cVarF = cVar.f(new R.b(0, collection));
            z2 = false;
            if (AbstractC3340k.a(cVarF, cVar)) {
                return false;
            }
            o oVar3 = this.f15732a;
            AbstractC3340k.c(oVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                o oVar4 = (o) m.x(oVar3, this, gVarK);
                synchronized (obj) {
                    int i10 = oVar4.f15730d;
                    if (i10 == i5) {
                        oVar4.f15729c = cVarF;
                        oVar4.f15731e++;
                        oVar4.f15730d = i10 + 1;
                        z2 = true;
                    }
                }
            }
            m.o(gVarK, this);
        } while (!z2);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return g(new R.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        int i10;
        R.c cVar;
        g gVarK;
        boolean z2;
        Object obj2 = get(i5);
        do {
            Object obj3 = q.f15733a;
            synchronized (obj3) {
                o oVar = this.f15732a;
                AbstractC3340k.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o oVar2 = (o) m.i(oVar);
                i10 = oVar2.f15730d;
                cVar = oVar2.f15729c;
            }
            AbstractC3340k.b(cVar);
            R.c cVarH = cVar.h(i5, obj);
            if (cVarH.equals(cVar)) {
                break;
            }
            o oVar3 = this.f15732a;
            AbstractC3340k.c(oVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                o oVar4 = (o) m.x(oVar3, this, gVarK);
                synchronized (obj3) {
                    int i11 = oVar4.f15730d;
                    if (i11 == i10) {
                        oVar4.f15729c = cVarH;
                        oVar4.f15730d = i11 + 1;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            m.o(gVarK, this);
        } while (!z2);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return a().f15729c.size();
    }

    @Override // java.util.List
    public final List subList(int i5, int i10) {
        if (i5 >= 0 && i5 <= i10 && i10 <= size()) {
            return new C(this, i5, i10);
        }
        C0718d.O("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3339j.b(this);
    }

    public final String toString() {
        o oVar = this.f15732a;
        AbstractC3340k.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((o) m.i(oVar)).f15729c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i5;
        R.c cVar;
        boolean z2;
        g gVarK;
        do {
            Object obj = q.f15733a;
            synchronized (obj) {
                o oVar = this.f15732a;
                AbstractC3340k.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o oVar2 = (o) m.i(oVar);
                i5 = oVar2.f15730d;
                cVar = oVar2.f15729c;
            }
            AbstractC3340k.b(cVar);
            R.c cVarD = cVar.d(collection);
            z2 = false;
            if (AbstractC3340k.a(cVarD, cVar)) {
                return false;
            }
            o oVar3 = this.f15732a;
            AbstractC3340k.c(oVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                o oVar4 = (o) m.x(oVar3, this, gVarK);
                synchronized (obj) {
                    int i10 = oVar4.f15730d;
                    if (i10 == i5) {
                        oVar4.f15729c = cVarD;
                        oVar4.f15731e++;
                        oVar4.f15730d = i10 + 1;
                        z2 = true;
                    }
                }
            }
            m.o(gVarK, this);
        } while (!z2);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        return new v(this, i5);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3339j.c(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        R.c cVar;
        g gVarK;
        boolean z2;
        do {
            Object obj2 = q.f15733a;
            synchronized (obj2) {
                o oVar = this.f15732a;
                AbstractC3340k.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o oVar2 = (o) m.i(oVar);
                i10 = oVar2.f15730d;
                cVar = oVar2.f15729c;
            }
            AbstractC3340k.b(cVar);
            R.c cVarA = cVar.a(i5, obj);
            if (cVarA.equals(cVar)) {
                return;
            }
            o oVar3 = this.f15732a;
            AbstractC3340k.c(oVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                o oVar4 = (o) m.x(oVar3, this, gVarK);
                synchronized (obj2) {
                    int i11 = oVar4.f15730d;
                    if (i11 == i10) {
                        oVar4.f15729c = cVarA;
                        z2 = true;
                        oVar4.f15731e++;
                        oVar4.f15730d = i11 + 1;
                    } else {
                        z2 = false;
                    }
                }
            }
            m.o(gVarK, this);
        } while (!z2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i5;
        R.c cVar;
        boolean z2;
        g gVarK;
        do {
            Object obj2 = q.f15733a;
            synchronized (obj2) {
                o oVar = this.f15732a;
                AbstractC3340k.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o oVar2 = (o) m.i(oVar);
                i5 = oVar2.f15730d;
                cVar = oVar2.f15729c;
            }
            AbstractC3340k.b(cVar);
            int iIndexOf = cVar.indexOf(obj);
            R.c cVarG = iIndexOf != -1 ? cVar.g(iIndexOf) : cVar;
            z2 = false;
            if (cVarG.equals(cVar)) {
                return false;
            }
            o oVar3 = this.f15732a;
            AbstractC3340k.c(oVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                o oVar4 = (o) m.x(oVar3, this, gVarK);
                synchronized (obj2) {
                    int i10 = oVar4.f15730d;
                    if (i10 == i5) {
                        oVar4.f15729c = cVarG;
                        oVar4.f15731e++;
                        oVar4.f15730d = i10 + 1;
                        z2 = true;
                    }
                }
            }
            m.o(gVarK, this);
        } while (!z2);
        return true;
    }
}
