package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class FallbackFrameClock implements MonotonicFrameClock {
    private static final long DefaultFrameDelay = 16;
    public static final FallbackFrameClock INSTANCE = new FallbackFrameClock();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.FallbackFrameClock$withFrameNanos$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e, Object> {
        final /* synthetic */ l $onFrame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(l lVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$onFrame = lVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$onFrame, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (aj.q(16L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return this.$onFrame.invoke(new Long(System.nanoTime()));
        }
    }

    private FallbackFrameClock() {
    }

    @Override // h.c.j
    public /* bridge */ <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public /* bridge */ <E extends h> E get(i<E> iVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, iVar);
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

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(l<? super Long, ? extends R> lVar, e<? super R> eVar) {
        int i2 = av.f51370a;
        return aj.v(ac.f51860a, new AnonymousClass2(lVar, null), eVar);
    }
}
