package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class awj {
    public static final defpackage.aug a = new defpackage.aug(2, 1.0f);
    private static final defpackage.aug b = new defpackage.aug(1, 1.0f);
    private static final defpackage.aug c = new defpackage.aug(3, 1.0f);
    private static final defpackage.axa d = defpackage.asq.t(defpackage.cfs.k);
    private static final defpackage.axa e = defpackage.asq.t(defpackage.cfs.j);
    private static final defpackage.axa f = defpackage.asq.r(defpackage.cfs.n);
    private static final defpackage.axa g = defpackage.asq.r(defpackage.cfs.m);
    private static final defpackage.axa h = defpackage.asq.s(defpackage.cfs.e);
    private static final defpackage.axa i = defpackage.asq.s(defpackage.cfs.a);

    public static final defpackage.cgf a(defpackage.cgf cgfVar, float f2, float f3) {
        return cgfVar.a(new defpackage.awp(f2, f3));
    }

    public static final defpackage.cgf b(defpackage.cgf cgfVar, float f2) {
        return cgfVar.a(f2 == 1.0f ? b : new defpackage.aug(1, f2));
    }

    public static final defpackage.cgf c(defpackage.cgf cgfVar, float f2) {
        return cgfVar.a(f2 == 1.0f ? c : new defpackage.aug(3, f2));
    }

    public static final defpackage.cgf d(defpackage.cgf cgfVar, float f2) {
        return cgfVar.a(new defpackage.awi(Float.NaN, f2, Float.NaN, f2, true));
    }

    public static final defpackage.cgf e(defpackage.cgf cgfVar, float f2, float f3) {
        return cgfVar.a(new defpackage.awi(Float.NaN, f2, Float.NaN, f3, true));
    }

    public static final defpackage.cgf f(defpackage.cgf cgfVar, float f2) {
        return cgfVar.a(new defpackage.awi(Float.NaN, f2, Float.NaN, f2, false));
    }

    public static final defpackage.cgf g(defpackage.cgf cgfVar, float f2, float f3) {
        return cgfVar.a(new defpackage.awi(f2, f3, f2, f3, false));
    }

    public static final defpackage.cgf h(defpackage.cgf cgfVar, float f2) {
        return cgfVar.a(new defpackage.awi(f2, Float.NaN, f2, Float.NaN, false));
    }

    public static final defpackage.cgf i(defpackage.cgf cgfVar, float f2) {
        return cgfVar.a(new defpackage.awi(f2, f2, f2, f2, true));
    }

    public static final defpackage.cgf j(defpackage.cgf cgfVar, long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) + 0.0f;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + 0.0f;
        return cgfVar.a(new defpackage.awi(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2, true));
    }

    public static final defpackage.cgf k(defpackage.cgf cgfVar, float f2, float f3) {
        return cgfVar.a(new defpackage.awi(f2, f3, f2, f3, true));
    }

    public static final defpackage.cgf l(defpackage.cgf cgfVar, float f2, float f3, float f4, float f5) {
        return cgfVar.a(new defpackage.awi(f2, f3, f4, f5, true));
    }

    public static final defpackage.cgf m(defpackage.cgf cgfVar, float f2) {
        return cgfVar.a(new defpackage.awi(f2, Float.NaN, f2, Float.NaN, true));
    }

    public static final defpackage.cgf n(defpackage.cgf cgfVar, float f2, float f3) {
        return cgfVar.a(new defpackage.awi(f2, Float.NaN, f3, Float.NaN, true));
    }

    public static final defpackage.cgf o(defpackage.cgf cgfVar, defpackage.cfu cfuVar, boolean z) {
        defpackage.axa axaVar;
        if (!defpackage.afga.f(cfuVar, defpackage.cfs.e) || z) {
            axaVar = (!defpackage.afga.f(cfuVar, defpackage.cfs.a) || z) ? new defpackage.axa(3, z, new defpackage.amc(cfuVar, 5), cfuVar) : i;
        } else {
            axaVar = h;
        }
        return cgfVar.a(axaVar);
    }

    public static final defpackage.cgf p(defpackage.cgf cgfVar, defpackage.cfy cfyVar, boolean z) {
        defpackage.axa axaVar;
        if (!defpackage.afga.f(cfyVar, defpackage.cfs.n) || z) {
            axaVar = (!defpackage.afga.f(cfyVar, defpackage.cfs.m) || z) ? new defpackage.axa(1, z, new defpackage.amc(cfyVar, 4), cfyVar) : g;
        } else {
            axaVar = f;
        }
        return cgfVar.a(axaVar);
    }

    public static /* synthetic */ defpackage.cgf q(defpackage.cgf cgfVar, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return cgfVar.a(new defpackage.awp(f2, f3));
    }

    public static final defpackage.cgf r(defpackage.cgf cgfVar) {
        return cgfVar.a(a);
    }

    public static /* synthetic */ defpackage.cgf s(defpackage.cgf cgfVar, float f2, float f3, float f4, float f5, int i2) {
        float f6 = (i2 & 8) != 0 ? Float.NaN : f5;
        float f7 = (i2 & 4) != 0 ? Float.NaN : f4;
        return cgfVar.a(new defpackage.awi(1 != (i2 & 1) ? f2 : Float.NaN, (i2 & 2) != 0 ? Float.NaN : f3, f7, f6, false));
    }

    public static /* synthetic */ defpackage.cgf t(defpackage.cgf cgfVar, defpackage.cfy cfyVar, int i2) {
        if ((i2 & 1) != 0) {
            cfyVar = defpackage.cfs.n;
        }
        return p(cgfVar, cfyVar, false);
    }

    public static /* synthetic */ defpackage.cgf u(defpackage.cgf cgfVar, defpackage.cfu cfuVar, int i2) {
        if ((i2 & 1) != 0) {
            cfuVar = defpackage.cfs.e;
        }
        return o(cgfVar, cfuVar, false);
    }

    public static /* synthetic */ defpackage.cgf v(defpackage.cgf cgfVar, boolean z, int i2) {
        defpackage.axa axaVar;
        defpackage.cft cftVar = (i2 & 1) != 0 ? defpackage.cfs.k : null;
        boolean z2 = z & ((i2 & 2) == 0);
        if (!defpackage.afga.f(cftVar, defpackage.cfs.k) || z2) {
            axaVar = (!defpackage.afga.f(cftVar, defpackage.cfs.j) || z2) ? new defpackage.axa(2, z2, new defpackage.amc(cftVar, 3), cftVar) : e;
        } else {
            axaVar = d;
        }
        return cgfVar.a(axaVar);
    }
}
