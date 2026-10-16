package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.CarUiInfo;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class joz implements jpu {
    public final /* synthetic */ jpw a;
    private final /* synthetic */ int b;

    public /* synthetic */ joz(jpw jpwVar, int i) {
        this.b = i;
        this.a = jpwVar;
    }

    @Override // defpackage.jpu, java.util.concurrent.Callable
    public final Object call() throws RemoteException {
        switch (this.b) {
            case 0:
                qwu qwuVarD = this.a.m().D();
                qwuVarD.getClass();
                return qwuVarD;
            case 1:
                return Boolean.valueOf(this.a.m().bx());
            case 2:
                return this.a.m().r();
            case 3:
                List listAc = this.a.m().ac();
                listAc.getClass();
                return listAc;
            case 4:
                rka rkaVarR = this.a.m().R();
                rkaVarR.getClass();
                return rkaVarR;
            case 5:
                qwq qwqVarBC = this.a.m().bC();
                qwqVarBC.getClass();
                return qwqVarBC;
            case 6:
                return Integer.valueOf(this.a.m().h());
            case 7:
                qwl qwlVarC = this.a.m().C();
                qwlVarC.getClass();
                return qwlVarC;
            case 8:
                rkj rkjVarS = this.a.m().S();
                rkjVarS.getClass();
                return rkjVarS;
            case 9:
                qvb qvbVarZ = this.a.m().z();
                qvbVarZ.getClass();
                return qvbVarZ;
            case 10:
                return this.a.m().G();
            case 11:
                return this.a.m().bB();
            case 12:
                rim rimVarO = this.a.m().O();
                rimVarO.getClass();
                return rimVarO;
            case 13:
                qxa qxaVarE = this.a.m().E();
                qxaVarE.getClass();
                return qxaVarE;
            case 14:
                qxp qxpVarH = this.a.m().H();
                qxpVarH.getClass();
                return qxpVarH;
            case 15:
                return Boolean.valueOf(this.a.m().bs());
            case 16:
                CarUiInfo carUiInfoU = this.a.m().u();
                carUiInfoU.getClass();
                return carUiInfoU;
            case 17:
                qyb qybVarI = this.a.m().I();
                qybVarI.getClass();
                return qybVarI;
            case 18:
                rho rhoVarN = this.a.m().N();
                rhoVarN.getClass();
                return rhoVarN;
            case 19:
                qxj qxjVarF = this.a.m().F();
                qxjVarF.getClass();
                return qxjVarF;
            default:
                return Integer.valueOf(this.a.m().gg());
        }
    }
}
