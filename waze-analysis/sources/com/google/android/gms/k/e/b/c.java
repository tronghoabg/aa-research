package com.google.android.gms.k.e.b;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f5574a = Executors.defaultThreadFactory();

    /* synthetic */ c() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f5574a.newThread(runnable);
        if (threadNewThread == null) {
            throw new NullPointerException("Default ThreadFactory returned null thread");
        }
        threadNewThread.setName("punch".concat(String.valueOf(threadNewThread.getName())));
        return threadNewThread;
    }
}
