package defpackage;

import android.os.RemoteException;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.auto.components.notifications.listener.ParceledNotificationList;

/* loaded from: classes.dex */
final class mbr extends mbf {
    final /* synthetic */ mbs a;

    public mbr(mbs mbsVar) {
        this.a = mbsVar;
    }

    @Override // defpackage.mbg
    public final void a(mbj mbjVar) {
        mbs mbsVar = this.a;
        synchronized (mbsVar.b) {
            mbsVar.c.b(2);
        }
        try {
            ParceledNotificationList parceledNotificationListF = mbjVar.f(null);
            if (parceledNotificationListF == null) {
                ((ype) ((ype) mbs.a.h()).ai((char) 4723)).u("#getActiveNotifications returned null");
            } else {
                mbs mbsVar2 = this.a;
                synchronized (mbsVar2.b) {
                    for (StatusBarNotification statusBarNotification : parceledNotificationListF.a) {
                        if (statusBarNotification == null) {
                            ((ype) ((ype) mbs.a.h()).ai(4722)).u("#getActiveNotifications returned a null notification");
                        } else {
                            mbsVar2.d.put(statusBarNotification.getKey(), statusBarNotification);
                        }
                    }
                }
            }
            this.a.e(new mbq(0));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.mbg
    public final void b() {
        yph yphVar = mbs.a;
        mbs mbsVar = this.a;
        synchronized (mbsVar.b) {
            mbsVar.c.b(4);
        }
    }

    @Override // defpackage.mbg
    public final void c(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        yph yphVar = mbs.a;
        mbs mbsVar = this.a;
        mbsVar.c.a(statusBarNotification.getPackageName());
        synchronized (mbsVar.b) {
            mbsVar.d.put(statusBarNotification.getKey(), statusBarNotification);
        }
        this.a.e(new kzp(statusBarNotification, 12));
    }

    @Override // defpackage.mbg
    public final void d(NotificationListenerService.RankingMap rankingMap) {
        yph yphVar = mbs.a;
    }

    @Override // defpackage.mbg
    public final void f(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        yph yphVar = mbs.a;
        mbs mbsVar = this.a;
        synchronized (mbsVar.b) {
            mbsVar.d.remove(statusBarNotification.getKey());
        }
        this.a.e(new kzp(statusBarNotification, 11));
    }
}
