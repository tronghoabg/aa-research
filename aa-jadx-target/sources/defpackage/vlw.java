package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vlw {
    private static final defpackage.vlw b;
    private static volatile boolean c;
    private static volatile defpackage.vlw d;
    public final defpackage.vlx a;

    static {
        defpackage.vlw vlwVar = new defpackage.vlw(new defpackage.vlv());
        b = vlwVar;
        c = true;
        d = vlwVar;
    }

    public vlw(defpackage.vlx vlxVar) {
        this.a = vlxVar;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static defpackage.vlw a() {
        if (d == b && c) {
            c = false;
            ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).q(java.lang.Math.random() < 0.01d ? defpackage.yqi.FULL : defpackage.yqi.NONE)).ai((char) 9777)).u("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return d;
    }

    public static synchronized void b(defpackage.vlw vlwVar) {
        if (d != b) {
            ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai((char) 9776)).u("Primes cached more than once. This call will be ignored.");
        } else {
            d = vlwVar;
        }
    }

    public final void c(defpackage.vlu vluVar, long j, long j2) {
        this.a.j(vluVar, j, j2);
    }

    public final void d(defpackage.vwp vwpVar) {
        this.a.e(vwpVar);
    }

    public final void e(defpackage.vlu vluVar) {
        this.a.g(vluVar);
    }

    public final void f(defpackage.vlu vluVar) {
        this.a.k(vluVar, null, 1);
    }

    public final boolean g() {
        return this.a.i();
    }

    public final void h() {
        this.a.f();
    }
}
