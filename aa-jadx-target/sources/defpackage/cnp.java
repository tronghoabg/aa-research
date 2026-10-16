package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cnp extends defpackage.col {
    public defpackage.cka a;
    public defpackage.cka b;
    private float f;
    private float j;
    private float l;
    private boolean o;
    private defpackage.cmo p;
    private final defpackage.afar q;
    private final defpackage.cju r;
    private defpackage.cju s;
    private defpackage.cju t;
    private float c = 1.0f;
    private java.util.List d = defpackage.cov.a;
    private float e = 1.0f;
    private int g = 0;
    private int h = 0;
    private float i = 4.0f;
    private float k = 1.0f;
    private boolean m = true;
    private boolean n = true;

    public cnp() {
        defpackage.cju cjuVar = new defpackage.cju((byte[]) null);
        this.r = cjuVar;
        this.s = cjuVar;
        this.q = defpackage.afga.cB(3, new defpackage.con(1));
    }

    private final void r() {
        if (this.j == 0.0f && this.k == 1.0f) {
            this.s = this.r;
            return;
        }
        defpackage.cju cjuVar = this.s;
        defpackage.cju cjuVar2 = this.r;
        if (defpackage.afga.f(cjuVar, cjuVar2)) {
            this.s = new defpackage.cju((byte[]) null);
        } else {
            int iA = this.s.a();
            this.s.l();
            this.s.m(iA);
        }
        s().h(cjuVar2);
        float f = s().f();
        float f2 = this.j;
        float f3 = this.l;
        float f4 = ((f2 + f3) % 1.0f) * f;
        float f5 = ((this.k + f3) % 1.0f) * f;
        if (f4 <= f5) {
            s().g(f4, f5, this.s);
            return;
        }
        defpackage.cju cjuVar3 = this.t;
        if (cjuVar3 == null) {
            cjuVar3 = new defpackage.cju((byte[]) null);
            this.t = cjuVar3;
        }
        cjuVar3.k();
        s().g(f4, f, cjuVar3);
        this.s.p(cjuVar3);
        cjuVar3.k();
        s().g(0.0f, f5, cjuVar3);
        this.s.p(cjuVar3);
    }

    private final defpackage.sr s() {
        return (defpackage.sr) this.q.a();
    }

    public final void a(defpackage.cka ckaVar) {
        this.a = ckaVar;
        q();
    }

    @Override // defpackage.col
    public final void c(defpackage.cml cmlVar) {
        defpackage.cml cmlVar2;
        defpackage.cmo cmoVar;
        if (this.m) {
            defpackage.dai.Q(this.d, this.r);
            r();
        } else if (this.o) {
            r();
        }
        this.m = false;
        this.o = false;
        defpackage.cka ckaVar = this.a;
        if (ckaVar != null) {
            cmlVar2 = cmlVar;
            defpackage.dai.aG(cmlVar2, this.s, ckaVar, this.c, null, 56);
        } else {
            cmlVar2 = cmlVar;
        }
        defpackage.cka ckaVar2 = this.b;
        if (ckaVar2 != null) {
            defpackage.cmo cmoVar2 = this.p;
            if (this.n || cmoVar2 == null) {
                defpackage.cmo cmoVar3 = new defpackage.cmo(this.f, this.i, this.g, this.h, 16);
                this.p = cmoVar3;
                this.n = false;
                cmoVar = cmoVar3;
            } else {
                cmoVar = cmoVar2;
            }
            defpackage.dai.aG(cmlVar2, this.s, ckaVar2, this.e, cmoVar, 48);
        }
    }

    public final void d(float f) {
        this.c = f;
        q();
    }

    public final void e(java.util.List list) {
        this.d = list;
        this.m = true;
        q();
    }

    public final void f(int i) {
        this.s.m(i);
        q();
    }

    public final void g(defpackage.cka ckaVar) {
        this.b = ckaVar;
        q();
    }

    public final void i(float f) {
        this.e = f;
        q();
    }

    public final void j(int i) {
        this.g = i;
        this.n = true;
        q();
    }

    public final void k(int i) {
        this.h = i;
        this.n = true;
        q();
    }

    public final void l(float f) {
        this.i = f;
        this.n = true;
        q();
    }

    public final void m(float f) {
        this.f = f;
        this.n = true;
        q();
    }

    public final void n(float f) {
        this.k = f;
        this.o = true;
        q();
    }

    public final void o(float f) {
        this.l = f;
        this.o = true;
        q();
    }

    public final void p(float f) {
        this.j = f;
        this.o = true;
        q();
    }

    public final java.lang.String toString() {
        return this.r.toString();
    }
}
