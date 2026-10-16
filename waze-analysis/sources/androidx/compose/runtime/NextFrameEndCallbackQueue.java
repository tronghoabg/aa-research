package androidx.compose.runtime;

import androidx.compose.runtime.NextFrameEndCallbackQueue;
import androidx.compose.runtime.internal.AtomicBoolean;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.AwaiterQueue;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class NextFrameEndCallbackQueue {
    public static final int $stable = 8;
    private final a<ab> onNewAwaiters;
    private final AtomicInt isFrameOngoing = AtomicBoolean.m7580constructorimpl(false);
    private final AwaiterQueue<NextFrameEndAwaiter> frameEndQueue = new AwaiterQueue<>();

    public NextFrameEndCallbackQueue(final a<ab> aVar) {
        this.onNewAwaiters = new a() { // from class: androidx.compose.runtime.NextFrameEndCallbackQueue$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return NextFrameEndCallbackQueue.onNewAwaiters$lambda$0(this.f$0, aVar);
            }
        };
    }

    public static /* synthetic */ void cancel$default(NextFrameEndCallbackQueue nextFrameEndCallbackQueue, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = new CancellationException("scheduler cancelled");
        }
        nextFrameEndCallbackQueue.cancel(cancellationException);
    }

    static final ab markFrameComplete$lambda$0(NextFrameEndAwaiter nextFrameEndAwaiter) {
        nextFrameEndAwaiter.resume();
        return ab.f48028a;
    }

    static final ab onNewAwaiters$lambda$0(NextFrameEndCallbackQueue nextFrameEndCallbackQueue, a aVar) {
        if (!AtomicBoolean.m7584getimpl(nextFrameEndCallbackQueue.isFrameOngoing)) {
            aVar.invoke();
        }
        return ab.f48028a;
    }

    public final void cancel(CancellationException cancellationException) {
        this.frameEndQueue.fail(cancellationException);
    }

    public final boolean getHasAwaiters() {
        return this.frameEndQueue.getHasAwaiters();
    }

    public final void markFrameComplete() {
        AtomicBoolean.m7587setimpl(this.isFrameOngoing, false);
        this.frameEndQueue.flushAndDispatchAwaiters(new l() { // from class: androidx.compose.runtime.NextFrameEndCallbackQueue$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return NextFrameEndCallbackQueue.markFrameComplete$lambda$0((NextFrameEndCallbackQueue.NextFrameEndAwaiter) obj);
            }
        });
    }

    public final void markFrameStarted() {
        AtomicBoolean.m7587setimpl(this.isFrameOngoing, true);
    }

    public final CancellationHandle scheduleFrameEndCallback(a<ab> aVar) {
        return this.frameEndQueue.addAwaiter(new NextFrameEndAwaiter(aVar), this.onNewAwaiters);
    }

    /* compiled from: WazeSource */
    final class NextFrameEndAwaiter extends AwaiterQueue.Awaiter {
        private a<ab> onNextFrameEnd;

        public NextFrameEndAwaiter(a<ab> aVar) {
            this.onNextFrameEnd = aVar;
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public void cancel() {
            this.onNextFrameEnd = null;
        }

        public final void resume() {
            a<ab> aVar = this.onNextFrameEnd;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public void resumeWithException(Throwable th) throws Throwable {
            throw th;
        }
    }
}
