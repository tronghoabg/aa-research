package com.bumptech.glide.load.a.c;

import android.os.StrictMode;
import android.util.Log;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f3110a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f3111b;

    d(e eVar, Runnable runnable) {
        this.f3110a = runnable;
        Objects.requireNonNull(eVar);
        this.f3111b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3111b.f3112a) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            this.f3110a.run();
        } catch (Throwable th) {
            if (Log.isLoggable("GlideExecutor", 6)) {
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }
    }
}
