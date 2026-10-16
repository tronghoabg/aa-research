package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajmj implements defpackage.ajpb {
    public final int a;
    public final defpackage.ajmc b;
    public final defpackage.ajmr c;
    public long d;
    public long e;
    public final java.util.ArrayDeque f;
    public final defpackage.ajmh g;
    public final defpackage.ajmg h;
    public final defpackage.ajmi i;
    public final defpackage.ajmi j;
    public java.io.IOException k;
    private boolean l;
    private int m;

    public ajmj(int i, defpackage.ajmc ajmcVar, boolean z, boolean z2, defpackage.ajiu ajiuVar) {
        this.a = i;
        this.b = ajmcVar;
        this.c = new defpackage.ajmr(i);
        this.e = ajmcVar.r.c();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.f = arrayDeque;
        this.g = new defpackage.ajmh(this, ajmcVar.q.c(), z2);
        this.h = new defpackage.ajmg(this, z);
        this.i = new defpackage.ajmi(this);
        this.j = new defpackage.ajmi(this);
        if (ajiuVar == null) {
            if (!i()) {
                throw new java.lang.IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (i()) {
                throw new java.lang.IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(ajiuVar);
        }
    }

    private final boolean o(int i, java.io.IOException iOException) {
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        synchronized (this) {
            if (k() == 0) {
                this.m = i;
                this.k = iOException;
                notifyAll();
                if (!this.g.b || !this.h.a) {
                    this.b.b(this.a);
                    return true;
                }
            }
            return false;
        }
    }

    @Override // defpackage.ajpb
    public final /* synthetic */ defpackage.ajpa a() {
        return this.h;
    }

    @Override // defpackage.ajpb
    public final /* synthetic */ defpackage.ajpc b() {
        return this.g;
    }

    public final void c(long j) {
        this.e += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void d() throws java.io.IOException {
        boolean z;
        boolean zJ;
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        synchronized (this) {
            defpackage.ajmh ajmhVar = this.g;
            z = false;
            if (!ajmhVar.b && ajmhVar.e) {
                defpackage.ajmg ajmgVar = this.h;
                if (ajmgVar.a || ajmgVar.b) {
                    z = true;
                }
            }
            zJ = j();
        }
        if (z) {
            l(9, null);
        } else {
            if (zJ) {
                return;
            }
            this.b.b(this.a);
        }
    }

    public final void e() throws java.io.IOException {
        defpackage.ajmg ajmgVar = this.h;
        if (ajmgVar.b) {
            throw new java.io.IOException("stream closed");
        }
        if (ajmgVar.a) {
            throw new java.io.IOException("stream finished");
        }
        if (k() != 0) {
            java.io.IOException iOException = this.k;
            if (iOException != null) {
                throw iOException;
            }
            int iK = k();
            if (iK != 0) {
                throw new defpackage.ajmq(iK);
            }
            throw null;
        }
    }

    public final void f(defpackage.ajiu ajiuVar, boolean z) {
        boolean zJ;
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        synchronized (this) {
            if (!this.l || ajiuVar.b(":status") != null || ajiuVar.b(":method") != null) {
                this.l = true;
                this.f.add(ajiuVar);
            }
            if (z) {
                this.g.b = true;
            }
            zJ = j();
            notifyAll();
        }
        if (zJ) {
            return;
        }
        this.b.b(this.a);
    }

    public final void g() throws java.io.InterruptedIOException {
        try {
            wait();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException();
        }
    }

    public final boolean h() {
        defpackage.ajmg ajmgVar = this.h;
        return ajmgVar.b || ajmgVar.a;
    }

    public final boolean i() {
        return (this.a & 1) == 1;
    }

    public final boolean j() {
        synchronized (this) {
            if (k() != 0) {
                return false;
            }
            defpackage.ajmh ajmhVar = this.g;
            if (ajmhVar.b || ajmhVar.e) {
                defpackage.ajmg ajmgVar = this.h;
                if ((ajmgVar.a || ajmgVar.b) && this.l) {
                    return false;
                }
            }
            return true;
        }
    }

    public final int k() {
        int i;
        synchronized (this) {
            i = this.m;
        }
        return i;
    }

    public final void l(int i, java.io.IOException iOException) throws java.io.IOException {
        if (o(i, iOException)) {
            this.b.l(this.a, i);
        }
    }

    public final void m(int i) {
        if (o(i, null)) {
            this.b.m(this.a, i);
        }
    }

    public final void n(int i) {
        synchronized (this) {
            if (k() == 0) {
                this.m = i;
                notifyAll();
            }
        }
    }
}
