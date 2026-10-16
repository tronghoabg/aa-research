package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class swb {
    private static final java.lang.Object a;
    private static java.lang.reflect.Method b;
    private static boolean c;

    static {
        int i = defpackage.sks.c;
        a = new java.lang.Object();
        b = null;
        c = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e A[Catch: all -> 0x00b4, TryCatch #1 {, blocks: (B:5:0x000f, B:8:0x0014, B:13:0x0036, B:14:0x003b, B:16:0x003d, B:18:0x0040, B:24:0x004c, B:26:0x0050, B:29:0x008c, B:32:0x009e, B:33:0x00a3, B:35:0x00a5, B:36:0x00b3, B:11:0x0020), top: B:44:0x000f, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5 A[Catch: all -> 0x00b4, TryCatch #1 {, blocks: (B:5:0x000f, B:8:0x0014, B:13:0x0036, B:14:0x003b, B:16:0x003d, B:18:0x0040, B:24:0x004c, B:26:0x0050, B:29:0x008c, B:32:0x009e, B:33:0x00a3, B:35:0x00a5, B:36:0x00b3, B:11:0x0020), top: B:44:0x000f, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(android.content.Context context) throws defpackage.slh, defpackage.slg {
        android.content.Context context2;
        boolean z;
        android.content.Context contextCreatePackageContext;
        if (context == null) {
            throw new java.lang.NullPointerException("Context must not be null");
        }
        defpackage.sli.c(context, 11925000);
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        synchronized (a) {
            android.content.Context context3 = null;
            if (c) {
                z = c;
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                if (contextCreatePackageContext != null) {
                    c = true;
                    if (!z) {
                        defpackage.sqs.aX(contextCreatePackageContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", new defpackage.rkq(android.content.Context.class, context), new defpackage.rkq(java.lang.Long.TYPE, java.lang.Long.valueOf(jUptimeMillis)), new defpackage.rkq(java.lang.Long.TYPE, java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis())));
                    }
                    context3 = contextCreatePackageContext;
                }
                if (context3 != null) {
                    b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    android.util.Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new defpackage.slg(8);
                }
            }
            try {
                context2 = com.google.android.gms.dynamite.DynamiteModule.b(context, com.google.android.gms.dynamite.DynamiteModule.b, "com.google.android.gms.providerinstaller.dynamite").c;
            } catch (defpackage.srq e) {
                android.util.Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(java.lang.String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z = c;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext != null) {
                c = true;
                if (!z) {
                    try {
                        defpackage.sqs.aX(contextCreatePackageContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", new defpackage.rkq(android.content.Context.class, context), new defpackage.rkq(java.lang.Long.TYPE, java.lang.Long.valueOf(jUptimeMillis)), new defpackage.rkq(java.lang.Long.TYPE, java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis())));
                    } catch (java.lang.Exception e2) {
                        android.util.Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                    }
                }
                context3 = contextCreatePackageContext;
            }
            if (context3 != null) {
                b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            } else {
                android.util.Log.e("ProviderInstaller", "Failed to get remote context");
                throw new defpackage.slg(8);
            }
            throw th;
        }
    }

    private static void b(android.content.Context context, java.lang.String str) throws defpackage.slg {
        try {
            java.lang.reflect.Method method = b;
            if (method == null) {
                method = context.getClassLoader().loadClass(str).getMethod("insertProvider", android.content.Context.class);
                b = method;
            }
            method.invoke(null, context);
        } catch (java.lang.Exception e) {
            java.lang.Throwable cause = e.getCause();
            if (android.util.Log.isLoggable("ProviderInstaller", 6)) {
                android.util.Log.e("ProviderInstaller", "Failed to install provider: ".concat(java.lang.String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new defpackage.slg(8);
        }
    }
}
