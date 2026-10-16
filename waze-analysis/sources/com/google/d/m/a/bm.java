package com.google.d.m.a;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface bm<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
