package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public class dpp implements dpw {
    public Object a;
    public float ab;
    public float ac;
    public dpu ad;
    public dpu ae;
    public Object af;
    public dqn ag;
    public final HashMap ah;
    public HashMap ai;
    public dpe aj;
    final dpz b;
    public dqd c = null;
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
    protected Object J = null;
    public Object K = null;
    public Object L = null;
    protected Object M = null;
    protected Object N = null;
    protected Object O = null;
    protected Object P = null;
    protected Object Q = null;
    protected Object R = null;
    protected Object S = null;
    public Object T = null;
    protected Object U = null;
    protected Object V = null;
    public Object W = null;
    Object X = null;
    public Object Y = null;
    public Object Z = null;
    public Object aa = null;
    public int ak = 0;

    public dpp(dpz dpzVar) {
        Object obj = dpu.b;
        this.ad = dpu.b(obj);
        this.ae = dpu.b(obj);
        this.ah = new HashMap();
        this.ai = new HashMap();
        this.aj = null;
        this.b = dpzVar;
    }

    private final void x(dqn dqnVar, Object obj, int i) {
        dqn dqnVarB = obj instanceof dpw ? ((dpw) obj).b() : null;
        if (dqnVarB == null) {
            return;
        }
        int i2 = i - 1;
        int i3 = dpo.b;
        if (i2 == 19) {
            dqnVar.r(dqnVarB, this.ab, (int) this.ac);
            return;
        }
        switch (i2) {
            case 0:
                dqnVar.U(2).l(dqnVarB.U(2), this.j, this.p, false);
                break;
            case 1:
                dqnVar.U(2).l(dqnVarB.U(4), this.j, this.p, false);
                break;
            case 2:
                dqnVar.U(4).l(dqnVarB.U(2), this.k, this.q, false);
                break;
            case 3:
                dqnVar.U(4).l(dqnVarB.U(4), this.k, this.q, false);
                break;
            case 4:
                dqnVar.U(2).l(dqnVarB.U(2), this.l, this.r, false);
                break;
            case 5:
                dqnVar.U(2).l(dqnVarB.U(4), this.l, this.r, false);
                break;
            case 6:
                dqnVar.U(4).l(dqnVarB.U(2), this.m, this.s, false);
                break;
            case 7:
                dqnVar.U(4).l(dqnVarB.U(4), this.m, this.s, false);
                break;
            case 8:
                dqnVar.U(3).l(dqnVarB.U(3), this.n, this.t, false);
                break;
            case 9:
                dqnVar.U(3).l(dqnVarB.U(5), this.n, this.t, false);
                break;
            case 10:
                dqnVar.Z(3, dqnVarB, 6, this.n, this.t);
                break;
            case 11:
                dqnVar.U(5).l(dqnVarB.U(3), this.o, this.u, false);
                break;
            case 12:
                dqnVar.U(5).l(dqnVarB.U(5), this.o, this.u, false);
                break;
            case 13:
                dqnVar.Z(5, dqnVarB, 6, this.o, this.u);
                break;
            case 14:
                dqnVar.Z(6, dqnVarB, 6, this.v, this.w);
                break;
            case 15:
                dqnVar.Z(6, dqnVarB, 3, this.v, this.w);
                break;
            case 16:
                dqnVar.Z(6, dqnVarB, 5, this.v, this.w);
                break;
        }
    }

    @Override // defpackage.dpw
    public final dqd a() {
        return this.c;
    }

    @Override // defpackage.dpw
    public dqn b() {
        dqn dqnVar = this.ag;
        if (dqnVar != null) {
            return dqnVar;
        }
        dqn dqnVar2 = new dqn(this.ad.j, this.ae.j);
        this.ag = dqnVar2;
        dqnVar2.aq = this.af;
        return dqnVar2;
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof dpp) ? (dpw) this.b.c.get(obj) : obj;
    }

    @Override // defpackage.dpw
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.dpw
    public void e() {
        if (this.ag == null) {
            return;
        }
        dqd dqdVar = this.c;
        if (dqdVar != null) {
            dqdVar.e();
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
        dqn dqnVar = this.ag;
        dqnVar.ao = this.h;
        dqnVar.ap = this.i;
        dqa dqaVar = dqnVar.u;
        dqaVar.f = this.x;
        dqaVar.g = this.y;
        dqaVar.h = this.z;
        dqaVar.i = this.A;
        dqaVar.j = this.B;
        dqaVar.k = this.C;
        dqaVar.l = this.D;
        dqaVar.m = this.E;
        dqaVar.n = this.G;
        dqaVar.o = this.H;
        dqaVar.p = this.F;
        int i3 = this.I;
        dqaVar.q = i3;
        dqnVar.ar = i3;
        dqaVar.s = this.aj;
        HashMap map = this.ah;
        for (String str : map.keySet()) {
            Integer num = (Integer) map.get(str);
            dqa dqaVar2 = this.ag.u;
            int iIntValue = num.intValue();
            HashMap map2 = dqaVar2.r;
            if (map2.containsKey(str)) {
                ((dpc) map2.get(str)).b = iIntValue;
            } else {
                map2.put(str, new dpc(str, iIntValue));
            }
        }
        HashMap map3 = this.ai;
        if (map3 != null) {
            for (String str2 : map3.keySet()) {
                float fFloatValue = ((Float) this.ai.get(str2)).floatValue();
                HashMap map4 = this.ag.u.r;
                if (map4.containsKey(str2)) {
                    ((dpc) map4.get(str2)).c = fFloatValue;
                } else {
                    map4.put(str2, new dpc(str2, fFloatValue));
                }
            }
        }
    }

    @Override // defpackage.dpw
    public final void f(dqn dqnVar) {
        if (dqnVar == null) {
            return;
        }
        this.ag = dqnVar;
        dqnVar.aq = this.af;
    }

    public final void g(dqd dqdVar) {
        this.c = dqdVar;
        f(dqdVar.b());
    }

    public final void h(Object obj) {
        this.ak = 15;
        this.X = obj;
    }

    public final void i(Object obj) {
        this.ak = 13;
        this.V = obj;
    }

    public final void j(Object obj) {
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

    public final void l(Object obj) {
        this.ak = 8;
        this.Q = obj;
    }

    public final void m(Object obj) {
        this.ak = 7;
        this.P = obj;
    }

    public final void n(Object obj) {
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

    public final void q(Object obj) {
        p(this.b.a(obj));
    }

    public final void r(Object obj) {
        this.ak = 4;
        this.M = obj;
    }

    public final void s(Object obj) {
        this.ak = 6;
        this.O = obj;
    }

    public final void t(Object obj) {
        this.ak = 5;
        this.N = obj;
    }

    public final void u(Object obj) {
        this.ak = 10;
        this.S = obj;
    }

    public final void v(Object obj) {
        this.ak = 9;
        this.R = obj;
    }

    public void w(Object obj) {
        o(this.b.a(obj));
    }
}
