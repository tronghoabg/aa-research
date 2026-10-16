package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tnx {
    public static final /* synthetic */ int a = 0;
    private static android.os.UserManager b = null;
    private static volatile boolean c = false;

    private tnx() {
    }

    public static android.content.Context a(android.content.Context context) {
        return a$.ExternalSyntheticApiModelOutline2.m(context) ? context : a$.ExternalSyntheticApiModelOutline2.m(context);
    }

    public static defpackage.zhs b(android.content.Context context, defpackage.zgm zgmVar, java.util.concurrent.Executor executor) {
        if (e(context)) {
            defpackage.zim zimVar = new defpackage.zim(zgmVar);
            executor.execute(zimVar);
            return zimVar;
        }
        defpackage.zif zifVar = new defpackage.zif();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        tnw tnwVar = new tnw(atomicBoolean, context, zifVar, zgmVar, executor);
        context.registerReceiver(tnwVar, new android.content.IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!e(context) || !atomicBoolean.compareAndSet(false, true)) {
            zifVar.c(new tnv(zifVar, atomicBoolean, context, tnwVar), defpackage.zgt.INSTANCE);
            return zifVar;
        }
        d(context, tnwVar);
        defpackage.zim zimVar2 = new defpackage.zim(zgmVar);
        executor.execute(zimVar2);
        zifVar.r(zimVar2);
        return zifVar;
    }

    public static defpackage.zhs c(android.content.Context context, java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        return b(context, new defpackage.vtx(java.util.concurrent.Executors.callable(runnable, null), 1), executor);
    }

    public static void d(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (java.lang.IllegalArgumentException e) {
            android.util.Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004c A[Catch: all -> 0x0050, TryCatch #0 {, blocks: (B:7:0x0009, B:9:0x000d, B:14:0x0015, B:16:0x0019, B:29:0x004c, B:30:0x004e, B:19:0x0027, B:21:0x002d, B:25:0x003a, B:27:0x0048), top: B:35:0x0009, inners: #1 }] */
    public static boolean e(android.content.Context context) {
        if (c) {
            return true;
        }
        synchronized (defpackage.tnx.class) {
            if (c) {
                return true;
            }
            int i = 1;
            while (true) {
                boolean z = false;
                if (i <= 2) {
                    android.os.UserManager userManager = b;
                    if (userManager == null) {
                        userManager = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
                        b = userManager;
                    }
                    if (userManager == null) {
                        z = true;
                    } else {
                        try {
                            if (a$.ExternalSyntheticApiModelOutline2.m(userManager) || !userManager.isUserRunning(android.os.Process.myUserHandle())) {
                                z = true;
                            }
                        } catch (java.lang.NullPointerException e) {
                            android.util.Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                            b = null;
                            i++;
                        }
                    }
                    if (z) {
                        c = true;
                    }
                    return z;
                }
                if (z) {
                    b = null;
                }
                if (z) {
                    c = true;
                }
                return z;
            }
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static boolean f(android.content.Context context) {
        return e(context);
    }
}
