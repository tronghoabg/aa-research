package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class dpx implements defpackage.dqe {
    public java.lang.Object a;
    public float ab;
    public float ac;
    public defpackage.dqc ad;
    public defpackage.dqc ae;
    public java.lang.Object af;
    public defpackage.dqv ag;
    public final java.util.HashMap ah;
    public java.util.HashMap ai;
    public defpackage.dpm aj;
    final defpackage.dqh b;
    public defpackage.dql c = null;
    public int d = 0;
    public int e = 0;
    public float f = -1.0f;
    public float g = -1.0f;
    public float h = 0.5f;
    public float i = 0.5f;
    protected int j = 0;
    protected int k = 0;
    protected int l = 0;
    protected int m = 0;
    protected int n = 0;
    protected int o = 0;
    protected int p = 0;
    protected int q = 0;
    protected int r = 0;
    protected int s = 0;
    protected int t = 0;
    protected int u = 0;
    int v = 0;
    int w = 0;
    public float x = Float.NaN;
    public float y = Float.NaN;
    public float z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public int I = 0;
    protected java.lang.Object J = null;
    public java.lang.Object K = null;
    public java.lang.Object L = null;
    protected java.lang.Object M = null;
    protected java.lang.Object N = null;
    protected java.lang.Object O = null;
    protected java.lang.Object P = null;
    protected java.lang.Object Q = null;
    protected java.lang.Object R = null;
    protected java.lang.Object S = null;
    public java.lang.Object T = null;
    protected java.lang.Object U = null;
    protected java.lang.Object V = null;
    public java.lang.Object W = null;
    java.lang.Object X = null;
    public java.lang.Object Y = null;
    public java.lang.Object Z = null;
    public java.lang.Object aa = null;
    public int ak = 0;

    public dpx(defpackage.dqh dqhVar) {
        java.lang.Object obj = defpackage.dqc.b;
        this.ad = defpackage.dqc.b(obj);
        this.ae = defpackage.dqc.b(obj);
        this.ah = new java.util.HashMap();
        this.ai = new java.util.HashMap();
        this.aj = null;
        this.b = dqhVar;
    }

    private final void x(defpackage.dqv dqvVar, java.lang.Object obj, int i) {
        defpackage.dqv dqvVarB = obj instanceof defpackage.dqe ? ((defpackage.dqe) obj).b() : null;
        if (dqvVarB == null) {
            return;
        }
        int i2 = i - 1;
        int i3 = defpackage.dpw.b;
        if (i2 == 19) {
            dqvVar.r(dqvVarB, this.ab, (int) this.ac);
            return;
        }
        switch (i2) {
            case 0:
                dqvVar.U(2).l(dqvVarB.U(2), this.j, this.p, false);
                break;
            case 1:
                dqvVar.U(2).l(dqvVarB.U(4), this.j, this.p, false);
                break;
            case 2:
                dqvVar.U(4).l(dqvVarB.U(2), this.k, this.q, false);
                break;
            case 3:
                dqvVar.U(4).l(dqvVarB.U(4), this.k, this.q, false);
                break;
            case 4:
                dqvVar.U(2).l(dqvVarB.U(2), this.l, this.r, false);
                break;
            case 5:
                dqvVar.U(2).l(dqvVarB.U(4), this.l, this.r, false);
                break;
            case 6:
                dqvVar.U(4).l(dqvVarB.U(2), this.m, this.s, false);
                break;
            case 7:
                dqvVar.U(4).l(dqvVarB.U(4), this.m, this.s, false);
                break;
            case 8:
                dqvVar.U(3).l(dqvVarB.U(3), this.n, this.t, false);
                break;
            case 9:
                dqvVar.U(3).l(dqvVarB.U(5), this.n, this.t, false);
                break;
            case 10:
                dqvVar.Z(3, dqvVarB, 6, this.n, this.t);
                break;
            case 11:
                dqvVar.U(5).l(dqvVarB.U(3), this.o, this.u, false);
                break;
            case 12:
                dqvVar.U(5).l(dqvVarB.U(5), this.o, this.u, false);
                break;
            case 13:
                dqvVar.Z(5, dqvVarB, 6, this.o, this.u);
                break;
            case 14:
                dqvVar.Z(6, dqvVarB, 6, this.v, this.w);
                break;
            case 15:
                dqvVar.Z(6, dqvVarB, 3, this.v, this.w);
                break;
            case 16:
                dqvVar.Z(6, dqvVarB, 5, this.v, this.w);
                break;
        }
    }

    @Override // defpackage.dqe
    public final defpackage.dql a() {
        return this.c;
    }

    @Override // defpackage.dqe
    public defpackage.dqv b() {
        defpackage.dqv dqvVar = this.ag;
        if (dqvVar != null) {
            return dqvVar;
        }
        defpackage.dqv dqvVar2 = new defpackage.dqv(this.ad.j, this.ae.j);
        this.ag = dqvVar2;
        dqvVar2.aq = this.af;
        return dqvVar2;
    }

    public final java.lang.Object c(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof defpackage.dpx) ? (defpackage.dqe) this.b.c.get(obj) : obj;
    }

    @Override // defpackage.dqe
    public final java.lang.Object d() {
        return this.a;
    }

    @Override // defpackage.dqe
    public void e() {
        if (this.ag == null) {
            return;
        }
        defpackage.dql dqlVar = this.c;
        if (dqlVar != null) {
            dqlVar.e();
        }
        this.ad.d(this.ag, 0);
        this.ae.d(this.ag, 1);
        this.J = c(this.J);
        this.K = c(this.K);
        this.L = c(this.L);
        this.M = c(this.M);
        this.N = c(this.N);
        this.O = c(this.O);
        this.P = c(this.P);
        this.Q = c(this.Q);
        this.R = c(this.R);
        this.S = c(this.S);
        this.U = c(this.U);
        this.V = c(this.V);
        this.X = c(this.X);
        this.Y = c(this.Y);
        this.Z = c(this.Z);
        x(this.ag, this.J, 1);
        x(this.ag, this.K, 2);
        x(this.ag, this.L, 3);
        x(this.ag, this.M, 4);
        x(this.ag, this.N, 5);
        x(this.ag, this.O, 6);
        x(this.ag, this.P, 7);
        x(this.ag, this.Q, 8);
        x(this.ag, this.R, 9);
        x(this.ag, this.S, 10);
        x(this.ag, this.T, 11);
        x(this.ag, this.U, 12);
        x(this.ag, this.V, 13);
        x(this.ag, this.W, 14);
        x(this.ag, this.X, 15);
        x(this.ag, this.Y, 16);
        x(this.ag, this.Z, 17);
        x(this.ag, this.aa, 20);
        int i = this.d;
        if (i != 0) {
            this.ag.at = i;
        }
        int i2 = this.e;
        if (i2 != 0) {
            this.ag.au = i2;
        }
        float f = this.f;
        if (f != -1.0f) {
            this.ag.D(f);
        }
        float f2 = this.g;
        if (f2 != -1.0f) {
            this.ag.L(f2);
        }
        defpackage.dqv dqvVar = this.ag;
        dqvVar.ao = this.h;
        dqvVar.ap = this.i;
        defpackage.dqi dqiVar = dqvVar.u;
        dqiVar.f = this.x;
        dqiVar.g = this.y;
        dqiVar.h = this.z;
        dqiVar.i = this.A;
        dqiVar.j = this.B;
        dqiVar.k = this.C;
        dqiVar.l = this.D;
        dqiVar.m = this.E;
        dqiVar.n = this.G;
        dqiVar.o = this.H;
        dqiVar.p = this.F;
        int i3 = this.I;
        dqiVar.q = i3;
        dqvVar.ar = i3;
        dqiVar.s = this.aj;
        java.util.HashMap map = this.ah;
        for (java.lang.String str : map.keySet()) {
            java.lang.Integer num = (java.lang.Integer) map.get(str);
            defpackage.dqi dqiVar2 = this.ag.u;
            int iIntValue = num.intValue();
            java.util.HashMap map2 = dqiVar2.r;
            if (map2.containsKey(str)) {
                ((defpackage.dpk) map2.get(str)).b = iIntValue;
            } else {
                map2.put(str, new defpackage.dpk(str, iIntValue));
            }
        }
        java.util.HashMap map3 = this.ai;
        if (map3 != null) {
            for (java.lang.String str2 : map3.keySet()) {
                float fFloatValue = ((java.lang.Float) this.ai.get(str2)).floatValue();
                java.util.HashMap map4 = this.ag.u.r;
                if (map4.containsKey(str2)) {
                    ((defpackage.dpk) map4.get(str2)).c = fFloatValue;
                } else {
                    map4.put(str2, new defpackage.dpk(str2, fFloatValue));
                }
            }
        }
    }

    @Override // defpackage.dqe
    public final void f(defpackage.dqv dqvVar) {
        if (dqvVar == null) {
            return;
        }
        this.ag = dqvVar;
        dqvVar.aq = this.af;
    }

    public final void g(defpackage.dql dqlVar) {
        this.c = dqlVar;
        f(dqlVar.b());
    }

    public final void h(java.lang.Object obj) {
        this.ak = 15;
        this.X = obj;
    }

    public final void i(java.lang.Object obj) {
        this.ak = 13;
        this.V = obj;
    }

    public final void j(java.lang.Object obj) {
        this.ak = 12;
        this.U = obj;
    }

    public final void k() {
        int i = this.ak;
        if (i == 0) {
            this.J = null;
            this.K = null;
            this.j = 0;
            this.L = null;
            this.M = null;
            this.k = 0;
            this.N = null;
            this.O = null;
            this.l = 0;
            this.P = null;
            this.Q = null;
            this.m = 0;
            this.R = null;
            this.S = null;
            this.n = 0;
            this.U = null;
            this.V = null;
            this.o = 0;
            this.X = null;
            this.aa = null;
            this.h = 0.5f;
            this.i = 0.5f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            return;
        }
        int i2 = i - 1;
        if (i2 == 19) {
            this.aa = null;
            return;
        }
        switch (i2) {
            case 0:
            case 1:
                this.J = null;
                this.K = null;
                this.j = 0;
                this.p = 0;
                break;
            case 2:
            case 3:
                this.L = null;
                this.M = null;
                this.k = 0;
                this.q = 0;
                break;
            case 4:
            case 5:
                this.N = null;
                this.O = null;
                this.l = 0;
                this.r = 0;
                break;
            case 6:
            case 7:
                this.P = null;
                this.Q = null;
                this.m = 0;
                this.s = 0;
                break;
            case 8:
            case 9:
            case 10:
                this.R = null;
                this.S = null;
                this.T = null;
                this.n = 0;
                this.t = 0;
                break;
            case 11:
            case 12:
            case 13:
                this.U = null;
                this.V = null;
                this.W = null;
                this.o = 0;
                this.u = 0;
                break;
            case 14:
                this.X = null;
                break;
        }
    }

    public final void l(java.lang.Object obj) {
        this.ak = 8;
        this.Q = obj;
    }

    public final void m(java.lang.Object obj) {
        this.ak = 7;
        this.P = obj;
    }

    public final void n(java.lang.Object obj) {
        this.ak = 1;
        this.J = obj;
    }

    public void o(int i) {
        int i2 = this.ak;
        if (i2 == 0) {
            this.j = i;
            this.k = i;
            this.l = i;
            this.m = i;
            this.n = i;
            this.o = i;
            return;
        }
        int i3 = i2 - 1;
        if (i3 == 19) {
            this.ac = i;
            return;
        }
        switch (i3) {
            case 0:
            case 1:
                this.j = i;
                break;
            case 2:
            case 3:
                this.k = i;
                break;
            case 4:
            case 5:
                this.l = i;
                break;
            case 6:
            case 7:
                this.m = i;
                break;
            case 8:
            case 9:
            case 10:
                this.n = i;
                break;
            case 11:
            case 12:
            case 13:
                this.o = i;
                break;
            case 14:
            case 15:
            case 16:
                this.v = i;
                break;
        }
    }

    public final void p(int i) {
        int i2 = this.ak;
        if (i2 == 0) {
            this.p = i;
            this.q = i;
            this.r = i;
            this.s = i;
            this.t = i;
            this.u = i;
            return;
        }
        switch (i2 - 1) {
            case 0:
            case 1:
                this.p = i;
                break;
            case 2:
            case 3:
                this.q = i;
                break;
            case 4:
            case 5:
                this.r = i;
                break;
            case 6:
            case 7:
                this.s = i;
                break;
            case 8:
            case 9:
            case 10:
                this.t = i;
                break;
            case 11:
            case 12:
            case 13:
                this.u = i;
                break;
            case 14:
            case 15:
            case 16:
                this.w = i;
                break;
        }
    }

    public final void q(java.lang.Object obj) {
        p(this.b.a(obj));
    }

    public final void r(java.lang.Object obj) {
        this.ak = 4;
        this.M = obj;
    }

    public final void s(java.lang.Object obj) {
        this.ak = 6;
        this.O = obj;
    }

    public final void t(java.lang.Object obj) {
        this.ak = 5;
        this.N = obj;
    }

    public final void u(java.lang.Object obj) {
        this.ak = 10;
        this.S = obj;
    }

    public final void v(java.lang.Object obj) {
        this.ak = 9;
        this.R = obj;
    }

    public void w(java.lang.Object obj) {
        o(this.b.a(obj));
    }
}
