package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sxf implements defpackage.sxe {
    private final java.lang.Object a = new java.lang.Object();
    private final int b;
    private final defpackage.sxc c;
    private int d;
    private int e;
    private int f;
    private java.lang.Exception g;
    private boolean h;

    public sxf(int i, defpackage.sxc sxcVar) {
        this.b = i;
        this.c = sxcVar;
    }

    private final void c() {
        int i = this.d + this.e + this.f;
        int i2 = this.b;
        if (i == i2) {
            if (this.g == null) {
                boolean z = this.h;
                defpackage.sxc sxcVar = this.c;
                if (z) {
                    sxcVar.r();
                    return;
                } else {
                    sxcVar.p(null);
                    return;
                }
            }
            this.c.o(new java.util.concurrent.ExecutionException(this.e + " out of " + i2 + " underlying tasks failed", this.g));
        }
    }

    @Override // defpackage.swp
    public final void b() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            c();
        }
    }

    @Override // defpackage.sws
    public final void d(java.lang.Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            c();
        }
    }

    @Override // defpackage.swt
    public final void e(java.lang.Object obj) {
        synchronized (this.a) {
            this.d++;
            c();
        }
    }
}
