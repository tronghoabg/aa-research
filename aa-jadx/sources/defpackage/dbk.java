package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dbk implements defpackage.affg {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ dbk(java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [cyu, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.d != 0) {
            ((java.lang.Integer) obj2).intValue();
            int i = this.a;
            java.lang.Object obj3 = this.c;
            int i2 = 306783378 & i;
            int i3 = 613566756 & i;
            ((defpackage.ccz) this.b).b(obj3, (defpackage.bve) obj, (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 + i2) & i3) | 1);
            return defpackage.afbk.a;
        }
        ((java.lang.Integer) obj2).intValue();
        int i4 = this.a;
        ?? r0 = this.c;
        int i5 = i4 | 1;
        int i6 = 306783378 & i5;
        int i7 = 613566756 & i5;
        defpackage.dbl.a(this.b, r0, (defpackage.bve) obj, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7));
        return defpackage.afbk.a;
    }
}
