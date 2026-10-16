package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nat implements defpackage.affg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ defpackage.affh b;
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;
    public final /* synthetic */ java.lang.Object h;
    private final /* synthetic */ int i;

    public /* synthetic */ nat(bqp bqpVar, defpackage.cgf cgfVar, boolean z, bqb bqbVar, defpackage.ask askVar, defpackage.affh affhVar, defpackage.affh affhVar2, int i, int i2) {
        this.i = i2;
        this.e = bqpVar;
        this.d = cgfVar;
        this.a = z;
        this.g = bqbVar;
        this.f = askVar;
        this.h = affhVar;
        this.b = affhVar2;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [ask, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [affh, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.i == 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            ((java.lang.Integer) obj2).intValue();
            int i = this.c;
            defpackage.affh affhVar = this.b;
            java.lang.Object obj3 = this.h;
            java.lang.Object obj4 = this.g;
            java.lang.Object obj5 = this.f;
            int i2 = i | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            defpackage.mkc.r(this.a, (j$.time.Duration) this.d, this.e, (defpackage.acw) obj5, (defpackage.acx) obj4, (java.lang.String) obj3, affhVar, bveVar, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar2 = (defpackage.bve) obj;
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.c;
        defpackage.affh affhVar2 = this.b;
        ?? r9 = this.h;
        ?? r8 = this.f;
        java.lang.Object obj6 = this.g;
        boolean z = this.a;
        int i6 = i5 | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        bqn.d((bqp) this.e, (defpackage.cgf) this.d, z, (bqb) obj6, (defpackage.ask) r8, (defpackage.affh) r9, affhVar2, bveVar2, (i8 >> 1) | i7 | (i6 & (-920350135)) | ((i7 + i7) & i8));
        return defpackage.afbk.a;
    }

    public /* synthetic */ nat(boolean z, j$.time.Duration duration, defpackage.cgf cgfVar, defpackage.acw acwVar, defpackage.acx acxVar, java.lang.String str, defpackage.affh affhVar, int i, int i2) {
        this.i = i2;
        this.a = z;
        this.d = duration;
        this.e = cgfVar;
        this.f = acwVar;
        this.g = acxVar;
        this.h = str;
        this.b = affhVar;
        this.c = i;
    }
}
