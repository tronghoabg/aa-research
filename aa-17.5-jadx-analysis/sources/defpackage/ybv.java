package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class ybv<E> extends AbstractCollection<E> implements ylc<E> {
    private transient Set a;
    private transient Set b;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        h(e, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (!(collection instanceof ylc)) {
            if (collection.isEmpty()) {
                return false;
            }
            return yrm.ad(this, collection.iterator());
        }
        ylc ylcVar = (ylc) collection;
        if (!(ylcVar instanceof ybq)) {
            if (ylcVar.isEmpty()) {
                return false;
            }
            for (ylb ylbVar : ylcVar.l()) {
                h(ylbVar.b(), ylbVar.a());
            }
            return true;
        }
        ybq ybqVar = (ybq) ylcVar;
        if (ybqVar.isEmpty()) {
            return false;
        }
        for (int iA = ybqVar.a.a(); iA >= 0; iA = ybqVar.a.f(iA)) {
            h(ybqVar.a.j(iA), ybqVar.a.c(iA));
        }
        return true;
    }

    public abstract int b();

    public int c(Object obj, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.ylc
    public final boolean contains(Object obj) {
        return a(obj) > 0;
    }

    public abstract Iterator d();

    public abstract Iterator e();

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ylc) {
            ylc ylcVar = (ylc) obj;
            if (size() != ylcVar.size() || l().size() != ylcVar.l().size()) {
                return false;
            }
            for (ylb ylbVar : ylcVar.l()) {
                if (a(ylbVar.b()) != ylbVar.a()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean g(Object obj, int i) {
        throw null;
    }

    public void h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return l().hashCode();
    }

    public Set i() {
        return new yle(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return l().isEmpty();
    }

    public Set j() {
        return new ylf(this);
    }

    @Override // defpackage.ylc
    public final Set k() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set setI = i();
        this.a = setI;
        return setI;
    }

    @Override // defpackage.ylc
    public final Set l() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setJ = j();
        this.b = setJ;
        return setJ;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.ylc
    public final boolean remove(Object obj) {
        return c(obj, 1) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof ylc) {
            collection = ((ylc) collection).k();
        }
        return k().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof ylc) {
            collection = ((ylc) collection).k();
        }
        return k().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return l().toString();
    }
}
