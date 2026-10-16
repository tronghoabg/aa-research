package androidx.compose.runtime;

import h.c.e;
import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface MonotonicFrameClock extends h {
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.MonotonicFrameClock$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static i $default$getKey(MonotonicFrameClock monotonicFrameClock) {
            return MonotonicFrameClock.Key;
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        public static <R> R fold(MonotonicFrameClock monotonicFrameClock, R r, p<? super R, ? super h, ? extends R> pVar) {
            return (R) h.c.a.h.e(monotonicFrameClock, r, pVar);
        }

        public static <E extends h> E get(MonotonicFrameClock monotonicFrameClock, i<E> iVar) {
            return (E) h.c.a.h.f(monotonicFrameClock, iVar);
        }

        @Deprecated
        public static i<?> getKey(MonotonicFrameClock monotonicFrameClock) {
            return CC.$default$getKey(monotonicFrameClock);
        }

        public static j minusKey(MonotonicFrameClock monotonicFrameClock, i<?> iVar) {
            return h.c.a.h.g(monotonicFrameClock, iVar);
        }

        public static j plus(MonotonicFrameClock monotonicFrameClock, j jVar) {
            return h.c.a.h.h(monotonicFrameClock, jVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Key implements i<MonotonicFrameClock> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // h.c.h
    i<?> getKey();

    <R> Object withFrameNanos(l<? super Long, ? extends R> lVar, e<? super R> eVar);
}
