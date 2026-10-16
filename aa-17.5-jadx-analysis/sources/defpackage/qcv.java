package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class qcv extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Set<qcx> set = qcx.a;
        synchronized (set) {
            for (qcx qcxVar : set) {
                ScheduledExecutorService scheduledExecutorService = qcxVar.b;
                qcxVar.getClass();
                scheduledExecutorService.execute(new qct(qcxVar, 7));
            }
        }
    }
}
