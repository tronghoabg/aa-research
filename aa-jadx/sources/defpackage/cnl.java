package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cnl extends defpackage.col {
    public final java.util.List a = new java.util.ArrayList();
    public boolean b = true;
    public long c;
    public defpackage.affc d;
    private float[] e;
    private java.util.List f;
    private boolean g;
    private final defpackage.affc h;
    private java.lang.String i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private boolean q;
    private defpackage.cju r;

    public cnl() {
        float[] fArr = defpackage.clr.a;
        this.c = defpackage.cjv.k(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, defpackage.clr.u);
        this.f = defpackage.cov.a;
        this.g = true;
        this.h = new defpackage.chq(this, 7);
        this.i = "";
        this.m = 1.0f;
        this.n = 1.0f;
        this.q = true;
    }

    private final void r() {
        this.b = false;
        float[] fArr = defpackage.clr.a;
        this.c = defpackage.cjv.k(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, defpackage.clr.u);
    }

    private final void s(defpackage.cka ckaVar) {
        if (this.b && ckaVar != null) {
            if (ckaVar instanceof defpackage.clf) {
                t(((defpackage.clf) ckaVar).a);
            } else {
                r();
            }
        }
    }

    private final void t(long j) {
        if (this.b && j != 16) {
            long j2 = this.c;
            if (j2 == 16) {
                this.c = j;
            } else {
                if (defpackage.ckd.d(j2) == defpackage.ckd.d(j) && defpackage.ckd.c(j2) == defpackage.ckd.c(j) && defpackage.ckd.b(j2) == defpackage.ckd.b(j)) {
                    return;
                }
                r();
            }
        }
    }

    private final boolean u() {
        return !this.f.isEmpty();
    }

    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.col
    public final defpackage.affc b() {
        return this.d;
    }

    @Override // defpackage.col
    public final void c(defpackage.cml cmlVar) {
        if (this.q) {
            float[] fArrE = this.e;
            if (fArrE == null) {
                fArrE = defpackage.ckq.e();
                this.e = fArrE;
            } else {
                defpackage.ckq.c(fArrE);
            }
            defpackage.ckq.g(fArrE, this.o + this.k, this.p + this.l);
            double d = ((double) this.j) * 0.017453292519943295d;
            float fSin = (float) java.lang.Math.sin(d);
            float fCos = (float) java.lang.Math.cos(d);
            float f = fArrE[0];
            float f2 = fCos * f;
            float f3 = fArrE[4];
            float f4 = fSin * f3;
            float f5 = -fSin;
            float f6 = fArrE[1];
            float f7 = fCos * f6;
            float f8 = fArrE[5];
            float f9 = fSin * f8;
            float f10 = fArrE[2];
            float f11 = fCos * f10;
            float f12 = fArrE[6];
            float f13 = fSin * f12;
            float f14 = fArrE[3];
            float f15 = fArrE[7];
            fArrE[0] = f2 + f4;
            fArrE[1] = f7 + f9;
            fArrE[2] = f11 + f13;
            fArrE[3] = (fCos * f14) + (fSin * f15);
            fArrE[4] = (f * f5) + (f3 * fCos);
            fArrE[5] = (f6 * f5) + (f8 * fCos);
            fArrE[6] = (f10 * f5) + (f12 * fCos);
            fArrE[7] = (f5 * f14) + (fCos * f15);
            defpackage.ckq.f(fArrE, this.m, this.n);
            defpackage.ckq.g(fArrE, -this.k, -this.l);
            this.q = false;
        }
        if (this.g) {
            if (u()) {
                defpackage.cju cjuVar = this.r;
                if (cjuVar == null) {
                    cjuVar = new defpackage.cju((byte[]) null);
                    this.r = cjuVar;
                }
                defpackage.dai.Q(this.f, cjuVar);
            }
            this.g = false;
        }
        defpackage.cmi cmiVarR = cmlVar.r();
        long jA = cmiVarR.a();
        cmiVarR.b().g();
        try {
            defpackage.izq izqVar = cmiVarR.c;
            float[] fArr = this.e;
            if (fArr != null) {
                ((defpackage.cmi) izqVar.a).b().b(new defpackage.ckq(fArr).a);
            }
            defpackage.cju cjuVar2 = this.r;
            if (u() && cjuVar2 != null) {
                izqVar.m(cjuVar2);
            }
            java.util.List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.col) list.get(i)).c(cmlVar);
            }
        } finally {
            cmiVarR.b().e();
            cmiVarR.h(jA);
        }
    }

    public final void d(int i, defpackage.col colVar) {
        int iA = a();
        java.util.List list = this.a;
        if (i < iA) {
            list.set(i, colVar);
        } else {
            list.add(colVar);
        }
        e(colVar);
        colVar.h(this.h);
        q();
    }

    public final void e(defpackage.col colVar) {
        if (colVar instanceof defpackage.cnp) {
            defpackage.cnp cnpVar = (defpackage.cnp) colVar;
            s(cnpVar.a);
            s(cnpVar.b);
        } else if (colVar instanceof defpackage.cnl) {
            defpackage.cnl cnlVar = (defpackage.cnl) colVar;
            if (cnlVar.b && this.b) {
                t(cnlVar.c);
            } else {
                r();
            }
        }
    }

    public final void f(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            java.util.List list = this.a;
            if (i < list.size()) {
                ((defpackage.col) list.get(i)).h(null);
                list.remove(i);
            }
        }
        q();
    }

    public final void g(java.util.List list) {
        this.f = list;
        this.g = true;
        q();
    }

    @Override // defpackage.col
    public final void h(defpackage.affc affcVar) {
        this.d = affcVar;
    }

    public final void i(java.lang.String str) {
        this.i = str;
        q();
    }

    public final void j(float f) {
        this.k = f;
        this.q = true;
        q();
    }

    public final void k(float f) {
        this.l = f;
        this.q = true;
        q();
    }

    public final void l(float f) {
        this.j = f;
        this.q = true;
        q();
    }

    public final void m(float f) {
        this.m = f;
        this.q = true;
        q();
    }

    public final void n(float f) {
        this.n = f;
        this.q = true;
        q();
    }

    public final void o(float f) {
        this.o = f;
        this.q = true;
        q();
    }

    public final void p(float f) {
        this.p = f;
        this.q = true;
        q();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VGroup: ");
        sb.append(this.i);
        java.util.List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.col colVar = (defpackage.col) list.get(i);
            sb.append("\t");
            sb.append(colVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
