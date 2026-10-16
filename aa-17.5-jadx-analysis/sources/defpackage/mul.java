package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final /* synthetic */ class mul implements afeg {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ mul(float f, float f2, gqc gqcVar, cfy cfyVar, int i, int i2) {
        this.f = i2;
        this.a = f;
        this.b = f2;
        this.d = gqcVar;
        this.e = cfyVar;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [cfy, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.f == 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i = this.c;
            Object obj3 = this.e;
            float f = this.b;
            int i2 = i | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            mva.i((muq) this.d, this.a, f, (Bundle) obj3, buxVar, (i2 & (-920350135)) | i3 | (i4 >> 1) | (i4 & (i3 + i3)));
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        ((Integer) obj2).intValue();
        int i5 = this.c;
        ?? r7 = this.e;
        Object obj4 = this.d;
        float f2 = this.b;
        float f3 = this.a;
        int i6 = i5 | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        gpm.a(f3, f2, (gqc) obj4, r7, buxVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
        return afak.a;
    }

    public /* synthetic */ mul(muq muqVar, float f, float f2, Bundle bundle, int i, int i2) {
        this.f = i2;
        this.d = muqVar;
        this.a = f;
        this.b = f2;
        this.e = bundle;
        this.c = i;
    }
}
