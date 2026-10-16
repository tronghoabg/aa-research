package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes3.dex */
final class udz {
    public boolean A;
    public String B;
    public ujq C;
    public trt D;
    public boolean E;
    public long F;
    public int G = Alert.DURATION_SHOW_INDEFINITELY;
    public wnq H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    public abcs a;
    public abcs b;
    public int c;
    public long d;
    public toc e;
    public String f;
    public udw g;
    public yfq h;
    public String i;
    public ucr j;
    public float k;
    public float l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public abky r;
    public int s;
    public abcy t;
    public boolean u;
    public boolean v;
    public abki w;
    public boolean x;
    public boolean y;
    public abjt z;

    public udz(ueb uebVar) {
        uat uatVar = (uat) uebVar;
        this.a = uatVar.a;
        this.b = uatVar.b;
        this.c = uatVar.c;
        this.d = uatVar.d;
        this.e = uatVar.e;
        this.f = uatVar.f;
        this.g = uatVar.g;
        this.I = uatVar.h;
        this.h = uatVar.i;
        this.i = uatVar.j;
        this.j = uatVar.k;
        this.k = uatVar.l;
        this.l = uatVar.m;
        this.W = uatVar.U;
        this.J = uatVar.n;
        this.K = uatVar.o;
        this.L = uatVar.p;
        this.M = uatVar.q;
        this.N = uatVar.r;
        this.m = uatVar.s;
        this.O = uatVar.t;
        this.P = uatVar.u;
        this.Q = uatVar.v;
        this.R = uatVar.w;
        this.n = uatVar.x;
        this.o = uatVar.y;
        this.p = uatVar.z;
        this.q = uatVar.A;
        this.r = uatVar.B;
        this.H = uatVar.V;
        this.s = uatVar.C;
        this.t = uatVar.D;
        this.S = uatVar.E;
        this.u = uatVar.F;
        this.v = uatVar.G;
        this.w = uatVar.H;
        this.T = uatVar.I;
        this.x = uatVar.J;
        this.U = uatVar.K;
        this.y = uatVar.L;
        this.z = uatVar.M;
        this.V = uatVar.N;
        this.A = uatVar.O;
        this.B = uatVar.P;
        this.C = uatVar.Q;
        this.D = uatVar.R;
        this.E = uatVar.S;
        this.F = uatVar.T;
    }

    public final ueb a() {
        abcs abcsVar;
        toc tocVar;
        String str;
        yfq yfqVar;
        String str2;
        ucr ucrVar;
        int i;
        abcy abcyVar;
        if (this.G != Integer.MAX_VALUE || (abcsVar = this.a) == null || (tocVar = this.e) == null || (str = this.f) == null || (yfqVar = this.h) == null || (str2 = this.i) == null || (ucrVar = this.j) == null || (i = this.W) == 0 || (abcyVar = this.t) == null) {
            throw new IllegalStateException();
        }
        return new uat(abcsVar, this.b, this.c, this.d, tocVar, str, this.g, this.I, yfqVar, str2, ucrVar, this.k, this.l, i, this.J, this.K, this.L, this.M, this.N, this.m, this.O, this.P, this.Q, this.R, this.n, this.o, this.p, this.q, this.r, this.H, this.s, abcyVar, this.S, this.u, this.v, this.w, this.T, this.x, this.U, this.y, this.z, this.V, this.A, this.B, this.C, this.D, this.E, this.F);
    }

    public final void b(int i) {
        if (i == 0) {
            throw null;
        }
        this.W = i;
    }

    public final void c(boolean z) {
        this.T = z;
        this.G |= 8388608;
    }

    public final void d(boolean z) {
        this.S = z;
        this.G |= 1048576;
    }

    public final void e(boolean z) {
        this.N = z;
        this.G |= sk.AUDIO_CONTENT_BUFFER_SIZE;
    }

    public final void f(boolean z) {
        this.U = z;
        this.G |= 33554432;
    }

    public final void g(boolean z) {
        this.P = z;
        this.G |= 4096;
    }

    public final void h(boolean z) {
        this.J = z;
        this.G |= 32;
    }

    public final void i(boolean z) {
        this.M = z;
        this.G |= 256;
    }

    public final void j(boolean z) {
        this.V = z;
        this.G |= 134217728;
    }

    public final void k(boolean z) {
        this.I = z;
        this.G |= 4;
    }

    public final void l(boolean z) {
        this.K = z;
        this.G |= 64;
    }

    public final void m(boolean z) {
        this.L = z;
        this.G |= 128;
    }

    public final void n(boolean z) {
        this.R = z;
        this.G |= 16384;
    }

    public final void o(boolean z) {
        this.O = z;
        this.G |= 2048;
    }

    public final void p(boolean z) {
        this.Q = z;
        this.G |= 8192;
    }
}
