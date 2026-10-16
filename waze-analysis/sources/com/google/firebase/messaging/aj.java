package com.google.firebase.messaging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final ExecutorService f10138a = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.a.b("firebase-iid-executor"));

    /* renamed from: b, reason: collision with root package name */
    private final long f10139b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f10140c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f10141d;

    public aj(FirebaseMessaging firebaseMessaging, long j2) {
        this.f10141d = firebaseMessaging;
        this.f10139b = j2;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f10140c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    static boolean b() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    final Context a() {
        return this.f10141d.a();
    }

    final boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (ad.c().e(a())) {
            this.f10140c.acquire();
        }
        try {
            try {
                FirebaseMessaging firebaseMessaging = this.f10141d;
                firebaseMessaging.n(true);
                if (!firebaseMessaging.q()) {
                    firebaseMessaging.n(false);
                } else if (!ad.c().d(a()) || c()) {
                    try {
                    } catch (IOException e2) {
                        String message = e2.getMessage();
                        if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                            Log.w("FirebaseMessaging", "Token retrieval failed: " + e2.getMessage() + ". Will retry token retrieval");
                        } else {
                            if (e2.getMessage() != null) {
                                throw e2;
                            }
                            Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                        }
                    } catch (SecurityException unused) {
                        Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
                    }
                    if (firebaseMessaging.h() == null) {
                        Log.e("FirebaseMessaging", "Token retrieval failed: null");
                        this.f10141d.o(this.f10139b);
                    } else {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Token successfully retrieved");
                        }
                        this.f10141d.n(false);
                    }
                } else {
                    new ai(this).a();
                }
            } catch (IOException e3) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e3.getMessage() + ". Won't retry the operation.");
                this.f10141d.n(false);
            }
        } finally {
            if (ad.c().e(a())) {
                this.f10140c.release();
            }
        }
    }
}
