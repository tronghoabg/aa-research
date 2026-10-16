package x;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4411d implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4412e f47500a;

    public C4411d(C4412e c4412e) {
        this.f47500a = c4412e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f47500a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f47500a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f47500a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C4408a(this.f47500a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C4412e c4412e = this.f47500a;
        int iA = c4412e.a(obj);
        if (iA < 0) {
            return false;
        }
        c4412e.i(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C4412e c4412e = this.f47500a;
        int i5 = c4412e.f47563c;
        int i10 = 0;
        boolean z2 = false;
        while (i10 < i5) {
            if (collection.contains(c4412e.k(i10))) {
                c4412e.i(i10);
                i10--;
                i5--;
                z2 = true;
            }
            i10++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C4412e c4412e = this.f47500a;
        int i5 = c4412e.f47563c;
        int i10 = 0;
        boolean z2 = false;
        while (i10 < i5) {
            if (!collection.contains(c4412e.k(i10))) {
                c4412e.i(i10);
                i10--;
                i5--;
                z2 = true;
            }
            i10++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f47500a.f47563c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C4412e c4412e = this.f47500a;
        int i5 = c4412e.f47563c;
        Object[] objArr = new Object[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            objArr[i10] = c4412e.k(i10);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C4412e c4412e = this.f47500a;
        int i5 = c4412e.f47563c;
        if (objArr.length < i5) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5);
        }
        for (int i10 = 0; i10 < i5; i10++) {
            objArr[i10] = c4412e.k(i10);
        }
        if (objArr.length > i5) {
            objArr[i5] = null;
        }
        return objArr;
    }
}
