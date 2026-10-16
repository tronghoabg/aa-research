package defpackage;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/* loaded from: classes.dex */
public final class qiu implements mbk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qiu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mbk
    public final void a() {
        int i = 1;
        if (this.b == 0) {
            ((qiv) this.a).b.post(new qit(this, i));
            return;
        }
        yph yphVar = mbs.a;
        Object obj = this.a;
        synchronized (((mbs) obj).b) {
            ((mbs) obj).c.b(2);
        }
        yfq yfqVarC = mbw.b().c(null);
        if (yfqVarC != null) {
            Object obj2 = this.a;
            synchronized (((mbs) obj2).b) {
                ynp ynpVarListIterator = yfqVarC.listIterator(0);
                while (ynpVarListIterator.hasNext()) {
                    StatusBarNotification statusBarNotification = (StatusBarNotification) ynpVarListIterator.next();
                    if (statusBarNotification == null) {
                        ((ype) ((ype) mbs.a.h()).ai(4717)).u("Found null notification in active notifications");
                    } else {
                        ((mbs) obj2).d.put(statusBarNotification.getKey(), statusBarNotification);
                    }
                }
            }
        }
        ((mbs) this.a).e(new mbq(1));
    }

    @Override // defpackage.mbk
    public final void b() {
        if (this.b == 0) {
            ((qiv) this.a).b.post(new qit(this, 2));
            return;
        }
        yph yphVar = mbs.a;
        Object obj = this.a;
        synchronized (((mbs) obj).b) {
            ((mbs) obj).c.b(4);
        }
    }

    @Override // defpackage.mbk
    public final void c(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        int i = 10;
        if (this.b == 0) {
            yph yphVar = qiv.a;
            ((qiv) this.a).b.post(new prm(this, statusBarNotification, rankingMap, i));
            return;
        }
        yph yphVar2 = mbs.a;
        String packageName = statusBarNotification.getPackageName();
        Object obj = this.a;
        mbs mbsVar = (mbs) obj;
        mbsVar.c.a(packageName);
        synchronized (mbsVar.b) {
            ((mbs) obj).d.put(statusBarNotification.getKey(), statusBarNotification);
        }
        ((mbs) this.a).e(new kzp(statusBarNotification, i));
    }

    @Override // defpackage.mbk
    public final void d(NotificationListenerService.RankingMap rankingMap) {
        if (this.b != 0) {
            yph yphVar = mbs.a;
            return;
        }
        yph yphVar2 = qiv.a;
        ((qiv) this.a).b.post(new qfa(this, rankingMap, 14));
    }

    @Override // defpackage.mbk
    public final void e(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        int i = 9;
        if (this.b == 0) {
            yph yphVar = qiv.a;
            ((qiv) this.a).b.post(new prm(this, statusBarNotification, rankingMap, i));
            return;
        }
        yph yphVar2 = mbs.a;
        Object obj = this.a;
        synchronized (((mbs) obj).b) {
            ((mbs) obj).d.remove(statusBarNotification.getKey());
        }
        ((mbs) this.a).e(new kzp(statusBarNotification, i));
    }
}
