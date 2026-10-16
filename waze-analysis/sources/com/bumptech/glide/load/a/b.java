package com.bumptech.glide.load.a;

import java.util.concurrent.ThreadFactory;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new a(this, runnable), "glide-active-resources");
    }
}
