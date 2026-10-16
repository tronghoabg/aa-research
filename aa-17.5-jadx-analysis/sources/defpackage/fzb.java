package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class fzb implements afeg {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ fzb(avx avxVar, List list, int i, float f, int i2, int i3) {
        this.f = i3;
        this.e = avxVar;
        this.d = list;
        this.b = i;
        this.a = f;
        this.c = i2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [avx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [afeh, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i2 = this.b | 1;
            int i3 = i2 & 306783378;
            int i4 = i2 & 613566756;
            int i5 = (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4);
            int i6 = this.c;
            float f = this.a;
            fzc.a((fzh) this.d, this.e, f, buxVar, i5, i6);
            return afak.a;
        }
        if (i == 1) {
            bux buxVar2 = (bux) obj;
            ((Integer) obj2).intValue();
            int i7 = this.b | 1;
            int i8 = i7 & 306783378;
            int i9 = i7 & 613566756;
            int i10 = (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9);
            int i11 = this.c;
            float f2 = this.a;
            fyz.a((fza) this.d, this.e, f2, buxVar2, i10, i11);
            return afak.a;
        }
        if (i != 2) {
            bux buxVar3 = (bux) obj;
            ((Integer) obj2).intValue();
            int i12 = this.b | 1;
            int i13 = i12 & 306783378;
            int i14 = 613566756 & i12;
            int i15 = this.c;
            ?? r8 = this.d;
            float f3 = this.a;
            cmw cmwVar = (cmw) this.e;
            lxr.D(cmwVar, f3, r8, buxVar3, (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 + i13) & i14), i15);
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i16 = this.c;
        float f4 = this.a;
        int i17 = this.b;
        ?? r1 = this.d;
        ?? r0 = this.e;
        int i18 = i16 | 1;
        int i19 = i18 & 306783378;
        int i20 = 613566756 & i18;
        gtz.e(r0, r1, i17, f4, (bux) obj, (i18 & (-920350135)) | i19 | (i20 >> 1) | ((i19 + i19) & i20));
        return afak.a;
    }

    public /* synthetic */ fzb(cmw cmwVar, float f, afeh afehVar, int i, int i2, int i3) {
        this.f = i3;
        this.e = cmwVar;
        this.a = f;
        this.d = afehVar;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ fzb(Object obj, cfy cfyVar, float f, int i, int i2, int i3) {
        this.f = i3;
        this.d = obj;
        this.e = cfyVar;
        this.a = f;
        this.b = i;
        this.c = i2;
    }
}
