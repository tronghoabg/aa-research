package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bnm implements defpackage.affg {
    private final /* synthetic */ int a;

    public /* synthetic */ bnm(int i) {
        this.a = i;
    }

    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return defpackage.tna.ax((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case 1:
                aip aipVar = (aip) obj;
                return aipVar == null ? air.a : aipVar;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.tna.ax((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.tna.ax((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.tna.ax((defpackage.bve) obj, ((java.lang.Integer) obj2).intValue());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.bve bveVar = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (bveVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    defpackage.xi.a(null, 0.0f, 0L, bveVar, 0, 7);
                } else {
                    bveVar.s();
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.tc) obj2).g();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.StringBuilder sb = (java.lang.StringBuilder) obj;
                defpackage.cgd cgdVar = (defpackage.cgd) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(cgdVar);
                return sb;
            case 9:
                ((defpackage.cnl) obj).g((java.util.List) obj2);
                return defpackage.afbk.a;
            case 10:
                ((defpackage.cnp) obj).j(((defpackage.clg) obj2).a);
                return defpackage.afbk.a;
            case 11:
                ((defpackage.cnp) obj).l(((java.lang.Float) obj2).floatValue());
                return defpackage.afbk.a;
            case 12:
                ((defpackage.cnp) obj).p(((java.lang.Float) obj2).floatValue());
                return defpackage.afbk.a;
            case 13:
                ((defpackage.cnp) obj).n(((java.lang.Float) obj2).floatValue());
                return defpackage.afbk.a;
            case 14:
                ((defpackage.cnp) obj).o(((java.lang.Float) obj2).floatValue());
                return defpackage.afbk.a;
            case 15:
                ((defpackage.cnp) obj).q();
                return defpackage.afbk.a;
            case 16:
                ((defpackage.cnp) obj).e((java.util.List) obj2);
                return defpackage.afbk.a;
            case 17:
                ((defpackage.cnp) obj).f(((defpackage.ckv) obj2).a);
                return defpackage.afbk.a;
            case 18:
                ((defpackage.cnp) obj).a((defpackage.cka) obj2);
                return defpackage.afbk.a;
            case 19:
                ((defpackage.cnp) obj).d(((java.lang.Float) obj2).floatValue());
                return defpackage.afbk.a;
            default:
                ((defpackage.cnp) obj).g((defpackage.cka) obj2);
                return defpackage.afbk.a;
        }
    }
}
