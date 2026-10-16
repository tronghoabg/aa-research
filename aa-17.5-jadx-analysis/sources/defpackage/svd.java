package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class svd {
    private static final Object a;
    private static Method b;
    private static boolean c;

    static {
        int i = sjw.c;
        a = new Object();
        b = null;
        c = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[Catch: all -> 0x00b4, TryCatch #1 {, blocks: (B:5:0x000f, B:8:0x0014, B:13:0x0036, B:14:0x003b, B:16:0x003d, B:18:0x0040, B:24:0x004c, B:26:0x0050, B:29:0x008c, B:32:0x009e, B:33:0x00a3, B:35:0x00a5, B:36:0x00b3, B:11:0x0020), top: B:44:0x000f, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5 A[Catch: all -> 0x00b4, TryCatch #1 {, blocks: (B:5:0x000f, B:8:0x0014, B:13:0x0036, B:14:0x003b, B:16:0x003d, B:18:0x0040, B:24:0x004c, B:26:0x0050, B:29:0x008c, B:32:0x009e, B:33:0x00a3, B:35:0x00a5, B:36:0x00b3, B:11:0x0020), top: B:44:0x000f, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r11) throws defpackage.skk, defpackage.skl {
        /*
            if (r11 == 0) goto Lb7
            r0 = 11925000(0xb5f608, float:1.6710484E-38)
            defpackage.skm.c(r11, r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r2 = defpackage.svd.a
            monitor-enter(r2)
            boolean r3 = defpackage.svd.c     // Catch: java.lang.Throwable -> Lb4
            r4 = 0
            if (r3 != 0) goto L3d
            sqv r3 = com.google.android.gms.dynamite.DynamiteModule.b     // Catch: defpackage.sqs -> L1f java.lang.Throwable -> Lb4
            java.lang.String r5 = "com.google.android.gms.providerinstaller.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r3 = com.google.android.gms.dynamite.DynamiteModule.b(r11, r3, r5)     // Catch: defpackage.sqs -> L1f java.lang.Throwable -> Lb4
            android.content.Context r3 = r3.c     // Catch: defpackage.sqs -> L1f java.lang.Throwable -> Lb4
            goto L34
        L1f:
            r3 = move-exception
            java.lang.String r5 = "ProviderInstaller"
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = "Failed to load providerinstaller module: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r3 = r6.concat(r3)     // Catch: java.lang.Throwable -> Lb4
            android.util.Log.w(r5, r3)     // Catch: java.lang.Throwable -> Lb4
            r3 = r4
        L34:
            if (r3 == 0) goto L3d
            java.lang.String r11 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            b(r3, r11)     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb4
            goto La4
        L3d:
            boolean r3 = defpackage.svd.c     // Catch: java.lang.Throwable -> Lb4
            r5 = 3
            java.lang.String r6 = "com.google.android.gms"
            android.content.Context r6 = r11.createPackageContext(r6, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L47 java.lang.Throwable -> Lb4
            goto L48
        L47:
            r6 = r4
        L48:
            if (r6 != 0) goto L4b
            goto L9c
        L4b:
            r4 = 1
            defpackage.svd.c = r4     // Catch: java.lang.Throwable -> Lb4
            if (r3 != 0) goto L9b
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            rju[] r5 = new defpackage.rju[r5]     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            rju r10 = new rju     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            r10.<init>(r9, r11)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            r11 = 0
            r5[r11] = r10     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            rju r11 = new rju     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            r11.<init>(r9, r0)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            r5[r4] = r11     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            rju r11 = new rju     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            r11.<init>(r0, r1)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            r0 = 2
            r5[r0] = r11     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            java.lang.String r11 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r0 = "reportRequestStats2"
            java.lang.Class r11 = r3.loadClass(r11)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            defpackage.spu.aG(r11, r0, r5)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lb4
            goto L9b
        L8b:
            r11 = move-exception
            java.lang.String r0 = "ProviderInstaller"
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = "Failed to report request stats: "
            java.lang.String r11 = r1.concat(r11)     // Catch: java.lang.Throwable -> Lb4
            android.util.Log.w(r0, r11)     // Catch: java.lang.Throwable -> Lb4
        L9b:
            r4 = r6
        L9c:
            if (r4 == 0) goto La5
            java.lang.String r11 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            b(r4, r11)     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb4
        La4:
            return
        La5:
            java.lang.String r11 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r11, r0)     // Catch: java.lang.Throwable -> Lb4
            skk r11 = new skk     // Catch: java.lang.Throwable -> Lb4
            r0 = 8
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Lb4
            throw r11     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r11 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb4
            throw r11
        Lb7:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "Context must not be null"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svd.a(android.content.Context):void");
    }

    private static void b(Context context, String str) throws IllegalAccessException, skk, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method method = b;
            if (method == null) {
                method = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
                b = method;
            }
            method.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new skk(8);
        }
    }
}
