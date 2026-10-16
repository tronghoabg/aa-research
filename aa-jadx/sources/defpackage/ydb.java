package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ydb<E> extends java.util.AbstractCollection<E> implements defpackage.ymh<E> {
    private transient java.util.Set a;
    private transient java.util.Set b;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        h(e, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        collection.getClass();
        if (!(collection instanceof defpackage.ymh)) {
            if (collection.isEmpty()) {
                return false;
            }
            return defpackage.ysr.ad(this, collection.iterator());
        }
        defpackage.ymh ymhVar = (defpackage.ymh) collection;
        if (!(ymhVar instanceof defpackage.ycw)) {
            if (ymhVar.isEmpty()) {
                return false;
            }
            for (defpackage.ymg ymgVar : ymhVar.l()) {
                h(ymgVar.b(), ymgVar.a());
            }
            return true;
        }
        defpackage.ycw ycwVar = (defpackage.ycw) ymhVar;
        if (ycwVar.isEmpty()) {
            return false;
        }
        for (int iA = ycwVar.a.a(); iA >= 0; iA = ycwVar.a.f(iA)) {
            h(ycwVar.a.j(iA), ycwVar.a.c(iA));
        }
        return true;
    }

    public abstract int b();

    public int c(java.lang.Object obj, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.ymh
    public final boolean contains(java.lang.Object obj) {
        return a(obj) > 0;
    }

    public abstract java.util.Iterator d();

    public abstract java.util.Iterator e();

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ymh) {
            defpackage.ymh ymhVar = (defpackage.ymh) obj;
            if (size() != ymhVar.size() || l().size() != ymhVar.l().size()) {
                return false;
            }
            for (defpackage.ymg ymgVar : ymhVar.l()) {
                if (a(ymgVar.b()) != ymgVar.a()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean g(java.lang.Object obj, int i) {
        throw null;
    }

    public void h(java.lang.Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return l().hashCode();
    }

    public java.util.Set i() {
        return new defpackage.ymj(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return l().isEmpty();
    }

    public java.util.Set j() {
        return new defpackage.ymk(this);
    }

    @Override // defpackage.ymh
    public final java.util.Set k() {
        java.util.Set set = this.a;
        if (set != null) {
            return set;
        }
        java.util.Set setI = i();
        this.a = setI;
        return setI;
    }

    @Override // defpackage.ymh
    public final java.util.Set l() {
        java.util.Set set = this.b;
        if (set != null) {
            return set;
        }
        java.util.Set setJ = j();
        this.b = setJ;
        return setJ;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.ymh
    public final boolean remove(java.lang.Object obj) {
        return c(obj, 1) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        if (collection instanceof defpackage.ymh) {
            collection = ((defpackage.ymh) collection).k();
        }
        return k().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        if (collection instanceof defpackage.ymh) {
            collection = ((defpackage.ymh) collection).k();
        }
        return k().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return l().toString();
    }
}
