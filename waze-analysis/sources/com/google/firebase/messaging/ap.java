package com.google.firebase.messaging;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ap implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f10167a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f10168b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f10169c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f10170d;

    /* renamed from: e, reason: collision with root package name */
    private final u f10171e;

    /* renamed from: f, reason: collision with root package name */
    private final PowerManager.WakeLock f10172f;

    /* renamed from: g, reason: collision with root package name */
    private final an f10173g;

    /* renamed from: h, reason: collision with root package name */
    private final long f10174h;

    ap(an anVar, Context context, u uVar, long j2) {
        this.f10173g = anVar;
        this.f10170d = context;
        this.f10174h = j2;
        this.f10171e = uVar;
        this.f10172f = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    static /* bridge */ /* synthetic */ boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private static boolean d(Context context) {
        boolean zBooleanValue;
        synchronized (f10167a) {
            Boolean bool = f10168b;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? f(context, "android.permission.WAKE_LOCK") : bool.booleanValue());
            f10168b = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean e() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f10170d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    private static boolean f(Context context, String str) {
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        an anVar;
        boolean zBooleanValue;
        Context context = this.f10170d;
        if (d(context)) {
            this.f10172f.acquire(d.f10192a);
        }
        try {
            try {
                anVar = this.f10173g;
                anVar.c(true);
            } catch (Throwable th) {
                if (d(this.f10170d)) {
                    try {
                        this.f10172f.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e2.getMessage());
            this.f10173g.c(false);
        }
        if (!this.f10171e.e()) {
            anVar.c(false);
            if (d(context)) {
                try {
                    this.f10172f.release();
                    return;
                } catch (RuntimeException unused2) {
                    str = "FirebaseMessaging";
                    str2 = "TopicsSyncTask's wakelock was already released due to timeout.";
                    Log.i(str, str2);
                }
            }
            return;
        }
        Context context2 = this.f10170d;
        synchronized (f10167a) {
            Boolean bool = f10169c;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? f(context2, "android.permission.ACCESS_NETWORK_STATE") : bool.booleanValue());
            f10169c = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        if (!zBooleanValue || e()) {
            an anVar2 = this.f10173g;
            if (anVar2.h()) {
                anVar2.c(false);
            } else {
                anVar2.e(this.f10174h);
            }
        } else {
            ao aoVar = new ao(this, this);
            if (c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            aoVar.f10165a.f10170d.registerReceiver(aoVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        if (d(this.f10170d)) {
            try {
                this.f10172f.release();
            } catch (RuntimeException unused3) {
                str = "FirebaseMessaging";
                str2 = "TopicsSyncTask's wakelock was already released due to timeout.";
                Log.i(str, str2);
            }
        }
    }
}
