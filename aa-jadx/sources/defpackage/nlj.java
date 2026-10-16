package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nlj implements defpackage.affg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ nlj(boolean z, boolean z2, defpackage.affc affcVar, defpackage.cgf cgfVar, int i, int i2, int i3) {
        this.g = i3;
        this.a = z;
        this.b = z2;
        this.e = affcVar;
        this.f = cgfVar;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [affg, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.g != 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.c | 1;
            int i2 = i & 306783378;
            int i3 = 613566756 & i;
            int i4 = (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3);
            int i5 = this.d;
            ?? r7 = this.e;
            java.lang.Object obj3 = this.f;
            defpackage.jtu.b(this.a, this.b, (defpackage.hjw) obj3, r7, bveVar, i4, i5);
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar2 = (defpackage.bve) obj;
        ((java.lang.Integer) obj2).intValue();
        int i6 = this.c | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        int i9 = (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8);
        int i10 = this.d;
        ?? r3 = this.f;
        ?? r2 = this.e;
        defpackage.lwz.B(this.a, this.b, r2, r3, bveVar2, i9, i10);
        return defpackage.afbk.a;
    }

    public /* synthetic */ nlj(boolean z, boolean z2, defpackage.hjw hjwVar, defpackage.affg affgVar, int i, int i2, int i3) {
        this.g = i3;
        this.a = z;
        this.b = z2;
        this.f = hjwVar;
        this.e = affgVar;
        this.c = i;
        this.d = i2;
    }
}
