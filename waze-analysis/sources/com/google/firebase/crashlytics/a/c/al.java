package com.google.firebase.crashlytics.a.c;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class al implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f9129a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AtomicLong f9130b;

    al(String str, AtomicLong atomicLong) {
        this.f9129a = str;
        this.f9130b = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new ak(this, runnable));
        threadNewThread.setName(this.f9129a + this.f9130b.getAndIncrement());
        return threadNewThread;
    }
}
