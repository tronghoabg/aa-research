package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bnl {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.bvm b = new defpackage.byu(new defpackage.bli(3));

    public static final long a(defpackage.bnk bnkVar, long j) {
        if (j == bnkVar.a) {
            return bnkVar.b;
        }
        if (j == bnkVar.f) {
            return bnkVar.g;
        }
        if (j == bnkVar.j) {
            return bnkVar.k;
        }
        if (j == bnkVar.n) {
            return bnkVar.o;
        }
        if (j == bnkVar.w) {
            return bnkVar.x;
        }
        if (j == bnkVar.c) {
            return bnkVar.d;
        }
        if (j == bnkVar.h) {
            return bnkVar.i;
        }
        if (j == bnkVar.l) {
            return bnkVar.m;
        }
        if (j == bnkVar.y) {
            return bnkVar.z;
        }
        if (j == bnkVar.u) {
            return bnkVar.v;
        }
        if (j == bnkVar.p) {
            return bnkVar.q;
        }
        if (j == bnkVar.r) {
            return bnkVar.s;
        }
        if (j == bnkVar.D) {
            return bnkVar.q;
        }
        if (j == bnkVar.F) {
            return bnkVar.q;
        }
        if (j == bnkVar.G) {
            return bnkVar.q;
        }
        if (j == bnkVar.H) {
            return bnkVar.q;
        }
        if (j == bnkVar.I) {
            return bnkVar.q;
        }
        if (j == bnkVar.J) {
            return bnkVar.q;
        }
        if (j == bnkVar.E) {
            return bnkVar.q;
        }
        if (j == bnkVar.K) {
            return bnkVar.M;
        }
        if (j == bnkVar.L) {
            return bnkVar.M;
        }
        if (j == bnkVar.O) {
            return bnkVar.Q;
        }
        if (j == bnkVar.P) {
            return bnkVar.Q;
        }
        if (j == bnkVar.S) {
            return bnkVar.U;
        }
        if (j == bnkVar.T) {
            return bnkVar.U;
        }
        float[] fArr = defpackage.clr.a;
        return defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
    }

    public static final long b(defpackage.bnk bnkVar, float f) {
        if (java.lang.Float.compare(f, 0.0f) == 0) {
            return bnkVar.p;
        }
        float fLog = (float) java.lang.Math.log(f + 1.0f);
        long j = bnkVar.t;
        float fD = defpackage.ckd.d(j);
        float fC = defpackage.ckd.c(j);
        float fB = defpackage.ckd.b(j);
        float[] fArr = defpackage.clr.a;
        return defpackage.cjv.m(defpackage.cjv.k(fD, fC, fB, ((fLog * 4.5f) + 2.0f) / 100.0f, defpackage.clr.y[(int) (j & 63)]), bnkVar.p);
    }

    public static final long c(defpackage.bnk bnkVar, long j, float f, defpackage.bve bveVar) {
        return (j == bnkVar.p && ((java.lang.Boolean) bveVar.f(b)).booleanValue()) ? b(bnkVar, f) : j;
    }

    public static final long d(long j, defpackage.bve bveVar) {
        bveVar.v(89373914);
        long jA = a(((defpackage.bol) bveVar.f(defpackage.bom.a)).a, j);
        if (jA == 16) {
            jA = ((defpackage.ckd) bveVar.f(defpackage.bnq.a)).a;
        }
        bveVar.o();
        return jA;
    }

    public static final long e(defpackage.bnk bnkVar, int i) {
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case defpackage.abnt.b /* 0 */:
                return bnkVar.n;
            case 1:
                return bnkVar.w;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return bnkVar.y;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return bnkVar.v;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return bnkVar.e;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return bnkVar.u;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return bnkVar.o;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return bnkVar.x;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return bnkVar.z;
            case 9:
                return bnkVar.b;
            case 10:
                return bnkVar.d;
            case 11:
                return bnkVar.M;
            case 12:
                return bnkVar.N;
            case 13:
                return bnkVar.g;
            case 14:
                return bnkVar.i;
            case 15:
                return bnkVar.Q;
            case 16:
                return bnkVar.R;
            case 17:
                return bnkVar.q;
            case 18:
                return bnkVar.s;
            case 19:
                return bnkVar.k;
            case 20:
                return bnkVar.m;
            case 21:
                return bnkVar.U;
            case 22:
            default:
                return bnkVar.V;
            case 23:
                return bnkVar.A;
            case 24:
                return bnkVar.B;
            case 25:
                return bnkVar.a;
            case 26:
                return bnkVar.c;
            case 27:
                return bnkVar.K;
            case 28:
                return bnkVar.L;
            case 29:
                return bnkVar.C;
            case 30:
                return bnkVar.f;
            case 31:
                return bnkVar.h;
            case 32:
                return bnkVar.O;
            case 33:
                return bnkVar.P;
            case 34:
                return bnkVar.p;
            case 35:
                return bnkVar.D;
            case 36:
                return bnkVar.F;
            case 37:
                return bnkVar.G;
            case 38:
                return bnkVar.H;
            case 39:
                return bnkVar.I;
            case 40:
                return bnkVar.J;
            case 41:
                return bnkVar.E;
            case 42:
                return bnkVar.t;
            case 43:
                return bnkVar.r;
        }
    }

    public static final long f(int i, defpackage.bve bveVar) {
        return e(((defpackage.bol) bveVar.f(defpackage.bom.a)).a, i);
    }
}
