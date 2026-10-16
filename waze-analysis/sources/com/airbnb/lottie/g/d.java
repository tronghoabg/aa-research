package com.airbnb.lottie.g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class d implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f2398a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    private final ThreadGroup f2399b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f2400c = new AtomicInteger(1);

    /* renamed from: d, reason: collision with root package name */
    private final String f2401d;

    public d() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f2399b = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f2401d = "lottie-" + f2398a.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f2399b, runnable, this.f2401d + this.f2400c.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
