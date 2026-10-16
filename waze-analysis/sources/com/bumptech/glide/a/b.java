package com.bumptech.glide.a;

import java.util.concurrent.ThreadFactory;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
