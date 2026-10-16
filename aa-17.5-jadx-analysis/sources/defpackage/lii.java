package defpackage;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.apps.auto.components.lifetime.service.GhLifetimeService;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class lii extends Handler {
    private final WeakReference a;

    public lii(GhLifetimeService ghLifetimeService) {
        super(Looper.getMainLooper());
        this.a = new WeakReference(ghLifetimeService);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws RemoteException {
        GhLifetimeService ghLifetimeService = (GhLifetimeService) this.a.get();
        if (ghLifetimeService == null) {
            ((ype) ((ype) GhLifetimeService.a.g()).ai((char) 3958)).y("Dropping message %s", message);
            return;
        }
        int i = message.what;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                ((ype) ((ype) GhLifetimeService.a.h()).ai((char) 3957)).y("Unknown message %s", message);
                return;
            }
            rpm rpmVar = (rpm) message.obj;
            ((ype) GhLifetimeService.a.l().ai((char) 3964)).y("unregisterProjectionLifetimeCallback(callback:%s)", rpmVar);
            IBinder.DeathRecipient deathRecipient = (IBinder.DeathRecipient) ghLifetimeService.b.remove(rpmVar);
            if (deathRecipient != null) {
                rpmVar.asBinder().unlinkToDeath(deathRecipient, 0);
                return;
            }
            return;
        }
        rpm rpmVar2 = (rpm) message.obj;
        ((ype) GhLifetimeService.a.l().ai((char) 3961)).y("registerProjectionLifetimeCallback(callback:%s)", rpmVar2);
        ray rayVar = new ray(ghLifetimeService, rpmVar2, i2);
        ghLifetimeService.b.put(rpmVar2, rayVar);
        try {
            rpmVar2.asBinder().linkToDeath(rayVar, 0);
            Boolean bool = ghLifetimeService.c;
            if (bool == null || !bool.booleanValue()) {
                return;
            }
            try {
                rpmVar2.e(ghLifetimeService.a());
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) GhLifetimeService.a.g()).p(e)).ai((char) 3962)).u("RemoteException calling onProjectionLifetimeStateChanged(true). Removing callback.");
                ghLifetimeService.b.remove(rpmVar2);
                rpmVar2.asBinder().unlinkToDeath(rayVar, 0);
            }
        } catch (RemoteException e2) {
            ((ype) ((ype) ((ype) GhLifetimeService.a.g()).p(e2)).ai((char) 3963)).u("RemoteException linking death recipient. Removing callback.");
            ghLifetimeService.b.remove(rpmVar2);
        }
    }
}
