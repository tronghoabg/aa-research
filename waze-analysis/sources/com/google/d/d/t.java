package com.google.d.d;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class t<K, V> extends y<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: a, reason: collision with root package name */
    private transient Map f7657a;

    /* renamed from: b, reason: collision with root package name */
    private transient int f7658b;

    t(Map map) {
        com.google.d.b.an.l(map.isEmpty());
        this.f7657a = map;
    }

    static /* bridge */ /* synthetic */ void v(t tVar, Object obj) {
        Object objRemove;
        Map map = tVar.f7657a;
        com.google.d.b.an.B(map);
        try {
            objRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            tVar.f7658b -= size;
        }
    }

    abstract Collection a();

    Collection b() {
        throw null;
    }

    @Override // com.google.d.d.dw
    public Collection c(Object obj) {
        Collection collectionA = (Collection) this.f7657a.get(obj);
        if (collectionA == null) {
            collectionA = a();
        }
        return f(obj, collectionA);
    }

    @Override // com.google.d.d.dw
    public Collection d(Object obj) {
        Collection collection = (Collection) this.f7657a.remove(obj);
        if (collection == null) {
            return b();
        }
        Collection collectionA = a();
        collectionA.addAll(collection);
        this.f7658b -= collection.size();
        collection.clear();
        return e(collectionA);
    }

    abstract Collection e(Collection collection);

    abstract Collection f(Object obj, Collection collection);

    @Override // com.google.d.d.dw
    public final int i() {
        return this.f7658b;
    }

    @Override // com.google.d.d.y
    final Collection j() {
        return this instanceof ff ? new w(this) : new ee(this);
    }

    @Override // com.google.d.d.y
    final Collection k() {
        return new x(this);
    }

    @Override // com.google.d.d.y
    final Iterator l() {
        return new d(this);
    }

    @Override // com.google.d.d.y
    final Iterator m() {
        return new c(this);
    }

    final List n(Object obj, List list, q qVar) {
        return list instanceof RandomAccess ? new m(this, obj, list, qVar) : new s(this, obj, list, qVar);
    }

    final Map p() {
        return this.f7657a;
    }

    @Override // com.google.d.d.y
    Map q() {
        return new g(this, this.f7657a);
    }

    final Map r() {
        Map map = this.f7657a;
        return map instanceof NavigableMap ? new k(this, (NavigableMap) map) : map instanceof SortedMap ? new n(this, (SortedMap) map) : new g(this, map);
    }

    @Override // com.google.d.d.y
    Set s() {
        return new j(this, this.f7657a);
    }

    final Set t() {
        Map map = this.f7657a;
        return map instanceof NavigableMap ? new l(this, (NavigableMap) map) : map instanceof SortedMap ? new o(this, (SortedMap) map) : new j(this, map);
    }

    @Override // com.google.d.d.dw
    public final void w() {
        Iterator<V> it = this.f7657a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f7657a.clear();
        this.f7658b = 0;
    }

    final void x(Map map) {
        this.f7657a = map;
        this.f7658b = 0;
        for (V v : map.values()) {
            com.google.d.b.an.l(!v.isEmpty());
            this.f7658b += v.size();
        }
    }

    @Override // com.google.d.d.y, com.google.d.d.dw
    public final void y(Object obj, Object obj2) {
        Collection collection = (Collection) this.f7657a.get(obj);
        if (collection != null) {
            if (collection.add(obj2)) {
                this.f7658b++;
            }
        } else {
            Collection collectionA = a();
            if (!collectionA.add(obj2)) {
                throw new AssertionError("New Collection violated the Collection spec");
            }
            this.f7658b++;
            this.f7657a.put(obj, collectionA);
        }
    }
}
