package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class att implements defpackage.atr {
    private final /* synthetic */ defpackage.ats a = defpackage.ats.a;
    private final defpackage.dlo b;
    private final long c;

    public att(defpackage.dlo dloVar, long j) {
        this.b = dloVar;
        this.c = j;
    }

    @Override // defpackage.atr
    public final defpackage.cgf a(defpackage.cgf cgfVar, defpackage.cfu cfuVar) {
        return this.a.a(cgfVar, cfuVar);
    }

    @Override // defpackage.atr
    public final defpackage.cgf b(defpackage.cgf cgfVar) {
        return this.a.b(cgfVar);
    }

    public final float c() {
        long j = this.c;
        if (defpackage.dlm.g(j)) {
            return this.b.dG(defpackage.dlm.a(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final float d() {
        long j = this.c;
        if (defpackage.dlm.h(j)) {
            return this.b.dG(defpackage.dlm.b(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.att)) {
            return false;
        }
        defpackage.att attVar = (defpackage.att) obj;
        return defpackage.afga.f(this.b, attVar.b) && this.c == attVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        long j = this.c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.b + ", constraints=" + defpackage.dlm.e(this.c) + ")";
    }
}
