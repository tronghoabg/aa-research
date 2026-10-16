package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class vjw implements afeg {
    public final /* synthetic */ cfy a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ vjw(cfy cfyVar, long j, int i, int i2) {
        this.d = i2;
        this.a = cfyVar;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.d != 0) {
            ((Integer) obj2).intValue();
            int i = this.c;
            long j = this.b;
            int i2 = i | 1;
            int i3 = i2 & 306783378;
            int i4 = 613566756 & i2;
            vja.l(this.a, j, (bux) obj, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i5 = this.c;
        long j2 = this.b;
        int i6 = i5 | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        vja.k(this.a, j2, (bux) obj, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
        return afak.a;
    }
}
