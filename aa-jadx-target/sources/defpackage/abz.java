package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class abz implements defpackage.affg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ defpackage.cgf b;
    public final /* synthetic */ defpackage.acw c;
    public final /* synthetic */ defpackage.acx d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ defpackage.affh f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ java.lang.Object i;
    private final /* synthetic */ int j;

    public /* synthetic */ abz(java.lang.Object obj, boolean z, defpackage.cgf cgfVar, defpackage.acw acwVar, defpackage.acx acxVar, java.lang.String str, defpackage.affh affhVar, int i, int i2, int i3) {
        this.j = i3;
        this.i = obj;
        this.a = z;
        this.b = cgfVar;
        this.c = acwVar;
        this.d = acxVar;
        this.e = str;
        this.f = affhVar;
        this.g = i;
        this.h = i2;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [awd, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.j != 0) {
            ((java.lang.Integer) obj2).intValue();
            int i = this.g | 1;
            int i2 = 306783378 & i;
            int i3 = 613566756 & i;
            int i4 = this.h;
            defpackage.affh affhVar = this.f;
            java.lang.String str = this.e;
            defpackage.acx acxVar = this.d;
            defpackage.acw acwVar = this.c;
            defpackage.cgf cgfVar = this.b;
            boolean z = this.a;
            ?? r4 = this.i;
            defpackage.ca.N(r4, z, cgfVar, acwVar, acxVar, str, affhVar, (defpackage.bve) obj, (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3), i4);
            return defpackage.afbk.a;
        }
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.g | 1;
        int i6 = 306783378 & i5;
        int i7 = 613566756 & i5;
        int i8 = (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7);
        int i9 = this.h;
        defpackage.affh affhVar2 = this.f;
        java.lang.String str2 = this.e;
        defpackage.acx acxVar2 = this.d;
        defpackage.acw acwVar2 = this.c;
        defpackage.cgf cgfVar2 = this.b;
        boolean z2 = this.a;
        defpackage.ca.P((defpackage.atx) this.i, z2, cgfVar2, acwVar2, acxVar2, str2, affhVar2, (defpackage.bve) obj, i8, i9);
        return defpackage.afbk.a;
    }
}
