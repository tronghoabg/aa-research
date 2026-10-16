package j$.util;

import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* renamed from: j$.util.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2919n extends C2917l implements java.util.List, List {
    private static final long serialVersionUID = -283967356065247728L;

    /* renamed from: b, reason: collision with root package name */
    final java.util.List f37925b;

    C2919n(java.util.List list) {
        super(list);
        this.f37925b = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || this.f37925b.equals(obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f37925b.hashCode();
    }

    @Override // java.util.List
    public final Object get(int i5) {
        return this.f37925b.get(i5);
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f37925b.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f37925b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i5, java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C2918m(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        return new C2918m(this, i5);
    }

    @Override // java.util.List
    public java.util.List subList(int i5, int i10) {
        return new C2919n(this.f37925b.subList(i5, i10));
    }

    private Object readResolve() {
        java.util.List list = this.f37925b;
        return list instanceof RandomAccess ? new C3053t(list) : this;
    }
}
