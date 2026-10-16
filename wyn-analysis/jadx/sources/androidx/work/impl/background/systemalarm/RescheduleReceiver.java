package androidx.work.impl.background.systemalarm;

import J3.r;
import K3.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19075a = r.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        r.d().a(f19075a, "Received intent " + intent);
        try {
            q qVarC = q.c(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (q.f6500m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = qVarC.f6509i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    qVarC.f6509i = pendingResultGoAsync;
                    if (qVarC.f6508h) {
                        pendingResultGoAsync.finish();
                        qVarC.f6509i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e7) {
            r.d().c(f19075a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e7);
        }
    }
}
