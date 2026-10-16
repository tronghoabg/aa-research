package com.google.d.m.a;

import j$.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bw implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ThreadFactory f8044a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f8045b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AtomicLong f8046c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Boolean f8047d;

    bw(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.f8044a = threadFactory;
        this.f8045b = str;
        this.f8046c = atomicLong;
        this.f8047d = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f8044a.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        String str = this.f8045b;
        if (str != null) {
            threadNewThread.setName(bx.e(str, Long.valueOf(((AtomicLong) Objects.requireNonNull(this.f8046c)).getAndIncrement())));
        }
        Boolean bool = this.f8047d;
        if (bool != null) {
            bool.booleanValue();
            threadNewThread.setDaemon(true);
        }
        return threadNewThread;
    }
}
