package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class qjs extends android.service.notification.NotificationListenerService {
    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        java.lang.Object obj = defpackage.rox.aj().a;
        synchronized (((defpackage.mce) obj).b) {
            ((defpackage.mce) obj).e("#onListenerServiceCreated", this);
            if (((defpackage.mce) obj).c != 1) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.mce.a.g()).ai(4746)).y("onListenerServiceCreated with state %s, expected REBIND_PENDING", new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(((defpackage.mce) obj).c)));
            } else {
                ((defpackage.yqj) defpackage.mce.a.l().ai(4744)).u("onListenerServiceCreated");
            }
            android.service.notification.NotificationListenerService notificationListenerService = ((defpackage.mce) obj).e;
            if (notificationListenerService != null) {
                notificationListenerService.getClass().getSimpleName();
                getClass().getSimpleName();
            }
            ((defpackage.mce) obj).e = this;
            ((defpackage.mce) obj).c = 2;
        }
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        java.lang.Object obj = defpackage.rox.aj().a;
        synchronized (((defpackage.mce) obj).b) {
            ((defpackage.mce) obj).e("#onListenerServiceDestroyed", this);
            if (((defpackage.mce) obj).c != 4) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.mce.a.g()).ai(4750)).y("onListenerServiceDestroyed with state %s, expected UNBIND_PENDING", new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(((defpackage.mce) obj).c)));
            } else {
                ((defpackage.yqj) defpackage.mce.a.l().ai(4747)).u("onListenerServiceDestroyed");
            }
            if (((defpackage.mce) obj).e != this) {
                return;
            }
            int i = ((defpackage.mce) obj).c;
            ((defpackage.mce) obj).e = null;
            ((defpackage.mce) obj).c = 0;
            if (((defpackage.mce) obj).i()) {
                if (i == 4) {
                    ((defpackage.mce) obj).f();
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.mce.a.g()).ai(4748)).u("ListenerService destroyed at unexpected time - likely caused by lost listener permissions");
                    defpackage.omf.u().x(18, defpackage.zaa.NOTIFICATION_LISTENER_UNEXPECTEDLY_DISCONNECTED);
                    java.util.Iterator it = ((defpackage.mce) obj).d.iterator();
                    while (it.hasNext()) {
                        ((defpackage.mcd) it.next()).b();
                    }
                }
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerConnected() {
        super.onListenerConnected();
        java.lang.Object obj = defpackage.rox.aj().a;
        synchronized (((defpackage.mce) obj).b) {
            ((defpackage.mce) obj).e("#onListenerServiceConnected", this);
            if (((defpackage.mce) obj).c != 2) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.mce.a.g()).ai(4743)).y("onListenerServiceConnected with state %s, expected CONNECTING", new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(((defpackage.mce) obj).c)));
            } else {
                ((defpackage.yqj) defpackage.mce.a.l().ai(4742)).u("onListenerServiceConnected");
            }
            ((defpackage.mce) obj).d(this);
            if (((defpackage.mce) obj).c == 3) {
                defpackage.omf.u().x(18, defpackage.zaa.NOTIFICATION_LISTENER_CONNECTED_TWICE);
            }
            ((defpackage.mce) obj).c = 3;
            if (((defpackage.mce) obj).i()) {
                java.util.Iterator it = ((defpackage.mce) obj).d.iterator();
                while (it.hasNext()) {
                    ((defpackage.mcd) it.next()).a(((defpackage.mce) obj).f);
                }
            } else {
                ((defpackage.mce) obj).g();
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationPosted(android.service.notification.StatusBarNotification statusBarNotification, android.service.notification.NotificationListenerService.RankingMap rankingMap) {
        super.onNotificationPosted(statusBarNotification, rankingMap);
        defpackage.ajnd ajndVarAj = defpackage.rox.aj();
        defpackage.mba.a(statusBarNotification, "Nls#onNotificationPosted");
        java.lang.Object obj = ajndVarAj.a;
        synchronized (((defpackage.mce) obj).b) {
            if (((defpackage.mce) obj).c != 3) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.mce.a.h()).ai(4751)).y("Ignoring posted notification outside of lifecycle (current state: %s)", new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(((defpackage.mce) obj).c)));
            } else {
                defpackage.mbw.b().e(statusBarNotification);
                ((defpackage.mce) obj).d(this);
                java.util.Iterator it = ((defpackage.mce) obj).d.iterator();
                while (it.hasNext()) {
                    ((defpackage.mcd) it.next()).c(statusBarNotification, rankingMap);
                }
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRankingUpdate(android.service.notification.NotificationListenerService.RankingMap rankingMap) {
        super.onNotificationRankingUpdate(rankingMap);
        java.lang.Object obj = defpackage.rox.aj().a;
        synchronized (((defpackage.mce) obj).b) {
            if (((defpackage.mce) obj).c != 3) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.mce.a.h()).ai(4752)).y("Ignoring ranking update outside of lifecycle (current state: %s)", new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(((defpackage.mce) obj).c)));
            } else {
                ((defpackage.mce) obj).d(this);
                java.util.Iterator it = ((defpackage.mce) obj).d.iterator();
                while (it.hasNext()) {
                    ((defpackage.mcd) it.next()).d(rankingMap);
                }
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRemoved(android.service.notification.StatusBarNotification statusBarNotification, android.service.notification.NotificationListenerService.RankingMap rankingMap) {
        super.onNotificationRemoved(statusBarNotification, rankingMap);
        defpackage.ajnd ajndVarAj = defpackage.rox.aj();
        if (statusBarNotification == null) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.mce.a.h()).ai((char) 4754)).u("StatusBarNotification is null, so nothing to remove");
            return;
        }
        defpackage.mba.a(statusBarNotification, "Nls#onNotificationRemoved");
        java.lang.Object obj = ajndVarAj.a;
        synchronized (((defpackage.mce) obj).b) {
            if (((defpackage.mce) obj).c != 3) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.mce.a.h()).ai(4753)).y("Ignoring removed notification outside of lifecycle (current state: %s)", new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(((defpackage.mce) obj).c)));
            } else {
                ((defpackage.mce) obj).d(this);
                java.util.Iterator it = ((defpackage.mce) obj).d.iterator();
                while (it.hasNext()) {
                    ((defpackage.mcd) it.next()).e(statusBarNotification, rankingMap);
                }
            }
        }
    }
}
