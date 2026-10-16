package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qrf implements IBinder.DeathRecipient {
    final qvu a;
    public final /* synthetic */ qrg b;

    public qrf(qrg qrgVar, qvu qvuVar) throws RemoteException {
        this.b = qrgVar;
        this.a = qvuVar;
        qvuVar.asBinder().linkToDeath(this, 0);
    }

    public final void a() {
        yop yopVarAi = qrg.a.l().ai(7699);
        qvu qvuVar = this.a;
        yopVarAi.y("ClientWrapper.unlink: %s", qvuVar.asBinder());
        qvuVar.asBinder().unlinkToDeath(this, 0);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        rbe.k(new qjv(this, 13, null));
    }
}
