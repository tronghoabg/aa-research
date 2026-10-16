package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class gaw implements afeg {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ gaw(long j, mss mssVar, cfy cfyVar, int i, int i2) {
        this.e = i2;
        this.a = j;
        this.c = mssVar;
        this.d = cfyVar;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ckv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [cfy, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            ((Integer) obj2).intValue();
            int i2 = this.b;
            ?? r3 = this.d;
            int i3 = i2 | 1;
            int i4 = i3 & 306783378;
            int i5 = 613566756 & i3;
            gax gaxVar = (gax) this.c;
            gaxVar.b(this.a, r3, (bux) obj, (i3 & (-920350135)) | i4 | (i5 >> 1) | (i5 & (i4 + i4)));
            return afak.a;
        }
        if (i == 1) {
            ((Integer) obj2).intValue();
            int i6 = this.b;
            long j = this.a;
            int i7 = i6 | 1;
            int i8 = i7 & 306783378;
            int i9 = 613566756 & i7;
            cng cngVar = (cng) this.c;
            boc.b(cngVar, this.d, j, (bux) obj, (i7 & (-920350135)) | i8 | (i9 >> 1) | (i9 & (i8 + i8)));
            return afak.a;
        }
        if (i == 2) {
            ((Integer) obj2).intValue();
            int i10 = this.b;
            ?? r32 = this.d;
            int i11 = i10 | 1;
            int i12 = i11 & 306783378;
            int i13 = 613566756 & i11;
            gbv gbvVar = (gbv) this.c;
            gbt.c(gbvVar, this.a, r32, (bux) obj, (i11 & (-920350135)) | i12 | (i13 >> 1) | (i13 & (i12 + i12)));
            return afak.a;
        }
        if (i != 3) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i14 = this.b;
            long j2 = this.a;
            ?? r7 = this.d;
            int i15 = i14 | 1;
            int i16 = i15 & 306783378;
            int i17 = 613566756 & i15;
            lws.x((String) this.c, r7, j2, buxVar, (i17 >> 1) | i16 | (i15 & (-920350135)) | ((i16 + i16) & i17));
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i18 = this.b;
        ?? r33 = this.d;
        Object obj3 = this.c;
        long j3 = this.a;
        int i19 = i18 | 1;
        int i20 = i19 & 306783378;
        int i21 = 613566756 & i19;
        mss mssVar = (mss) obj3;
        mva.o(j3, mssVar, r33, (bux) obj, (i19 & (-920350135)) | i20 | (i21 >> 1) | ((i20 + i20) & i21));
        return afak.a;
    }

    public /* synthetic */ gaw(Object obj, long j, Object obj2, int i, int i2) {
        this.e = i2;
        this.c = obj;
        this.a = j;
        this.d = obj2;
        this.b = i;
    }

    public /* synthetic */ gaw(Object obj, cfy cfyVar, long j, int i, int i2) {
        this.e = i2;
        this.c = obj;
        this.d = cfyVar;
        this.a = j;
        this.b = i;
    }
}
