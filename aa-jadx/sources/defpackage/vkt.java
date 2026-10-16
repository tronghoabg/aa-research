package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vkt implements defpackage.affg {
    public final /* synthetic */ defpackage.cgf a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ vkt(defpackage.cgf cgfVar, long j, int i, int i2) {
        this.d = i2;
        this.a = cgfVar;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.d != 0) {
            ((java.lang.Integer) obj2).intValue();
            int i = this.c;
            long j = this.b;
            int i2 = i | 1;
            int i3 = i2 & 306783378;
            int i4 = 613566756 & i2;
            defpackage.vvb.B(this.a, j, (defpackage.bve) obj, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return defpackage.afbk.a;
        }
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.c;
        long j2 = this.b;
        int i6 = i5 | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        defpackage.vvb.A(this.a, j2, (defpackage.bve) obj, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
        return defpackage.afbk.a;
    }
}
