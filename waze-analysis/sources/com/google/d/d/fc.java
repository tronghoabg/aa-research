package com.google.d.d;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class fc extends cq {

    /* renamed from: c, reason: collision with root package name */
    static final fc f7615c;

    /* renamed from: d, reason: collision with root package name */
    final transient bn f7616d;

    static {
        int i2 = bn.f7456d;
        f7615c = new fc(es.f7582a, eo.f7570a);
    }

    fc(bn bnVar, Comparator comparator) {
        super(comparator);
        this.f7616d = bnVar;
    }

    @Override // com.google.d.d.cq
    final cq B(Object obj, boolean z, Object obj2, boolean z2) {
        return D(obj, z).y(obj2, z2);
    }

    @Override // com.google.d.d.cq
    final cq D(Object obj, boolean z) {
        return I(H(obj, z), size());
    }

    @Override // com.google.d.d.cq, java.util.NavigableSet
    /* renamed from: F */
    public final fu descendingIterator() {
        return this.f7616d.a().iterator();
    }

    final int G(Object obj, boolean z) {
        com.google.d.b.an.B(obj);
        int iBinarySearch = Collections.binarySearch(this.f7616d, obj, ((cq) this).f7508a);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    final int H(Object obj, boolean z) {
        com.google.d.b.an.B(obj);
        int iBinarySearch = Collections.binarySearch(this.f7616d, obj, ((cq) this).f7508a);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    final fc I(int i2, int i3) {
        if (i2 == 0) {
            if (i3 == size()) {
                return this;
            }
            i2 = 0;
        }
        if (i2 >= i3) {
            return E(this.f7508a);
        }
        bn bnVar = this.f7616d;
        return new fc(bnVar.subList(i2, i3), this.f7508a);
    }

    @Override // com.google.d.d.cq, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iH = H(obj, true);
        if (iH == size()) {
            return null;
        }
        return this.f7616d.get(iH);
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f7616d, obj, this.f7508a) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof em) {
            collection = ((em) collection).b();
        }
        if (!fo.a(((cq) this).f7508a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        fu fuVarListIterator = listIterator();
        Iterator<?> it = collection.iterator();
        if (!fuVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = fuVarListIterator.next();
        while (true) {
            try {
                int iA = a(next2, next);
                if (iA >= 0) {
                    if (iA != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!fuVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = fuVarListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.d.d.bh
    final int d(Object[] objArr, int i2) {
        return this.f7616d.d(objArr, i2);
    }

    @Override // com.google.d.d.bh
    final int e() {
        return this.f7616d.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.d.d.ci, java.util.Collection, java.util.Set
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
        if (!fo.a(this.f7508a, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            fu fuVarListIterator = listIterator();
            while (fuVarListIterator.hasNext()) {
                Object next = fuVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || a(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.d.d.bh
    final int f() {
        return this.f7616d.f();
    }

    @Override // com.google.d.d.cq, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f7616d.get(0);
    }

    @Override // com.google.d.d.cq, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iG = G(obj, true) - 1;
        if (iG == -1) {
            return null;
        }
        return this.f7616d.get(iG);
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh
    public final bn g() {
        return this.f7616d;
    }

    @Override // com.google.d.d.cq, com.google.d.d.ci, com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: h */
    public final fu listIterator() {
        return this.f7616d.iterator();
    }

    @Override // com.google.d.d.cq, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iH = H(obj, false);
        if (iH == size()) {
            return null;
        }
        return this.f7616d.get(iH);
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        return this.f7616d.i();
    }

    @Override // com.google.d.d.bh
    final Object[] j() {
        return this.f7616d.j();
    }

    @Override // com.google.d.d.cq, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f7616d.get(size() - 1);
    }

    @Override // com.google.d.d.cq, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iG = G(obj, false) - 1;
        if (iG == -1) {
            return null;
        }
        return this.f7616d.get(iG);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7616d.size();
    }

    @Override // com.google.d.d.cq
    final cq v() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f7508a);
        return isEmpty() ? E(comparatorReverseOrder) : new fc(this.f7616d.a(), comparatorReverseOrder);
    }

    @Override // com.google.d.d.cq, com.google.d.d.ci, com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.d.d.cq
    final cq y(Object obj, boolean z) {
        return I(0, G(obj, z));
    }
}
