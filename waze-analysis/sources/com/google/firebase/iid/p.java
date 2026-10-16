package com.google.firebase.iid;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final ExecutorService f9967a = a.b();

    /* renamed from: b, reason: collision with root package name */
    private final long f9968b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager.WakeLock f9969c;

    /* renamed from: d, reason: collision with root package name */
    private final FirebaseInstanceId f9970d;

    p(FirebaseInstanceId firebaseInstanceId, long j2) {
        this.f9970d = firebaseInstanceId;
        this.f9968b = j2;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f9969c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    final Context a() {
        return this.f9970d.b().a();
    }

    final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (l.a().c(a())) {
            this.f9969c.acquire();
        }
        try {
            try {
                FirebaseInstanceId firebaseInstanceId = this.f9970d;
                firebaseInstanceId.h(true);
                if (!firebaseInstanceId.l()) {
                    firebaseInstanceId.h(false);
                } else if (l.a().b(a()) && !b()) {
                    new o(this).a();
                } else if (firebaseInstanceId.m(firebaseInstanceId.c())) {
                    try {
                    } catch (IOException e2) {
                        String message = e2.getMessage();
                        if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                            Log.w("FirebaseInstanceId", "Token retrieval failed: " + e2.getMessage() + ". Will retry token retrieval");
                        } else {
                            if (e2.getMessage() != null) {
                                throw e2;
                            }
                            Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                        }
                    } catch (SecurityException unused) {
                        Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
                    }
                    if (firebaseInstanceId.d() == null) {
                        Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                        this.f9970d.j(this.f9968b);
                    } else {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            Log.d("FirebaseInstanceId", "Token successfully retrieved");
                        }
                        this.f9970d.h(false);
                    }
                } else {
                    this.f9970d.h(false);
                }
            } catch (IOException e3) {
                Log.e("FirebaseInstanceId", "Topic sync or token retrieval failed on hard failure exceptions: " + e3.getMessage() + ". Won't retry the operation.");
                this.f9970d.h(false);
            }
        } finally {
            if (l.a().c(a())) {
                this.f9969c.release();
            }
        }
    }
}
