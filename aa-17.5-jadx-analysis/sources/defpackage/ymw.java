package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class ymw<K, V> extends yng<Map.Entry<K, Collection<V>>> {
    private static final long serialVersionUID = 0;

    @Override // defpackage.ymz, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.g) {
            zContains = !(obj instanceof Map.Entry) ? false : a().contains(yrm.M((Map.Entry) obj));
        }
        return zContains;
    }

    @Override // defpackage.ymz, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        boolean zL;
        synchronized (this.g) {
            zL = ysi.l(a(), collection);
        }
        return zL;
    }

    @Override // defpackage.yng, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean zV;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            zV = yrm.v(a(), obj);
        }
        return zV;
    }

    @Override // defpackage.ymz, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return new ymv(this, super.iterator());
    }

    @Override // defpackage.ymz, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.g) {
            zRemove = !(obj instanceof Map.Entry) ? false : a().remove(yrm.M((Map.Entry) obj));
        }
        return zRemove;
    }

    @Override // defpackage.ymz, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean zAf;
        synchronized (this.g) {
            zAf = yrm.af(a().iterator(), collection);
        }
        return zAf;
    }

    @Override // defpackage.ymz, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean zAg;
        synchronized (this.g) {
            zAg = yrm.ag(a().iterator(), collection);
        }
        return zAg;
    }

    @Override // defpackage.ymz, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr;
        synchronized (this.g) {
            Set setA = a();
            objArr = new Object[setA.size()];
            yrm.C(setA, objArr);
        }
        return objArr;
    }

    @Override // defpackage.ymz, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.g) {
            tArr2 = (T[]) yrm.z(a(), tArr);
        }
        return tArr2;
    }
}
