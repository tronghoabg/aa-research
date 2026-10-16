package com.bytedance.adsdk.ugeno.xs;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class zjm implements Runnable {
    private WeakReference<Runnable> uef;

    public zjm(Runnable runnable) {
        this.uef = new WeakReference<>(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.uef.get();
        if (runnable != null) {
            runnable.run();
        }
    }
}
