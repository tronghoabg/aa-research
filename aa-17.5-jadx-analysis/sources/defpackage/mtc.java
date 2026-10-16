package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class mtc implements afeg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    private final /* synthetic */ int i;

    public /* synthetic */ mtc(afeh afehVar, cfy cfyVar, List list, List list2, boolean z, fyy fyyVar, float f, int i, int i2) {
        this.i = i2;
        this.h = afehVar;
        this.d = cfyVar;
        this.e = list;
        this.f = list2;
        this.a = z;
        this.g = fyyVar;
        this.b = f;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.i == 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i = this.c;
            ?? r6 = this.h;
            float f = this.b;
            ?? r4 = this.g;
            ?? r3 = this.f;
            int i2 = i | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            lxw.s(this.a, (afm) this.d, this.e, r3, r4, f, r6, buxVar, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        ((Integer) obj2).intValue();
        int i5 = this.c;
        float f2 = this.b;
        Object obj3 = this.g;
        boolean z = this.a;
        ?? r7 = this.f;
        ?? r62 = this.e;
        ?? r5 = this.d;
        ?? r42 = this.h;
        int i6 = i5 | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        fwn.d(r42, r5, r62, r7, z, (fyy) obj3, f2, buxVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
        return afak.a;
    }

    public /* synthetic */ mtc(boolean z, afm afmVar, afeg afegVar, afeg afegVar2, cfy cfyVar, float f, afeg afegVar3, int i, int i2) {
        this.i = i2;
        this.a = z;
        this.d = afmVar;
        this.e = afegVar;
        this.f = afegVar2;
        this.g = cfyVar;
        this.b = f;
        this.h = afegVar3;
        this.c = i;
    }
}
