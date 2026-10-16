package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ybm extends ybu implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    public ybm(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.a = map;
    }

    public abstract Collection a();

    public Collection b() {
        throw null;
    }

    @Override // defpackage.yks
    public Collection c(Object obj) {
        Collection collectionA = (Collection) this.a.get(obj);
        if (collectionA == null) {
            collectionA = a();
        }
        return e(obj, collectionA);
    }

    public abstract Collection d(Collection collection);

    public abstract Collection e(Object obj, Collection collection);

    @Override // defpackage.yks
    public final int h() {
        return this.b;
    }

    @Override // defpackage.ybu
    public final Collection i() {
        return this instanceof ymf ? new ybs(this) : new ykx(this);
    }

    @Override // defpackage.ybu
    public final Collection j() {
        return new ybt(this);
    }

    public final Collection k(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return b();
        }
        Collection collectionA = a();
        collectionA.addAll(collection);
        this.b -= collection.size();
        collection.clear();
        return d(collectionA);
    }

    @Override // defpackage.ybu
    public final Iterator l() {
        return new yat(this);
    }

    @Override // defpackage.ybu
    public final Iterator m() {
        return new yas(this);
    }

    final List n(Object obj, List list, ybg ybgVar) {
        return list instanceof RandomAccess ? new ybc(this, obj, list, ybgVar) : new ybi(this, obj, list, ybgVar);
    }

    @Override // defpackage.ybu
    public Map o() {
        return new yaw(this, this.a);
    }

    @Override // defpackage.ybu
    public Set p() {
        return new yaz(this, this.a);
    }

    @Override // defpackage.yks
    public final void q() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    final void r(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            woy.N(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.yks
    public final boolean s(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.ybu, defpackage.yks
    public final boolean t(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.b++;
            return true;
        }
        Collection collectionA = a();
        if (!collectionA.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.b++;
        this.a.put(obj, collectionA);
        return true;
    }
}
