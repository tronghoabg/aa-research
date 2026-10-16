package X;

import N.C0718d;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3339j;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4293c;

/* loaded from: classes.dex */
public final class C implements List, InterfaceC4293c {

    /* renamed from: a, reason: collision with root package name */
    public final p f15669a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15670b;

    /* renamed from: c, reason: collision with root package name */
    public int f15671c;

    /* renamed from: d, reason: collision with root package name */
    public int f15672d;

    public C(p pVar, int i5, int i10) {
        this.f15669a = pVar;
        this.f15670b = i5;
        this.f15671c = pVar.d();
        this.f15672d = i10 - i5;
    }

    public final void a() {
        if (this.f15669a.d() != this.f15671c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i5 = this.f15670b + this.f15672d;
        p pVar = this.f15669a;
        pVar.add(i5, obj);
        this.f15672d++;
        this.f15671c = pVar.d();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f15672d, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i5;
        R.c cVar;
        g gVarK;
        boolean z2;
        if (this.f15672d > 0) {
            a();
            p pVar = this.f15669a;
            int i10 = this.f15670b;
            int i11 = this.f15672d + i10;
            do {
                Object obj = q.f15733a;
                synchronized (obj) {
                    o oVar = pVar.f15732a;
                    AbstractC3340k.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    o oVar2 = (o) m.i(oVar);
                    i5 = oVar2.f15730d;
                    cVar = oVar2.f15729c;
                }
                AbstractC3340k.b(cVar);
                R.g gVarE = cVar.e();
                gVarE.subList(i10, i11).clear();
                R.c cVarD = gVarE.d();
                if (AbstractC3340k.a(cVarD, cVar)) {
                    break;
                }
                o oVar3 = pVar.f15732a;
                AbstractC3340k.c(oVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (m.f15718b) {
                    gVarK = m.k();
                    o oVar4 = (o) m.x(oVar3, pVar, gVarK);
                    synchronized (obj) {
                        int i12 = oVar4.f15730d;
                        if (i12 == i5) {
                            oVar4.f15729c = cVarD;
                            oVar4.f15730d = i12 + 1;
                            z2 = true;
                            oVar4.f15731e++;
                        } else {
                            z2 = false;
                        }
                    }
                }
                m.o(gVarK, pVar);
            } while (!z2);
            this.f15672d = 0;
            this.f15671c = this.f15669a.d();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        a();
        q.a(i5, this.f15672d);
        return this.f15669a.get(this.f15670b + i5);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i5 = this.f15672d;
        int i10 = this.f15670b;
        Iterator it = android.support.v4.media.session.b.u0(i10, i5 + i10).iterator();
        while (it.hasNext()) {
            int iA = ((zf.f) it).a();
            if (AbstractC3340k.a(obj, this.f15669a.get(iA))) {
                return iA - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f15672d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i5 = this.f15672d;
        int i10 = this.f15670b;
        for (int i11 = (i5 + i10) - 1; i11 >= i10; i11--) {
            if (AbstractC3340k.a(obj, this.f15669a.get(i11))) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z2) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i5;
        R.c cVar;
        g gVarK;
        boolean z2;
        a();
        p pVar = this.f15669a;
        int i10 = this.f15670b;
        int i11 = this.f15672d + i10;
        int size = pVar.size();
        do {
            Object obj = q.f15733a;
            synchronized (obj) {
                o oVar = pVar.f15732a;
                AbstractC3340k.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                o oVar2 = (o) m.i(oVar);
                i5 = oVar2.f15730d;
                cVar = oVar2.f15729c;
            }
            AbstractC3340k.b(cVar);
            R.g gVarE = cVar.e();
            gVarE.subList(i10, i11).retainAll(collection);
            R.c cVarD = gVarE.d();
            if (AbstractC3340k.a(cVarD, cVar)) {
                break;
            }
            o oVar3 = pVar.f15732a;
            AbstractC3340k.c(oVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (m.f15718b) {
                gVarK = m.k();
                o oVar4 = (o) m.x(oVar3, pVar, gVarK);
                synchronized (obj) {
                    int i12 = oVar4.f15730d;
                    if (i12 == i5) {
                        oVar4.f15729c = cVarD;
                        oVar4.f15730d = i12 + 1;
                        oVar4.f15731e++;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            m.o(gVarK, pVar);
        } while (!z2);
        int size2 = size - pVar.size();
        if (size2 > 0) {
            this.f15671c = this.f15669a.d();
            this.f15672d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        q.a(i5, this.f15672d);
        a();
        int i10 = i5 + this.f15670b;
        p pVar = this.f15669a;
        Object obj2 = pVar.set(i10, obj);
        this.f15671c = pVar.d();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f15672d;
    }

    @Override // java.util.List
    public final List subList(int i5, int i10) {
        if (!(i5 >= 0 && i5 <= i10 && i10 <= this.f15672d)) {
            C0718d.O("fromIndex or toIndex are out of bounds");
            throw null;
        }
        a();
        int i11 = this.f15670b;
        return new C(this.f15669a, i5 + i11, i10 + i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3339j.b(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        a();
        kotlin.jvm.internal.E e7 = new kotlin.jvm.internal.E();
        e7.f39738a = i5 - 1;
        return new B(e7, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3339j.c(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        a();
        int i10 = i5 + this.f15670b;
        p pVar = this.f15669a;
        boolean zAddAll = pVar.addAll(i10, collection);
        if (zAddAll) {
            this.f15672d = collection.size() + this.f15672d;
            this.f15671c = pVar.d();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        a();
        int i10 = this.f15670b + i5;
        p pVar = this.f15669a;
        Object objRemove = pVar.remove(i10);
        this.f15672d--;
        this.f15671c = pVar.d();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        a();
        int i10 = this.f15670b + i5;
        p pVar = this.f15669a;
        pVar.add(i10, obj);
        this.f15672d++;
        this.f15671c = pVar.d();
    }
}
