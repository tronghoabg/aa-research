package P;

import Fe.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3339j;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4293c;

/* loaded from: classes.dex */
public final class a implements List, InterfaceC4293c {

    /* renamed from: a, reason: collision with root package name */
    public final d f8964a;

    public a(d dVar) {
        this.f8964a = dVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f8964a.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        d dVar = this.f8964a;
        return dVar.d(dVar.f8972c, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f8964a.e();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8964a.f(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        d dVar = this.f8964a;
        dVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!dVar.f(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        g.j(i5, this);
        return this.f8964a.f8970a[i5];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f8964a.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f8964a.i();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d dVar = this.f8964a;
        int i5 = dVar.f8972c;
        if (i5 <= 0) {
            return -1;
        }
        int i10 = i5 - 1;
        Object[] objArr = dVar.f8970a;
        while (!AbstractC3340k.a(obj, objArr[i10])) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
        }
        return i10;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f8964a.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        d dVar = this.f8964a;
        dVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i5 = dVar.f8972c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dVar.k(it.next());
        }
        return i5 != dVar.f8972c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        d dVar = this.f8964a;
        int i5 = dVar.f8972c;
        for (int i10 = i5 - 1; -1 < i10; i10--) {
            if (!collection.contains(dVar.f8970a[i10])) {
                dVar.m(i10);
            }
        }
        return i5 != dVar.f8972c;
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        g.j(i5, this);
        Object[] objArr = this.f8964a.f8970a;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f8964a.f8972c;
    }

    @Override // java.util.List
    public final List subList(int i5, int i10) {
        g.k(i5, i10, this);
        return new b(i5, i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3339j.b(this);
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        this.f8964a.a(i5, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        return new c(i5, this);
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        g.j(i5, this);
        return this.f8964a.m(i5);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3339j.c(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        return this.f8964a.d(i5, collection);
    }
}
