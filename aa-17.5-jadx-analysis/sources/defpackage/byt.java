package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class byt<T> implements List<T>, afgd {
    private final /* synthetic */ int a;
    private final Object b;

    public byt(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.a;
        Object obj2 = this.b;
        if (i2 == 0) {
            ((byw) obj2).f(i, obj);
            return;
        }
        if (i < 0 || i > ((aag) obj2).b) {
            ((aag) obj2).n(i);
        }
        aag aagVar = (aag) obj2;
        int i3 = aagVar.b + 1;
        Object[] objArr = aagVar.a;
        if (objArr.length < i3) {
            aagVar.m(i3, objArr);
        }
        Object[] objArr2 = aagVar.a;
        int i4 = aagVar.b;
        if (i != i4) {
            woy.dq(objArr2, objArr2, i + 1, i, i4);
        }
        objArr2[i] = obj;
        aagVar.b++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (this.a == 0) {
            return ((byw) this.b).k(i, collection);
        }
        collection.getClass();
        Object obj = this.b;
        if (i < 0 || i > ((aag) obj).b) {
            ((aag) obj).n(i);
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        aag aagVar = (aag) obj;
        int size = aagVar.b + collection.size();
        Object[] objArr = aagVar.a;
        if (objArr.length < size) {
            aagVar.m(size, objArr);
        }
        Object[] objArr2 = aagVar.a;
        if (i != aagVar.b) {
            woy.dq(objArr2, objArr2, collection.size() + i, i, aagVar.b);
        }
        for (T t : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                woy.bo();
            }
            objArr2[i2 + i] = t;
            i2 = i3;
        }
        aagVar.b += collection.size();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.a;
        Object obj = this.b;
        if (i != 0) {
            ((aag) obj).k();
        } else {
            ((byw) obj).g();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        return i != 0 ? ((aag) obj2).e(obj) : ((byw) obj2).l(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (this.a == 0) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!((byw) this.b).l(it.next())) {
                    return false;
                }
            }
            return true;
        }
        collection.getClass();
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!((aag) this.b).e(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (this.a != 0) {
            aah.a(this, i);
            return ((aag) this.b).c(i);
        }
        byx.a(this, i);
        return ((byw) this.b).a[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        return i != 0 ? ((aag) obj2).a(obj) : ((byw) obj2).a(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.a;
        Object obj = this.b;
        return i != 0 ? ((aag) obj).f() : ((byw) obj).b == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a != 0 ? new zx(this, 0) : new byv(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        if (i == 0) {
            byw bywVar = (byw) obj2;
            Object[] objArr = bywVar.a;
            for (int i2 = bywVar.b - 1; i2 >= 0; i2--) {
                if (affa.f(obj, objArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        if (obj == null) {
            aag aagVar = (aag) obj2;
            Object[] objArr2 = aagVar.a;
            for (int i3 = aagVar.b - 1; i3 >= 0; i3--) {
                if (objArr2[i3] == null) {
                    return i3;
                }
            }
            return -1;
        }
        aag aagVar2 = (aag) obj2;
        Object[] objArr3 = aagVar2.a;
        for (int i4 = aagVar2.b - 1; i4 >= 0; i4--) {
            if (obj.equals(objArr3[i4])) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.a != 0 ? new zx(this, 0) : new byv(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        if (this.a != 0) {
            aah.a(this, i);
            return ((aag) this.b).h(i);
        }
        byx.a(this, i);
        return ((byw) this.b).c(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (this.a != 0) {
            collection.getClass();
            aag aagVar = (aag) this.b;
            int i = aagVar.b;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                aagVar.o(it.next());
            }
            return i != aagVar.b;
        }
        if (!collection.isEmpty()) {
            byw bywVar = (byw) this.b;
            int i2 = bywVar.b;
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                bywVar.m(it2.next());
            }
            if (i2 != bywVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        if (this.a == 0) {
            byw bywVar = (byw) this.b;
            int i = bywVar.b;
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (!collection.contains(bywVar.a[i2])) {
                    bywVar.c(i2);
                }
            }
            return i != bywVar.b;
        }
        collection.getClass();
        aag aagVar = (aag) this.b;
        int i3 = aagVar.b;
        Object[] objArr = aagVar.a;
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            if (!collection.contains(objArr[i4])) {
                aagVar.h(i4);
            }
        }
        return i3 != aagVar.b;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        if (this.a != 0) {
            aah.a(this, i);
            return ((aag) this.b).i(i, obj);
        }
        byx.a(this, i);
        return ((byw) this.b).d(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        return i != 0 ? ((aag) obj).b : ((byw) obj).b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (this.a != 0) {
            aah.b(this, i, i2);
            return new zy(this, i, i2);
        }
        byx.b(this, i, i2);
        return new byu(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        if (this.a == 0) {
            return afet.b(this, objArr);
        }
        objArr.getClass();
        return afet.b(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.a != 0 ? new zx(this, i) : new byv(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.a != 0 ? afet.a(this) : afet.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        if (i != 0) {
            return ((aag) obj2).o(obj);
        }
        return ((byw) obj2).m(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        if (i != 0) {
            ((aag) obj2).p(obj);
            return true;
        }
        ((byw) obj2).n(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (this.a != 0) {
            collection.getClass();
            aag aagVar = (aag) this.b;
            int i = aagVar.b;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                aagVar.p(it.next());
            }
            return i != aagVar.b;
        }
        byw bywVar = (byw) this.b;
        return bywVar.k(bywVar.b, collection);
    }
}
