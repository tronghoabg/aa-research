package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class yns<E> extends java.util.AbstractSet<E> {
    static int d(java.util.Set set) {
        return set instanceof defpackage.yns ? ((defpackage.yns) set).a() : set.size();
    }

    static int e(java.util.Set set) {
        return set instanceof defpackage.yns ? ((defpackage.yns) set).b() : set.size();
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean add(E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract defpackage.yot iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        java.util.Set set;
        int iD;
        int iE;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set) || b() > (iD = d((set = (java.util.Set) obj))) || a() < (iE = e(set))) {
            return false;
        }
        defpackage.yot it = iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                if (!set.contains(it.next())) {
                    return false;
                }
                i++;
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        if (i == iD) {
            return true;
        }
        if (i < iE) {
            return false;
        }
        java.util.Iterator<E> it2 = set.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            it2.next();
            i2++;
            if (i2 > i) {
                return false;
            }
        }
        return true;
    }

    public final defpackage.yhx f() {
        int iA = a();
        if (iA == 0) {
            return defpackage.ynd.a;
        }
        defpackage.ysr.aL(iA, "expectedSize");
        defpackage.yhv yhvVar = new defpackage.yhv(iA);
        defpackage.yot it = iterator();
        while (it.hasNext()) {
            E next = it.next();
            next.getClass();
            yhvVar.c(next);
        }
        return yhvVar.g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }
}
