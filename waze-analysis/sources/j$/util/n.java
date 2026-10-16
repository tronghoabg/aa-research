package j$.util;

import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class n extends l implements java.util.List, List {
    private static final long serialVersionUID = -283967356065247728L;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f50276b;

    public n(java.util.List list) {
        super(list);
        this.f50276b = list;
    }

    private Object readResolve() {
        java.util.List list = this.f50276b;
        return list instanceof RandomAccess ? new s(list) : this;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i2, java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || this.f50276b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return this.f50276b.get(i2);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f50276b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f50276b.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f50276b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new m(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public java.util.List subList(int i2, int i3) {
        return new n(this.f50276b.subList(i2, i3));
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return new m(this, i2);
    }
}
