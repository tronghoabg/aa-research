package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class ymf extends defpackage.yfq implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final defpackage.ylx a;
    transient java.util.Collection b;
    transient java.util.Set c;
    transient java.util.Map d;

    public ymf(defpackage.ylx ylxVar) {
        this.a = ylxVar;
    }

    @Override // defpackage.yfq, defpackage.ylx
    public final boolean B(defpackage.ylx ylxVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.yfq, defpackage.ylx
    public final boolean C(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.yfq, defpackage.ylx
    public final void D(java.lang.Object obj, java.lang.Iterable iterable) {
        throw null;
    }

    @Override // defpackage.yfq, defpackage.ylx
    public java.util.Collection c(java.lang.Object obj) {
        return defpackage.ysr.D(((defpackage.yfn) this.a).c(obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yfr
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public defpackage.ylx d() {
        return this.a;
    }

    @Override // defpackage.yfq, defpackage.ylx
    public final void q() {
        throw null;
    }

    @Override // defpackage.yfq, defpackage.ylx
    public final boolean t(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.yfq, defpackage.ylx
    public final java.util.Collection u() {
        java.util.Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        defpackage.ylu yluVar = new defpackage.ylu(j$.util.DesugarCollections.unmodifiableCollection(this.a.u()));
        this.b = yluVar;
        return yluVar;
    }

    @Override // defpackage.yfq, defpackage.ylx
    public final java.util.Collection v() {
        throw null;
    }

    @Override // defpackage.yfq, defpackage.ylx
    public final java.util.Map w() {
        java.util.Map map = this.d;
        if (map != null) {
            return map;
        }
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(new defpackage.ylt(this.a.w(), new defpackage.ajnd(new defpackage.yme(0))));
        this.d = mapUnmodifiableMap;
        return mapUnmodifiableMap;
    }

    @Override // defpackage.yfq, defpackage.ylx
    public final java.util.Set x() {
        java.util.Set set = this.c;
        if (set != null) {
            return set;
        }
        java.util.Set setUnmodifiableSet = j$.util.DesugarCollections.unmodifiableSet(this.a.x());
        this.c = setUnmodifiableSet;
        return setUnmodifiableSet;
    }
}
