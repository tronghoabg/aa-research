package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bms {
    public static final defpackage.avv a;
    public static final float b;
    private static final float c;

    static {
        defpackage.avx avxVar = new defpackage.avx(24.0f, 8.0f, 24.0f, 8.0f);
        a = avxVar;
        new defpackage.avx(16.0f, 8.0f, 24.0f, 8.0f);
        c = 12.0f;
        new defpackage.avx(12.0f, avxVar.a, 12.0f, avxVar.b);
        new defpackage.avx(12.0f, avxVar.a, 16.0f, avxVar.b);
        b = 58.0f;
    }

    public static final defpackage.bmv a(float f, float f2, float f3, float f4, float f5, int i) {
        if ((i & 16) != 0) {
            f5 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 3.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        return new defpackage.bmv(1 == (i & 1) ? 1.0f : f, f2, f3, f4, f5);
    }

    public static final defpackage.bmr b(defpackage.bnk bnkVar) {
        defpackage.bmr bmrVar = bnkVar.W;
        if (bmrVar != null) {
            return bmrVar;
        }
        defpackage.bmr bmrVar2 = new defpackage.bmr(defpackage.bnl.e(bnkVar, 26), defpackage.bnl.e(bnkVar, 10), defpackage.ckd.h(defpackage.bnl.e(bnkVar, 18), 0.1f), defpackage.ckd.h(defpackage.bnl.e(bnkVar, 19), 0.38f));
        bnkVar.W = bmrVar2;
        return bmrVar2;
    }

    public static final float c() {
        return ((java.lang.Boolean) defpackage.box.a.a()).booleanValue() ? 36.0f : 40.0f;
    }

    public static final defpackage.cld d(defpackage.bve bveVar) {
        return defpackage.bqa.b(7, bveVar);
    }

    public static final defpackage.cld e(defpackage.bve bveVar) {
        int i = defpackage.bqa.a;
        return defpackage.bqa.a(((defpackage.bol) bveVar.f(defpackage.bom.a)).c, 7);
    }

    public static final defpackage.bmr f(long j, long j2, long j3, long j4, defpackage.bve bveVar, int i) {
        long jC = (i & 1) != 0 ? defpackage.cjv.c() : j;
        long jC2 = (i & 2) != 0 ? defpackage.cjv.c() : j2;
        long jC3 = (i & 4) != 0 ? defpackage.cjv.c() : j3;
        long jC4 = (i & 8) != 0 ? defpackage.cjv.c() : j4;
        defpackage.bmr bmrVarB = b(defpackage.bxi.n(bveVar));
        if (jC == 16) {
            jC = bmrVarB.a;
        }
        if (jC2 == 16) {
            jC2 = bmrVarB.b;
        }
        if (jC3 == 16) {
            jC3 = bmrVarB.c;
        }
        if (jC4 == 16) {
            jC4 = bmrVarB.d;
        }
        return new defpackage.bmr(jC, jC2, jC3, jC4);
    }
}
