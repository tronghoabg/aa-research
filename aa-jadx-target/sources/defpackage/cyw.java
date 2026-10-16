package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class cyw implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ cyw(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.cxl cxlVar = (defpackage.cxl) obj;
                if (cxlVar.am()) {
                    cxlVar.W(false);
                }
                return defpackage.afbk.a;
            case 1:
                defpackage.cxl cxlVar2 = (defpackage.cxl) obj;
                if (cxlVar2.am()) {
                    cxlVar2.W(false);
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.cxl cxlVar3 = (defpackage.cxl) obj;
                if (cxlVar3.am()) {
                    cxlVar3.U(false);
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.cxl cxlVar4 = (defpackage.cxl) obj;
                if (cxlVar4.am()) {
                    cxlVar4.U(false);
                }
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.cdd cddVar = (defpackage.cdd) obj;
                defpackage.dai.az(cddVar, defpackage.daj.a);
                return ((android.content.Context) defpackage.dai.az(cddVar, defpackage.daj.b)).getResources();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return (defpackage.dkk) defpackage.afga.ay((java.lang.Iterable) defpackage.dai.az((defpackage.cdd) obj, defpackage.dbl.j));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.cyu) defpackage.dai.az((defpackage.cdd) obj, defpackage.dbl.a)).K();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf(defpackage.daz.b(obj));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.afbk.a;
            case 9:
                defpackage.dfb dfbVar = defpackage.dfc.a;
                return java.lang.Boolean.valueOf(!(((defpackage.dex) obj) instanceof defpackage.dfn));
            case 10:
                defpackage.dfk dfkVar = (defpackage.dfk) obj;
                return "[" + dfkVar.a + ", " + dfkVar.b + ")";
            case 11:
                defpackage.dig digVar = (defpackage.dig) obj;
                return "'" + digVar.a() + "' " + digVar.b();
            case 12:
                defpackage.dig digVar2 = (defpackage.dig) obj;
                return "'" + digVar2.a() + "' " + digVar2.b();
            case 13:
                return defpackage.afbk.a;
            case 14:
                return defpackage.afbk.a;
            case 15:
                return defpackage.afbk.a;
            case 16:
                return defpackage.afbk.a;
            case 17:
                java.io.File file = (java.io.File) obj;
                java.util.Set set = defpackage.egp.a;
                file.getClass();
                file.getCanonicalFile().getAbsolutePath().getClass();
                return new defpackage.eho();
            case 18:
                ((android.content.Context) obj).getClass();
                return defpackage.afce.a;
            case 19:
                ((defpackage.esi) obj).getClass();
                return new defpackage.eri();
            default:
                defpackage.fdr fdrVar = defpackage.fdr.a;
                return java.lang.Boolean.FALSE;
        }
    }
}
