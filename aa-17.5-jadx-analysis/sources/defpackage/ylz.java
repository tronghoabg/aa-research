package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class ylz extends yhc {
    public static final ylz c;
    final transient yfq d;

    static {
        int i = yfq.d;
        c = new ylz(yls.a, yli.a);
    }

    public ylz(yfq yfqVar, Comparator comparator) {
        super(comparator);
        this.d = yfqVar;
    }

    @Override // defpackage.yhc
    public final yhc A(Object obj, boolean z) {
        return J(0, H(obj, z));
    }

    @Override // defpackage.yhc
    public final yhc C(Object obj, boolean z, Object obj2, boolean z2) {
        return E(obj, z).A(obj2, z2);
    }

    @Override // defpackage.yhc
    public final yhc E(Object obj, boolean z) {
        return J(I(obj, z), size());
    }

    @Override // defpackage.yhc, java.util.NavigableSet
    /* renamed from: G */
    public final yno descendingIterator() {
        return this.d.h().listIterator(0);
    }

    final int H(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.d, obj, ((yhc) this).a);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    final int I(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.d, obj, ((yhc) this).a);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    final ylz J(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return F(this.a);
        }
        yfq yfqVar = this.d;
        return new ylz(yfqVar.subList(i, i2), this.a);
    }

    @Override // defpackage.yfg
    public final int a(Object[] objArr, int i) {
        return this.d.a(objArr, i);
    }

    @Override // defpackage.yfg
    public final int b() {
        return this.d.b();
    }

    @Override // defpackage.yfg
    public final int c() {
        return this.d.c();
    }

    @Override // defpackage.yhc, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int I = I(obj, true);
        if (I == size()) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.a) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof ylc) {
            collection = ((ylc) collection).k();
        }
        if (!ysi.e(((yhc) this).a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        yno it = iterator();
        Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int iH = h(next2, next);
                if (iH >= 0) {
                    if (iH != 0) {
                        break;
                    }
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.ygr, defpackage.yfg
    public final yfq d() {
        return this.d;
    }

    @Override // defpackage.yhc, defpackage.ygr, defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final yno iterator() {
        return this.d.listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ygr, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!ysi.e(this.a, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            yno it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 == null || h(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return this.d.f();
    }

    @Override // defpackage.yhc, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.yhc, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iH = H(obj, true) - 1;
        if (iH == -1) {
            return null;
        }
        return this.d.get(iH);
    }

    @Override // defpackage.yfg
    public final Object[] g() {
        return this.d.g();
    }

    @Override // defpackage.yhc, java.util.NavigableSet
    public final Object higher(Object obj) {
        int I = I(obj, false);
        if (I == size()) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.yhc, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.yhc, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iH = H(obj, false) - 1;
        if (iH == -1) {
            return null;
        }
        return this.d.get(iH);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.yhc, defpackage.ygr, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.yhc
    public final yhc x() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.a);
        return isEmpty() ? F(comparatorReverseOrder) : new ylz(this.d.h(), comparatorReverseOrder);
    }
}
