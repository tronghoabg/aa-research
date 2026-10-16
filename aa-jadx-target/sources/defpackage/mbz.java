package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class mbz extends defpackage.mbm {
    final /* synthetic */ defpackage.mca a;

    public mbz(defpackage.mca mcaVar) {
        this.a = mcaVar;
    }

    public final void a(mbq mbqVar) {
        defpackage.mca mcaVar = this.a;
        synchronized (mcaVar.b) {
            mcaVar.c.b(2);
        }
        try {
            com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList parceledNotificationListF = mbqVar.f((java.lang.String[]) null);
            if (parceledNotificationListF == null) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.mca.a.h()).ai((char) 4726)).u("#getActiveNotifications returned null");
            } else {
                defpackage.mca mcaVar2 = this.a;
                synchronized (mcaVar2.b) {
                    for (android.service.notification.StatusBarNotification statusBarNotification : ((com.google.android.apps.auto.components.notifications.listener.AbstractParceledList) parceledNotificationListF).a) {
                        if (statusBarNotification == null) {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.mca.a.h()).ai(4725)).u("#getActiveNotifications returned a null notification");
                        } else {
                            mcaVar2.d.put(statusBarNotification.getKey(), statusBarNotification);
                        }
                    }
                }
            }
            this.a.e(new defpackage.mby(0));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public final void b() {
        defpackage.yqm yqmVar = defpackage.mca.a;
        defpackage.mca mcaVar = this.a;
        synchronized (mcaVar.b) {
            mcaVar.c.b(4);
        }
    }

    public final void c(android.service.notification.StatusBarNotification statusBarNotification, android.service.notification.NotificationListenerService.RankingMap rankingMap) {
        defpackage.yqm yqmVar = defpackage.mca.a;
        defpackage.mca mcaVar = this.a;
        mcaVar.c.a(statusBarNotification.getPackageName());
        synchronized (mcaVar.b) {
            mcaVar.d.put(statusBarNotification.getKey(), statusBarNotification);
        }
        this.a.e(new defpackage.kzu(statusBarNotification, 12));
    }

    public final void d(android.service.notification.NotificationListenerService.RankingMap rankingMap) {
        defpackage.yqm yqmVar = defpackage.mca.a;
    }

    public final void f(android.service.notification.StatusBarNotification statusBarNotification, android.service.notification.NotificationListenerService.RankingMap rankingMap) {
        defpackage.yqm yqmVar = defpackage.mca.a;
        defpackage.mca mcaVar = this.a;
        synchronized (mcaVar.b) {
            mcaVar.d.remove(statusBarNotification.getKey());
        }
        this.a.e(new defpackage.kzu(statusBarNotification, 11));
    }
}
