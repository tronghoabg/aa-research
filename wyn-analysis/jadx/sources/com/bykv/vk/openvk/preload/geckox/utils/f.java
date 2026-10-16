package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class f implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f24491a;

    public static f a() {
        if (f24491a == null) {
            synchronized (f.class) {
                try {
                    if (f24491a == null) {
                        f24491a = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f24491a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
