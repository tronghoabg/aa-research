package com.google.android.gms.common.util.a;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f5141a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f5142b = Executors.defaultThreadFactory();

    public b(String str) {
        this.f5141a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f5142b.newThread(new c(runnable));
        threadNewThread.setName(this.f5141a);
        return threadNewThread;
    }
}
