package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class adkr {
    static final java.util.logging.Logger c = java.util.logging.Logger.getLogger(defpackage.adkr.class.getName());
    public static final defpackage.adkr d = new defpackage.adkr();
    final defpackage.adkk e;
    public final defpackage.adoc f;
    public final int g;

    public adkr(defpackage.adkr adkrVar, defpackage.adoc adocVar) {
        this.e = adkrVar instanceof defpackage.adkk ? (defpackage.adkk) adkrVar : adkrVar.e;
        this.f = adocVar;
        int i = adkrVar.g + 1;
        this.g = i;
        e(i);
    }

    private static void e(int i) {
        if (i == 1000) {
            c.logp(java.util.logging.Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (java.lang.Throwable) new java.lang.Exception());
        }
    }

    public static defpackage.adkr k() {
        defpackage.adkr adkrVarA = defpackage.adkp.a.a();
        return adkrVarA == null ? d : adkrVarA;
    }

    public static void m(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException((java.lang.String) obj2);
        }
    }

    public defpackage.adkr a() {
        defpackage.adkr adkrVarB = defpackage.adkp.a.b(this);
        return adkrVarB == null ? d : adkrVarB;
    }

    public defpackage.adks b() {
        defpackage.adkk adkkVar = this.e;
        if (adkkVar == null) {
            return null;
        }
        return adkkVar.a;
    }

    public java.lang.Throwable c() {
        defpackage.adkk adkkVar = this.e;
        if (adkkVar == null) {
            return null;
        }
        return adkkVar.c();
    }

    public void d(defpackage.adkl adklVar, java.util.concurrent.Executor executor) {
        defpackage.adkk adkkVar = this.e;
        if (adkkVar == null) {
            return;
        }
        adkkVar.e(new defpackage.adkn(executor, adklVar, this));
    }

    public void f(defpackage.adkr adkrVar) {
        m(adkrVar, "toAttach");
        defpackage.adkp.a.c(this, adkrVar);
    }

    public void g(defpackage.adkl adklVar) {
        defpackage.adkk adkkVar = this.e;
        if (adkkVar == null) {
            return;
        }
        adkkVar.h(adklVar, this);
    }

    public boolean i() {
        defpackage.adkk adkkVar = this.e;
        if (adkkVar == null) {
            return false;
        }
        return adkkVar.i();
    }

    public final defpackage.adkr l(defpackage.adko adkoVar, java.lang.Object obj) {
        defpackage.adoc adocVar = this.f;
        return new defpackage.adkr(this, adocVar == null ? new defpackage.adob(adkoVar, obj, 0) : adocVar.c(adkoVar, obj, adkoVar.hashCode(), 0));
    }

    private adkr() {
        this.e = null;
        this.f = null;
        this.g = 0;
    }

    public adkr(defpackage.adoc adocVar, int i) {
        this.e = null;
        this.f = adocVar;
        this.g = i;
        e(i);
    }
}
