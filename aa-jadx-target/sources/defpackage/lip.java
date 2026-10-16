package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lip extends android.os.Handler {
    private final java.lang.ref.WeakReference a;

    public lip(com.google.android.apps.auto.components.lifetime.service.GhLifetimeService ghLifetimeService) {
        super(android.os.Looper.getMainLooper());
        this.a = new java.lang.ref.WeakReference(ghLifetimeService);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        com.google.android.apps.auto.components.lifetime.service.GhLifetimeService ghLifetimeService = (com.google.android.apps.auto.components.lifetime.service.GhLifetimeService) this.a.get();
        if (ghLifetimeService == null) {
            ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.lifetime.service.GhLifetimeService.a.g()).ai((char) 3961)).y("Dropping message %s", message);
            return;
        }
        int i = message.what;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.lifetime.service.GhLifetimeService.a.h()).ai((char) 3960)).y("Unknown message %s", message);
                return;
            }
            defpackage.rqh rqhVar = (defpackage.rqh) message.obj;
            ((defpackage.yqj) com.google.android.apps.auto.components.lifetime.service.GhLifetimeService.a.l().ai((char) 3967)).y("unregisterProjectionLifetimeCallback(callback:%s)", rqhVar);
            android.os.IBinder.DeathRecipient deathRecipient = (android.os.IBinder.DeathRecipient) ghLifetimeService.b.remove(rqhVar);
            if (deathRecipient != null) {
                rqhVar.asBinder().unlinkToDeath(deathRecipient, 0);
                return;
            }
            return;
        }
        defpackage.rqh rqhVar2 = (defpackage.rqh) message.obj;
        ((defpackage.yqj) com.google.android.apps.auto.components.lifetime.service.GhLifetimeService.a.l().ai((char) 3964)).y("registerProjectionLifetimeCallback(callback:%s)", rqhVar2);
        defpackage.rbt rbtVar = new defpackage.rbt(ghLifetimeService, rqhVar2, i2);
        ghLifetimeService.b.put(rqhVar2, rbtVar);
        try {
            rqhVar2.asBinder().linkToDeath(rbtVar, 0);
            java.lang.Boolean bool = ghLifetimeService.c;
            if (bool == null || !bool.booleanValue()) {
                return;
            }
            try {
                rqhVar2.e(ghLifetimeService.a());
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.lifetime.service.GhLifetimeService.a.g()).p(e)).ai((char) 3965)).u("RemoteException calling onProjectionLifetimeStateChanged(true). Removing callback.");
                ghLifetimeService.b.remove(rqhVar2);
                rqhVar2.asBinder().unlinkToDeath(rbtVar, 0);
            }
        } catch (android.os.RemoteException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.lifetime.service.GhLifetimeService.a.g()).p(e2)).ai((char) 3966)).u("RemoteException linking death recipient. Removing callback.");
            ghLifetimeService.b.remove(rqhVar2);
        }
    }
}
