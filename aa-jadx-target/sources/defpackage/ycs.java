package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class ycs extends defpackage.yda implements java.io.Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient java.util.Map a;
    public transient int b;

    public ycs(java.util.Map map) {
        if (!map.isEmpty()) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = map;
    }

    public abstract java.util.Collection a();

    public java.util.Collection b() {
        throw null;
    }

    @Override // defpackage.ylx
    public java.util.Collection c(java.lang.Object obj) {
        java.util.Collection collectionA = (java.util.Collection) this.a.get(obj);
        if (collectionA == null) {
            collectionA = a();
        }
        return e(obj, collectionA);
    }

    public abstract java.util.Collection d(java.util.Collection collection);

    public abstract java.util.Collection e(java.lang.Object obj, java.util.Collection collection);

    @Override // defpackage.ylx
    public final int h() {
        return this.b;
    }

    @Override // defpackage.yda
    public final java.util.Collection i() {
        return this instanceof defpackage.ynk ? new ycy(this) : new ymc(this);
    }

    @Override // defpackage.yda
    public final java.util.Collection j() {
        return new defpackage.ycz(this);
    }

    public final java.util.Collection k(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.a.remove(obj);
        if (collection == null) {
            return b();
        }
        java.util.Collection collectionA = a();
        collectionA.addAll(collection);
        this.b -= collection.size();
        collection.clear();
        return d(collectionA);
    }

    @Override // defpackage.yda
    public final java.util.Iterator l() {
        return new ybz(this);
    }

    @Override // defpackage.yda
    public final java.util.Iterator m() {
        return new defpackage.yby(this);
    }

    final java.util.List n(java.lang.Object obj, java.util.List list, defpackage.ycm ycmVar) {
        return list instanceof java.util.RandomAccess ? new defpackage.yci(this, obj, list, ycmVar) : new defpackage.yco(this, obj, list, ycmVar);
    }

    @Override // defpackage.yda
    public java.util.Map o() {
        return new defpackage.ycc(this, this.a);
    }

    @Override // defpackage.yda
    public java.util.Set p() {
        return new defpackage.ycf(this, this.a);
    }

    @Override // defpackage.ylx
    public final void q() {
        java.util.Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((java.util.Collection) it.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    final void r(java.util.Map map) {
        this.a = map;
        this.b = 0;
        for (java.util.Collection collection : map.values()) {
            defpackage.ysr.aX(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.ylx
    public final boolean s(java.lang.Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.yda, defpackage.ylx
    public final boolean t(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Collection collection = (java.util.Collection) this.a.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.b++;
            return true;
        }
        java.util.Collection collectionA = a();
        if (!collectionA.add(obj2)) {
            throw new java.lang.AssertionError("New Collection violated the Collection spec");
        }
        this.b++;
        this.a.put(obj, collectionA);
        return true;
    }
}
