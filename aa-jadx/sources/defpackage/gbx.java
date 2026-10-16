package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gbx implements defpackage.affg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ gbx(defpackage.ask askVar, defpackage.cgf cgfVar, defpackage.bqb bqbVar, boolean z, long j, int i, int i2) {
        this.g = i2;
        this.e = askVar;
        this.f = cgfVar;
        this.d = bqbVar;
        this.a = z;
        this.b = j;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [ask, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [cgf, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.g == 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.c;
            ?? r5 = this.f;
            long j = this.b;
            int i2 = i | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            defpackage.gca.b(this.a, (defpackage.gcc) this.d, this.e, j, r5, bveVar, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar2 = (defpackage.bve) obj;
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.c;
        long j2 = this.b;
        boolean z = this.a;
        java.lang.Object obj3 = this.d;
        ?? r6 = this.f;
        ?? r4 = this.e;
        int i6 = i5 | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        defpackage.bqn.c(r4, r6, (defpackage.bqb) obj3, z, j2, bveVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
        return defpackage.afbk.a;
    }

    public /* synthetic */ gbx(boolean z, defpackage.gcc gccVar, defpackage.cgf cgfVar, long j, defpackage.affg affgVar, int i, int i2) {
        this.g = i2;
        this.a = z;
        this.d = gccVar;
        this.e = cgfVar;
        this.b = j;
        this.f = affgVar;
        this.c = i;
    }
}
