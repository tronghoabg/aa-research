package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadFactory f8987a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f8988b = new AtomicLong();

    /* renamed from: c, reason: collision with root package name */
    private final String f8989c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8990d;

    /* renamed from: e, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f8991e;

    b(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        this.f8989c = str;
        this.f8990d = i2;
        this.f8991e = threadPolicy;
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable) throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(bVar.f8990d);
        StrictMode.ThreadPolicy threadPolicy = bVar.f8991e;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f8987a.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                b.a(this.f8985a, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f8989c, Long.valueOf(this.f8988b.getAndIncrement())));
        return threadNewThread;
    }
}
