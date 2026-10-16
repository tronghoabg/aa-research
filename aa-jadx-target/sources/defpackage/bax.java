package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bax implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public bax(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v29, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v32, types: [beq, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(defpackage.cri criVar, defpackage.afdk afdkVar) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object objA = ahoi.a(new defpackage.ais(criVar, (defpackage.bby) this.a, (defpackage.afdk) null, 16), afdkVar);
                return objA == defpackage.afdr.a ? objA : defpackage.afbk.a;
            case 1:
                java.lang.Object objAK = defpackage.ca.aK(criVar, new defpackage.aiy((defpackage.aiz) this.a, null), afdkVar);
                return objAK == defpackage.afdr.a ? objAK : defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.blw blwVar = (defpackage.blw) this.a;
                java.lang.Object objX = defpackage.bxi.x(criVar, blwVar.r, blwVar.q, afdkVar);
                return objX == defpackage.afdr.a ? objX : defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object objAK2 = defpackage.ca.aK(criVar, new defpackage.blb(new defpackage.bhh(this.a, 0), null, 1, null), afdkVar);
                defpackage.afdr afdrVar = defpackage.afdr.a;
                if (objAK2 != afdrVar) {
                    objAK2 = defpackage.afbk.a;
                }
                return objAK2 == afdrVar ? objAK2 : defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Object objAK3 = defpackage.ca.aK(criVar, new defpackage.bhx((defpackage.bhy) this.a, null), afdkVar);
                return objAK3 == defpackage.afdr.a ? objAK3 : defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.bje bjeVar = (defpackage.bje) this.a;
                java.lang.Object objX2 = defpackage.bxi.x(criVar, bjeVar.e, bjeVar.d, afdkVar);
                return objX2 == defpackage.afdr.a ? objX2 : defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object objR = criVar.r(new defpackage.blb(this.a, null, 0), afdkVar);
                return objR == defpackage.afdr.a ? objR : defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object objAc = defpackage.asq.ac(criVar, this.a, afdkVar);
                return objAc == defpackage.afdr.a ? objAc : defpackage.afbk.a;
            default:
                java.lang.Object objA2 = ahoi.a(new njc(criVar, (defpackage.affc) this.a, (defpackage.afdk) null, 1, (byte[]) null), afdkVar);
                return objA2 == defpackage.afdr.a ? objA2 : defpackage.afbk.a;
        }
    }
}
