package androidx.camera.camera2.pipe.config;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.AndroidThreads;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import h.g.a.a;
import h.g.b.aq;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ThreadConfigModule {
    private final int backgroundThreadCount;
    private final int cameraThreadPriority;
    private final int defaultThreadPriority;
    private final int lightweightThreadCount;
    private final CameraPipe.ThreadConfig threadConfig;

    public ThreadConfigModule(CameraPipe.ThreadConfig threadConfig) {
        x.f(threadConfig, "threadConfig");
        this.threadConfig = threadConfig;
        this.lightweightThreadCount = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);
        this.backgroundThreadCount = 4;
        this.cameraThreadPriority = -3;
        this.defaultThreadPriority = -1;
    }

    static final void provideThreads$lambda$3(List list) throws InterruptedException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ExecutorService) it.next()).shutdownNow();
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((ExecutorService) it2.next()).awaitTermination(1L, TimeUnit.SECONDS);
        }
    }

    static final Handler provideThreads$lambda$4(ThreadConfigModule threadConfigModule, CameraPipeLifetime cameraPipeLifetime) {
        if (threadConfigModule.threadConfig.getDefaultCameraHandler() != null) {
            return threadConfigModule.threadConfig.getDefaultCameraHandler();
        }
        final HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", threadConfigModule.cameraThreadPriority);
        handlerThread.start();
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.THREAD, new Runnable() { // from class: androidx.camera.camera2.pipe.config.ThreadConfigModule$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ThreadConfigModule.provideThreads$lambda$4$1(handlerThread);
            }
        });
        return new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideThreads$lambda$4$1(HandlerThread handlerThread) {
        handlerThread.quit();
        handlerThread.join(1000L);
    }

    static final Executor provideThreads$lambda$5(ThreadConfigModule threadConfigModule, CameraPipeLifetime cameraPipeLifetime) {
        if (threadConfigModule.threadConfig.getDefaultCameraExecutor() != null) {
            return threadConfigModule.threadConfig.getDefaultCameraExecutor();
        }
        AndroidThreads androidThreads = AndroidThreads.INSTANCE;
        final ExecutorService executorServiceAsFixedSizeThreadPool = androidThreads.asFixedSizeThreadPool(androidThreads.withAndroidPriority(androidThreads.withPrefix(androidThreads.getFactory(), "CXCP-Camera-E"), threadConfigModule.cameraThreadPriority), 1);
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.THREAD, new Runnable() { // from class: androidx.camera.camera2.pipe.config.ThreadConfigModule$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                ThreadConfigModule.provideThreads$lambda$5$0(executorServiceAsFixedSizeThreadPool);
            }
        });
        return executorServiceAsFixedSizeThreadPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideThreads$lambda$5$0(ExecutorService executorService) throws InterruptedException {
        executorService.shutdownNow();
        executorService.awaitTermination(1L, TimeUnit.SECONDS);
    }

    static final void provideThreads$lambda$6(aq aqVar, aq aqVar2) {
        aj.h((af) aqVar.f48105a, null);
        aj.h((af) aqVar2.f48105a, null);
    }

    public final Threads provideThreads(final CameraPipeLifetime cameraPipeLifetime, @CameraPipeJob br brVar) {
        x.f(cameraPipeLifetime, "cameraPipeLifetime");
        x.f(brVar, "cameraPipeJob");
        final ArrayList arrayList = new ArrayList();
        ScheduledExecutorService defaultBlockingExecutor = this.threadConfig.getDefaultBlockingExecutor();
        if (defaultBlockingExecutor == null) {
            AndroidThreads androidThreads = AndroidThreads.INSTANCE;
            ScheduledExecutorService scheduledExecutorServiceAsScheduledThreadPool = androidThreads.asScheduledThreadPool(androidThreads.withAndroidPriority(androidThreads.withPrefix(androidThreads.getFactory(), "CXCP-IO-"), this.defaultThreadPriority), 8);
            arrayList.add(scheduledExecutorServiceAsScheduledThreadPool);
            defaultBlockingExecutor = scheduledExecutorServiceAsScheduledThreadPool;
        }
        Executor executor = defaultBlockingExecutor;
        CameraPipe.ThreadConfig threadConfig = this.threadConfig;
        ab abVarF = bo.f(executor);
        ScheduledExecutorService defaultBackgroundExecutor = threadConfig.getDefaultBackgroundExecutor();
        if (defaultBackgroundExecutor == null) {
            AndroidThreads androidThreads2 = AndroidThreads.INSTANCE;
            ScheduledExecutorService scheduledExecutorServiceAsScheduledThreadPool2 = androidThreads2.asScheduledThreadPool(androidThreads2.withAndroidPriority(androidThreads2.withPrefix(androidThreads2.getFactory(), "CXCP-BG-"), this.defaultThreadPriority), this.backgroundThreadCount);
            arrayList.add(scheduledExecutorServiceAsScheduledThreadPool2);
            defaultBackgroundExecutor = scheduledExecutorServiceAsScheduledThreadPool2;
        }
        Executor executor2 = defaultBackgroundExecutor;
        CameraPipe.ThreadConfig threadConfig2 = this.threadConfig;
        ab abVarF2 = bo.f(executor2);
        ScheduledExecutorService defaultLightweightExecutor = threadConfig2.getDefaultLightweightExecutor();
        if (defaultLightweightExecutor == null) {
            AndroidThreads androidThreads3 = AndroidThreads.INSTANCE;
            ScheduledExecutorService scheduledExecutorServiceAsScheduledThreadPool3 = androidThreads3.asScheduledThreadPool(androidThreads3.withAndroidPriority(androidThreads3.withPrefix(androidThreads3.getFactory(), "CXCP-"), this.cameraThreadPriority), this.lightweightThreadCount);
            arrayList.add(scheduledExecutorServiceAsScheduledThreadPool3);
            defaultLightweightExecutor = scheduledExecutorServiceAsScheduledThreadPool3;
        }
        Executor executor3 = defaultLightweightExecutor;
        ab abVarF3 = bo.f(executor3);
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.THREAD, new Runnable() { // from class: androidx.camera.camera2.pipe.config.ThreadConfigModule$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                ThreadConfigModule.provideThreads$lambda$3(arrayList);
            }
        });
        a<Handler> defaultCameraHandlerFn = this.threadConfig.getDefaultCameraHandlerFn();
        if (defaultCameraHandlerFn == null) {
            defaultCameraHandlerFn = new a() { // from class: androidx.camera.camera2.pipe.config.ThreadConfigModule$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return ThreadConfigModule.provideThreads$lambda$4(this.f$0, cameraPipeLifetime);
                }
            };
        }
        a<Handler> aVar = defaultCameraHandlerFn;
        a aVar2 = new a() { // from class: androidx.camera.camera2.pipe.config.ThreadConfigModule$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return ThreadConfigModule.provideThreads$lambda$5(this.f$0, cameraPipeLifetime);
            }
        };
        final aq aqVar = new aq();
        final aq aqVar2 = new aq();
        if (this.threadConfig.getTestOnlyScope() != null) {
            aqVar.f48105a = this.threadConfig.getTestOnlyScope();
            aqVar2.f48105a = this.threadConfig.getTestOnlyScope();
        } else {
            aqVar.f48105a = aj.e(aj.P(brVar).plus(abVarF3).plus(new ae(Log.TAG)));
            aqVar2.f48105a = aj.e(aj.P(brVar).plus(new ae("CXCP-Dispatch")));
            cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.SCOPE, new Runnable() { // from class: androidx.camera.camera2.pipe.config.ThreadConfigModule$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    ThreadConfigModule.provideThreads$lambda$6(aqVar, aqVar2);
                }
            });
        }
        return new Threads((af) aqVar.f48105a, (af) aqVar2.f48105a, executor, abVarF, executor2, abVarF2, executor3, abVarF3, aVar, aVar2);
    }
}
