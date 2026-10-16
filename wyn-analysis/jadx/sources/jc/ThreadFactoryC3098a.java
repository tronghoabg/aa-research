package jc;

import java.util.concurrent.ThreadFactory;

/* renamed from: jc.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ThreadFactoryC3098a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public int f38753a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb2 = new StringBuilder("flutter-worker-");
        int i5 = this.f38753a;
        this.f38753a = i5 + 1;
        sb2.append(i5);
        thread.setName(sb2.toString());
        return thread;
    }
}
