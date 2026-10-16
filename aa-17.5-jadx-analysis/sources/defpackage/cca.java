package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cca<K, V> extends afat<V> implements Collection<V>, afgd {
    private final cbw a;

    public cca(cbw cbwVar) {
        this.a = cbwVar;
    }

    @Override // defpackage.afat
    public final int a() {
        return this.a.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        ccf[] ccfVarArr = new ccf[8];
        for (int i = 0; i < 8; i++) {
            ccfVarArr[i] = new ccj();
        }
        return new cbx(this.a, ccfVarArr);
    }
}
