package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cla implements defpackage.dlo {
    public int a;
    public float e;
    public float f;
    public float g;
    public float j;
    public float k;
    public float l;
    public boolean p;
    public defpackage.ckz v;
    public defpackage.cku x;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public long h = -72057594037927936L;
    public long i = -72057594037927936L;
    public float m = 8.0f;
    public long n = defpackage.tna.aK(0.5f, 0.5f);
    public defpackage.cld o = defpackage.cky.a;
    public int q = 0;
    public long r = 9205357640488583168L;
    public defpackage.cko s = defpackage.cko.a;
    public defpackage.dlo t = new defpackage.dlp(1.0f, 1.0f);
    public defpackage.dlz u = defpackage.dlz.a;
    public int w = 3;

    public final void A(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public final void B(float f) {
        if (this.g == f) {
            return;
        }
        this.a |= 32;
        this.g = f;
    }

    public final void C(defpackage.cld cldVar) {
        if (defpackage.afga.f(this.o, cldVar)) {
            return;
        }
        this.a |= 8192;
        this.o = cldVar;
    }

    public final void D(long j) {
        if (this.i == j) {
            return;
        }
        this.a |= 128;
        this.i = j;
    }

    public final void E(long j) {
        if (this.n == j) {
            return;
        }
        this.a |= 4096;
        this.n = j;
    }

    public final void F(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    public final void G(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }

    @Override // defpackage.dlo
    public final float a() {
        return this.t.a();
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.t.b();
    }

    @Override // defpackage.dlu
    public final /* synthetic */ float dE(long j) {
        return defpackage.dln.n(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dF(float f) {
        return (f / a()) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dG(int i) {
        return (i / a()) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dH(long j) {
        return defpackage.dln.p(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dI(float f) {
        return f * a();
    }

    @Override // defpackage.dlo
    public final /* synthetic */ int dM(long j) {
        throw null;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ int dN(float f) {
        return defpackage.dln.q(this, f);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dO(long j) {
        return defpackage.dln.r(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dP(long j) {
        return defpackage.dln.s(this, j);
    }

    @Override // defpackage.dlu
    public final /* synthetic */ long dQ(float f) {
        return defpackage.dln.o(this, f);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dR(float f) {
        return defpackage.dln.o(this, (f / a()) + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }

    public final void n() {
        z(1.0f);
        A(1.0f);
        o(1.0f);
        F(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        G(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        B(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        p(-72057594037927936L);
        D(-72057594037927936L);
        w(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        x(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        y(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        r(8.0f);
        E(defpackage.tna.aK(0.5f, 0.5f));
        C(defpackage.cky.a);
        s(false);
        v(null);
        q(3);
        t(0);
        u(defpackage.cko.a);
        this.r = 9205357640488583168L;
        this.x = null;
        this.a = 0;
    }

    public final void o(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    public final void p(long j) {
        if (this.h == j) {
            return;
        }
        this.a |= 64;
        this.h = j;
    }

    public final void q(int i) {
        if (this.w == i) {
            return;
        }
        this.a |= 524288;
        this.w = i;
    }

    public final void r(float f) {
        if (this.m == f) {
            return;
        }
        this.a |= 2048;
        this.m = f;
    }

    public final void s(boolean z) {
        if (this.p != z) {
            this.a |= 16384;
            this.p = z;
        }
    }

    public final void t(int i) {
        if (this.q == i) {
            return;
        }
        this.a |= 32768;
        this.q = i;
    }

    public final void u(defpackage.cko ckoVar) {
        if (defpackage.afga.f(this.s, ckoVar)) {
            return;
        }
        this.a |= 1048576;
        this.s = ckoVar;
    }

    public final void v(defpackage.ckz ckzVar) {
        if (defpackage.afga.f(this.v, ckzVar)) {
            return;
        }
        this.a |= 131072;
        this.v = ckzVar;
    }

    public final void w(float f) {
        if (this.j == f) {
            return;
        }
        this.a |= 256;
        this.j = f;
    }

    public final void x(float f) {
        if (this.k == f) {
            return;
        }
        this.a |= defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE;
        this.k = f;
    }

    public final void y(float f) {
        if (this.l == f) {
            return;
        }
        this.a |= 1024;
        this.l = f;
    }

    public final void z(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }
}
