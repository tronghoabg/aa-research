package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.collection.ArrayMap;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class an {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10155a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final long f10156b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f10157c;

    /* renamed from: d, reason: collision with root package name */
    private final u f10158d;

    /* renamed from: e, reason: collision with root package name */
    private final s f10159e;

    /* renamed from: f, reason: collision with root package name */
    private final FirebaseMessaging f10160f;

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledExecutorService f10162h;

    /* renamed from: j, reason: collision with root package name */
    private final al f10164j;

    /* renamed from: g, reason: collision with root package name */
    private final Map f10161g = new ArrayMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f10163i = false;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        f10156b = 28800L;
    }

    private an(FirebaseMessaging firebaseMessaging, u uVar, al alVar, s sVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f10160f = firebaseMessaging;
        this.f10158d = uVar;
        this.f10164j = alVar;
        this.f10159e = sVar;
        this.f10157c = context;
        this.f10162h = scheduledExecutorService;
    }

    static /* synthetic */ an a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, u uVar, s sVar) {
        return new an(firebaseMessaging, uVar, al.b(context, scheduledExecutorService), sVar, context, scheduledExecutorService);
    }

    static boolean f() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private static void i(com.google.android.gms.o.t tVar) throws IOException {
        try {
            com.google.android.gms.o.ag.g(tVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e3);
            }
            throw ((RuntimeException) cause);
        }
    }

    final void b(Runnable runnable, long j2) {
        this.f10162h.schedule(runnable, j2, TimeUnit.SECONDS);
    }

    final synchronized void c(boolean z) {
        this.f10163i = z;
    }

    final void d() {
        if (this.f10164j.a() == null || g()) {
            return;
        }
        e(0L);
    }

    final void e(long j2) {
        b(new ap(this, this.f10157c, this.f10158d, Math.min(Math.max(30L, j2 + j2), f10156b)), j2);
        c(true);
    }

    final synchronized boolean g() {
        return this.f10163i;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[Catch: IOException -> 0x0109, TryCatch #0 {IOException -> 0x0109, blocks: (B:12:0x001a, B:20:0x0034, B:22:0x004d, B:29:0x00ae, B:31:0x00b4, B:26:0x0075, B:28:0x008e), top: B:67:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean h() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.an.h():boolean");
    }
}
