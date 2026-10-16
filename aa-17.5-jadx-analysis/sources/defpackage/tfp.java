package defpackage;

import android.util.Base64;

/* loaded from: classes.dex */
public final class tfp implements ackr {
    private final /* synthetic */ int a;

    public tfp(int i) {
        this.a = i;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                vuy vuyVarD = vuz.d();
                vuyVarD.e = 3;
                vuyVarD.d(true);
                vuyVarD.c(true);
                return vuyVarD.a();
            case 1:
                vtn vtnVarD = vto.d();
                vtnVarD.a = 3;
                vtnVarD.b = ":projection";
                return vtnVarD.a();
            case 2:
                vvs vvsVarD = vvt.d();
                vvsVarD.d = 3;
                vvsVarD.b(true);
                return vvsVarD.a();
            case 3:
                vwn vwnVarD = vwo.d();
                vwnVarD.c = 3;
                return vwnVarD.a();
            case 4:
                vzm vzmVarA = vzn.a();
                vzmVarA.b(true);
                return vzmVarA.a();
            case 5:
                return new vll();
            case 6:
                return true;
            case 7:
                try {
                    byte[] bArrDecode = Base64.decode("CAYIBAgFCAMIEQ==", 3);
                    abnv abnvVarD = abnv.D(ajek.a, bArrDecode, 0, bArrDecode.length, abnj.a);
                    abnv.U(abnvVarD);
                    ajek ajekVar = (ajek) abnvVarD;
                    ajekVar.getClass();
                    return ajekVar;
                } catch (abon e) {
                    throw new AssertionError(e);
                }
            case 8:
            case 9:
                return false;
            case 10:
                return true;
            case 11:
                ajfz ajfzVarAH = spu.aH();
                ajfzVarAH.getClass();
                return ajfzVarAH;
            case 12:
                return true;
            case 13:
                return false;
            case 14:
                return 2L;
            case 15:
                ajfz ajfzVarAH2 = spu.aH();
                ajfzVarAH2.getClass();
                return ajfzVarAH2;
            case 16:
                try {
                    byte[] bArrDecode2 = Base64.decode("CAAQAxgGIJBOLQrXIzw=", 3);
                    abnv abnvVarD2 = abnv.D(vsr.a, bArrDecode2, 0, bArrDecode2.length, abnj.a);
                    abnv.U(abnvVarD2);
                    vsr vsrVar = (vsr) abnvVarD2;
                    vsrVar.getClass();
                    return vsrVar;
                } catch (abon e2) {
                    throw new AssertionError(e2);
                }
            case 17:
                try {
                    vtg vtgVar = (vtg) abnv.x(vtg.a, Base64.decode("CAEQZBj0AyDoBw==", 3));
                    vtgVar.getClass();
                    return vtgVar;
                } catch (abon e3) {
                    throw new AssertionError(e3);
                }
            case 18:
                ajfz ajfzVarAI = spu.aI();
                ajfzVarAI.getClass();
                return ajfzVarAI;
            case 19:
                return false;
            default:
                return true;
        }
    }
}
