package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import defpackage.fjo;
import defpackage.flo;
import defpackage.gjv;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ForceStopRunnable implements Runnable {
    private static final String a = fjo.b("ForceStopRunnable");
    private static final long b;
    private final Context c;
    private final flo d;
    private int e = 0;
    private final gjv f;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        static {
            fjo.b("ForceStopRunnable$Rcvr");
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            int i = fjo.a().c;
            ForceStopRunnable.a(context);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        b = 315360000000L;
    }

    public ForceStopRunnable(Context context, flo floVar) {
        this.c = context.getApplicationContext();
        this.d = floVar;
        this.f = floVar.i;
    }

    static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentB = b(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + b;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentB);
        }
    }

    private static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f6 A[Catch: SQLiteException -> 0x0358, all -> 0x0413, TRY_ENTER, TryCatch #0 {SQLiteException -> 0x0358, blocks: (B:146:0x0354, B:147:0x0357, B:109:0x02a7, B:111:0x02ad, B:113:0x02b3, B:115:0x02c3, B:116:0x02c7, B:118:0x02cd, B:120:0x02dd, B:139:0x031a, B:123:0x02e6, B:133:0x02f6, B:138:0x0310, B:126:0x02ec), top: B:197:0x01e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0200  */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.util.Map] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.run():void");
    }
}
