package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.CarInfo;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class jpb implements jpu {
    public final /* synthetic */ jpw a;
    private final /* synthetic */ int b;

    public /* synthetic */ jpb(jpw jpwVar, int i) {
        this.b = i;
        this.a = jpwVar;
    }

    @Override // defpackage.jpu, java.util.concurrent.Callable
    public final Object call() throws RemoteException {
        int i = this.b;
        if (i == 0) {
            CarInfo carInfoS = this.a.m().s();
            carInfoS.getClass();
            return carInfoS;
        }
        if (i == 1) {
            List listAa = this.a.m().aa();
            listAa.getClass();
            return listAa;
        }
        if (i == 2) {
            qzi qziVarM = this.a.m().M();
            qziVarM.getClass();
            return qziVarM;
        }
        if (i == 3) {
            qyh qyhVarJ = this.a.m().J();
            qyhVarJ.getClass();
            return qyhVarJ;
        }
        jpw jpwVar = this.a;
        if (i != 4) {
            qvr qvrVarA = jpwVar.m().A();
            qvrVarA.getClass();
            return qvrVarA;
        }
        rkm rkmVarT = jpwVar.m().T();
        rkmVarT.getClass();
        return rkmVarT;
    }
}
