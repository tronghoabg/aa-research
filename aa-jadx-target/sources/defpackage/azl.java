package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class azl implements defpackage.affg {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ azl(defpackage.azm azmVar, java.lang.Object obj, int i, java.lang.Object obj2, int i2, int i3) {
        this.f = i3;
        this.e = azmVar;
        this.a = obj;
        this.b = i;
        this.c = obj2;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [azm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [cfu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [affg, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.f;
        if (i == 0) {
            ((java.lang.Integer) obj2).intValue();
            int i2 = this.d;
            java.lang.Object obj3 = this.c;
            int i3 = this.b;
            java.lang.Object obj4 = this.a;
            int i4 = i2 | 1;
            int i5 = 306783378 & i4;
            int i6 = 613566756 & i4;
            defpackage.axd.p(this.e, obj4, i3, obj3, (defpackage.bve) obj, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
            return defpackage.afbk.a;
        }
        if (i == 1) {
            ((java.lang.Integer) obj2).intValue();
            int i7 = this.b | 1;
            int i8 = i7 & 306783378;
            int i9 = 613566756 & i7;
            int i10 = (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9);
            int i11 = this.d;
            ?? r2 = this.c;
            ?? r1 = this.e;
            defpackage.ca.at(this.a, r1, r2, (defpackage.bve) obj, i10, i11);
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar = (defpackage.bve) obj;
        ((java.lang.Integer) obj2).intValue();
        int i12 = this.d;
        ?? r8 = this.c;
        java.lang.Object obj5 = this.e;
        int i13 = this.b;
        java.lang.Object obj6 = this.a;
        int i14 = i12 | 1;
        int i15 = i14 & 306783378;
        int i16 = 613566756 & i14;
        defpackage.axd.m(obj6, i13, (defpackage.azv) obj5, r8, bveVar, (i14 & (-920350135)) | i15 | (i16 >> 1) | ((i15 + i15) & i16));
        return defpackage.afbk.a;
    }

    public /* synthetic */ azl(defpackage.cgf cgfVar, defpackage.cfu cfuVar, defpackage.affh affhVar, int i, int i2, int i3) {
        this.f = i3;
        this.a = cgfVar;
        this.e = cfuVar;
        this.c = affhVar;
        this.b = i;
        this.d = i2;
    }

    public /* synthetic */ azl(java.lang.Object obj, int i, defpackage.azv azvVar, defpackage.affg affgVar, int i2, int i3) {
        this.f = i3;
        this.a = obj;
        this.b = i;
        this.e = azvVar;
        this.c = affgVar;
        this.d = i2;
    }
}
