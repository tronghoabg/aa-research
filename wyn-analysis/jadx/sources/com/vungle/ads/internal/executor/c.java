package com.vungle.ads.internal.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f32977a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f32978b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f32979c;

    public c(String name) {
        AbstractC3340k.e(name, "name");
        this.f32977a = name;
        this.f32978b = Executors.defaultThreadFactory();
        this.f32979c = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r10) {
        AbstractC3340k.e(r10, "r");
        Thread threadNewThread = this.f32978b.newThread(r10);
        threadNewThread.setName(this.f32977a + "-th-" + this.f32979c.incrementAndGet());
        return threadNewThread;
    }
}
