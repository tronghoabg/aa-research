package com.google.android.libraries.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.UserManager;
import android.util.Log;
import com.google.d.m.a.af;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.bv;
import com.google.d.m.a.cf;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5792a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static UserManager f5793b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f5794c = false;

    private c() {
    }

    public static Context a(Context context) {
        return context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext();
    }

    public static bm b(final Context context, af afVar, Executor executor) {
        if (f(context)) {
            return bd.l(afVar, executor);
        }
        final bv bvVarF = bv.f();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final b bVar = new b(atomicBoolean, context, bvVarF, afVar, executor);
        context.registerReceiver(bVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!f(context) || !atomicBoolean.compareAndSet(false, true)) {
            bvVarF.addListener(new Runnable() { // from class: com.google.android.libraries.a.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(bvVarF, atomicBoolean, context, bVar);
                }
            }, cf.y());
            return bvVarF;
        }
        g(context, bVar);
        bvVarF.e(bd.l(afVar, executor));
        return bvVarF;
    }

    static /* synthetic */ void d(bv bvVar, AtomicBoolean atomicBoolean, Context context, BroadcastReceiver broadcastReceiver) {
        if (bvVar.isCancelled() && atomicBoolean.compareAndSet(false, true)) {
            g(context, broadcastReceiver);
        }
    }

    public static boolean e(Context context) {
        return !h(context);
    }

    public static boolean f(Context context) {
        return h(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e2) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean h(android.content.Context r7) {
        /*
            boolean r0 = com.google.android.libraries.a.c.f5794c
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<com.google.android.libraries.a.c> r0 = com.google.android.libraries.a.c.class
            monitor-enter(r0)
            boolean r2 = com.google.android.libraries.a.c.f5794c     // Catch: java.lang.Throwable -> L50
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
            android.os.UserManager r3 = com.google.android.libraries.a.c.f5793b     // Catch: java.lang.Throwable -> L50
            if (r3 != 0) goto L23
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> L50
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> L50
            com.google.android.libraries.a.c.f5793b = r3     // Catch: java.lang.Throwable -> L50
        L23:
            if (r3 != 0) goto L27
            r5 = r1
            goto L4a
        L27:
            boolean r6 = com.waze.mg$$ExternalSyntheticApiModelOutline0.m(r3)     // Catch: java.lang.NullPointerException -> L39 java.lang.Throwable -> L50
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
            com.google.android.libraries.a.c.f5793b = r4     // Catch: java.lang.Throwable -> L50
            int r2 = r2 + 1
            goto L10
        L46:
            if (r5 == 0) goto L4a
            com.google.android.libraries.a.c.f5793b = r4     // Catch: java.lang.Throwable -> L50
        L4a:
            if (r5 == 0) goto L4e
            com.google.android.libraries.a.c.f5794c = r1     // Catch: java.lang.Throwable -> L50
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return r5
        L50:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.a.c.h(android.content.Context):boolean");
    }
}
