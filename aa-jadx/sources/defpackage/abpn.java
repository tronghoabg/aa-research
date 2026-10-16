package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class abpn {
    public volatile defpackage.abnv a;
    protected volatile defpackage.abpy b;
    private final defpackage.abpy c;
    private final defpackage.abol d;
    private volatile boolean e;

    public abpn(defpackage.abpy abpyVar) {
        if (abpyVar == null) {
            throw new java.lang.IllegalArgumentException("message cannot be null");
        }
        this.b = abpyVar;
        this.c = abpyVar.s();
        this.d = defpackage.abol.a;
        this.a = null;
        this.e = false;
    }

    final int a() {
        int iD = this.a != null ? this.a.d() : this.b.m();
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(iD) * 9)) >>> 6) + iD;
    }

    final defpackage.abpy b() {
        try {
            return this.b;
        } catch (defpackage.abpp unused) {
            int i = defpackage.abol.b;
            return this.c;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.abpn)) {
            return b().equals(obj);
        }
        defpackage.abpn abpnVar = (defpackage.abpn) obj;
        if (this.a == null || abpnVar.a == null || this.d != abpnVar.d || !this.a.equals(abpnVar.a)) {
            return b().equals(abpnVar.b());
        }
        return true;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final java.lang.String toString() {
        return b().toString();
    }
}
