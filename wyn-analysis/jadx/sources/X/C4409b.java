package x;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4409b implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4412e f47495a;

    public C4409b(C4412e c4412e) {
        this.f47495a = c4412e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f47495a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f47495a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f47495a.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C4412e c4412e = this.f47495a;
        try {
            if (c4412e.f47563c == set.size()) {
                return c4412e.l(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C4412e c4412e = this.f47495a;
        int iHashCode = 0;
        for (int i5 = c4412e.f47563c - 1; i5 >= 0; i5--) {
            Object objG = c4412e.g(i5);
            iHashCode += objG == null ? 0 : objG.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f47495a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C4408a(this.f47495a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C4412e c4412e = this.f47495a;
        int iE = c4412e.e(obj);
        if (iE < 0) {
            return false;
        }
        c4412e.i(iE);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f47495a.m(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f47495a.n(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f47495a.f47563c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C4412e c4412e = this.f47495a;
        int i5 = c4412e.f47563c;
        Object[] objArr = new Object[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            objArr[i10] = c4412e.g(i10);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C4412e c4412e = this.f47495a;
        int i5 = c4412e.f47563c;
        if (objArr.length < i5) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5);
        }
        for (int i10 = 0; i10 < i5; i10++) {
            objArr[i10] = c4412e.g(i10);
        }
        if (objArr.length > i5) {
            objArr[i5] = null;
        }
        return objArr;
    }
}
