package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class abp implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ abp(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v16, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v21, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v26, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v31, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v36, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v91, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v93, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v98, types: [ask, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v58, types: [asi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [affc, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        long j;
        defpackage.afd afdVar;
        defpackage.afd afdVar2;
        defpackage.afd afdVar3;
        defpackage.afd afdVar4;
        float f = 1.0f;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                long j2 = iIntValue;
                defpackage.abr abrVar = (defpackage.abr) this.b;
                return java.lang.Integer.valueOf(((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf((-defpackage.dlw.a(abrVar.d((j2 & 4294967295L) | (j2 << 32), abrVar.e()))) - iIntValue))).intValue());
            case 1:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                defpackage.abr abrVar2 = (defpackage.abr) this.b;
                long j3 = iIntValue2;
                return java.lang.Integer.valueOf(((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf(((int) (abrVar2.e() >> 32)) - defpackage.dlw.a(abrVar2.d((j3 & 4294967295L) | (j3 << 32), abrVar2.e()))))).intValue());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int iIntValue3 = ((java.lang.Integer) obj).intValue();
                defpackage.abr abrVar3 = (defpackage.abr) this.b;
                long j4 = iIntValue3;
                return java.lang.Integer.valueOf(((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf(((int) (abrVar3.e() & 4294967295L)) - defpackage.dlw.b(abrVar3.d((j4 & 4294967295L) | (j4 << 32), abrVar3.e()))))).intValue());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int iIntValue4 = ((java.lang.Integer) obj).intValue();
                long j5 = iIntValue4;
                defpackage.abr abrVar4 = (defpackage.abr) this.b;
                return java.lang.Integer.valueOf(((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf((-defpackage.dlw.b(abrVar4.d((j5 & 4294967295L) | (j5 << 32), abrVar4.e()))) - iIntValue4))).intValue());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int iIntValue5 = ((java.lang.Integer) obj).intValue();
                defpackage.abr abrVar5 = (defpackage.abr) this.b;
                defpackage.bys bysVar = (defpackage.bys) abrVar5.f.a(abrVar5.a.g());
                j = bysVar != null ? ((defpackage.dly) bysVar.a()).a : 0L;
                long j6 = iIntValue5;
                return java.lang.Integer.valueOf(((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf((-defpackage.dlw.a(abrVar5.d((j6 & 4294967295L) | (j6 << 32), j))) - iIntValue5))).intValue());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int iIntValue6 = ((java.lang.Integer) obj).intValue();
                defpackage.abr abrVar6 = (defpackage.abr) this.b;
                defpackage.bys bysVar2 = (defpackage.bys) abrVar6.f.a(abrVar6.a.g());
                j = bysVar2 != null ? ((defpackage.dly) bysVar2.a()).a : 0L;
                long j7 = iIntValue6;
                return java.lang.Integer.valueOf(((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf((-defpackage.dlw.a(abrVar6.d((j7 & 4294967295L) | (j7 << 32), j))) + ((int) (j >> 32))))).intValue());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int iIntValue7 = ((java.lang.Integer) obj).intValue();
                defpackage.abr abrVar7 = (defpackage.abr) this.b;
                defpackage.bys bysVar3 = (defpackage.bys) abrVar7.f.a(abrVar7.a.g());
                j = bysVar3 != null ? ((defpackage.dly) bysVar3.a()).a : 0L;
                long j8 = iIntValue7;
                return java.lang.Integer.valueOf(((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf((-defpackage.dlw.b(abrVar7.d((j8 & 4294967295L) | (j8 << 32), j))) - iIntValue7))).intValue());
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int iIntValue8 = ((java.lang.Integer) obj).intValue();
                defpackage.abr abrVar8 = (defpackage.abr) this.b;
                defpackage.bys bysVar4 = (defpackage.bys) abrVar8.f.a(abrVar8.a.g());
                j = bysVar4 != null ? ((defpackage.dly) bysVar4.a()).a : 0L;
                long j9 = iIntValue8;
                return java.lang.Integer.valueOf(((java.lang.Number) this.a.invoke(java.lang.Integer.valueOf((-defpackage.dlw.b(abrVar8.d((j9 & 4294967295L) | (j9 << 32), j))) + ((int) (j & 4294967295L))))).intValue());
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.agj agjVar = (defpackage.agj) obj;
                defpackage.aga agaVar = defpackage.acs.a;
                defpackage.acj acjVar = defpackage.acj.a;
                defpackage.acj acjVar2 = defpackage.acj.b;
                if (agjVar.h(acjVar, acjVar2)) {
                    defpackage.acy acyVar = ((defpackage.acw) this.b).b.a;
                    return (acyVar == null || (afdVar2 = acyVar.b) == null) ? defpackage.acs.a : afdVar2;
                }
                if (!agjVar.h(acjVar2, defpackage.acj.c)) {
                    return defpackage.acs.a;
                }
                defpackage.acy acyVar2 = ((defpackage.acx) this.a).b.a;
                return (acyVar2 == null || (afdVar = acyVar2.b) == null) ? defpackage.acs.a : afdVar;
            case 9:
                defpackage.aga agaVar2 = defpackage.acs.a;
                int iOrdinal = ((defpackage.acj) obj).ordinal();
                if (iOrdinal == 0) {
                    defpackage.acy acyVar3 = ((defpackage.acw) this.b).b.a;
                    if (acyVar3 != null) {
                        f = acyVar3.a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new defpackage.afas();
                    }
                    defpackage.acy acyVar4 = ((defpackage.acx) this.a).b.a;
                    if (acyVar4 != null) {
                        f = acyVar4.a;
                    }
                }
                return java.lang.Float.valueOf(f);
            case 10:
                defpackage.agj agjVar2 = (defpackage.agj) obj;
                defpackage.aga agaVar3 = defpackage.acs.a;
                defpackage.acj acjVar3 = defpackage.acj.a;
                defpackage.acj acjVar4 = defpackage.acj.b;
                if (agjVar2.h(acjVar3, acjVar4)) {
                    defpackage.adf adfVar = ((defpackage.acw) this.b).b.d;
                    return (adfVar == null || (afdVar4 = adfVar.c) == null) ? defpackage.acs.b : afdVar4;
                }
                if (!agjVar2.h(acjVar4, defpackage.acj.c)) {
                    return defpackage.acs.b;
                }
                defpackage.adf adfVar2 = ((defpackage.acx) this.a).b.d;
                return (adfVar2 == null || (afdVar3 = adfVar2.c) == null) ? defpackage.acs.b : afdVar3;
            case 11:
                defpackage.aga agaVar4 = defpackage.acs.a;
                int iOrdinal2 = ((defpackage.acj) obj).ordinal();
                if (iOrdinal2 == 0) {
                    defpackage.adf adfVar3 = ((defpackage.acw) this.b).b.d;
                    if (adfVar3 != null) {
                        f = adfVar3.a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new defpackage.afas();
                    }
                    defpackage.adf adfVar4 = ((defpackage.acx) this.a).b.d;
                    if (adfVar4 != null) {
                        f = adfVar4.a;
                    }
                }
                return java.lang.Float.valueOf(f);
            case 12:
                ((defpackage.cuw) obj).r((defpackage.cux) this.a, 0, 0, ((defpackage.ady) this.b).a);
                return defpackage.afbk.a;
            case 13:
                java.lang.Object obj2 = this.a;
                defpackage.afo afoVar = (defpackage.afo) obj2;
                defpackage.bzc bzcVar = afoVar.a;
                java.lang.Object obj3 = this.b;
                bzcVar.n(obj3);
                afoVar.b(true);
                return new defpackage.agp(obj2, obj3, 1, null);
            case 14:
                defpackage.aei aeiVar = (defpackage.aei) obj;
                this.a.invoke(aeiVar.a(), ((defpackage.bil) this.b).a.invoke(aeiVar.c));
                return defpackage.afbk.a;
            case 15:
                ahoc.d((aiuw) this.a, (defpackage.afdo) null, 4, new defpackage.agm((defpackage.agn) this.b, null), 1);
                return new defpackage.bdu(1);
            case 16:
                java.lang.Object obj4 = this.b;
                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = ((defpackage.agn) obj4).f;
                java.lang.Object obj5 = this.a;
                snapshotStateList.add(obj5);
                return new defpackage.agp(obj4, obj5, 0);
            case 17:
                return new defpackage.agp(this.a, this.b, 2, null);
            case 18:
                java.lang.Object obj6 = this.b;
                java.lang.Object obj7 = this.a;
                ((defpackage.agn) obj7).x((defpackage.agl) obj6);
                return new defpackage.agp(obj7, obj6, 3, null);
            case 19:
                this.b.c(this.a);
                return defpackage.afbk.a;
            default:
                defpackage.cxn cxnVar = (defpackage.cxn) obj;
                cxnVar.q();
                defpackage.dai.aG(cxnVar, (defpackage.cju) this.b, (defpackage.cka) this.a, 0.0f, null, 60);
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ abp(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
