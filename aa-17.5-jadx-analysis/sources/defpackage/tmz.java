package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.UserManager;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class tmz {
    public static final /* synthetic */ int a = 0;
    private static UserManager b = null;
    private static volatile boolean c = false;

    private tmz() {
    }

    public static Context a(Context context) {
        return context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext();
    }

    public static zgp b(final Context context, zfj zfjVar, Executor executor) {
        if (e(context)) {
            zhk zhkVar = new zhk(zfjVar);
            executor.execute(zhkVar);
            return zhkVar;
        }
        final zhc zhcVar = new zhc();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final tmy tmyVar = new tmy(atomicBoolean, context, zhcVar, zfjVar, executor);
        context.registerReceiver(tmyVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!e(context) || !atomicBoolean.compareAndSet(false, true)) {
            zhcVar.c(new Runnable() { // from class: tmx
                @Override // java.lang.Runnable
                public final void run() {
                    int i = tmz.a;
                    if (zhcVar.isCancelled() && atomicBoolean.compareAndSet(false, true)) {
                        tmz.d(context, tmyVar);
                    }
                }
            }, zfq.a);
            return zhcVar;
        }
        d(context, tmyVar);
        zhk zhkVar2 = new zhk(zfjVar);
        executor.execute(zhkVar2);
        zhcVar.r(zhkVar2);
        return zhcVar;
    }

    public static zgp c(Context context, Runnable runnable, Executor executor) {
        return b(context, new vtb(Executors.callable(runnable, null), 1), executor);
    }

    public static void d(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(android.content.Context r7) {
        /*
            boolean r0 = defpackage.tmz.c
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<tmz> r0 = defpackage.tmz.class
            monitor-enter(r0)
            boolean r2 = defpackage.tmz.c     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return r1
        Lf:
            r2 = r1
        L10:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L46
            android.os.UserManager r3 = defpackage.tmz.b     // Catch: java.lang.Throwable -> L50
            if (r3 != 0) goto L23
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> L50
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> L50
            defpackage.tmz.b = r3     // Catch: java.lang.Throwable -> L50
        L23:
            if (r3 != 0) goto L27
            r5 = r1
            goto L4a
        L27:
            boolean r6 = defpackage.a$$ExternalSyntheticApiModelOutline3.m(r3)     // Catch: java.lang.NullPointerException -> L39 java.lang.Throwable -> L50
            if (r6 != 0) goto L37
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L39 java.lang.Throwable -> L50
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.NullPointerException -> L39 java.lang.Throwable -> L50
            if (r7 != 0) goto L46
        L37:
            r5 = r1
            goto L46
        L39:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L50
            defpackage.tmz.b = r4     // Catch: java.lang.Throwable -> L50
            int r2 = r2 + 1
            goto L10
        L46:
            if (r5 == 0) goto L4a
            defpackage.tmz.b = r4     // Catch: java.lang.Throwable -> L50
        L4a:
            if (r5 == 0) goto L4e
            defpackage.tmz.c = r1     // Catch: java.lang.Throwable -> L50
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return r5
        L50:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmz.e(android.content.Context):boolean");
    }

    @ResultIgnorabilityUnspecified
    public static boolean f(Context context) {
        return e(context);
    }
}
