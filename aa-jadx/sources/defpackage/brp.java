package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class brp implements defpackage.affg {
    public final /* synthetic */ defpackage.cgf a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ defpackage.affh d;
    public final /* synthetic */ defpackage.affg e;
    public final /* synthetic */ defpackage.affg f;
    public final /* synthetic */ int g;
    private final /* synthetic */ int h;

    public /* synthetic */ brp(defpackage.cgf cgfVar, long j, long j2, defpackage.affh affhVar, defpackage.affg affgVar, defpackage.affg affgVar2, int i, int i2) {
        this.h = i2;
        this.a = cgfVar;
        this.b = j;
        this.c = j2;
        this.d = affhVar;
        this.e = affgVar;
        this.f = affgVar2;
        this.g = i;
    }

    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.h != 0) {
            ((java.lang.Integer) obj2).intValue();
            int i = this.g;
            defpackage.affg affgVar = this.f;
            defpackage.affg affgVar2 = this.e;
            defpackage.affh affhVar = this.d;
            long j = this.c;
            long j2 = this.b;
            defpackage.cgf cgfVar = this.a;
            int i2 = i | 1;
            int i3 = i2 & 306783378;
            int i4 = 613566756 & i2;
            defpackage.tw.i(cgfVar, j2, j, affhVar, affgVar2, affgVar, (defpackage.bve) obj, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return defpackage.afbk.a;
        }
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.g;
        defpackage.affg affgVar3 = this.f;
        defpackage.affg affgVar4 = this.e;
        defpackage.affh affhVar2 = this.d;
        long j3 = this.c;
        long j4 = this.b;
        int i6 = i5 | 1;
        int i7 = 306783378 & i6;
        int i8 = 613566756 & i6;
        int i9 = (i6 & (-920350135)) | i7 | (i8 >> 1);
        defpackage.tw.j(this.a, j4, j3, affhVar2, affgVar4, affgVar3, (defpackage.bve) obj, ((i7 + i7) & i8) | i9);
        return defpackage.afbk.a;
    }
}
