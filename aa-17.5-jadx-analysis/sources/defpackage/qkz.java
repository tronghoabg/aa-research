package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class qkz extends BroadcastReceiver {
    public static Boolean a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        spu.aw(context);
        if (qmh.a == null) {
            synchronized (qmh.class) {
                if (qmh.a == null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    qmh qmhVar = new qmh(new rjg(context, (byte[]) null));
                    qmh.a = qmhVar;
                    List list = qla.c;
                    synchronized (qla.class) {
                        List list2 = qla.c;
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            qla.c = null;
                        }
                    }
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    Long l = (Long) qmy.E.f();
                    if (jElapsedRealtime2 > l.longValue()) {
                        qmhVar.e().p(5, "Slow initialization (ms)", Long.valueOf(jElapsedRealtime2), l, null);
                    }
                }
            }
        }
        qmh qmhVar2 = qmh.a;
        qnd qndVarE = qmhVar2.e();
        if (intent == null) {
            qndVarE.p(5, "CampaignTrackingReceiver received null intent", null, null, null);
            return;
        }
        String stringExtra = intent.getStringExtra("referrer");
        String action = intent.getAction();
        qndVarE.p(2, "CampaignTrackingReceiver received", action, null, null);
        if (!"com.android.vending.INSTALL_REFERRER".equals(action) || TextUtils.isEmpty(stringExtra)) {
            qndVarE.p(5, "CampaignTrackingReceiver received unexpected intent without referrer extra", null, null, null);
            return;
        }
        qmu qmuVar = qmhVar2.d;
        int iE = qmu.e();
        if (stringExtra.length() > iE) {
            qndVarE.p(5, "Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(stringExtra.length()), Integer.valueOf(iE), null);
            stringExtra = stringExtra.substring(0, iE);
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        qmd qmdVarC = qmhVar2.c();
        qjv qjvVar = new qjv(pendingResultGoAsync, 3, null);
        spu.au(stringExtra, "campaign param can't be empty");
        qmdVarC.g().c(new rdz(qmdVarC, stringExtra, (Runnable) qjvVar, 1));
    }
}
