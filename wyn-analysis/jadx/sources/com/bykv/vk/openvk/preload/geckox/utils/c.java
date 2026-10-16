package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f24489a;

    public static c a() {
        if (f24489a == null) {
            synchronized (c.class) {
                try {
                    if (f24489a == null) {
                        f24489a = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f24489a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
