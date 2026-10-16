package com.google.d.m.a;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface bn extends ExecutorService {
    bm a(Runnable runnable);

    bm b(Callable callable);
}
