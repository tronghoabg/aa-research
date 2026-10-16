package D7;

import android.content.Context;
import android.util.Log;
import d7.f;
import d7.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2557a = f.f34129b;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2558b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static Method f2559c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2560d = false;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[Catch: all -> 0x002b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0019, B:7:0x0020, B:14:0x0043, B:15:0x0048, B:12:0x002f, B:17:0x004a, B:18:0x004e, B:23:0x0059, B:25:0x005d, B:28:0x0086, B:31:0x0096, B:32:0x009b, B:34:0x009d, B:35:0x00a9), top: B:44:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096 A[Catch: all -> 0x002b, TryCatch #3 {, blocks: (B:4:0x0019, B:7:0x0020, B:14:0x0043, B:15:0x0048, B:12:0x002f, B:17:0x004a, B:18:0x004e, B:23:0x0059, B:25:0x005d, B:28:0x0086, B:31:0x0096, B:32:0x009b, B:34:0x009d, B:35:0x00a9), top: B:44:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d A[Catch: all -> 0x002b, TryCatch #3 {, blocks: (B:4:0x0019, B:7:0x0020, B:14:0x0043, B:15:0x0048, B:12:0x002f, B:17:0x004a, B:18:0x004e, B:23:0x0059, B:25:0x005d, B:28:0x0086, B:31:0x0096, B:32:0x009b, B:34:0x009d, B:35:0x00a9), top: B:44:0x0019, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r13) {
        /*
            r0 = 1
            r1 = 3
            java.lang.String r2 = "Context must not be null"
            com.google.android.gms.common.internal.AbstractC1732v.j(r13, r2)
            d7.f r2 = D7.a.f2557a
            r2.getClass()
            r2 = 11925000(0xb5f608, float:1.6710484E-38)
            d7.i.a(r13, r2)
            long r2 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r4 = D7.a.f2558b
            monitor-enter(r4)
            boolean r5 = D7.a.f2560d     // Catch: java.lang.Throwable -> L2b
            r6 = 0
            if (r5 != 0) goto L4a
            java.lang.String r5 = "Failed to load providerinstaller module: "
            ae.b r7 = r7.C3934d.f44526e     // Catch: java.lang.Throwable -> L2b r7.C3931a -> L2e
            java.lang.String r8 = "com.google.android.gms.providerinstaller.dynamite"
            r7.d r7 = r7.C3934d.c(r13, r7, r8)     // Catch: java.lang.Throwable -> L2b r7.C3931a -> L2e
            android.content.Context r5 = r7.f44536a     // Catch: java.lang.Throwable -> L2b r7.C3931a -> L2e
            goto L41
        L2b:
            r13 = move-exception
            goto Laa
        L2e:
            r7 = move-exception
            java.lang.String r8 = "ProviderInstaller"
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r5.concat(r7)     // Catch: java.lang.Throwable -> L2b
            android.util.Log.w(r8, r5)     // Catch: java.lang.Throwable -> L2b
            r5 = r6
        L41:
            if (r5 == 0) goto L4a
            java.lang.String r13 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            b(r5, r13)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            goto L9c
        L4a:
            boolean r5 = D7.a.f2560d     // Catch: java.lang.Throwable -> L2b
            java.lang.String r7 = "Failed to report request stats: "
            java.lang.String r8 = "com.google.android.gms"
            android.content.Context r8 = r13.createPackageContext(r8, r1)     // Catch: java.lang.Throwable -> L2b android.content.pm.PackageManager.NameNotFoundException -> L55
            goto L56
        L55:
            r8 = r6
        L56:
            if (r8 != 0) goto L59
            goto L94
        L59:
            D7.a.f2560d = r0     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L93
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L85
            java.lang.String r9 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r10 = "reportRequestStats2"
            java.lang.ClassLoader r11 = r8.getClassLoader()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L85
            java.lang.Class<android.content.Context> r12 = android.content.Context.class
            com.google.android.gms.internal.common.zzi r13 = com.google.android.gms.internal.common.zzi.zzb(r12, r13)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L85
            com.google.android.gms.internal.common.zzh r2 = com.google.android.gms.internal.common.zzh.zza(r2)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L85
            com.google.android.gms.internal.common.zzh r3 = com.google.android.gms.internal.common.zzh.zza(r5)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L85
            com.google.android.gms.internal.common.zzi[] r1 = new com.google.android.gms.internal.common.zzi[r1]     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L85
            r5 = 0
            r1[r5] = r13     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L85
            r1[r0] = r2     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L85
            r13 = 2
            r1[r13] = r3     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L85
            com.google.android.gms.internal.common.zzj.zzb(r9, r10, r11, r1)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L85
            goto L93
        L85:
            r13 = move-exception
            java.lang.String r0 = "ProviderInstaller"
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r13 = r7.concat(r13)     // Catch: java.lang.Throwable -> L2b
            android.util.Log.w(r0, r13)     // Catch: java.lang.Throwable -> L2b
        L93:
            r6 = r8
        L94:
            if (r6 == 0) goto L9d
            java.lang.String r13 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            b(r6, r13)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
        L9c:
            return
        L9d:
            java.lang.String r13 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r13, r0)     // Catch: java.lang.Throwable -> L2b
            d7.g r13 = new d7.g     // Catch: java.lang.Throwable -> L2b
            r13.<init>()     // Catch: java.lang.Throwable -> L2b
            throw r13     // Catch: java.lang.Throwable -> L2b
        Laa:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: D7.a.a(android.content.Context):void");
    }

    public static void b(Context context, String str) throws IllegalAccessException, g, IllegalArgumentException, InvocationTargetException {
        try {
            if (f2559c == null) {
                f2559c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f2559c.invoke(null, context);
        } catch (Exception e7) {
            Throwable cause = e7.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e7.toString() : cause.toString())));
            }
            throw new g();
        }
    }
}
