package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mwf implements afeg {
    public final /* synthetic */ bbt a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ afec g;
    public final /* synthetic */ int h;
    private final /* synthetic */ int i;

    public /* synthetic */ mwf(bbt bbtVar, int i, float f, float f2, long j, long j2, afec afecVar, int i2, int i3) {
        this.i = i3;
        this.a = bbtVar;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = j;
        this.f = j2;
        this.g = afecVar;
        this.h = i2;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.i != 0) {
            ((Integer) obj2).intValue();
            int i = this.h;
            afec afecVar = this.g;
            long j = this.f;
            long j2 = this.e;
            float f = this.d;
            float f2 = this.c;
            int i2 = this.b;
            int i3 = i | 1;
            int i4 = i3 & 306783378;
            int i5 = 613566756 & i3;
            mcd.q(this.a, i2, f2, f, j2, j, afecVar, (bux) obj, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 + i4) & i5));
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i6 = this.h;
        afec afecVar2 = this.g;
        long j3 = this.f;
        long j4 = this.e;
        float f3 = this.d;
        float f4 = this.c;
        int i7 = this.b;
        int i8 = i6 | 1;
        int i9 = 306783378 & i8;
        int i10 = 613566756 & i8;
        int i11 = (i8 & (-920350135)) | i9 | (i10 >> 1);
        mcd.p(this.a, i7, f4, f3, j4, j3, afecVar2, (bux) obj, ((i9 + i9) & i10) | i11);
        return afak.a;
    }
}
