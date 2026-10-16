package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class arm implements defpackage.arw {
    final /* synthetic */ defpackage.axx a;
    final /* synthetic */ defpackage.ary b;

    public arm(defpackage.axx axxVar, defpackage.ary aryVar) {
        this.a = axxVar;
        this.b = aryVar;
    }

    private final defpackage.axo c() {
        return this.a.l();
    }

    @Override // defpackage.arw
    public final float a(float f, float f2) {
        float fAbs = java.lang.Math.abs(f2);
        java.util.List list = c().j;
        int i = 0;
        if (!list.isEmpty()) {
            int size = list.size();
            int size2 = list.size();
            int i2 = 0;
            while (i < size2) {
                i2 += ((defpackage.axp) list.get(i)).i;
                i++;
            }
            i = i2 / size;
        }
        float f3 = fAbs - i;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        return f3 * java.lang.Math.signum(f2);
    }

    @Override // defpackage.arw
    public final float b(float f) {
        java.util.List list = c().j;
        int size = list.size();
        float f2 = Float.NEGATIVE_INFINITY;
        float f3 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            defpackage.axp axpVar = (defpackage.axp) list.get(i);
            defpackage.axp axpVar2 = true != (axpVar instanceof defpackage.axp) ? null : axpVar;
            if (axpVar2 == null || !axpVar2.o) {
                defpackage.ary aryVar = this.b;
                int iAx = defpackage.ca.ax(c());
                int iA = c().a();
                int i2 = c().o;
                float fA = axpVar.h - aryVar.a(iAx, axpVar.i, iA, i2, axpVar.a, c().m);
                if (fA <= 0.0f && fA > f2) {
                    f2 = fA;
                }
                if (fA >= 0.0f && fA < f3) {
                    f3 = fA;
                }
            }
        }
        int iAw = defpackage.ca.aw(this.a.d(), f);
        if (iAw != 0 ? iAw != 1 : java.lang.Math.abs(f3) > java.lang.Math.abs(f2)) {
            f3 = f2;
        }
        if (f3 == Float.POSITIVE_INFINITY || f3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f3;
    }
}
