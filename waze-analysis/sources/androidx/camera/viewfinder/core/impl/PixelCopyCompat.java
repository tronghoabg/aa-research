package androidx.camera.viewfinder.core.impl;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.Surface;
import androidx.camera.viewfinder.core.impl.PixelCopyCompat;
import androidx.core.os.HandlerCompat;
import androidx.core.util.Consumer;
import androidx.tracing.Trace;
import h.ab;
import h.f;
import h.g;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.k;
import j$.util.function.Consumer$CC;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import kotlinx.a.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface PixelCopyCompat {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface CopyResultStatus {
    }

    /* compiled from: WazeSource */
    final class PixelCopyApi24Impl implements PixelCopyCompat {
        public static final long KEEP_ALIVE_MILLIS = 500;
        private static RefCounted<Handler> _backgroundHandler;
        public static final PixelCopyApi24Impl INSTANCE = new PixelCopyApi24Impl();
        private static final Object lock = new Object();

        private PixelCopyApi24Impl() {
        }

        static final ab requestImpl$lambda$0(Surface surface, final Bitmap bitmap, final Executor executor, final Consumer consumer, Handler handler, final a aVar) {
            x.f(handler, "handler");
            x.f(aVar, "onComplete");
            PixelCopy.request(surface, bitmap, new PixelCopy$OnPixelCopyFinishedListener() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyApi24Impl$$ExternalSyntheticLambda0
                public final void onPixelCopyFinished(int i2) {
                    PixelCopyCompat.PixelCopyApi24Impl.requestImpl$lambda$0$0(bitmap, executor, aVar, consumer, i2);
                }
            }, handler);
            return ab.f48028a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void requestImpl$lambda$0$0(Bitmap bitmap, Executor executor, a aVar, final Consumer consumer, final int i2) {
            Trace.endAsyncSection("PixelCopyApi24Impl.request", bitmap.hashCode());
            try {
                executor.execute(new Runnable() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyApi24Impl$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        PixelCopyCompat.PixelCopyApi24Impl.requestImpl$lambda$0$0$0(consumer, i2);
                    }
                });
            } finally {
                aVar.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void requestImpl$lambda$0$0$0(Consumer consumer, int i2) {
            consumer.accept(Integer.valueOf(i2));
        }

        private final void withHandlerScope(p<? super Handler, ? super a<ab>, ab> pVar) {
            k kVar;
            Handler handlerAcquire;
            synchronized (lock) {
                RefCounted<Handler> refCounted = _backgroundHandler;
                if (refCounted == null || (handlerAcquire = refCounted.acquire()) == null) {
                    final HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
                    handlerThread.start();
                    Handler handlerCreateAsync = HandlerCompat.createAsync(handlerThread.getLooper());
                    x.e(handlerCreateAsync, "createAsync(...)");
                    RefCounted<Handler> refCounted2 = new RefCounted<>(false, new l() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyApi24Impl$$ExternalSyntheticLambda2
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return PixelCopyCompat.PixelCopyApi24Impl.withHandlerScope$lambda$0$1$1(handlerThread, (Handler) obj);
                        }
                    });
                    refCounted2.initialize(handlerCreateAsync);
                    _backgroundHandler = refCounted2;
                    kVar = new k(handlerCreateAsync, refCounted2);
                } else {
                    kVar = new k(handlerAcquire, refCounted);
                }
            }
            Handler handler = (Handler) kVar.a();
            final RefCounted refCounted3 = (RefCounted) kVar.b();
            refCounted3.acquire();
            if (!handler.postDelayed(new Runnable() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyApi24Impl$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    refCounted3.release();
                }
            }, 500L)) {
                throw new AssertionError("Handler thread killed unexpectedly.");
            }
            pVar.invoke(handler, new PixelCopyCompat$PixelCopyApi24Impl$withHandlerScope$3(refCounted3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab withHandlerScope$lambda$0$1$1(HandlerThread handlerThread, Handler handler) {
            x.f(handler, "it");
            handlerThread.quit();
            return ab.f48028a;
        }

        @Override // androidx.camera.viewfinder.core.impl.PixelCopyCompat
        public void requestImpl(final Surface surface, final Bitmap bitmap, final Executor executor, final Consumer<Integer> consumer) {
            x.f(surface, "source");
            x.f(bitmap, "dest");
            x.f(executor, "executor");
            x.f(consumer, "listener");
            Trace.beginAsyncSection("PixelCopyApi24Impl.request", bitmap.hashCode());
            withHandlerScope(new p() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyApi24Impl$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return PixelCopyCompat.PixelCopyApi24Impl.requestImpl$lambda$0(surface, bitmap, executor, consumer, (Handler) obj, (a) obj2);
                }
            });
        }
    }

    /* compiled from: WazeSource */
    final class PixelCopyApi34Impl implements PixelCopyCompat {
        public static final PixelCopyApi34Impl INSTANCE = new PixelCopyApi34Impl();

        private PixelCopyApi34Impl() {
        }

        static final void requestImpl$lambda$0(Bitmap bitmap, Consumer consumer, PixelCopy.Result result) {
            Trace.endAsyncSection("PixelCopyApi34Impl.request", bitmap.hashCode());
            consumer.accept(Integer.valueOf(result.getStatus()));
        }

        @Override // androidx.camera.viewfinder.core.impl.PixelCopyCompat
        public void requestImpl(Surface surface, final Bitmap bitmap, Executor executor, final Consumer<Integer> consumer) {
            x.f(surface, "source");
            x.f(bitmap, "dest");
            x.f(executor, "executor");
            x.f(consumer, "listener");
            Trace.beginAsyncSection("PixelCopyApi34Impl.request", bitmap.hashCode());
            PixelCopy.Request requestBuild = PixelCopy.Request.Builder.ofSurface(surface).setDestinationBitmap(bitmap).build();
            x.e(requestBuild, "build(...)");
            PixelCopy.request(requestBuild, executor, new java.util.function.Consumer() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyApi34Impl$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void u(Object obj) {
                    PixelCopyCompat.PixelCopyApi34Impl.requestImpl$lambda$0(bitmap, consumer, (PixelCopy.Result) obj);
                }

                public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            });
        }
    }

    /* compiled from: WazeSource */
    final class PixelCopyStub implements PixelCopyCompat {
        public static final PixelCopyStub INSTANCE = new PixelCopyStub();

        private PixelCopyStub() {
        }

        @Override // androidx.camera.viewfinder.core.impl.PixelCopyCompat
        public void requestImpl(Surface surface, Bitmap bitmap, Executor executor, final Consumer<Integer> consumer) {
            x.f(surface, "source");
            x.f(bitmap, "dest");
            x.f(executor, "executor");
            x.f(consumer, "listener");
            executor.execute(new Runnable() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$PixelCopyStub$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    consumer.accept(1);
                }
            });
        }
    }

    void requestImpl(Surface surface, Bitmap bitmap, Executor executor, Consumer<Integer> consumer);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.viewfinder.core.impl.PixelCopyCompat$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            Companion companion = PixelCopyCompat.Companion;
        }

        public static void request(Surface surface, Bitmap bitmap, Executor executor, Consumer<Integer> consumer) {
            PixelCopyCompat.Companion.request(surface, bitmap, executor, consumer);
        }

        public static int requestSync(Surface surface, Bitmap bitmap) {
            return PixelCopyCompat.Companion.requestSync(surface, bitmap);
        }

        public static int requestSync(Surface surface, Bitmap bitmap, long j2) {
            return PixelCopyCompat.Companion.requestSync(surface, bitmap, j2);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final f<PixelCopyCompat> impl$delegate = g.a(new a() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$Companion$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return PixelCopyCompat.Companion.impl_delegate$lambda$0();
            }
        });

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PixelCopyCompat getImpl() {
            return impl$delegate.getValue();
        }

        static final PixelCopyCompat impl_delegate$lambda$0() {
            return Build.VERSION.SDK_INT >= 34 ? PixelCopyApi34Impl.INSTANCE : PixelCopyApi24Impl.INSTANCE;
        }

        public static /* synthetic */ int requestSync$default(Companion companion, Surface surface, Bitmap bitmap, long j2, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                j2 = -1;
            }
            return companion.requestSync(surface, bitmap, j2);
        }

        public final void request(Surface surface, Bitmap bitmap, Executor executor, Consumer<Integer> consumer) {
            x.f(surface, "source");
            x.f(bitmap, "dest");
            x.f(executor, "executor");
            x.f(consumer, "listener");
            getImpl().requestImpl(surface, bitmap, executor, consumer);
        }

        public final int requestSync(Surface surface, Bitmap bitmap, long j2) {
            x.f(surface, "source");
            x.f(bitmap, "dest");
            Trace.beginSection("PixelCopyCompat.requestSync");
            try {
                final b bVarF = h.e.b.f(2);
                final Semaphore semaphore = new Semaphore(0);
                $$INSTANCE.getImpl().requestImpl(surface, bitmap, new Executor() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$Companion$$ExternalSyntheticLambda1
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, new Consumer() { // from class: androidx.camera.viewfinder.core.impl.PixelCopyCompat$Companion$requestSync$1$2
                    @Override // androidx.core.util.Consumer
                    public final void accept(Integer num) {
                        x.c(num);
                        bVarF.f(num.intValue());
                        semaphore.release();
                    }
                });
                if (j2 >= 0) {
                    semaphore.tryAcquire(j2, TimeUnit.MILLISECONDS);
                } else {
                    semaphore.acquire();
                }
                return bVarF.d();
            } finally {
                Trace.endSection();
            }
        }

        public final int requestSync(Surface surface, Bitmap bitmap) {
            x.f(surface, "source");
            x.f(bitmap, "dest");
            return requestSync$default(this, surface, bitmap, 0L, 4, null);
        }
    }
}
