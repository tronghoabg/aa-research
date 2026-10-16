package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
abstract class ybu<K, V> implements yks<K, V> {
    private transient Collection a;
    private transient Set b;
    private transient Collection c;
    private transient Map d;

    @Override // defpackage.yks
    public boolean A() {
        return h() == 0;
    }

    @Override // defpackage.yks
    public boolean B(yks yksVar) {
        boolean zT = false;
        for (Map.Entry entry : yksVar.u()) {
            zT |= t(entry.getKey(), entry.getValue());
        }
        return zT;
    }

    @Override // defpackage.yks
    public boolean C(Object obj, Object obj2) {
        Collection collection = (Collection) w().get(obj);
        return collection != null && collection.remove(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yks
    public void D(Object obj, Iterable iterable) {
        iterable.getClass();
        if (iterable.isEmpty()) {
            return;
        }
        c(obj).addAll(iterable);
    }

    @Override // defpackage.yks
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yks) {
            return w().equals(((yks) obj).w());
        }
        return false;
    }

    @Override // defpackage.yks
    public final int hashCode() {
        return w().hashCode();
    }

    public abstract Collection i();

    public abstract Collection j();

    public abstract Iterator l();

    public Iterator m() {
        throw null;
    }

    public abstract Map o();

    public abstract Set p();

    @Override // defpackage.yks
    public boolean t(Object obj, Object obj2) {
        throw null;
    }

    public final String toString() {
        return w().toString();
    }

    @Override // defpackage.yks
    public Collection u() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection collectionI = i();
        this.a = collectionI;
        return collectionI;
    }

    @Override // defpackage.yks
    public Collection v() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        Collection collectionJ = j();
        this.c = collectionJ;
        return collectionJ;
    }

    @Override // defpackage.yks
    public Map w() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map mapO = o();
        this.d = mapO;
        return mapO;
    }

    @Override // defpackage.yks
    public Set x() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setP = p();
        this.b = setP;
        return setP;
    }

    @Override // defpackage.yks
    public final boolean y(Object obj, Object obj2) {
        Collection collection = (Collection) w().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // defpackage.yks
    public boolean z(Object obj) {
        Iterator<V> it = w().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
