package defpackage;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class jpl implements jpu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jpl(jpw jpwVar, Intent intent, int i) {
        this.c = i;
        this.b = jpwVar;
        this.a = intent;
    }

    @Override // defpackage.jpu, java.util.concurrent.Callable
    public final Object call() throws RemoteException {
        int i = this.c;
        if (i == 0) {
            qyq qyqVarK = ((jpw) this.a).m().K((String) this.b);
            qyqVarK.getClass();
            return qyqVarK;
        }
        if (i == 1) {
            return Boolean.valueOf(((jpw) this.b).m().by((Intent) this.a));
        }
        if (i != 2) {
            List listAi = ((jpw) this.b).m().ai((Intent) this.a);
            listAi.getClass();
            return listAi;
        }
        rjm rjmVarQ = ((jpw) this.a).m().Q((CarDisplayId) this.b);
        rjmVarQ.getClass();
        return rjmVarQ;
    }

    public /* synthetic */ jpl(jpw jpwVar, Object obj, int i) {
        this.c = i;
        this.a = jpwVar;
        this.b = obj;
    }
}
