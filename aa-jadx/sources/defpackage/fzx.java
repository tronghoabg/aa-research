package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fzx implements defpackage.affg {
    public final /* synthetic */ defpackage.csr a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ fzx(android.graphics.drawable.Drawable drawable, defpackage.cgf cgfVar, defpackage.cfu cfuVar, defpackage.csr csrVar, float f, defpackage.cke ckeVar, int i, int i2) {
        this.h = i2;
        this.d = drawable;
        this.e = cgfVar;
        this.f = cfuVar;
        this.a = csrVar;
        this.b = f;
        this.g = ckeVar;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [cfu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [cfu, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.h == 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.c;
            java.lang.Object obj3 = this.g;
            float f = this.b;
            defpackage.csr csrVar = this.a;
            ?? r2 = this.f;
            int i2 = i | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            defpackage.fxj.g((android.graphics.drawable.Drawable) this.d, this.e, r2, csrVar, f, (defpackage.cke) obj3, bveVar, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar2 = (defpackage.bve) obj;
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.c;
        java.lang.Object obj4 = this.e;
        float f2 = this.b;
        defpackage.csr csrVar2 = this.a;
        ?? r6 = this.d;
        java.lang.Object obj5 = this.g;
        ?? r4 = this.f;
        int i6 = i5 | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        defpackage.dtf.j(r4, (defpackage.cne) obj5, r6, csrVar2, f2, (defpackage.cke) obj4, bveVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
        return defpackage.afbk.a;
    }

    public /* synthetic */ fzx(defpackage.cgf cgfVar, defpackage.cne cneVar, defpackage.cfu cfuVar, defpackage.csr csrVar, float f, defpackage.cke ckeVar, int i, int i2) {
        this.h = i2;
        this.f = cgfVar;
        this.g = cneVar;
        this.d = cfuVar;
        this.a = csrVar;
        this.b = f;
        this.e = ckeVar;
        this.c = i;
    }
}
