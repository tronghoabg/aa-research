package l8;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: l8.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3431m extends AbstractCollection implements List {

    /* renamed from: a, reason: collision with root package name */
    public final Object f40136a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f40137b;

    /* renamed from: c, reason: collision with root package name */
    public final C3431m f40138c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f40139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f40140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f40141f;

    public C3431m(a0 a0Var, Object obj, List list, C3431m c3431m) {
        this.f40141f = a0Var;
        this.f40140e = a0Var;
        this.f40136a = obj;
        this.f40137b = list;
        this.f40138c = c3431m;
        this.f40139d = c3431m == null ? null : c3431m.f40137b;
    }

    public final void a() {
        C3431m c3431m = this.f40138c;
        if (c3431m != null) {
            c3431m.a();
        } else {
            this.f40140e.f40081d.put(this.f40136a, this.f40137b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.f40137b.isEmpty();
        boolean zAdd = this.f40137b.add(obj);
        if (zAdd) {
            this.f40140e.f40082e++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f40137b.addAll(collection);
        if (zAddAll) {
            this.f40140e.f40082e += this.f40137b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final void b() {
        Collection collection;
        C3431m c3431m = this.f40138c;
        if (c3431m != null) {
            c3431m.b();
            if (c3431m.f40137b != this.f40139d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f40137b.isEmpty() || (collection = (Collection) this.f40140e.f40081d.get(this.f40136a)) == null) {
                return;
            }
            this.f40137b = collection;
        }
    }

    public final void c() {
        C3431m c3431m = this.f40138c;
        if (c3431m != null) {
            c3431m.c();
        } else if (this.f40137b.isEmpty()) {
            this.f40140e.f40081d.remove(this.f40136a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f40137b.clear();
        this.f40140e.f40082e -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        b();
        return this.f40137b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        b();
        return this.f40137b.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f40137b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i5) {
        b();
        return ((List) this.f40137b).get(i5);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        b();
        return this.f40137b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.f40137b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        b();
        return new C3422d(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.f40137b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new C3430l(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.f40137b.remove(obj);
        if (zRemove) {
            a0 a0Var = this.f40140e;
            a0Var.f40082e--;
            c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f40137b.removeAll(collection);
        if (zRemoveAll) {
            this.f40140e.f40082e += this.f40137b.size() - size;
            c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f40137b.retainAll(collection);
        if (zRetainAll) {
            this.f40140e.f40082e += this.f40137b.size() - size;
            c();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        b();
        return ((List) this.f40137b).set(i5, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        b();
        return this.f40137b.size();
    }

    @Override // java.util.List
    public final List subList(int i5, int i10) {
        b();
        List listSubList = ((List) this.f40137b).subList(i5, i10);
        C3431m c3431m = this.f40138c;
        if (c3431m == null) {
            c3431m = this;
        }
        a0 a0Var = this.f40141f;
        a0Var.getClass();
        boolean z2 = listSubList instanceof RandomAccess;
        Object obj = this.f40136a;
        return z2 ? new C3427i(a0Var, obj, listSubList, c3431m) : new C3431m(a0Var, obj, listSubList, c3431m);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f40137b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        b();
        return new C3430l(this, i5);
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        b();
        Object objRemove = ((List) this.f40137b).remove(i5);
        a0 a0Var = this.f40141f;
        a0Var.f40082e--;
        c();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        b();
        boolean zIsEmpty = this.f40137b.isEmpty();
        ((List) this.f40137b).add(i5, obj);
        this.f40141f.f40082e++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f40137b).addAll(i5, collection);
        if (zAddAll) {
            this.f40141f.f40082e += this.f40137b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }
}
