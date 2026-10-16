package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class ukk {
    public int a;
    private int b;
    private uke c;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;
    private float i;
    private int j;
    private int k;
    private int l;
    private float m;
    private yfq n;
    private boolean o;
    private boolean p;
    private short q;

    public final ukl a() {
        if ((this.q & 2) == 0) {
            throw new IllegalStateException();
        }
        j(Math.max(0, this.d));
        if ((this.q & 4) == 0) {
            throw new IllegalStateException();
        }
        k(Math.max(0, this.e));
        if ((this.q & 16) == 0) {
            throw new IllegalStateException();
        }
        h(Math.max(BitmapDescriptorFactory.HUE_RED, this.g));
        if ((this.q & 32) == 0) {
            throw new IllegalStateException();
        }
        n(Math.max(BitmapDescriptorFactory.HUE_RED, this.h));
        if ((this.q & 64) == 0) {
            throw new IllegalStateException();
        }
        o(Math.max(BitmapDescriptorFactory.HUE_RED, this.i));
        if ((this.q & 128) == 0) {
            throw new IllegalStateException();
        }
        e(Math.max(0, this.j));
        f(Math.max(0, b()));
        int iB = b();
        if ((this.q & 512) == 0) {
            throw new IllegalStateException();
        }
        d(Math.min(iB, Math.max(0, this.l)));
        if ((this.q & 1024) == 0) {
            throw new IllegalStateException();
        }
        g(Math.max(BitmapDescriptorFactory.HUE_RED, this.m));
        if (this.q != 8191 || this.c == null || this.n == null || this.a == 0) {
            throw new IllegalStateException();
        }
        return new ukl(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.a, this.o, this.p);
    }

    public final int b() {
        if ((this.q & 256) != 0) {
            return this.k;
        }
        throw new IllegalStateException();
    }

    public final void c(boolean z) {
        this.o = z;
        this.q = (short) (this.q | 2048);
    }

    public final void d(int i) {
        this.l = i;
        this.q = (short) (this.q | 512);
    }

    public final void e(int i) {
        this.j = i;
        this.q = (short) (this.q | 128);
    }

    public final void f(int i) {
        this.k = i;
        this.q = (short) (this.q | 256);
    }

    public final void g(float f) {
        this.m = f;
        this.q = (short) (this.q | 1024);
    }

    public final void h(float f) {
        this.g = f;
        this.q = (short) (this.q | 16);
    }

    public final void i(int i) {
        this.f = i;
        this.q = (short) (this.q | 8);
    }

    public final void j(int i) {
        this.d = i;
        this.q = (short) (this.q | 2);
    }

    public final void k(int i) {
        this.e = i;
        this.q = (short) (this.q | 4);
    }

    public final void l(int i) {
        this.b = i;
        this.q = (short) (this.q | 1);
    }

    public final void m(boolean z) {
        this.p = z;
        this.q = (short) (this.q | 4096);
    }

    public final void n(float f) {
        this.h = f;
        this.q = (short) (this.q | 32);
    }

    public final void o(float f) {
        this.i = f;
        this.q = (short) (this.q | 64);
    }

    public final void p(uke ukeVar) {
        ukeVar.getClass();
        this.c = ukeVar;
    }

    public final void q(yfq yfqVar) {
        yfqVar.getClass();
        this.n = yfqVar;
    }
}
