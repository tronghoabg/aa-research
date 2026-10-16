package W9;

import android.content.Context;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class C implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f15291f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f15292g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f15293h;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15294a;

    /* renamed from: b, reason: collision with root package name */
    public final o f15295b;

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f15296c;

    /* renamed from: d, reason: collision with root package name */
    public final A f15297d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15298e;

    public C(A a5, Context context, o oVar, long j8) {
        this.f15297d = a5;
        this.f15294a = context;
        this.f15298e = j8;
        this.f15295b = oVar;
        this.f15296c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f15291f) {
            try {
                Boolean bool = f15293h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f15293h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z2 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z2 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z2;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (f15291f) {
            try {
                Boolean bool = f15292g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f15292g = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean d() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f15294a     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W9.C.d():boolean");
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        A a5 = this.f15297d;
        Context context = this.f15294a;
        boolean zC = c(context);
        PowerManager.WakeLock wakeLock = this.f15296c;
        if (zC) {
            wakeLock.acquire(AbstractC1235f.f15332a);
        }
        try {
            try {
                try {
                    a5.h(true);
                    if (!this.f15295b.f()) {
                        a5.h(false);
                        if (!c(context)) {
                            return;
                        }
                    } else if (!a(context) || d()) {
                        if (a5.j()) {
                            a5.h(false);
                        } else {
                            a5.k(this.f15298e);
                        }
                        if (!c(context)) {
                            return;
                        }
                    } else {
                        new B(this, this).a();
                        if (!c(context)) {
                            return;
                        }
                    }
                    wakeLock.release();
                } catch (IOException e7) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e7.getMessage());
                    a5.h(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (Throwable th) {
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused2) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
