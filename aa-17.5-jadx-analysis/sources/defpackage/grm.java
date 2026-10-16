package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final /* synthetic */ class grm implements afeg {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ grm(float f, Object obj, int i, int i2) {
        this.d = i2;
        this.a = f;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [avx, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            ((Integer) obj2).intValue();
            int i2 = this.b | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            gmk.f(this.a, this.c, (bux) obj, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return afak.a;
        }
        if (i == 1) {
            ((Integer) obj2).intValue();
            int i5 = this.b | 1;
            int i6 = 306783378 & i5;
            int i7 = 613566756 & i5;
            bmf.c(this.a, this.c, (bux) obj, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7));
            return afak.a;
        }
        if (i != 2) {
            ((Integer) obj2).intValue();
            int i8 = this.b | 1;
            int i9 = 306783378 & i8;
            int i10 = 613566756 & i8;
            mjv.k(this.c, this.a, (bux) obj, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10));
            return afak.a;
        }
        bux buxVar = (bux) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i11 = 0;
        if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
            while (true) {
                int i12 = this.b;
                if (i11 >= i12) {
                    break;
                }
                cfy cfyVarC = awd.c(this.c.b(cfy.e, this.a / i12, true), 1.0f);
                Bundle bundle = new Bundle();
                bundle.putInt("column_number", i11);
                vo voVarD = dtv.d(buxVar);
                eps epsVar = (eps) dyz.c(((eqa) buxVar.f(erz.a)).getLifecycle(), buxVar).a();
                Object objG = buxVar.g();
                if (objG == buw.a) {
                    objG = muo.d;
                    buxVar.x(objG);
                }
                dtk.i(mvb.class, cfyVarC, voVarD, bundle, epsVar, (afec) objG, buxVar, 0);
                i11++;
            }
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public /* synthetic */ grm(int i, avx avxVar, float f, int i2) {
        this.d = i2;
        this.b = i;
        this.c = avxVar;
        this.a = f;
    }

    public /* synthetic */ grm(cfy cfyVar, float f, int i, int i2) {
        this.d = i2;
        this.c = cfyVar;
        this.a = f;
        this.b = i;
    }
}
