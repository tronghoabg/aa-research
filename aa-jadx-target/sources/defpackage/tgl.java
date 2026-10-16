package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tgl implements defpackage.aclt {
    private final /* synthetic */ int a;

    public tgl(int i) {
        this.a = i;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
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
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.vwn vwnVarD = defpackage.vwo.d();
                vwnVarD.d = 3;
                vwnVarD.b(true);
                return vwnVarD.a();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.vxi vxiVarD = defpackage.vxj.d();
                vxiVarD.c = 3;
                return vxiVarD.a();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.wai waiVarA = defpackage.waj.a();
                waiVarA.b(true);
                return waiVarA.a();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new defpackage.vmh();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.TRUE;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                try {
                    byte[] bArrDecode = android.util.Base64.decode("CAYIBAgFCAMIEQ==", 3);
                    ajfj ajfjVarD = defpackage.abox.D(ajfj.a, bArrDecode, 0, bArrDecode.length, defpackage.abol.a);
                    defpackage.abox.U(ajfjVarD);
                    ajfj ajfjVar = ajfjVarD;
                    ajfjVar.getClass();
                    return ajfjVar;
                } catch (defpackage.abpp e) {
                    throw new java.lang.AssertionError(e);
                }
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Boolean.FALSE;
            case 9:
                return java.lang.Boolean.FALSE;
            case 10:
                return java.lang.Boolean.TRUE;
            case 11:
                ajgy ajgyVarBN = defpackage.sqs.bN();
                ajgyVarBN.getClass();
                return ajgyVarBN;
            case 12:
                return java.lang.Boolean.TRUE;
            case 13:
                return java.lang.Boolean.FALSE;
            case 14:
                return 2L;
            case 15:
                ajgy ajgyVarBN2 = defpackage.sqs.bN();
                ajgyVarBN2.getClass();
                return ajgyVarBN2;
            case 16:
                try {
                    byte[] bArrDecode2 = android.util.Base64.decode("CAAQAxgGIJBOLQrXIzw=", 3);
                    defpackage.abox aboxVarD = defpackage.abox.D(defpackage.vtn.a, bArrDecode2, 0, bArrDecode2.length, defpackage.abol.a);
                    defpackage.abox.U(aboxVarD);
                    defpackage.vtn vtnVar = (defpackage.vtn) aboxVarD;
                    vtnVar.getClass();
                    return vtnVar;
                } catch (defpackage.abpp e2) {
                    throw new java.lang.AssertionError(e2);
                }
            case 17:
                try {
                    vuc vucVarX = defpackage.abox.x(vuc.a, android.util.Base64.decode("CAEQZBj0AyDoBw==", 3));
                    vucVarX.getClass();
                    return vucVarX;
                } catch (defpackage.abpp e3) {
                    throw new java.lang.AssertionError(e3);
                }
            case 18:
                ajgy ajgyVarBO = defpackage.sqs.bO();
                ajgyVarBO.getClass();
                return ajgyVarBO;
            case 19:
                return java.lang.Boolean.FALSE;
            default:
                return java.lang.Boolean.TRUE;
        }
    }
}
