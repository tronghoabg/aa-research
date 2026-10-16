package androidx.work;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface RunnableScheduler {
    void cancel(Runnable runnable);

    void scheduleWithDelay(long j2, Runnable runnable);
}
