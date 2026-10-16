package com.bytedance.sdk.component.lw.oa.uef;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class uef implements ThreadFactory {

    /* renamed from: oa, reason: collision with root package name */
    private final AtomicInteger f25023oa = new AtomicInteger(1);
    private final ThreadGroup uef;

    public uef(String str) {
        this.uef = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.uef, runnable, "tt_img_" + this.f25023oa.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
