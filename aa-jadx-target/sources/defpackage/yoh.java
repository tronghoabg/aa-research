package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yoh extends defpackage.yoi implements defpackage.ylx {
    private static final long serialVersionUID = 0;
    transient java.util.Collection a;
    transient java.util.Map b;

    public yoh(defpackage.ylx ylxVar) {
        super(ylxVar, null);
    }

    @Override // defpackage.ylx
    public final boolean A() {
        throw null;
    }

    @Override // defpackage.ylx
    public final boolean B(defpackage.ylx ylxVar) {
        throw null;
    }

    @Override // defpackage.ylx
    public final boolean C(java.lang.Object obj, java.lang.Object obj2) {
        boolean zC;
        synchronized (this.g) {
            zC = a().C(obj, obj2);
        }
        return zC;
    }

    @Override // defpackage.ylx
    public final void D(java.lang.Object obj, java.lang.Iterable iterable) {
        throw null;
    }

    final defpackage.ylx a() {
        return (defpackage.ylx) this.f;
    }

    @Override // defpackage.ylx
    public final java.util.Collection c(java.lang.Object obj) {
        java.util.Collection collectionK;
        java.lang.Object obj2 = this.g;
        synchronized (obj2) {
            collectionK = defpackage.ysr.k(a().c(obj), obj2);
        }
        return collectionK;
    }

    @Override // defpackage.ylx
    public final boolean equals(java.lang.Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            zEquals = a().equals(obj);
        }
        return zEquals;
    }

    @Override // defpackage.ylx
    public final int h() {
        throw null;
    }

    @Override // defpackage.ylx
    public final int hashCode() {
        int iHashCode;
        synchronized (this.g) {
            iHashCode = a().hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.ylx
    public final void q() {
        throw null;
    }

    @Override // defpackage.ylx
    public final boolean s(java.lang.Object obj) {
        throw null;
    }

    @Override // defpackage.ylx
    public final boolean t(java.lang.Object obj, java.lang.Object obj2) {
        boolean zT;
        synchronized (this.g) {
            zT = a().t(obj, obj2);
        }
        return zT;
    }

    @Override // defpackage.ylx
    public final java.util.Collection u() {
        java.util.Collection collectionK;
        java.lang.Object obj = this.g;
        synchronized (obj) {
            collectionK = this.a;
            if (collectionK == null) {
                collectionK = defpackage.ysr.k(a().u(), obj);
                this.a = collectionK;
            }
        }
        return collectionK;
    }

    @Override // defpackage.ylx
    public final java.util.Collection v() {
        throw null;
    }

    @Override // defpackage.ylx
    public final java.util.Map w() {
        java.util.Map map;
        java.lang.Object obj = this.g;
        synchronized (obj) {
            if (this.b == null) {
                this.b = new yny(a().w(), obj);
            }
            map = this.b;
        }
        return map;
    }

    @Override // defpackage.ylx
    public final java.util.Set x() {
        throw null;
    }

    @Override // defpackage.ylx
    public final boolean y(java.lang.Object obj, java.lang.Object obj2) {
        throw null;
    }

    @Override // defpackage.ylx
    public final boolean z(java.lang.Object obj) {
        throw null;
    }
}
