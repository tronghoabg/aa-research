package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nlc implements defpackage.affg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ nlc(defpackage.gbm gbmVar, defpackage.gcw gcwVar, boolean z, boolean z2, boolean z3, int i, int i2, int i3) {
        this.h = i3;
        this.g = gbmVar;
        this.f = gcwVar;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [gbm, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.h != 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.d | 1;
            int i2 = i & 306783378;
            int i3 = 613566756 & i;
            int i4 = this.e;
            boolean z = this.c;
            boolean z2 = this.b;
            boolean z3 = this.a;
            defpackage.fxf.b(this.g, (defpackage.gcw) this.f, z3, z2, z, bveVar, (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3), i4);
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar2 = (defpackage.bve) obj;
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.d | 1;
        int i6 = i5 & 306783378;
        int i7 = 613566756 & i5;
        int i8 = (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7);
        int i9 = this.e;
        ?? r4 = this.g;
        ?? r3 = this.f;
        boolean z4 = this.c;
        defpackage.lvs.M(this.a, this.b, z4, r3, r4, bveVar2, i8, i9);
        return defpackage.afbk.a;
    }

    public /* synthetic */ nlc(boolean z, boolean z2, boolean z3, defpackage.affc affcVar, defpackage.cgf cgfVar, int i, int i2, int i3) {
        this.h = i3;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.f = affcVar;
        this.g = cgfVar;
        this.d = i;
        this.e = i2;
    }
}
