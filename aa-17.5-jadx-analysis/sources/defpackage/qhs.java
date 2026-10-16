package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gearhead.demand.DemandClientService;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class qhs implements IBinder.DeathRecipient {
    public final xqe a;
    final /* synthetic */ DemandClientService b;

    public qhs(DemandClientService demandClientService, xqe xqeVar) throws InstantiationException, RemoteException {
        this.b = demandClientService;
        try {
            xqeVar.asBinder().linkToDeath(this, 0);
            this.a = xqeVar;
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) DemandClientService.a.h()).p(e)).ai((char) 7263)).u("linkToDeath failed");
            throw new InstantiationException("linkToDeath failed with callbacks");
        }
    }

    public final void a() {
        Map map = this.b.d;
        xqe xqeVar = this.a;
        map.remove(xqeVar.asBinder());
        try {
            xqeVar.asBinder().unlinkToDeath(this, 0);
        } catch (NoSuchElementException unused) {
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        ((ype) DemandClientService.a.l().ai((char) 7264)).u("binder died");
        DemandClientService demandClientService = this.b;
        demandClientService.b.j(ywk.UNKNOWN_CANCEL_TRIGGER);
        demandClientService.c.post(new qct(this, 15));
    }
}
