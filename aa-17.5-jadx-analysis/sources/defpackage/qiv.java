package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class qiv implements mbl {
    public static final yph a = yph.c("GH.NotificationClient");
    public final mbd c;
    public volatile NotificationListenerService.RankingMap e;
    public mbj f;
    public boolean g;
    public final ajmd j;
    public final List d = new ArrayList();
    public final mbg h = new qis(this);
    public final mbk i = new qiu(this, 0);
    public final Handler b = new Handler(Looper.getMainLooper());

    public qiv(ajmd ajmdVar, mbd mbdVar) {
        this.j = ajmdVar;
        this.c = mbdVar;
    }

    @Override // defpackage.mbl
    public final NotificationListenerService.RankingMap a() {
        NotificationListenerService.RankingMap rankingMapE;
        wer.c();
        if (this.e != null) {
            return this.e;
        }
        if (acui.c()) {
            woy.aa(c(), "Cannot interact with notification listener before onListenerConnected called");
            rankingMapE = mbw.b().a();
        } else {
            try {
                rankingMapE = d().e();
            } catch (RemoteException e) {
                throw new IllegalStateException("Could not call the service", e);
            }
        }
        this.e = rankingMapE;
        return rankingMapE;
    }

    @Override // defpackage.mbl
    public final List b() {
        wer.c();
        return this.d;
    }

    @Override // defpackage.mbl
    public final boolean c() {
        wer.c();
        boolean z = true;
        if (!acui.c()) {
            return this.f != null;
        }
        mbw mbwVarB = mbw.b();
        synchronized (mbwVarB.b) {
            if (mbwVarB.c != 3) {
                z = false;
            }
        }
        return z;
    }

    public final mbj d() {
        wer.c();
        woy.aa(!acui.c(), "Cannot get Binder service in Local mode");
        woy.aa(c(), "Cannot interact with notification listener before onListenerConnected called");
        mbj mbjVar = this.f;
        mbjVar.getClass();
        return mbjVar;
    }

    public final void e(StatusBarNotification statusBarNotification) {
        wer.c();
        int i = 0;
        while (true) {
            List list = this.d;
            if (i >= list.size()) {
                return;
            }
            if (((StatusBarNotification) list.get(i)).getKey().equals(statusBarNotification.getKey())) {
                list.remove(i);
                return;
            }
            i++;
        }
    }
}
