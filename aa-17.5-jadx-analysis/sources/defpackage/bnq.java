package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class bnq implements afeg {
    public final /* synthetic */ cfy a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    private final /* synthetic */ int f;

    public /* synthetic */ bnq(cfy cfyVar, float f, long j, int i, int i2, int i3) {
        this.f = i3;
        this.a = cfyVar;
        this.b = f;
        this.c = j;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.f != 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i = this.d | 1;
            int i2 = i & 306783378;
            int i3 = 613566756 & i;
            int i4 = this.e;
            long j = this.c;
            float f = this.b;
            cfy cfyVar = this.a;
            xb.b(cfyVar, f, j, buxVar, (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3), i4);
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        ((Integer) obj2).intValue();
        int i5 = this.d | 1;
        int i6 = i5 & 306783378;
        int i7 = 613566756 & i5;
        int i8 = (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7);
        int i9 = this.e;
        long j2 = this.c;
        xb.a(this.a, this.b, j2, buxVar2, i8, i9);
        return afak.a;
    }
}
