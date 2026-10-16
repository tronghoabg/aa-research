package j$.util;

import j$.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* renamed from: j$.util.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2912g extends C2911f implements java.util.List, List {
    private static final long serialVersionUID = -7754090372962971524L;

    /* renamed from: c, reason: collision with root package name */
    final java.util.List f37898c;

    C2912g(java.util.List list) {
        super(list);
        this.f37898c = list;
    }

    C2912g(java.util.List list, Object obj) {
        super(list, obj);
        this.f37898c = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f37873b) {
            zEquals = this.f37898c.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f37873b) {
            iHashCode = this.f37898c.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        Object obj;
        synchronized (this.f37873b) {
            obj = this.f37898c.get(i5);
        }
        return obj;
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        Object obj2;
        synchronized (this.f37873b) {
            obj2 = this.f37898c.set(i5, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        synchronized (this.f37873b) {
            this.f37898c.add(i5, obj);
        }
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        Object objRemove;
        synchronized (this.f37873b) {
            objRemove = this.f37898c.remove(i5);
        }
        return objRemove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iIndexOf;
        synchronized (this.f37873b) {
            iIndexOf = this.f37898c.indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int iLastIndexOf;
        synchronized (this.f37873b) {
            iLastIndexOf = this.f37898c.lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final boolean addAll(int i5, java.util.Collection collection) {
        boolean zAddAll;
        synchronized (this.f37873b) {
            zAddAll = this.f37898c.addAll(i5, collection);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f37898c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        return this.f37898c.listIterator(i5);
    }

    @Override // java.util.List
    public java.util.List subList(int i5, int i10) {
        C2912g c2912g;
        synchronized (this.f37873b) {
            c2912g = new C2912g(this.f37898c.subList(i5, i10), this.f37873b);
        }
        return c2912g;
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.f37873b) {
            java.util.List list = this.f37898c;
            if (list instanceof List) {
                ((List) list).replaceAll(unaryOperator);
            } else {
                List.CC.$default$replaceAll(list, unaryOperator);
            }
        }
    }

    @Override // java.util.List, j$.util.List
    public final void sort(java.util.Comparator comparator) {
        synchronized (this.f37873b) {
            List.EL.sort(this.f37898c, comparator);
        }
    }

    private Object readResolve() {
        java.util.List list = this.f37898c;
        return list instanceof RandomAccess ? new C2914i(list) : this;
    }
}
