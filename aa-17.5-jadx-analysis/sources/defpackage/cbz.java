package defpackage;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class cbz<K, V> extends afaw<K> implements Set<K>, afgh {
    private final cbw a;

    public cbz(cbw cbwVar) {
        this.a = cbwVar;
    }

    @Override // defpackage.afaw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.afaw
    public final int getSize() {
        return this.a.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        ccf[] ccfVarArr = new ccf[8];
        for (int i = 0; i < 8; i++) {
            ccfVarArr[i] = new cch();
        }
        return new cbx(this.a, ccfVarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        cbw cbwVar = this.a;
        if (!cbwVar.containsKey(obj)) {
            return false;
        }
        cbwVar.remove(obj);
        return true;
    }
}
