package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class advv implements adxi {
    public final adtt a;
    boolean b = false;
    public final /* synthetic */ defpackage.advx c;

    public advv(defpackage.advx advxVar, adtt adttVar) {
        this.c = advxVar;
        this.a = adttVar;
    }

    public static final java.lang.String e(defpackage.adof adofVar) {
        int iOrdinal;
        if (adofVar == null || (iOrdinal = adofVar.ordinal()) == 0) {
            return "none";
        }
        if (iOrdinal == 1) {
            return "integrity_only";
        }
        if (iOrdinal == 2) {
            return "privacy_and_integrity";
        }
        throw new java.lang.IllegalArgumentException("Unknown SecurityLevel: ".concat(adofVar.toString()));
    }

    public static final java.lang.String f(defpackage.adjs adjsVar, defpackage.adjr adjrVar) {
        java.lang.String str = (java.lang.String) adjsVar.a(adjrVar);
        return str == null ? "" : str;
    }

    public static final java.lang.String g(defpackage.adjs adjsVar) {
        java.lang.String str = (java.lang.String) adjsVar.a(defpackage.adlm.b);
        if (str == null) {
            str = (java.lang.String) adjsVar.a(defpackage.adns.a);
        }
        return str == null ? "" : str;
    }

    public final void a(boolean z) {
        this.c.f(this.a, z);
    }

    public final void b() {
        defpackage.advx advxVar = this.c;
        advxVar.d.a(2, "READY");
        advxVar.g.execute(new defpackage.adug(this, 8));
    }

    public final void c(defpackage.ador adorVar, aduj adujVar) {
        java.lang.Object[] objArr = {this.a.e(), defpackage.advx.k(adorVar)};
        defpackage.advx advxVar = this.c;
        advxVar.d.b(2, "{0} SHUTDOWN with {1}", objArr);
        this.b = true;
        advxVar.g.execute(new defpackage.unw(this, adujVar, adorVar, 17, (int[]) null));
    }

    public final void d() {
        defpackage.ysr.bk(this.b, "transportShutdown() must be called before transportTerminated().");
        adtt adttVar = this.a;
        java.lang.Object[] objArr = {adttVar.e()};
        defpackage.advx advxVar = this.c;
        advxVar.d.b(2, "{0} Terminated", objArr);
        defpackage.adlk.c(advxVar.c.f, adttVar);
        advxVar.f(adttVar, false);
        java.util.Iterator it = advxVar.f.iterator();
        if (!it.hasNext()) {
            advxVar.g.execute(new defpackage.adug(this, 9));
        } else {
            adttVar.s();
            throw null;
        }
    }

    public final void h() {
        java.util.Iterator it = this.c.f.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }
}
