package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class xsz implements defpackage.affc {
    private final /* synthetic */ int a;

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                xti xtiVar = (xti) obj;
                xtiVar.getClass();
                xtiVar.b();
                return defpackage.afbk.a;
            case 1:
                xso xsoVar = (xso) obj;
                xsoVar.getClass();
                xsoVar.b();
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                xtb xtbVar = (xtb) obj;
                xtbVar.getClass();
                xtbVar.a();
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                xsx xsxVar = (xsx) obj;
                xsxVar.getClass();
                xsxVar.b();
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                afjd afjdVar = (afjd) obj;
                afjdVar.getClass();
                afje afjeVar = afjdVar.b;
                if (afjeVar == null) {
                    return "*";
                }
                afjb afjbVar = afjdVar.c;
                afhb afhbVar = afjbVar instanceof afhb ? (afhb) afjbVar : null;
                java.lang.String strA = afhbVar != null ? afhbVar.a(true) : java.lang.String.valueOf(afjbVar);
                int iOrdinal = afjeVar.ordinal();
                if (iOrdinal == 0) {
                    return strA;
                }
                if (iOrdinal == 1) {
                    return "in ".concat(java.lang.String.valueOf(strA));
                }
                if (iOrdinal == 2) {
                    return "out ".concat(java.lang.String.valueOf(strA));
                }
                throw new defpackage.afas();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                aisp aispVar = (aisp) obj;
                aispVar.getClass();
                return aispVar.a();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
                return obj;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf(obj == null);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.String str = (java.lang.String) obj;
                str.getClass();
                return str;
            case 10:
                int i = ajdi.a;
                return null;
            case 11:
                ajjm ajjmVar = (ajjm) obj;
                ajjmVar.getClass();
                ajjm ajjmVar2 = ajjmVar.c;
                if (ajjmVar2 instanceof ajjm) {
                    return ajjmVar2;
                }
                return null;
            case 12:
                ajjm ajjmVar3 = (ajjm) obj;
                ajjmVar3.getClass();
                return ajjmVar3.a + "=" + ajjmVar3.b;
            default:
                ajpp ajppVar = (ajpp) obj;
                ajor ajorVar = ajpn.c;
                ajppVar.getClass();
                return java.lang.Boolean.valueOf(aguc.c(ajppVar.a));
        }
    }
}
