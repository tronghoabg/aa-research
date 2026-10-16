package androidx.compose.runtime;

import h.c.e;
import h.c.j;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MonotonicFrameClockKt {
    public static final MonotonicFrameClock getMonotonicFrameClock(j jVar) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) jVar.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final <R> Object withFrameMillis(l<? super Long, ? extends R> lVar, e<? super R> eVar) {
        return getMonotonicFrameClock(eVar.getContext()).withFrameNanos(new AnonymousClass2(lVar), eVar);
    }

    public static final <R> Object withFrameNanos(l<? super Long, ? extends R> lVar, e<? super R> eVar) {
        return getMonotonicFrameClock(eVar.getContext()).withFrameNanos(lVar, eVar);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2, reason: invalid class name */
    public final class AnonymousClass2 implements l {
        final /* synthetic */ l $onFrame;

        public AnonymousClass2(l lVar) {
            this.$onFrame = lVar;
        }

        public final Object invoke(long j2) {
            return this.$onFrame.invoke(Long.valueOf(j2 / 1000000));
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }
    }

    public static final <R> Object withFrameMillis(MonotonicFrameClock monotonicFrameClock, l<? super Long, ? extends R> lVar, e<? super R> eVar) {
        return monotonicFrameClock.withFrameNanos(new AnonymousClass2(lVar), eVar);
    }

    public static /* synthetic */ void getMonotonicFrameClock$annotations(j jVar) {
    }
}
