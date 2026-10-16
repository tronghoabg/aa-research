package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class fzq implements afeg {
    public final /* synthetic */ csi a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ fzq(Drawable drawable, cfy cfyVar, cfn cfnVar, csi csiVar, float f, cjw cjwVar, int i, int i2) {
        this.h = i2;
        this.d = drawable;
        this.e = cfyVar;
        this.f = cfnVar;
        this.a = csiVar;
        this.b = f;
        this.g = cjwVar;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [cfn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [cfn, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.h == 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i = this.c;
            Object obj3 = this.g;
            float f = this.b;
            csi csiVar = this.a;
            ?? r2 = this.f;
            int i2 = i | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            fxa.g((Drawable) this.d, this.e, r2, csiVar, f, (cjw) obj3, buxVar, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        ((Integer) obj2).intValue();
        int i5 = this.c;
        Object obj4 = this.e;
        float f2 = this.b;
        csi csiVar2 = this.a;
        ?? r6 = this.d;
        Object obj5 = this.g;
        ?? r4 = this.f;
        int i6 = i5 | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        dtd.j(r4, (cmw) obj5, r6, csiVar2, f2, (cjw) obj4, buxVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
        return afak.a;
    }

    public /* synthetic */ fzq(cfy cfyVar, cmw cmwVar, cfn cfnVar, csi csiVar, float f, cjw cjwVar, int i, int i2) {
        this.h = i2;
        this.f = cfyVar;
        this.g = cmwVar;
        this.d = cfnVar;
        this.a = csiVar;
        this.b = f;
        this.e = cjwVar;
        this.c = i;
    }
}
