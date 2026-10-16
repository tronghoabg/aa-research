package defpackage;

/* JADX INFO: loaded from: classes.dex */
abstract class yda<K, V> implements defpackage.ylx<K, V> {
    private transient java.util.Collection a;
    private transient java.util.Set b;
    private transient java.util.Collection c;
    private transient java.util.Map d;

    @Override // defpackage.ylx
    public boolean A() {
        return h() == 0;
    }

    @Override // defpackage.ylx
    public boolean B(defpackage.ylx ylxVar) {
        boolean zT = false;
        for (java.util.Map.Entry entry : ylxVar.u()) {
            zT |= t(entry.getKey(), entry.getValue());
        }
        return zT;
    }

    @Override // defpackage.ylx
    public boolean C(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection collection = (java.util.Collection) w().get(obj);
        return collection != null && collection.remove(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ylx
    public void D(java.lang.Object obj, java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable.isEmpty()) {
            return;
        }
        c(obj).addAll(iterable);
    }

    @Override // defpackage.ylx
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ylx) {
            return w().equals(((defpackage.ylx) obj).w());
        }
        return false;
    }

    @Override // defpackage.ylx
    public final int hashCode() {
        return w().hashCode();
    }

    public abstract java.util.Collection i();

    public abstract java.util.Collection j();

    public abstract java.util.Iterator l();

    public java.util.Iterator m() {
        throw null;
    }

    public abstract java.util.Map o();

    public abstract java.util.Set p();

    @Override // defpackage.ylx
    public boolean t(java.lang.Object obj, java.lang.Object obj2) {
        throw null;
    }

    public final java.lang.String toString() {
        return w().toString();
    }

    @Override // defpackage.ylx
    public java.util.Collection u() {
        java.util.Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        java.util.Collection collectionI = i();
        this.a = collectionI;
        return collectionI;
    }

    @Override // defpackage.ylx
    public java.util.Collection v() {
        java.util.Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        java.util.Collection collectionJ = j();
        this.c = collectionJ;
        return collectionJ;
    }

    @Override // defpackage.ylx
    public java.util.Map w() {
        java.util.Map map = this.d;
        if (map != null) {
            return map;
        }
        java.util.Map mapO = o();
        this.d = mapO;
        return mapO;
    }

    @Override // defpackage.ylx
    public java.util.Set x() {
        java.util.Set set = this.b;
        if (set != null) {
            return set;
        }
        java.util.Set setP = p();
        this.b = setP;
        return setP;
    }

    @Override // defpackage.ylx
    public final boolean y(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection collection = (java.util.Collection) w().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // defpackage.ylx
    public boolean z(java.lang.Object obj) {
        java.util.Iterator<V> it = w().values().iterator();
        while (it.hasNext()) {
            if (((java.util.Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
