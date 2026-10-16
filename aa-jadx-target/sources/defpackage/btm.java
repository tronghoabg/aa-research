package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class btm implements defpackage.affg {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ btm(long j, defpackage.dgd dgdVar, defpackage.affg affgVar, int i, int i2) {
        this.e = i2;
        this.a = j;
        this.c = dgdVar;
        this.d = affgVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [bkc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [cgf, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.e != 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.b;
            long j = this.a;
            ?? r5 = this.d;
            ?? r4 = this.c;
            int i2 = i | 1;
            int i3 = i2 & 306783378;
            int i4 = i2 & 613566756;
            defpackage.afw.O(r4, r5, j, bveVar, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar2 = (defpackage.bve) obj;
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.b;
        ?? r3 = this.d;
        java.lang.Object obj3 = this.c;
        long j2 = this.a;
        int i6 = i5 | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        defpackage.dai.aC(j2, (defpackage.dgd) obj3, r3, bveVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
        return defpackage.afbk.a;
    }

    public /* synthetic */ btm(defpackage.bkc bkcVar, defpackage.cgf cgfVar, long j, int i, int i2) {
        this.e = i2;
        this.c = bkcVar;
        this.d = cgfVar;
        this.a = j;
        this.b = i;
    }
}
