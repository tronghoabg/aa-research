package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public final class vla {
    private static final vla b;
    private static volatile boolean c;
    private static volatile vla d;
    public final vlb a;

    static {
        vla vlaVar = new vla(new vkz());
        b = vlaVar;
        c = true;
        d = vlaVar;
    }

    public vla(vlb vlbVar) {
        this.a = vlbVar;
    }

    @ResultIgnorabilityUnspecified
    public static vla a() {
        if (d == b && c) {
            c = false;
            ((ynz) ((ynz) ((ynz) vlj.a.h()).q(Math.random() < 0.01d ? ypd.FULL : ypd.NONE)).ai((char) 9749)).u("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return d;
    }

    public static synchronized void b(vla vlaVar) {
        if (d != b) {
            ((ynz) ((ynz) vlj.a.e()).ai((char) 9748)).u("Primes cached more than once. This call will be ignored.");
        } else {
            d = vlaVar;
        }
    }

    public final void c(vky vkyVar, long j, long j2) {
        this.a.j(vkyVar, j, j2);
    }

    public final void d(vvu vvuVar) {
        this.a.e(vvuVar);
    }

    public final void e(vky vkyVar) {
        this.a.g(vkyVar);
    }

    public final void f(vky vkyVar) {
        this.a.k(vkyVar, null, 1);
    }

    public final boolean g() {
        return this.a.i();
    }

    public final void h() {
        this.a.f();
    }
}
