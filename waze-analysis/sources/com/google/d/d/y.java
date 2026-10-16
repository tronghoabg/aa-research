package com.google.d.d;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class y<K, V> implements dw<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private transient Collection f7661a;

    /* renamed from: b, reason: collision with root package name */
    private transient Set f7662b;

    /* renamed from: c, reason: collision with root package name */
    private transient Collection f7663c;

    /* renamed from: d, reason: collision with root package name */
    private transient Map f7664d;

    y() {
    }

    @Override // com.google.d.d.dw
    public Collection A() {
        Collection collection = this.f7663c;
        if (collection != null) {
            return collection;
        }
        Collection collectionK = k();
        this.f7663c = collectionK;
        return collectionK;
    }

    @Override // com.google.d.d.dw
    public Map B() {
        Map map = this.f7664d;
        if (map != null) {
            return map;
        }
        Map mapQ = q();
        this.f7664d = mapQ;
        return mapQ;
    }

    @Override // com.google.d.d.dw
    public Set C() {
        Set set = this.f7662b;
        if (set != null) {
            return set;
        }
        Set setS = s();
        this.f7662b = setS;
        return setS;
    }

    @Override // com.google.d.d.dw
    public final boolean D(Object obj, Object obj2) {
        Collection collection = (Collection) B().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean E(Object obj) {
        Iterator<V> it = B().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.d.d.dw
    public boolean F() {
        return i() == 0;
    }

    @Override // com.google.d.d.dw
    public boolean G(Object obj, Object obj2) {
        Collection collection = (Collection) B().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final void H(Object obj, Iterable iterable) {
        Collection collection = (Collection) iterable;
        if (collection.isEmpty()) {
            return;
        }
        c(obj).addAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dw) {
            return B().equals(((dw) obj).B());
        }
        return false;
    }

    public final int hashCode() {
        return B().hashCode();
    }

    abstract Collection j();

    abstract Collection k();

    abstract Iterator l();

    Iterator m() {
        throw null;
    }

    abstract Map q();

    abstract Set s();

    public final String toString() {
        return B().toString();
    }

    @Override // com.google.d.d.dw
    public void y(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.d.d.dw
    public Collection z() {
        Collection collection = this.f7661a;
        if (collection != null) {
            return collection;
        }
        Collection collectionJ = j();
        this.f7661a = collectionJ;
        return collectionJ;
    }
}
