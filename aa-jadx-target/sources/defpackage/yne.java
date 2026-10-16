package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yne extends defpackage.yii {
    public static final defpackage.yne c;
    final transient defpackage.ygw d;

    static {
        int i = defpackage.ygw.d;
        c = new defpackage.yne(defpackage.ymx.a, defpackage.ymn.a);
    }

    public yne(defpackage.ygw ygwVar, java.util.Comparator comparator) {
        super(comparator);
        this.d = ygwVar;
    }

    @Override // defpackage.yii
    public final defpackage.yii A(java.lang.Object obj, boolean z) {
        return J(0, H(obj, z));
    }

    @Override // defpackage.yii
    public final defpackage.yii C(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        return E(obj, z).A(obj2, z2);
    }

    @Override // defpackage.yii
    public final defpackage.yii E(java.lang.Object obj, boolean z) {
        return J(I(obj, z), size());
    }

    @Override // defpackage.yii, java.util.NavigableSet
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final defpackage.yot descendingIterator() {
        return this.d.h().listIterator(0);
    }

    final int H(java.lang.Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = java.util.Collections.binarySearch(this.d, obj, ((defpackage.yii) this).a);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    final int I(java.lang.Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = java.util.Collections.binarySearch(this.d, obj, ((defpackage.yii) this).a);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    final defpackage.yne J(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return F(this.a);
        }
        defpackage.ygw ygwVar = this.d;
        return new defpackage.yne(ygwVar.subList(i, i2), this.a);
    }

    @Override // defpackage.ygm
    public final int a(java.lang.Object[] objArr, int i) {
        return this.d.a(objArr, i);
    }

    @Override // defpackage.ygm
    public final int b() {
        return this.d.b();
    }

    @Override // defpackage.ygm
    public final int c() {
        return this.d.c();
    }

    @Override // defpackage.yii, java.util.NavigableSet
    public final java.lang.Object ceiling(java.lang.Object obj) {
        int I = I(obj, true);
        if (I == size()) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.ygm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj != null) {
            try {
                if (java.util.Collections.binarySearch(this.d, obj, this.a) >= 0) {
                    return true;
                }
            } catch (java.lang.ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        if (collection instanceof ymh) {
            collection = ((ymh) collection).k();
        }
        if (!defpackage.ytn.e(((defpackage.yii) this).a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        defpackage.yot it = iterator();
        java.util.Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        java.lang.Object next = it2.next();
        java.lang.Object next2 = it.next();
        while (true) {
            try {
                int iH = h(next2, next);
                if (iH < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else {
                    if (iH != 0) {
                        return false;
                    }
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
    }

    @Override // defpackage.yhx, defpackage.ygm
    public final defpackage.ygw d() {
        return this.d;
    }

    @Override // defpackage.yii, defpackage.yhx, defpackage.ygm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public final defpackage.yot iterator() {
        return this.d.listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yhx, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!defpackage.ytn.e(this.a, set)) {
            return containsAll(set);
        }
        java.util.Iterator it = set.iterator();
        try {
            defpackage.yot it2 = iterator();
            while (it2.hasNext()) {
                java.lang.Object next = it2.next();
                java.lang.Object next2 = it.next();
                if (next2 == null || h(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.util.NoSuchElementException unused) {
            return false;
        }
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return this.d.f();
    }

    @Override // defpackage.yii, java.util.SortedSet
    public final java.lang.Object first() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.yii, java.util.NavigableSet
    public final java.lang.Object floor(java.lang.Object obj) {
        int iH = H(obj, true) - 1;
        if (iH == -1) {
            return null;
        }
        return this.d.get(iH);
    }

    @Override // defpackage.ygm
    public final java.lang.Object[] g() {
        return this.d.g();
    }

    @Override // defpackage.yii, java.util.NavigableSet
    public final java.lang.Object higher(java.lang.Object obj) {
        int I = I(obj, false);
        if (I == size()) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.yii, java.util.SortedSet
    public final java.lang.Object last() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.yii, java.util.NavigableSet
    public final java.lang.Object lower(java.lang.Object obj) {
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

    @Override // defpackage.yii, defpackage.yhx, defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.yii
    public final defpackage.yii x() {
        java.util.Comparator comparatorReverseOrder = java.util.Collections.reverseOrder(this.a);
        return isEmpty() ? F(comparatorReverseOrder) : new defpackage.yne(this.d.h(), comparatorReverseOrder);
    }
}
