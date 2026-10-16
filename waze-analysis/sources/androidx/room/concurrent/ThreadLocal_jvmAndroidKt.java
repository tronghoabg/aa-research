package androidx.room.concurrent;

import h.c.h;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ThreadLocal_jvmAndroidKt {
    public static /* synthetic */ void ThreadLocal$annotations() {
    }

    public static final <T> h asContextElement(ThreadLocal<T> threadLocal, T t) {
        x.f(threadLocal, "<this>");
        return aj.K(threadLocal, t);
    }

    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }
}
