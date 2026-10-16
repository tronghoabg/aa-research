package com.vungle.ads.internal.executor;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class g {
    public static final h a(Runnable runnable, Runnable runnable2) {
        int i5 = j.f32993b;
        return runnable instanceof com.vungle.ads.internal.task.j ? new e(runnable, runnable2) : new f(runnable, runnable2);
    }

    public static Callable b(Callable callable, i iVar) {
        return new B8.c(1, callable, iVar);
    }

    public static final Object a(Callable command, tf.a failFallback) {
        AbstractC3340k.e(command, "$command");
        AbstractC3340k.e(failFallback, "$failFallback");
        try {
            return command.call();
        } catch (OutOfMemoryError unused) {
            failFallback.invoke();
            return null;
        }
    }
}
