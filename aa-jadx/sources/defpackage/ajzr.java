package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajzr {
    public static final defpackage.ajzr a = new defpackage.ajzr();
    private static final java.util.BitSet b = defpackage.akbp.a(61, 59);
    private static final java.util.BitSet c = defpackage.akbp.a(59);

    private static final defpackage.ajqp b(defpackage.akch akchVar, defpackage.akbo akboVar) {
        java.lang.String strD = defpackage.akbp.d(akchVar, akboVar, b);
        if (akboVar.b()) {
            return new defpackage.akbg(strD, null);
        }
        char cCharAt = akchVar.charAt(akboVar.b);
        akboVar.a(akboVar.b + 1);
        if (cCharAt != '=') {
            return new defpackage.akbg(strD, null);
        }
        java.lang.String strD2 = defpackage.akbp.d(akchVar, akboVar, c);
        if (!akboVar.b()) {
            akboVar.a(akboVar.b + 1);
        }
        return new defpackage.akbg(strD, strD2);
    }

    public final defpackage.akay a(defpackage.akch akchVar, defpackage.akbo akboVar) throws defpackage.ajqr {
        defpackage.aguw.e(akchVar, "Char array buffer");
        defpackage.ajqp ajqpVarB = b(akchVar, akboVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!akboVar.b()) {
            arrayList.add(b(akchVar, akboVar));
        }
        defpackage.akbg akbgVar = (defpackage.akbg) ajqpVarB;
        return new defpackage.akay(akbgVar.a, akbgVar.b, (defpackage.ajqp[]) arrayList.toArray(new defpackage.ajqp[arrayList.size()]));
    }
}
