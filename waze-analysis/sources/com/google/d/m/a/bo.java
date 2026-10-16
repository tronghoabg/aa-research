package com.google.d.m.a;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface bo extends ScheduledExecutorService, bn {
    aw c(Runnable runnable, long j2, TimeUnit timeUnit);

    aw d(Callable callable, long j2, TimeUnit timeUnit);
}
