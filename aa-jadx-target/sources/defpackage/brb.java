package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class brb implements defpackage.affg {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ brb(int i, defpackage.bys bysVar, int i2) {
        this.c = i2;
        this.a = i;
        this.b = bysVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [cfu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.cgf cgfVarN;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((java.lang.Integer) obj2).intValue();
                int i = this.a | 1;
                int i2 = i & 306783378;
                int i3 = 613566756 & i;
                brh.c((defpackage.affg) this.b, (defpackage.bve) obj, (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3));
                break;
            case 1:
                ((java.lang.Integer) obj2).intValue();
                int i4 = this.a | 1;
                int i5 = i4 & 306783378;
                int i6 = 613566756 & i4;
                defpackage.boy.a(this.b, (defpackage.bve) obj, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((java.lang.Integer) obj2).intValue();
                int i7 = this.a | 1;
                int i8 = i7 & 306783378;
                int i9 = 613566756 & i7;
                ((defpackage.dbg) this.b).b((defpackage.bve) obj, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((java.lang.Integer) obj2).intValue();
                int i10 = this.a | 1;
                int i11 = i10 & 306783378;
                int i12 = 613566756 & i10;
                ((dnr) this.b).b((defpackage.bve) obj, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 + i11) & i12));
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((java.lang.Integer) obj2).intValue();
                int i13 = this.a | 1;
                int i14 = i13 & 306783378;
                int i15 = 613566756 & i13;
                ((dny) this.b).b((defpackage.bve) obj, (i13 & (-920350135)) | i14 | (i15 >> 1) | ((i14 + i14) & i15));
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.bve bveVar = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (bveVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    for (fwv fwvVar : this.b) {
                        int i16 = this.a;
                        defpackage.cgc cgcVar = defpackage.cgf.e;
                        int i17 = i16 - 1;
                        if (i17 == 0) {
                            bveVar.v(-1745073179);
                            float f = defpackage.gvt.i(bveVar).h;
                            cgfVarN = defpackage.awj.n(cgcVar, Float.NaN, 420.0f);
                            bveVar.o();
                        } else if (i17 != 1) {
                            bveVar.v(-1745066909);
                            bveVar.o();
                            cgfVarN = defpackage.awj.r(cgcVar);
                        } else {
                            bveVar.v(-1745070093);
                            float f2 = defpackage.gvt.i(bveVar).h;
                            cgfVarN = defpackage.awj.n(cgcVar, 380.0f, 420.0f);
                            bveVar.o();
                        }
                        fwu.a(fwvVar, defpackage.dai.y(cgfVarN, "action"), (hkf) null, false, (defpackage.cld) null, (defpackage.ask) null, (defpackage.dlr) null, (defpackage.dlr) null, (fxg) null, bveVar, 8, 508);
                    }
                } else {
                    bveVar.s();
                }
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((java.lang.Integer) obj2).intValue();
                int i18 = this.a | 1;
                int i19 = i18 & 306783378;
                int i20 = 613566756 & i18;
                defpackage.fzv.b(this.b, (defpackage.bve) obj, (i18 & (-920350135)) | i19 | (i20 >> 1) | ((i19 + i19) & i20));
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((java.lang.Integer) obj2).intValue();
                int i21 = this.a | 1;
                int i22 = i21 & 306783378;
                int i23 = 613566756 & i21;
                gbl.b((defpackage.cfu) this.b, (defpackage.bve) obj, (i21 & (-920350135)) | i22 | (i23 >> 1) | ((i22 + i22) & i23));
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((java.lang.Integer) obj2).intValue();
                int i24 = this.a | 1;
                int i25 = i24 & 306783378;
                int i26 = 613566756 & i24;
                fxr.j((defpackage.cit) this.b, (defpackage.bve) obj, (i24 & (-920350135)) | i25 | (i26 >> 1) | ((i25 + i25) & i26));
                break;
            case 9:
                ((java.lang.Integer) obj2).intValue();
                int i27 = this.a | 1;
                int i28 = i27 & 306783378;
                int i29 = 613566756 & i27;
                gpw.b((defpackage.cgf) this.b, (defpackage.bve) obj, (i27 & (-920350135)) | i28 | (i29 >> 1) | ((i28 + i28) & i29));
                break;
            case 10:
                ((java.lang.Integer) obj2).intValue();
                int i30 = this.a | 1;
                int i31 = i30 & 306783378;
                int i32 = 613566756 & i30;
                gkk.f((gah) this.b, (defpackage.bve) obj, (i30 & (-920350135)) | i31 | (i32 >> 1) | ((i31 + i31) & i32));
                break;
            case 11:
                defpackage.bve bveVar2 = (defpackage.bve) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (bveVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    gcg.a(new gch(((java.lang.Number) this.b.a()).floatValue(), new hkf(defpackage.gvt.e(bveVar2).C(), defpackage.gvt.e(bveVar2).C())), defpackage.awj.d(defpackage.awj.r(defpackage.cgf.e), defpackage.gjr.P1.k), this.a, bveVar2, 0, 0);
                } else {
                    bveVar2.s();
                }
                break;
            case 12:
                ((java.lang.Integer) obj2).intValue();
                int i33 = this.a | 1;
                int i34 = i33 & 306783378;
                int i35 = 613566756 & i33;
                guj.g((gvk) this.b, (defpackage.bve) obj, (i33 & (-920350135)) | i34 | (i35 >> 1) | ((i34 + i34) & i35));
                break;
            case 13:
                ((java.lang.Integer) obj2).intValue();
                int i36 = this.a | 1;
                int i37 = i36 & 306783378;
                int i38 = 613566756 & i36;
                guj.b((guk) this.b, (defpackage.bve) obj, (i36 & (-920350135)) | i37 | (i38 >> 1) | ((i37 + i37) & i38));
                break;
            case 14:
                ((java.lang.Integer) obj2).intValue();
                int i39 = this.a | 1;
                int i40 = i39 & 306783378;
                int i41 = 613566756 & i39;
                guj.b((guk) this.b, (defpackage.bve) obj, (i39 & (-920350135)) | i40 | (i41 >> 1) | ((i40 + i40) & i41));
                break;
            case 15:
                ((java.lang.Integer) obj2).intValue();
                int i42 = this.a | 1;
                int i43 = i42 & 306783378;
                int i44 = 613566756 & i42;
                gum.b((gun) this.b, (defpackage.bve) obj, (i42 & (-920350135)) | i43 | (i44 >> 1) | ((i43 + i43) & i44));
                break;
            case 16:
                ((java.lang.Integer) obj2).intValue();
                int i45 = this.a | 1;
                int i46 = i45 & 306783378;
                int i47 = 613566756 & i45;
                gut.c((guo) this.b, (defpackage.bve) obj, (i45 & (-920350135)) | i46 | (i47 >> 1) | ((i46 + i46) & i47));
                break;
            case 17:
                ((java.lang.Integer) obj2).intValue();
                int i48 = this.a | 1;
                int i49 = i48 & 306783378;
                int i50 = 613566756 & i48;
                gut.b((gun) this.b, (defpackage.bve) obj, (i48 & (-920350135)) | i49 | (i50 >> 1) | ((i49 + i49) & i50));
                break;
            case 18:
                ((java.lang.Integer) obj2).intValue();
                int i51 = this.a | 1;
                int i52 = i51 & 306783378;
                int i53 = 613566756 & i51;
                guw.a((gux) this.b, (defpackage.bve) obj, (i51 & (-920350135)) | i52 | (i53 >> 1) | ((i52 + i52) & i53));
                break;
            case 19:
                ((java.lang.Integer) obj2).intValue();
                int i54 = this.a | 1;
                int i55 = i54 & 306783378;
                int i56 = 613566756 & i54;
                hea.i((defpackage.cgf) this.b, (defpackage.bve) obj, (i54 & (-920350135)) | i55 | (i56 >> 1) | ((i55 + i55) & i56));
                break;
            default:
                ((java.lang.Integer) obj2).intValue();
                int i57 = this.a | 1;
                int i58 = i57 & 306783378;
                int i59 = 613566756 & i57;
                hea.d((defpackage.cgf) this.b, (defpackage.bve) obj, (i57 & (-920350135)) | i58 | (i59 >> 1) | ((i58 + i58) & i59));
                break;
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ brb(java.lang.Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
