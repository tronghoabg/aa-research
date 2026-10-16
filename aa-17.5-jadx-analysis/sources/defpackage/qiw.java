package defpackage;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import java.util.Iterator;

/* loaded from: classes.dex */
public class qiw extends NotificationListenerService {
    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Object obj = roc.bv().a;
        synchronized (((mbw) obj).b) {
            ((mbw) obj).e("#onListenerServiceCreated", this);
            if (((mbw) obj).c != 1) {
                ((ype) ((ype) mbw.a.g()).ai(4743)).y("onListenerServiceCreated with state %s, expected REBIND_PENDING", new zjd(zjc.a, Integer.valueOf(((mbw) obj).c)));
            } else {
                ((ype) mbw.a.l().ai(4741)).u("onListenerServiceCreated");
            }
            NotificationListenerService notificationListenerService = ((mbw) obj).e;
            if (notificationListenerService != null) {
                notificationListenerService.getClass().getSimpleName();
                getClass().getSimpleName();
            }
            ((mbw) obj).e = this;
            ((mbw) obj).c = 2;
        }
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        Object obj = roc.bv().a;
        synchronized (((mbw) obj).b) {
            ((mbw) obj).e("#onListenerServiceDestroyed", this);
            if (((mbw) obj).c != 4) {
                ((ype) ((ype) mbw.a.g()).ai(4747)).y("onListenerServiceDestroyed with state %s, expected UNBIND_PENDING", new zjd(zjc.a, Integer.valueOf(((mbw) obj).c)));
            } else {
                ((ype) mbw.a.l().ai(4744)).u("onListenerServiceDestroyed");
            }
            if (((mbw) obj).e != this) {
                return;
            }
            int i = ((mbw) obj).c;
            ((mbw) obj).e = null;
            ((mbw) obj).c = 0;
            if (((mbw) obj).i()) {
                if (i == 4) {
                    ((mbw) obj).f();
                } else {
                    ((ype) ((ype) mbw.a.g()).ai(4745)).u("ListenerService destroyed at unexpected time - likely caused by lost listener permissions");
                    ebf.j().x(18, yyv.NOTIFICATION_LISTENER_UNEXPECTEDLY_DISCONNECTED);
                    Iterator it = ((mbw) obj).d.iterator();
                    while (it.hasNext()) {
                        ((mbv) it.next()).b();
                    }
                }
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerConnected() {
        super.onListenerConnected();
        Object obj = roc.bv().a;
        synchronized (((mbw) obj).b) {
            ((mbw) obj).e("#onListenerServiceConnected", this);
            if (((mbw) obj).c != 2) {
                ((ype) ((ype) mbw.a.g()).ai(4740)).y("onListenerServiceConnected with state %s, expected CONNECTING", new zjd(zjc.a, Integer.valueOf(((mbw) obj).c)));
            } else {
                ((ype) mbw.a.l().ai(4739)).u("onListenerServiceConnected");
            }
            ((mbw) obj).d(this);
            if (((mbw) obj).c == 3) {
                ebf.j().x(18, yyv.NOTIFICATION_LISTENER_CONNECTED_TWICE);
            }
            ((mbw) obj).c = 3;
            if (((mbw) obj).i()) {
                Iterator it = ((mbw) obj).d.iterator();
                while (it.hasNext()) {
                    ((mbv) it.next()).a(((mbw) obj).f);
                }
            } else {
                ((mbw) obj).g();
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationPosted(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        super.onNotificationPosted(statusBarNotification, rankingMap);
        ajmd ajmdVarBv = roc.bv();
        mat.a(statusBarNotification, "Nls#onNotificationPosted");
        Object obj = ajmdVarBv.a;
        synchronized (((mbw) obj).b) {
            if (((mbw) obj).c != 3) {
                ((ype) ((ype) mbw.a.h()).ai(4748)).y("Ignoring posted notification outside of lifecycle (current state: %s)", new zjd(zjc.a, Integer.valueOf(((mbw) obj).c)));
            } else {
                mbp.b().e(statusBarNotification);
                ((mbw) obj).d(this);
                Iterator it = ((mbw) obj).d.iterator();
                while (it.hasNext()) {
                    ((mbv) it.next()).c(statusBarNotification, rankingMap);
                }
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRankingUpdate(NotificationListenerService.RankingMap rankingMap) {
        super.onNotificationRankingUpdate(rankingMap);
        Object obj = roc.bv().a;
        synchronized (((mbw) obj).b) {
            if (((mbw) obj).c != 3) {
                ((ype) ((ype) mbw.a.h()).ai(4749)).y("Ignoring ranking update outside of lifecycle (current state: %s)", new zjd(zjc.a, Integer.valueOf(((mbw) obj).c)));
            } else {
                ((mbw) obj).d(this);
                Iterator it = ((mbw) obj).d.iterator();
                while (it.hasNext()) {
                    ((mbv) it.next()).d(rankingMap);
                }
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRemoved(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        super.onNotificationRemoved(statusBarNotification, rankingMap);
        ajmd ajmdVarBv = roc.bv();
        if (statusBarNotification == null) {
            ((ype) ((ype) mbw.a.h()).ai((char) 4751)).u("StatusBarNotification is null, so nothing to remove");
            return;
        }
        mat.a(statusBarNotification, "Nls#onNotificationRemoved");
        Object obj = ajmdVarBv.a;
        synchronized (((mbw) obj).b) {
            if (((mbw) obj).c != 3) {
                ((ype) ((ype) mbw.a.h()).ai(4750)).y("Ignoring removed notification outside of lifecycle (current state: %s)", new zjd(zjc.a, Integer.valueOf(((mbw) obj).c)));
            } else {
                ((mbw) obj).d(this);
                Iterator it = ((mbw) obj).d.iterator();
                while (it.hasNext()) {
                    ((mbv) it.next()).e(statusBarNotification, rankingMap);
                }
            }
        }
    }
}
