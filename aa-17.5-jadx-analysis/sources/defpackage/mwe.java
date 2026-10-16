package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mwe implements afeg {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ mwe(bbt bbtVar, int i, float f, float f2, long j, long j2, int i2, int i3) {
        this.h = i3;
        this.g = bbtVar;
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = j;
        this.e = j2;
        this.f = i2;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [cfy, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.h;
        if (i == 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f;
            long j = this.e;
            long j2 = this.d;
            float f = this.c;
            float f2 = this.b;
            int i3 = i2 | 1;
            int i4 = i3 & 306783378;
            int i5 = 613566756 & i3;
            bbt bbtVar = (bbt) this.g;
            int i6 = (i3 & (-920350135)) | i4 | (i5 >> 1);
            mcd.r(bbtVar, this.a, f2, f, j2, j, (bux) obj, ((i4 + i4) & i5) | i6);
            return afak.a;
        }
        if (i != 1) {
            ((Integer) obj2).intValue();
            int i7 = this.f;
            long j3 = this.e;
            long j4 = this.d;
            float f3 = this.c;
            float f4 = this.b;
            int i8 = this.a;
            int i9 = i7 | 1;
            int i10 = 306783378 & i9;
            int i11 = 613566756 & i9;
            mcd.s((bbt) this.g, i8, f4, f3, j4, j3, (bux) obj, (i11 >> 1) | i10 | (i9 & (-920350135)) | ((i10 + i10) & i11));
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i12 = this.f;
        float f5 = this.c;
        int i13 = this.a;
        long j5 = this.e;
        float f6 = this.b;
        long j6 = this.d;
        int i14 = i12 | 1;
        int i15 = i14 & 306783378;
        int i16 = 613566756 & i14;
        int i17 = (i14 & (-920350135)) | i15 | (i16 >> 1);
        boz.h(this.g, j6, f6, j5, i13, f5, (bux) obj, ((i15 + i15) & i16) | i17);
        return afak.a;
    }

    public /* synthetic */ mwe(cfy cfyVar, long j, float f, long j2, int i, float f2, int i2, int i3) {
        this.h = i3;
        this.g = cfyVar;
        this.d = j;
        this.b = f;
        this.e = j2;
        this.a = i;
        this.c = f2;
        this.f = i2;
    }
}
