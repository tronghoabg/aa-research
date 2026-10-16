package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class nzv implements afeg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ nzv(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v16, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [afdr, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).intValue();
                int i = this.a | 1;
                int i2 = i & 306783378;
                int i3 = 613566756 & i;
                ((oag) this.b).e(this.c, (bux) obj, (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3));
                break;
            case 1:
                ((Integer) obj2).intValue();
                int i4 = this.a | 1;
                int i5 = i4 & 306783378;
                int i6 = 613566756 & i4;
                nxm.b(this.b, this.c, (bux) obj, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                break;
            case 2:
                ((Integer) obj2).intValue();
                int i7 = this.a | 1;
                int i8 = i7 & 306783378;
                int i9 = 613566756 & i7;
                mlq.r(this.c, this.b, (bux) obj, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
                break;
            case 3:
                ((Integer) obj2).intValue();
                int i10 = this.a | 1;
                int i11 = i10 & 306783378;
                int i12 = 613566756 & i10;
                mlq.u(this.b, this.c, (bux) obj, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 + i11) & i12));
                break;
            case 4:
                ((Integer) obj2).intValue();
                int i13 = this.a | 1;
                int i14 = i13 & 306783378;
                int i15 = 613566756 & i13;
                mva.I(this.c, this.b, (bux) obj, (i13 & (-920350135)) | i14 | (i15 >> 1) | ((i14 + i14) & i15));
                break;
            case 5:
                ((Integer) obj2).intValue();
                int i16 = this.a | 1;
                int i17 = i16 & 306783378;
                int i18 = 613566756 & i16;
                mva.Q((mva) this.b, this.c, (bux) obj, (i16 & (-920350135)) | i17 | (i18 >> 1) | ((i17 + i17) & i18));
                break;
            case 6:
                bux buxVar = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    this.b.invoke(this.c, buxVar, Integer.valueOf(this.a & 8));
                } else {
                    buxVar.s();
                }
                break;
            case 7:
                bux buxVar2 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i19 = iIntValue2 & 3;
                if (buxVar2.I(i19 != 2, iIntValue2 & 1)) {
                    this.b.invoke(this.c, buxVar2, Integer.valueOf(this.a & 8));
                } else {
                    buxVar2.s();
                }
                break;
            default:
                ((Integer) obj2).intValue();
                int i20 = this.a | 1;
                int i21 = i20 & 306783378;
                int i22 = 613566756 & i20;
                std.n((tjq) this.c, this.b, (bux) obj, (i20 & (-920350135)) | i21 | (i22 >> 1) | ((i21 + i21) & i22));
                break;
        }
        return afak.a;
    }

    public /* synthetic */ nzv(Object obj, Object obj2, int i, int i2, byte[] bArr) {
        this.d = i2;
        this.c = obj;
        this.b = obj2;
        this.a = i;
    }
}
