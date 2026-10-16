package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nav implements defpackage.affg {
    public final /* synthetic */ java.util.List a;
    public final /* synthetic */ defpackage.cgf b;
    public final /* synthetic */ int c;
    public final /* synthetic */ defpackage.affg d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ java.lang.Object g;
    public final /* synthetic */ java.lang.Object h;
    private final /* synthetic */ int i;

    public /* synthetic */ nav(java.util.List list, defpackage.affg affgVar, defpackage.cgf cgfVar, int i, int i2, defpackage.affg affgVar2, defpackage.ajal ajalVar, int i3, int i4) {
        this.i = i4;
        this.a = list;
        this.g = affgVar;
        this.b = cgfVar;
        this.c = i;
        this.e = i2;
        this.d = affgVar2;
        this.h = ajalVar;
        this.f = i3;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [ajal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [affi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [affg, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.i == 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.e | 1;
            int i2 = i & 306783378;
            int i3 = 613566756 & i;
            int i4 = (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3);
            int i5 = this.f;
            ?? r5 = this.h;
            defpackage.affg affgVar = this.d;
            ?? r3 = this.g;
            int i6 = this.c;
            defpackage.mkc.m(this.a, this.b, i6, r3, affgVar, r5, bveVar, i4, i5);
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar2 = (defpackage.bve) obj;
        ((java.lang.Integer) obj2).intValue();
        int i7 = this.f;
        ?? r10 = this.h;
        defpackage.affg affgVar2 = this.d;
        int i8 = this.e;
        int i9 = this.c;
        defpackage.cgf cgfVar = this.b;
        ?? r6 = this.g;
        java.util.List list = this.a;
        int i10 = i7 | 1;
        int i11 = i10 & 306783378;
        int i12 = i10 & 613566756;
        defpackage.gsu.f(list, r6, cgfVar, i9, i8, affgVar2, r10, bveVar2, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 + i11) & i12));
        return defpackage.afbk.a;
    }

    public /* synthetic */ nav(java.util.List list, defpackage.cgf cgfVar, int i, defpackage.affc affcVar, defpackage.affg affgVar, defpackage.affi affiVar, int i2, int i3, int i4) {
        this.i = i4;
        this.a = list;
        this.b = cgfVar;
        this.c = i;
        this.g = affcVar;
        this.d = affgVar;
        this.h = affiVar;
        this.e = i2;
        this.f = i3;
    }
}
