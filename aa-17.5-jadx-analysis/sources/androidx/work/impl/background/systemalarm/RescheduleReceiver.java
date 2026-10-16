package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.fjo;
import defpackage.flo;
import java.util.Objects;

/* loaded from: classes2.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = fjo.b("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        fjo fjoVarA = fjo.a();
        String str = a;
        Objects.toString(intent);
        fjoVarA.c(str, "Received intent ".concat(String.valueOf(intent)));
        try {
            flo floVarB = flo.b(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (flo.a) {
                BroadcastReceiver.PendingResult pendingResult = floVarB.h;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                floVarB.h = pendingResultGoAsync;
                if (floVarB.g) {
                    floVarB.h.finish();
                    floVarB.h = null;
                }
            }
        } catch (IllegalStateException e) {
            fjo.a();
            Log.e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
