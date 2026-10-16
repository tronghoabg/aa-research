package defpackage;

import android.content.Intent;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class jpj implements jpu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jpj(jpw jpwVar, Intent intent, int i, int i2) {
        this.d = i2;
        this.c = jpwVar;
        this.b = intent;
        this.a = i;
    }

    @Override // defpackage.jpu, java.util.concurrent.Callable
    public final Object call() throws RemoteException, jnq {
        int i = this.d;
        if (i == 0) {
            return Boolean.valueOf(((jpw) this.b).m().bw((String) this.c, this.a));
        }
        if (i == 1) {
            return Integer.valueOf(((jpw) this.b).m().k((String) this.c, this.a));
        }
        if (i == 2) {
            List listAe = ((jpw) this.c).m().ae((Intent) this.b, this.a);
            listAe.getClass();
            return listAe;
        }
        if (i == 3) {
            return Integer.valueOf(((jpw) this.b).m().gf((String) this.c, this.a));
        }
        if (i == 4) {
            List listAg = ((jpw) this.c).m().ag((Intent) this.b, this.a);
            listAg.getClass();
            return listAg;
        }
        if (i != 5) {
            return Boolean.valueOf(((jpw) this.b).m().bv((String) this.c, this.a));
        }
        List listAh = ((jpw) this.c).m().ah((Intent) this.b, this.a);
        listAh.getClass();
        return listAh;
    }

    public /* synthetic */ jpj(jpw jpwVar, String str, int i, int i2) {
        this.d = i2;
        this.b = jpwVar;
        this.c = str;
        this.a = i;
    }
}
