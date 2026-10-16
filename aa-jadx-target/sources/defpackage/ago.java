package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ago implements defpackage.affg {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ ago(defpackage.agn agnVar, defpackage.agl aglVar, java.lang.Object obj, java.lang.Object obj2, defpackage.afd afdVar, int i, int i2) {
        this.g = i2;
        this.d = agnVar;
        this.e = aglVar;
        this.a = obj;
        this.b = obj2;
        this.f = afdVar;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [afd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [afd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [affh, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.g;
        if (i == 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            ((java.lang.Integer) obj2).intValue();
            int i2 = this.c;
            ?? r4 = this.f;
            java.lang.Object obj3 = this.b;
            int i3 = i2 | 1;
            int i4 = i3 & 306783378;
            int i5 = i3 & 613566756;
            defpackage.afw.q((defpackage.agn) this.d, (defpackage.agl) this.e, this.a, obj3, r4, bveVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 + i4) & i5));
            return defpackage.afbk.a;
        }
        if (i != 1) {
            defpackage.bve bveVar2 = (defpackage.bve) obj;
            ((java.lang.Integer) obj2).intValue();
            int i6 = this.c;
            java.lang.Object obj4 = this.b;
            java.lang.Object obj5 = this.a;
            java.lang.Object obj6 = this.d;
            int i7 = i6 & 306783378;
            int i8 = 613566756 & i6;
            ((defpackage.ccz) this.f).e(this.e, obj6, obj5, obj4, bveVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8) | 1);
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar3 = (defpackage.bve) obj;
        ((java.lang.Integer) obj2).intValue();
        int i9 = this.c;
        ?? r5 = this.b;
        ?? r3 = this.a;
        ?? r2 = this.f;
        int i10 = i9 | 1;
        int i11 = i10 & 306783378;
        int i12 = i10 & 613566756;
        defpackage.ca.J((defpackage.agn) this.e, this.d, r2, r3, r5, bveVar3, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 + i11) & i12));
        return defpackage.afbk.a;
    }

    public /* synthetic */ ago(defpackage.agn agnVar, defpackage.cgf cgfVar, defpackage.afd afdVar, defpackage.affc affcVar, defpackage.affh affhVar, int i, int i2) {
        this.g = i2;
        this.e = agnVar;
        this.d = cgfVar;
        this.f = afdVar;
        this.a = affcVar;
        this.b = affhVar;
        this.c = i;
    }

    public /* synthetic */ ago(defpackage.ccz cczVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i, int i2) {
        this.g = i2;
        this.f = cczVar;
        this.e = obj;
        this.d = obj2;
        this.a = obj3;
        this.b = obj4;
        this.c = i;
    }
}
