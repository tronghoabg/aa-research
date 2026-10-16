package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class yes<K, V> extends AbstractMap<V, K> implements Serializable, ycc {
    final yey a;
    private transient Set b;

    public yes(yey yeyVar) {
        this.a = yeyVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a.g = this;
    }

    @Override // defpackage.ycc
    public final ycc a() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<V, K>> entrySet() {
        Set<Map.Entry<V, K>> set = this.b;
        if (set != null) {
            return set;
        }
        yet yetVar = new yet(this.a);
        this.b = yetVar;
        return yetVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final K get(Object obj) {
        yey yeyVar = this.a;
        int iD = yeyVar.d(obj);
        if (iD == -1) {
            return null;
        }
        return (K) yeyVar.a[iD];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<V> keySet() {
        return this.a.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final K put(V v, K k) {
        return (K) this.a.k(v, k);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final K remove(Object obj) {
        yey yeyVar = this.a;
        int iX = wub.x(obj);
        int iE = yeyVar.e(obj, iX);
        if (iE == -1) {
            return null;
        }
        K k = (K) yeyVar.a[iE];
        yeyVar.h(iE, iX);
        return k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return this.a.keySet();
    }
}
