package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class atn implements defpackage.affg {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ atn(java.lang.Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [affh, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((java.lang.Integer) obj2).intValue();
                int i = this.a | 1;
                int i2 = i & 306783378;
                int i3 = i & 613566756;
                defpackage.atp.c(this.b, (defpackage.bve) obj, (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3));
                break;
            case 1:
                ((java.lang.Integer) obj2).intValue();
                int i4 = this.a | 1;
                int i5 = i4 & 306783378;
                int i6 = i4 & 613566756;
                ((defpackage.afo) this.b).a((defpackage.bve) obj, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.bve bveVar = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (bveVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    int i7 = this.a;
                    defpackage.axk axkVar = (defpackage.axk) this.b;
                    defpackage.ov ovVarB = axkVar.a.a.b(i7);
                    ((defpackage.axi) ovVarB.c).a.invoke(axkVar.c, java.lang.Integer.valueOf(i7 - ovVarB.a), bveVar, 0);
                } else {
                    bveVar.s();
                }
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((java.lang.Integer) obj2).intValue();
                int i8 = this.a | 1;
                int i9 = i8 & 306783378;
                int i10 = i8 & 613566756;
                defpackage.afw.ae(this.b, (defpackage.bve) obj, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10));
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.bve bveVar2 = (defpackage.bve) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                int i11 = iIntValue2 & 3;
                if (bveVar2.I(i11 != 2, iIntValue2 & 1)) {
                    int i12 = this.a;
                    defpackage.bbk bbkVar = (defpackage.bbk) this.b;
                    defpackage.ov ovVarB2 = ((defpackage.bbi) bbkVar.a).a.b(i12);
                    ((defpackage.bbf) ovVarB2.c).a.invoke(bbkVar.b, java.lang.Integer.valueOf(i12 - ovVarB2.a), bveVar2, 0);
                } else {
                    bveVar2.s();
                }
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((java.lang.Integer) obj2).intValue();
                int i13 = this.a | 1;
                int i14 = i13 & 306783378;
                int i15 = i13 & 613566756;
                defpackage.asq.ah((defpackage.blw) this.b, (defpackage.bve) obj, (i13 & (-920350135)) | i14 | (i15 >> 1) | ((i14 + i14) & i15));
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((java.lang.Integer) obj2).intValue();
                int i16 = this.a | 1;
                int i17 = i16 & 306783378;
                int i18 = i16 & 613566756;
                ((defpackage.bfk) this.b).b((defpackage.bve) obj, (i16 & (-920350135)) | i17 | (i18 >> 1) | ((i17 + i17) & i18));
                break;
            default:
                ((java.lang.Integer) obj2).intValue();
                int i19 = this.a | 1;
                int i20 = i19 & 306783378;
                int i21 = i19 & 613566756;
                ((com.google.android.apps.auto.components.coolwalk.compose.viewcompat.CarButton) this.b).l((defpackage.bve) obj, (i19 & (-920350135)) | i20 | (i21 >> 1) | ((i20 + i20) & i21));
                break;
        }
        return defpackage.afbk.a;
    }
}
