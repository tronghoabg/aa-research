package androidx.camera.camera2.pipe.core;

import android.os.Process;
import h.g.b.x;
import h.n.o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlinx.a.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidThreads {
    public static final AndroidThreads INSTANCE = new AndroidThreads();
    private static final int[] NICE_VALUES = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
    private static final ThreadFactory factory;

    static {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        x.e(threadFactoryDefaultThreadFactory, "defaultThreadFactory(...)");
        factory = threadFactoryDefaultThreadFactory;
    }

    private AndroidThreads() {
    }

    private final int androidToJavaPriority(int i2) {
        int length = NICE_VALUES.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            if (i2 >= NICE_VALUES[i3]) {
                return i4;
            }
            i3 = i4;
        }
        return 10;
    }

    static final Thread withAndroidPriority$lambda$0(final int i2, ThreadFactory threadFactory, final Runnable runnable) {
        int iAndroidToJavaPriority = INSTANCE.androidToJavaPriority(i2);
        Thread threadNewThread = threadFactory.newThread(new Runnable() { // from class: androidx.camera.camera2.pipe.core.AndroidThreads$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                AndroidThreads.withAndroidPriority$lambda$0$0(i2, runnable);
            }
        });
        x.e(threadNewThread, "newThread(...)");
        threadNewThread.setPriority(iAndroidToJavaPriority);
        return threadNewThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void withAndroidPriority$lambda$0$0(int i2, Runnable runnable) throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(i2);
        runnable.run();
    }

    static final Thread withPrefix$lambda$0(ThreadFactory threadFactory, String str, b bVar, Runnable runnable) {
        Thread threadNewThread = threadFactory.newThread(runnable);
        x.e(threadNewThread, "newThread(...)");
        threadNewThread.setName(String.valueOf(str).concat(String.valueOf(o.w(String.valueOf(bVar.e()), 2, '0'))));
        return threadNewThread;
    }

    public final ExecutorService asCachedThreadPool(ThreadFactory threadFactory) {
        x.f(threadFactory, "<this>");
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(threadFactory);
        x.e(executorServiceNewCachedThreadPool, "newCachedThreadPool(...)");
        return executorServiceNewCachedThreadPool;
    }

    public final ExecutorService asFixedSizeThreadPool(ThreadFactory threadFactory, int i2) {
        x.f(threadFactory, "<this>");
        if (i2 > 0) {
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i2, threadFactory);
            x.e(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
            return executorServiceNewFixedThreadPool;
        }
        throw new IllegalArgumentException("Threads (" + i2 + ") must be > 0");
    }

    public final ScheduledExecutorService asScheduledThreadPool(ThreadFactory threadFactory, int i2) {
        x.f(threadFactory, "<this>");
        if (i2 > 0) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i2, threadFactory);
            x.e(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
            return scheduledExecutorServiceNewScheduledThreadPool;
        }
        throw new IllegalArgumentException("Threads (" + i2 + ") must be > 0");
    }

    public final ThreadFactory getFactory() {
        return factory;
    }

    public final ThreadFactory withAndroidPriority(final ThreadFactory threadFactory, final int i2) {
        x.f(threadFactory, "<this>");
        return new ThreadFactory() { // from class: androidx.camera.camera2.pipe.core.AndroidThreads$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AndroidThreads.withAndroidPriority$lambda$0(i2, threadFactory, runnable);
            }
        };
    }

    public final ThreadFactory withPrefix(final ThreadFactory threadFactory, final String str) {
        x.f(threadFactory, "<this>");
        x.f(str, "namePrefix");
        final b bVarF = h.e.b.f(0);
        return new ThreadFactory() { // from class: androidx.camera.camera2.pipe.core.AndroidThreads$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AndroidThreads.withPrefix$lambda$0(threadFactory, str, bVarF, runnable);
            }
        };
    }
}
