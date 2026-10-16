package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bhr implements defpackage.affg {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ bhr(defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.azy azyVar, defpackage.azo azoVar, int i, int i2) {
        this.f = i2;
        this.c = aferVar;
        this.d = cgfVar;
        this.b = azyVar;
        this.e = azoVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [affj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [azo, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.f;
        if (i == 0) {
            ((java.lang.Integer) obj2).intValue();
            int i2 = this.a;
            ?? r3 = this.d;
            ?? r2 = this.c;
            java.lang.Object obj3 = this.e;
            int i3 = i2 | 1;
            int i4 = i3 & 306783378;
            int i5 = 613566756 & i3;
            defpackage.bvm bvmVar = (defpackage.bvm) obj3;
            defpackage.axd.S(this.b, bvmVar, r2, r3, (defpackage.bve) obj, (i3 & (-920350135)) | i4 | (i5 >> 1) | (i5 & (i4 + i4)));
            return defpackage.afbk.a;
        }
        if (i != 1) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            ((java.lang.Integer) obj2).intValue();
            int i6 = this.a;
            java.lang.Object obj4 = this.c;
            java.lang.Object obj5 = this.d;
            int i7 = i6 & 306783378;
            int i8 = 613566756 & i6;
            ((defpackage.ccz) this.e).d(this.b, obj5, obj4, bveVar, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8) | 1);
            return defpackage.afbk.a;
        }
        ((java.lang.Integer) obj2).intValue();
        int i9 = this.a;
        ?? r4 = this.e;
        java.lang.Object obj6 = this.b;
        ?? r1 = this.d;
        ?? r0 = this.c;
        int i10 = i9 | 1;
        int i11 = i10 & 306783378;
        int i12 = 613566756 & i10;
        defpackage.azy azyVar = (defpackage.azy) obj6;
        defpackage.axd.n(r0, r1, azyVar, r4, (defpackage.bve) obj, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 + i11) & i12));
        return defpackage.afbk.a;
    }

    public /* synthetic */ bhr(defpackage.ccz cczVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int i2) {
        this.f = i2;
        this.e = cczVar;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.a = i;
    }

    public /* synthetic */ bhr(defpackage.cgf cgfVar, defpackage.bvm bvmVar, defpackage.affj affjVar, defpackage.affg affgVar, int i, int i2) {
        this.f = i2;
        this.b = cgfVar;
        this.e = bvmVar;
        this.c = affjVar;
        this.d = affgVar;
        this.a = i;
    }
}
