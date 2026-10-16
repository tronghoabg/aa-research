package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class azg implements afeg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ azg(azh azhVar, Object obj, int i, Object obj2, int i2, int i3) {
        this.f = i3;
        this.e = azhVar;
        this.a = obj;
        this.b = i;
        this.c = obj2;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [azh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [cfn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [afeg, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            ((Integer) obj2).intValue();
            int i2 = this.d;
            Object obj3 = this.c;
            int i3 = this.b;
            Object obj4 = this.a;
            int i4 = i2 | 1;
            int i5 = 306783378 & i4;
            int i6 = 613566756 & i4;
            awx.p(this.e, obj4, i3, obj3, (bux) obj, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
            return afak.a;
        }
        if (i == 1) {
            ((Integer) obj2).intValue();
            int i7 = this.b | 1;
            int i8 = i7 & 306783378;
            int i9 = 613566756 & i7;
            int i10 = (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9);
            int i11 = this.d;
            ?? r2 = this.c;
            ?? r1 = this.e;
            ca.at(this.a, r1, r2, (bux) obj, i10, i11);
            return afak.a;
        }
        bux buxVar = (bux) obj;
        ((Integer) obj2).intValue();
        int i12 = this.d;
        ?? r8 = this.c;
        Object obj5 = this.e;
        int i13 = this.b;
        Object obj6 = this.a;
        int i14 = i12 | 1;
        int i15 = i14 & 306783378;
        int i16 = 613566756 & i14;
        awx.m(obj6, i13, (azq) obj5, r8, buxVar, (i14 & (-920350135)) | i15 | (i16 >> 1) | ((i15 + i15) & i16));
        return afak.a;
    }

    public /* synthetic */ azg(cfy cfyVar, cfn cfnVar, afeh afehVar, int i, int i2, int i3) {
        this.f = i3;
        this.a = cfyVar;
        this.e = cfnVar;
        this.c = afehVar;
        this.b = i;
        this.d = i2;
    }

    public /* synthetic */ azg(Object obj, int i, azq azqVar, afeg afegVar, int i2, int i3) {
        this.f = i3;
        this.a = obj;
        this.b = i;
        this.e = azqVar;
        this.c = afegVar;
        this.d = i2;
    }
}
