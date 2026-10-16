package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.AwaiterQueue;
import e.b.c;
import h.ab;
import h.c.e;
import h.c.h;
import h.c.i;
import h.c.j;
import h.d.b;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final a<ab> onNewAwaiters;
    private final AwaiterQueue<FrameAwaiter<?>> queue;

    /* compiled from: WazeSource */
    final class FrameAwaiter<R> extends AwaiterQueue.Awaiter {
        private k<? super R> continuation;
        private l<? super Long, ? extends R> onFrame;

        public FrameAwaiter(l<? super Long, ? extends R> lVar, k<? super R> kVar) {
            this.continuation = kVar;
            this.onFrame = lVar;
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public void cancel() {
            this.onFrame = null;
            this.continuation = null;
        }

        public final void resume(long j2) {
            k<? super R> kVar;
            Object objA;
            l<? super Long, ? extends R> lVar = this.onFrame;
            if (lVar == null || (kVar = this.continuation) == null) {
                return;
            }
            try {
                FrameAwaiter<R> frameAwaiter = this;
                objA = lVar.invoke(Long.valueOf(j2));
            } catch (Throwable th) {
                objA = c.a(th);
            }
            kVar.resumeWith(objA);
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public void resumeWithException(Throwable th) {
            k<? super R> kVar = this.continuation;
            if (kVar != null) {
                kVar.resumeWith(c.a(th));
            }
        }
    }

    public BroadcastFrameClock(a<ab> aVar) {
        this.onNewAwaiters = aVar;
        this.queue = new AwaiterQueue<>();
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    static final ab sendFrame$lambda$0(long j2, FrameAwaiter frameAwaiter) {
        frameAwaiter.resume(j2);
        return ab.f48028a;
    }

    public final void cancel(CancellationException cancellationException) {
        this.queue.fail(cancellationException);
    }

    @Override // h.c.j
    public /* bridge */ <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public /* bridge */ <E extends h> E get(i<E> iVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, iVar);
    }

    public final boolean getHasAwaiters() {
        return this.queue.getHasAwaiters();
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, h.c.h
    public /* synthetic */ i getKey() {
        return MonotonicFrameClock.CC.$default$getKey(this);
    }

    @Override // h.c.j
    public /* bridge */ j minusKey(i<?> iVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, iVar);
    }

    @Override // h.c.j
    public /* bridge */ j plus(j jVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, jVar);
    }

    public final void sendFrame(final long j2) {
        this.queue.flushAndDispatchAwaiters(new l() { // from class: androidx.compose.runtime.BroadcastFrameClock$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BroadcastFrameClock.sendFrame$lambda$0(j2, (BroadcastFrameClock.FrameAwaiter) obj);
            }
        });
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(l<? super Long, ? extends R> lVar, e<? super R> eVar) {
        kotlinx.coroutines.l lVar2 = new kotlinx.coroutines.l(h.c.a.h.d(eVar), 1);
        lVar2.u();
        kotlinx.coroutines.l lVar3 = lVar2;
        final CancellationHandle cancellationHandleAddAwaiter = this.queue.addAwaiter(new FrameAwaiter(lVar, lVar3), this.onNewAwaiters);
        lVar3.c(new l<Throwable, ab>() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
                invoke2(th);
                return ab.f48028a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationHandleAddAwaiter.cancel();
            }
        });
        Object objJ = lVar2.j();
        if (objJ == h.c.a.a.f48038a) {
            b.c(eVar);
        }
        return objJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BroadcastFrameClock(a aVar, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : aVar);
    }
}
