package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.projection.gearhead.service.CarSystemUiControllerService;

/* loaded from: classes3.dex */
public final class xev implements IBinder.DeathRecipient {
    public final Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public xev(sew sewVar, rws rwsVar, int i) throws RemoteException {
        this.c = i;
        this.b = sewVar;
        this.a = rwsVar;
        rwsVar.asBinder().linkToDeath(this, 0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xer] */
    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.c;
        Object obj = this.b;
        if (i == 0) {
            ((CarSystemUiControllerService) obj).b.remove(this);
            this.a.asBinder().unlinkToDeath(this, 0);
        } else {
            synchronized (((sew) obj).b) {
                ((sew) obj).c.remove(this);
            }
        }
    }

    public xev(CarSystemUiControllerService carSystemUiControllerService, xer xerVar, int i) throws RemoteException {
        this.c = i;
        this.b = carSystemUiControllerService;
        this.a = xerVar;
        xerVar.asBinder().linkToDeath(this, 0);
    }
}
