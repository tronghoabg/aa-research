package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qjr implements mbs {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.NotificationClient");
    public final defpackage.mbk c;
    public volatile android.service.notification.NotificationListenerService.RankingMap e;
    public mbq f;
    public boolean g;
    public final ajnd j;
    public final java.util.List d = new java.util.ArrayList();
    public final mbn h = new defpackage.qjp(this);
    public final mbr i = new defpackage.qjq(this, 0);
    public final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());

    public qjr(ajnd ajndVar, defpackage.mbk mbkVar) {
        this.j = ajndVar;
        this.c = mbkVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final android.service.notification.NotificationListenerService.RankingMap a() throws wfo {
        android.service.notification.NotificationListenerService.RankingMap rankingMapE;
        defpackage.wfp.c();
        if (this.e != null) {
            return this.e;
        }
        if (defpackage.acvk.c()) {
            defpackage.ysr.bk(c(), "Cannot interact with notification listener before onListenerConnected called");
            rankingMapE = defpackage.mce.b().a();
        } else {
            try {
                rankingMapE = d().e();
            } catch (android.os.RemoteException e) {
                throw new java.lang.IllegalStateException("Could not call the service", e);
            }
        }
        this.e = rankingMapE;
        return rankingMapE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final java.util.List b() throws wfo {
        defpackage.wfp.c();
        return this.d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final boolean c() throws wfo {
        defpackage.wfp.c();
        boolean z = true;
        if (!defpackage.acvk.c()) {
            return this.f != null;
        }
        defpackage.mce mceVarB = defpackage.mce.b();
        synchronized (mceVarB.b) {
            if (mceVarB.c != 3) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final mbq d() throws wfo {
        defpackage.wfp.c();
        defpackage.ysr.bk(!defpackage.acvk.c(), "Cannot get Binder service in Local mode");
        defpackage.ysr.bk(c(), "Cannot interact with notification listener before onListenerConnected called");
        mbq mbqVar = this.f;
        mbqVar.getClass();
        return mbqVar;
    }

    public final void e(android.service.notification.StatusBarNotification statusBarNotification) {
        defpackage.wfp.c();
        int i = 0;
        while (true) {
            java.util.List list = this.d;
            if (i >= list.size()) {
                return;
            }
            if (((android.service.notification.StatusBarNotification) list.get(i)).getKey().equals(statusBarNotification.getKey())) {
                list.remove(i);
                return;
            }
            i++;
        }
    }
}
