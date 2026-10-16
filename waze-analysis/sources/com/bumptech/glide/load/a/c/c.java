package com.bumptech.glide.load.a.c;

import java.util.concurrent.ThreadFactory;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new b(this, runnable);
    }
}
