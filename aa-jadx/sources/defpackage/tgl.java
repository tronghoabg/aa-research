package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tgl implements defpackage.aclt {
    private final /* synthetic */ int a;

    public tgl(int i) {
        this.a = i;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        switch (this.a) {
            case 0:
                defpackage.vvt vvtVarD = defpackage.vvu.d();
                vvtVarD.e = 3;
                vvtVarD.d(true);
                vvtVarD.c(true);
                return vvtVarD.a();
            case 1:
                defpackage.vuj vujVarD = defpackage.vuk.d();
                vujVarD.a = 3;
                vujVarD.b = ":projection";
                return vujVarD.a();
            case 2:
                defpackage.vwn vwnVarD = defpackage.vwo.d();
                vwnVarD.d = 3;
                vwnVarD.b(true);
                return vwnVarD.a();
            case 3:
                defpackage.vxi vxiVarD = defpackage.vxj.d();
                vxiVarD.c = 3;
                return vxiVarD.a();
            case 4:
                defpackage.wai waiVarA = defpackage.waj.a();
                waiVarA.b(true);
                return waiVarA.a();
            case 5:
                return new defpackage.vmh();
            case 6:
                return java.lang.Boolean.TRUE;
            case 7:
                try {
                    byte[] bArrDecode = android.util.Base64.decode("CAYIBAgFCAMIEQ==", 3);
                    defpackage.abox aboxVarD = defpackage.abox.D(defpackage.ajfj.a, bArrDecode, 0, bArrDecode.length, defpackage.abol.a);
                    defpackage.abox.U(aboxVarD);
                    defpackage.ajfj ajfjVar = (defpackage.ajfj) aboxVarD;
                    ajfjVar.getClass();
                    return ajfjVar;
                } catch (defpackage.abpp e) {
                    throw new java.lang.AssertionError(e);
                }
            case 8:
                return java.lang.Boolean.FALSE;
            case 9:
                return java.lang.Boolean.FALSE;
            case 10:
                return java.lang.Boolean.TRUE;
            case 11:
                defpackage.ajgy ajgyVarBN = defpackage.sqs.bN();
                ajgyVarBN.getClass();
                return ajgyVarBN;
            case 12:
                return java.lang.Boolean.TRUE;
            case 13:
                return java.lang.Boolean.FALSE;
            case 14:
                return 2L;
            case 15:
                defpackage.ajgy ajgyVarBN2 = defpackage.sqs.bN();
                ajgyVarBN2.getClass();
                return ajgyVarBN2;
            case 16:
                try {
                    byte[] bArrDecode2 = android.util.Base64.decode("CAAQAxgGIJBOLQrXIzw=", 3);
                    defpackage.abox aboxVarD2 = defpackage.abox.D(defpackage.vtn.a, bArrDecode2, 0, bArrDecode2.length, defpackage.abol.a);
                    defpackage.abox.U(aboxVarD2);
                    defpackage.vtn vtnVar = (defpackage.vtn) aboxVarD2;
                    vtnVar.getClass();
                    return vtnVar;
                } catch (defpackage.abpp e2) {
                    throw new java.lang.AssertionError(e2);
                }
            case 17:
                try {
                    defpackage.vuc vucVar = (defpackage.vuc) defpackage.abox.x(defpackage.vuc.a, android.util.Base64.decode("CAEQZBj0AyDoBw==", 3));
                    vucVar.getClass();
                    return vucVar;
                } catch (defpackage.abpp e3) {
                    throw new java.lang.AssertionError(e3);
                }
            case 18:
                defpackage.ajgy ajgyVarBO = defpackage.sqs.bO();
                ajgyVarBO.getClass();
                return ajgyVarBO;
            case 19:
                return java.lang.Boolean.FALSE;
            default:
                return java.lang.Boolean.TRUE;
        }
    }
}
