package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class nae implements afeg {
    public final /* synthetic */ List a;
    public final /* synthetic */ cfy b;
    public final /* synthetic */ int c;
    public final /* synthetic */ afeg d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    private final /* synthetic */ int i;

    public /* synthetic */ nae(List list, afeg afegVar, cfy cfyVar, int i, int i2, afeg afegVar2, aizm aizmVar, int i3, int i4) {
        this.i = i4;
        this.a = list;
        this.g = afegVar;
        this.b = cfyVar;
        this.c = i;
        this.e = i2;
        this.d = afegVar2;
        this.h = aizmVar;
        this.f = i3;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [aizm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [afei, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [afeg, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.i == 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i = this.e | 1;
            int i2 = i & 306783378;
            int i3 = 613566756 & i;
            int i4 = (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3);
            int i5 = this.f;
            ?? r5 = this.h;
            afeg afegVar = this.d;
            ?? r3 = this.g;
            int i6 = this.c;
            mjv.g(this.a, this.b, i6, r3, afegVar, r5, buxVar, i4, i5);
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        ((Integer) obj2).intValue();
        int i7 = this.f;
        ?? r10 = this.h;
        afeg afegVar2 = this.d;
        int i8 = this.e;
        int i9 = this.c;
        cfy cfyVar = this.b;
        ?? r52 = this.g;
        List list = this.a;
        int i10 = i7 | 1;
        int i11 = i10 & 306783378;
        int i12 = i10 & 613566756;
        gsm.d(list, r52, cfyVar, i9, i8, afegVar2, r10, buxVar2, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 + i11) & i12));
        return afak.a;
    }

    public /* synthetic */ nae(List list, cfy cfyVar, int i, afec afecVar, afeg afegVar, afei afeiVar, int i2, int i3, int i4) {
        this.i = i4;
        this.a = list;
        this.b = cfyVar;
        this.c = i;
        this.g = afecVar;
        this.d = afegVar;
        this.h = afeiVar;
        this.e = i2;
        this.f = i3;
    }
}
