package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cks implements dlg {
    public int a;
    public float e;
    public float f;
    public float g;
    public float j;
    public float k;
    public float l;
    public boolean p;
    public ckr v;
    public ckm x;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public long h = -72057594037927936L;
    public long i = -72057594037927936L;
    public float m = 8.0f;
    public long n = roc.aA(0.5f, 0.5f);
    public ckv o = ckq.a;
    public int q = 0;
    public long r = 9205357640488583168L;
    public ckg s = ckg.a;
    public dlg t = new dlh(1.0f, 1.0f);
    public dlr u = dlr.a;
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

    public final void C(ckv ckvVar) {
        if (affa.f(this.o, ckvVar)) {
            return;
        }
        this.a |= 8192;
        this.o = ckvVar;
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

    @Override // defpackage.dlg
    public final float a() {
        return this.t.a();
    }

    @Override // defpackage.dlm
    public final float b() {
        return this.t.b();
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float eA(float f) {
        return f * a();
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eE(long j) {
        throw null;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ int eF(float f) {
        return dlf.l(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eG(long j) {
        return dlf.m(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eH(long j) {
        return dlf.n(this, j);
    }

    @Override // defpackage.dlm
    public final /* synthetic */ long eI(float f) {
        return dln.d(this, f);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ long eJ(float f) {
        return dln.d(this, (f / a()) + BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.dlm
    public final /* synthetic */ float ew(long j) {
        return dln.c(this, j);
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ex(float f) {
        return (f / a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ey(int i) {
        return (i / a()) + BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.dlg
    public final /* synthetic */ float ez(long j) {
        return dlf.k(this, j);
    }

    public final void n() {
        z(1.0f);
        A(1.0f);
        o(1.0f);
        F(BitmapDescriptorFactory.HUE_RED);
        G(BitmapDescriptorFactory.HUE_RED);
        B(BitmapDescriptorFactory.HUE_RED);
        p(-72057594037927936L);
        D(-72057594037927936L);
        w(BitmapDescriptorFactory.HUE_RED);
        x(BitmapDescriptorFactory.HUE_RED);
        y(BitmapDescriptorFactory.HUE_RED);
        r(8.0f);
        E(roc.aA(0.5f, 0.5f));
        C(ckq.a);
        s(false);
        v(null);
        q(3);
        t(0);
        u(ckg.a);
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

    public final void u(ckg ckgVar) {
        if (affa.f(this.s, ckgVar)) {
            return;
        }
        this.a |= 1048576;
        this.s = ckgVar;
    }

    public final void v(ckr ckrVar) {
        if (affa.f(this.v, ckrVar)) {
            return;
        }
        this.a |= 131072;
        this.v = ckrVar;
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
        this.a |= sk.AUDIO_CONTENT_BUFFER_SIZE;
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
