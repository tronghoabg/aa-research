package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class awd {
    public static final aub a = new aub(2, 1.0f);
    private static final aub b = new aub(1, 1.0f);
    private static final aub c = new aub(3, 1.0f);
    private static final awu d = asl.t(cfl.k);
    private static final awu e = asl.t(cfl.j);
    private static final awu f = asl.r(cfl.n);
    private static final awu g = asl.r(cfl.m);
    private static final awu h = asl.s(cfl.e);
    private static final awu i = asl.s(cfl.a);

    public static final cfy a(cfy cfyVar, float f2, float f3) {
        return cfyVar.a(new awj(f2, f3));
    }

    public static final cfy b(cfy cfyVar, float f2) {
        return cfyVar.a(f2 == 1.0f ? b : new aub(1, f2));
    }

    public static final cfy c(cfy cfyVar, float f2) {
        return cfyVar.a(f2 == 1.0f ? c : new aub(3, f2));
    }

    public static final cfy d(cfy cfyVar, float f2) {
        return cfyVar.a(new awc(Float.NaN, f2, Float.NaN, f2, true));
    }

    public static final cfy e(cfy cfyVar, float f2, float f3) {
        return cfyVar.a(new awc(Float.NaN, f2, Float.NaN, f3, true));
    }

    public static final cfy f(cfy cfyVar, float f2) {
        return cfyVar.a(new awc(Float.NaN, f2, Float.NaN, f2, false));
    }

    public static final cfy g(cfy cfyVar, float f2, float f3) {
        return cfyVar.a(new awc(f2, f3, f2, f3, false));
    }

    public static final cfy h(cfy cfyVar, float f2) {
        return cfyVar.a(new awc(f2, Float.NaN, f2, Float.NaN, false));
    }

    public static final cfy i(cfy cfyVar, float f2) {
        return cfyVar.a(new awc(f2, f2, f2, f2, true));
    }

    public static final cfy j(cfy cfyVar, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + BitmapDescriptorFactory.HUE_RED;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + BitmapDescriptorFactory.HUE_RED;
        return cfyVar.a(new awc(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2, true));
    }

    public static final cfy k(cfy cfyVar, float f2, float f3) {
        return cfyVar.a(new awc(f2, f3, f2, f3, true));
    }

    public static final cfy l(cfy cfyVar, float f2, float f3, float f4, float f5) {
        return cfyVar.a(new awc(f2, f3, f4, f5, true));
    }

    public static final cfy m(cfy cfyVar, float f2) {
        return cfyVar.a(new awc(f2, Float.NaN, f2, Float.NaN, true));
    }

    public static final cfy n(cfy cfyVar, float f2, float f3) {
        return cfyVar.a(new awc(f2, Float.NaN, f3, Float.NaN, true));
    }

    public static final cfy o(cfy cfyVar, cfn cfnVar, boolean z) {
        return cfyVar.a((!affa.f(cfnVar, cfl.e) || z) ? (!affa.f(cfnVar, cfl.a) || z) ? new awu(3, z, new alx(cfnVar, 5), cfnVar) : i : h);
    }

    public static final cfy p(cfy cfyVar, cfr cfrVar, boolean z) {
        return cfyVar.a((!affa.f(cfrVar, cfl.n) || z) ? (!affa.f(cfrVar, cfl.m) || z) ? new awu(1, z, new alx(cfrVar, 4), cfrVar) : g : f);
    }

    public static /* synthetic */ cfy q(cfy cfyVar, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return cfyVar.a(new awj(f2, f3));
    }

    public static final cfy r(cfy cfyVar) {
        return cfyVar.a(a);
    }

    public static /* synthetic */ cfy s(cfy cfyVar, float f2, float f3, float f4, float f5, int i2) {
        float f6 = (i2 & 8) != 0 ? Float.NaN : f5;
        float f7 = (i2 & 4) != 0 ? Float.NaN : f4;
        return cfyVar.a(new awc(1 != (i2 & 1) ? f2 : Float.NaN, (i2 & 2) != 0 ? Float.NaN : f3, f7, f6, false));
    }

    public static /* synthetic */ cfy t(cfy cfyVar, cfr cfrVar, int i2) {
        if ((i2 & 1) != 0) {
            cfrVar = cfl.n;
        }
        return p(cfyVar, cfrVar, false);
    }

    public static /* synthetic */ cfy u(cfy cfyVar, cfn cfnVar, int i2) {
        if ((i2 & 1) != 0) {
            cfnVar = cfl.e;
        }
        return o(cfyVar, cfnVar, false);
    }

    public static /* synthetic */ cfy v(cfy cfyVar, boolean z, int i2) {
        cfm cfmVar = (i2 & 1) != 0 ? cfl.k : null;
        boolean z2 = z & ((i2 & 2) == 0);
        return cfyVar.a((!affa.f(cfmVar, cfl.k) || z2) ? (!affa.f(cfmVar, cfl.j) || z2) ? new awu(2, z2, new alx(cfmVar, 3), cfmVar) : e : d);
    }
}
