package com.bumptech.glide.load.a.c;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    final boolean f3112a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f3113b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3114c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f3115d = new AtomicInteger();

    e(ThreadFactory threadFactory, String str, boolean z) {
        this.f3113b = threadFactory;
        this.f3114c = str;
        this.f3112a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        b bVar = new b((c) this.f3113b, new d(this, runnable));
        bVar.setName("glide-" + this.f3114c + "-thread-" + this.f3115d.getAndIncrement());
        return bVar;
    }
}
