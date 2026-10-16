package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/* loaded from: classes.dex */
final class mbt implements IBinder.DeathRecipient, mbv {
    private static final yph b = yph.c("GH.SharedNotifClient");
    public final IBinder a;
    private final mbg c;

    public mbt(mbg mbgVar) {
        mbgVar.getClass();
        this.c = mbgVar;
        IBinder iBinderAsBinder = mbgVar.asBinder();
        iBinderAsBinder.getClass();
        this.a = iBinderAsBinder;
    }

    @Override // defpackage.mbv
    public final void a(mbj mbjVar) {
        try {
            this.c.a(mbjVar);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) b.g()).p(e)).ai((char) 4734)).u("Error dispatching onListenerConnected");
        }
    }

    @Override // defpackage.mbv
    public final void b() {
        try {
            this.c.b();
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) b.g()).p(e)).ai((char) 4735)).u("Error dispatching onListenerDisconnected");
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        mbw.b().l(this.c);
    }

    @Override // defpackage.mbv
    public final void c(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        try {
            this.c.c(statusBarNotification, rankingMap);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) b.g()).p(e)).ai((char) 4736)).u("Error dispatching onNotificationPosted");
        }
    }

    @Override // defpackage.mbv
    public final void d(NotificationListenerService.RankingMap rankingMap) {
        try {
            this.c.d(rankingMap);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) b.g()).p(e)).ai((char) 4737)).u("Error dispatching onNotificationRankingUpdate");
        }
    }

    @Override // defpackage.mbv
    public final void e(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        try {
            this.c.f(statusBarNotification, rankingMap);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) b.g()).p(e)).ai((char) 4738)).u("Error dispatching onNotificationRemoved");
        }
    }

    @Override // defpackage.mbv
    public final void f() {
    }
}
