package defpackage;

import java.util.EnumSet;

/* loaded from: classes2.dex */
public final /* synthetic */ class gzt implements afeg {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ gzt(float f, cfy cfyVar, atc atcVar, cfm cfmVar, afeg afegVar, int i, int i2) {
        this.g = i2;
        this.a = f;
        this.d = cfyVar;
        this.e = atcVar;
        this.c = cfmVar;
        this.f = afegVar;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fzj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [hju, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ckv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [atc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [cfm, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.g;
        if (i == 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i2 = this.b;
            ?? r4 = this.f;
            ?? r3 = this.e;
            ?? r2 = this.d;
            float f = this.a;
            ?? r0 = this.c;
            int i3 = i2 | 1;
            int i4 = i3 & 306783378;
            int i5 = 613566756 & i3;
            gzw.c(r0, f, r2, r3, r4, buxVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 + i4) & i5));
            return afak.a;
        }
        if (i == 1) {
            bux buxVar2 = (bux) obj;
            ((Integer) obj2).intValue();
            int i6 = this.b;
            Object obj3 = this.f;
            ?? r32 = this.c;
            float f2 = this.a;
            Object obj4 = this.d;
            ?? r02 = this.e;
            int i7 = i6 | 1;
            int i8 = i7 & 306783378;
            int i9 = 613566756 & i7;
            fwt.a(r02, (fwy) obj4, f2, r32, (fxe) obj3, buxVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
            return afak.a;
        }
        if (i == 2) {
            bux buxVar3 = (bux) obj;
            ((Integer) obj2).intValue();
            int i10 = this.b;
            Object obj5 = this.c;
            Object obj6 = this.f;
            float f3 = this.a;
            int i11 = i10 | 1;
            int i12 = 306783378 & i11;
            int i13 = 613566756 & i11;
            ((msj) this.d).b(this.e, f3, (EnumSet) obj6, (cjb) obj5, buxVar3, (i11 & (-920350135)) | i12 | (i13 >> 1) | ((i12 + i12) & i13));
            return afak.a;
        }
        bux buxVar4 = (bux) obj;
        ((Integer) obj2).intValue();
        int i14 = this.b;
        ?? r10 = this.f;
        ?? r9 = this.c;
        ?? r8 = this.e;
        ?? r7 = this.d;
        float f4 = this.a;
        int i15 = i14 | 1;
        int i16 = i15 & 306783378;
        int i17 = i15 & 613566756;
        mvy.e(f4, r7, r8, r9, r10, buxVar4, (i15 & (-920350135)) | i16 | (i17 >> 1) | ((i16 + i16) & i17));
        return afak.a;
    }

    public /* synthetic */ gzt(cfy cfyVar, fwy fwyVar, float f, ckv ckvVar, fxe fxeVar, int i, int i2) {
        this.g = i2;
        this.e = cfyVar;
        this.d = fwyVar;
        this.a = f;
        this.c = ckvVar;
        this.f = fxeVar;
        this.b = i;
    }

    public /* synthetic */ gzt(fzj fzjVar, float f, hju hjuVar, cfy cfyVar, afeh afehVar, int i, int i2) {
        this.g = i2;
        this.c = fzjVar;
        this.a = f;
        this.d = hjuVar;
        this.e = cfyVar;
        this.f = afehVar;
        this.b = i;
    }

    public /* synthetic */ gzt(msj msjVar, cfy cfyVar, float f, EnumSet enumSet, cjb cjbVar, int i, int i2) {
        this.g = i2;
        this.d = msjVar;
        this.e = cfyVar;
        this.a = f;
        this.f = enumSet;
        this.c = cjbVar;
        this.b = i;
    }
}
