package defpackage;

import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class swh implements swg {
    private final Object a = new Object();
    private final int b;
    private final swe c;
    private int d;
    private int e;
    private int f;
    private Exception g;
    private boolean h;

    public swh(int i, swe sweVar) {
        this.b = i;
        this.c = sweVar;
    }

    private final void c() {
        int i = this.d + this.e + this.f;
        int i2 = this.b;
        if (i == i2) {
            if (this.g == null) {
                boolean z = this.h;
                swe sweVar = this.c;
                if (z) {
                    sweVar.r();
                    return;
                } else {
                    sweVar.p(null);
                    return;
                }
            }
            this.c.o(new ExecutionException(this.e + " out of " + i2 + " underlying tasks failed", this.g));
        }
    }

    @Override // defpackage.svr
    public final void b() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            c();
        }
    }

    @Override // defpackage.svu
    public final void d(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            c();
        }
    }

    @Override // defpackage.svv
    public final void e(Object obj) {
        synchronized (this.a) {
            this.d++;
            c();
        }
    }
}
