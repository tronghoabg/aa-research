package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class agg implements defpackage.affg {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ agg(defpackage.azm azmVar, int i, java.lang.Object obj, int i2) {
        this.d = i2;
        this.c = azmVar;
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v15, types: [azm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v27, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v29, types: [bgb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v31, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v33, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v35, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v46, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [cgf, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                ((java.lang.Integer) obj2).intValue();
                int i = this.b;
                int i2 = i | 1;
                int i3 = 306783378 & i2;
                int i4 = 613566756 & i2;
                ((defpackage.agn) this.c).h(this.a, (defpackage.bve) obj, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
                break;
            case 1:
                ((java.lang.Integer) obj2).intValue();
                int i5 = this.b;
                int i6 = i5 | 1;
                int i7 = 306783378 & i6;
                int i8 = 613566756 & i6;
                defpackage.acs.l((defpackage.agn) this.c, this.a, (defpackage.bve) obj, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((java.lang.Integer) obj2).intValue();
                int i9 = this.b;
                int i10 = i9 | 1;
                int i11 = 306783378 & i10;
                int i12 = 613566756 & i10;
                defpackage.afw.z(this.c, this.a, (defpackage.bve) obj, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 + i11) & i12));
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((java.lang.Integer) obj2).intValue();
                int i13 = this.b;
                int i14 = i13 | 1;
                int i15 = 306783378 & i14;
                int i16 = 613566756 & i14;
                defpackage.afw.A(this.c, this.a, (defpackage.bve) obj, (i14 & (-920350135)) | i15 | (i16 >> 1) | ((i15 + i15) & i16));
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((java.lang.Integer) obj2).intValue();
                int i17 = this.b;
                int i18 = i17 | 1;
                int i19 = 306783378 & i18;
                int i20 = 613566756 & i18;
                ((defpackage.bil) this.a).q((defpackage.alu) this.c, (defpackage.bve) obj, (i18 & (-920350135)) | i19 | (i20 >> 1) | ((i19 + i19) & i20));
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.bve bveVar = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                int i21 = iIntValue & 3;
                if (bveVar.I(i21 != 2, iIntValue & 1)) {
                    this.c.e(this.b, this.a, bveVar, 0);
                } else {
                    bveVar.s();
                }
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((java.lang.Integer) obj2).intValue();
                int i22 = this.b;
                int i23 = i22 | 1;
                int i24 = 306783378 & i23;
                int i25 = 613566756 & i23;
                defpackage.bcz.a((defpackage.dfb) this.c, this.a, (defpackage.bve) obj, (i23 & (-920350135)) | i24 | (i25 >> 1) | ((i24 + i24) & i25));
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((java.lang.Integer) obj2).intValue();
                int i26 = this.b;
                int i27 = i26 | 1;
                int i28 = 306783378 & i27;
                int i29 = 613566756 & i27;
                defpackage.afw.H((defpackage.blw) this.c, this.a, (defpackage.bve) obj, (i27 & (-920350135)) | i28 | (i29 >> 1) | ((i28 + i28) & i29));
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((java.lang.Integer) obj2).intValue();
                int i30 = this.b;
                int i31 = i30 | 1;
                int i32 = 306783378 & i31;
                int i33 = 613566756 & i31;
                defpackage.afw.G((defpackage.blw) this.c, this.a, (defpackage.bve) obj, (i31 & (-920350135)) | i32 | (i33 >> 1) | ((i32 + i32) & i33));
                break;
            case 9:
                ((java.lang.Integer) obj2).intValue();
                int i34 = this.b;
                int i35 = i34 | 1;
                int i36 = 306783378 & i35;
                int i37 = 613566756 & i35;
                defpackage.axd.ab(this.c, this.a, (defpackage.bve) obj, (i35 & (-920350135)) | i36 | (i37 >> 1) | ((i36 + i36) & i37));
                break;
            case 10:
                ((java.lang.Integer) obj2).intValue();
                int i38 = this.b;
                int i39 = i38 | 1;
                int i40 = 306783378 & i39;
                int i41 = 613566756 & i39;
                defpackage.axd.aa(this.c, this.a, (defpackage.bve) obj, (i39 & (-920350135)) | i40 | (i41 >> 1) | ((i40 + i40) & i41));
                break;
            case 11:
                ((java.lang.Integer) obj2).intValue();
                int i42 = this.b;
                int i43 = i42 | 1;
                int i44 = 306783378 & i43;
                int i45 = 613566756 & i43;
                defpackage.bgq.a(this.a, (defpackage.bfx) this.c, (defpackage.bve) obj, (i43 & (-920350135)) | i44 | (i45 >> 1) | ((i44 + i44) & i45));
                break;
            case 12:
                ((java.lang.Integer) obj2).intValue();
                int i46 = this.b;
                int i47 = i46 | 1;
                int i48 = 306783378 & i47;
                int i49 = 613566756 & i47;
                defpackage.bgq.d(this.c, this.a, (defpackage.bve) obj, (i47 & (-920350135)) | i48 | (i49 >> 1) | ((i48 + i48) & i49));
                break;
            case 13:
                ((java.lang.Integer) obj2).intValue();
                int i50 = this.b;
                int i51 = i50 | 1;
                int i52 = 306783378 & i51;
                int i53 = 613566756 & i51;
                defpackage.axd.Y(this.c, this.a, (defpackage.bve) obj, (i51 & (-920350135)) | i52 | (i53 >> 1) | ((i52 + i52) & i53));
                break;
            case 14:
                ((java.lang.Integer) obj2).intValue();
                int i54 = this.b;
                int i55 = i54 | 1;
                int i56 = 306783378 & i55;
                int i57 = 613566756 & i55;
                defpackage.axd.Z(this.c, this.a, (defpackage.bve) obj, (i55 & (-920350135)) | i56 | (i57 >> 1) | ((i56 + i56) & i57));
                break;
            case 15:
                ((java.lang.Integer) obj2).intValue();
                int i58 = this.b;
                int i59 = i58 | 1;
                int i60 = 306783378 & i59;
                int i61 = 613566756 & i59;
                ((defpackage.bgy) this.a).a((android.graphics.drawable.Drawable) this.c, (defpackage.bve) obj, (i59 & (-920350135)) | i60 | (i61 >> 1) | ((i60 + i60) & i61));
                break;
            case 16:
                ((java.lang.Integer) obj2).intValue();
                int i62 = this.b;
                int i63 = i62 | 1;
                int i64 = 306783378 & i63;
                int i65 = 613566756 & i63;
                ((defpackage.bhp) this.c).c(this.a, (defpackage.bve) obj, (i63 & (-920350135)) | i64 | (i65 >> 1) | ((i64 + i64) & i65));
                break;
            case 17:
                ((java.lang.Integer) obj2).intValue();
                int i66 = this.b;
                int i67 = i66 | 1;
                int i68 = 306783378 & i67;
                int i69 = 613566756 & i67;
                ((defpackage.bhp) this.c).c(this.a, (defpackage.bve) obj, (i67 & (-920350135)) | i68 | (i69 >> 1) | ((i68 + i68) & i69));
                break;
            case 18:
                ((java.lang.Integer) obj2).intValue();
                int i70 = this.b;
                int i71 = i70 | 1;
                int i72 = 306783378 & i71;
                int i73 = 613566756 & i71;
                defpackage.bxi.u(this.c, this.a, (defpackage.bve) obj, (i71 & (-920350135)) | i72 | (i73 >> 1) | ((i72 + i72) & i73));
                break;
            case 19:
                ((java.lang.Integer) obj2).intValue();
                int i74 = this.b;
                int i75 = i74 | 1;
                int i76 = 306783378 & i75;
                int i77 = 613566756 & i75;
                defpackage.dai.aA((defpackage.bxk) this.c, this.a, (defpackage.bve) obj, (i75 & (-920350135)) | i76 | (i77 >> 1) | ((i76 + i76) & i77));
                break;
            default:
                ((java.lang.Integer) obj2).intValue();
                int i78 = this.b;
                int i79 = i78 | 1;
                int i80 = 306783378 & i79;
                int i81 = 613566756 & i79;
                defpackage.dai.aB((defpackage.bxk[]) this.a, this.c, (defpackage.bve) obj, (i79 & (-920350135)) | i80 | (i81 >> 1) | ((i80 + i80) & i81));
                break;
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ agg(java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        this.d = i2;
        this.c = obj;
        this.a = obj2;
        this.b = i;
    }

    public /* synthetic */ agg(java.lang.Object obj, java.lang.Object obj2, int i, int i2, byte[] bArr) {
        this.d = i2;
        this.a = obj;
        this.c = obj2;
        this.b = i;
    }
}
