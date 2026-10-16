package defpackage;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/* loaded from: classes2.dex */
final class mbu implements mbv {
    public final mbk a;

    public mbu(mbk mbkVar) {
        mbkVar.getClass();
        this.a = mbkVar;
    }

    @Override // defpackage.mbv
    public final void a(mbj mbjVar) {
        this.a.a();
    }

    @Override // defpackage.mbv
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.mbv
    public final void c(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.a.c(statusBarNotification, rankingMap);
    }

    @Override // defpackage.mbv
    public final void d(NotificationListenerService.RankingMap rankingMap) {
        this.a.d(rankingMap);
    }

    @Override // defpackage.mbv
    public final void e(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.a.e(statusBarNotification, rankingMap);
    }

    @Override // defpackage.mbv
    public final void f() {
    }
}
