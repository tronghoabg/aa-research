package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class huw implements defpackage.hus {
    public final defpackage.zd b = new defpackage.ifu();

    @Override // defpackage.hus
    public final void a(java.security.MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            defpackage.zd zdVar = this.b;
            if (i >= zdVar.d) {
                return;
            }
            defpackage.huv huvVar = (defpackage.huv) zdVar.d(i);
            java.lang.Object objG = zdVar.g(i);
            defpackage.huu huuVar = huvVar.c;
            if (huvVar.e == null) {
                huvVar.e = huvVar.d.getBytes(defpackage.hus.a);
            }
            huuVar.a(huvVar.e, objG, messageDigest);
            i++;
        }
    }

    public final java.lang.Object b(defpackage.huv huvVar) {
        defpackage.zd zdVar = this.b;
        return zdVar.containsKey(huvVar) ? zdVar.get(huvVar) : huvVar.b;
    }

    public final void c(defpackage.huw huwVar) {
        this.b.i(huwVar.b);
    }

    public final void d(defpackage.huv huvVar, java.lang.Object obj) {
        this.b.put(huvVar, obj);
    }

    @Override // defpackage.hus
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.huw) {
            return this.b.equals(((defpackage.huw) obj).b);
        }
        return false;
    }

    @Override // defpackage.hus
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Options{values=" + this.b.toString() + "}";
    }
}
