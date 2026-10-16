package defpackage;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/* loaded from: classes.dex */
public final class qis extends mbf {
    public final /* synthetic */ qiv a;

    public qis(qiv qivVar) {
        this.a = qivVar;
    }

    @Override // defpackage.mbg
    public final void a(mbj mbjVar) {
        this.a.b.post(new qfa(this, mbjVar, 12));
    }

    @Override // defpackage.mbg
    public final void b() {
        this.a.b.post(new qct(this, 20));
    }

    @Override // defpackage.mbg
    public final void c(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        yph yphVar = qiv.a;
        this.a.b.post(new prm(this, statusBarNotification, rankingMap, 8));
    }

    @Override // defpackage.mbg
    public final void d(NotificationListenerService.RankingMap rankingMap) {
        yph yphVar = qiv.a;
        this.a.b.post(new qfa(this, rankingMap, 13));
    }

    @Override // defpackage.mbg
    public final void f(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        yph yphVar = qiv.a;
        this.a.b.post(new prm(this, statusBarNotification, rankingMap, 7));
    }
}
