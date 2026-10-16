package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class arn implements defpackage.arw {
    final /* synthetic */ defpackage.bby a;
    final /* synthetic */ defpackage.affh b;

    public arn(defpackage.bby bbyVar, defpackage.affh affhVar) {
        this.a = bbyVar;
        this.b = affhVar;
    }

    @Override // defpackage.arw
    public final float a(float f, float f2) {
        defpackage.bby bbyVar = this.a;
        int iK = bbyVar.k() + bbyVar.m();
        if (iK != 0) {
            int i = f < 0.0f ? bbyVar.f + 1 : bbyVar.f;
            int iG = defpackage.afqt.g(((int) (f2 / iK)) + i, 0, bbyVar.b());
            bbyVar.k();
            bbyVar.m();
            long j = i;
            long j2 = (-1) + j;
            if (j2 < 0) {
                j2 = 0;
            }
            long j3 = j + 1;
            if (j3 > 2147483647L) {
                j3 = 2147483647L;
            }
            int iAbs = java.lang.Math.abs((defpackage.afqt.g(defpackage.afqt.g(iG, (int) j2, (int) j3), 0, bbyVar.b()) - i) * iK) - iK;
            int i2 = iAbs >= 0 ? iAbs : 0;
            if (i2 != 0) {
                return i2 * java.lang.Math.signum(f);
            }
        }
        return 0.0f;
    }

    @Override // defpackage.arw
    public final float b(float f) {
        defpackage.bby bbyVar = this.a;
        defpackage.ary aryVar = bbyVar.w().n;
        java.util.List list = c().a;
        int size = list.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            defpackage.bba bbaVar = (defpackage.bba) list.get(i);
            defpackage.afw.V(c());
            c().a();
            int i2 = c().d;
            int i3 = c().b;
            int i4 = bbaVar.h;
            int i5 = bbaVar.a;
            bbyVar.b();
            float f4 = i4 + 0.0f;
            if (f4 <= 0.0f && f4 > f3) {
                f3 = f4;
            }
            if (f4 >= 0.0f && f4 < f2) {
                f2 = f4;
            }
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            f3 = f2;
        }
        if (f2 == Float.POSITIVE_INFINITY) {
            f2 = f3;
        }
        if (!bbyVar.h()) {
            if (defpackage.asq.p(bbyVar, f)) {
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
            }
        }
        if (!bbyVar.g()) {
            if (defpackage.asq.p(bbyVar, f)) {
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
                f2 = 0.0f;
            }
        }
        defpackage.afau afauVar = new defpackage.afau(java.lang.Float.valueOf(f3), java.lang.Float.valueOf(f2));
        float fFloatValue = ((java.lang.Number) afauVar.a).floatValue();
        float fFloatValue2 = ((java.lang.Number) afauVar.b).floatValue();
        float fFloatValue3 = ((java.lang.Number) this.b.invoke(java.lang.Float.valueOf(f), java.lang.Float.valueOf(fFloatValue), java.lang.Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            defpackage.asq.d("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }

    public final defpackage.bbo c() {
        return this.a.w();
    }
}
