package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.c.h;
import h.c.i;
import h.c.j;
import h.d.b;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultChoreographerFrameClock implements MonotonicFrameClock {
    public static final DefaultChoreographerFrameClock INSTANCE = new DefaultChoreographerFrameClock();
    private static final Choreographer choreographer;

    static {
        int i2 = av.f51370a;
        choreographer = (Choreographer) aj.u(ac.f51860a.c(), new DefaultChoreographerFrameClock$choreographer$1(null));
    }

    private DefaultChoreographerFrameClock() {
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
    public <R> Object withFrameNanos(final l<? super Long, ? extends R> lVar, e<? super R> eVar) {
        kotlinx.coroutines.l lVar2 = new kotlinx.coroutines.l(h.c.a.h.d(eVar), 1);
        lVar2.u();
        final kotlinx.coroutines.l lVar3 = lVar2;
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                Object objA;
                DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.INSTANCE;
                try {
                    objA = lVar.invoke(Long.valueOf(j2));
                } catch (Throwable th) {
                    objA = c.a(th);
                }
                lVar3.resumeWith(objA);
            }
        };
        choreographer.postFrameCallback(frameCallback);
        lVar3.c(new l<Throwable, ab>() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                DefaultChoreographerFrameClock.choreographer.removeFrameCallback(frameCallback);
            }

            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
                invoke2(th);
                return ab.f48028a;
            }
        });
        Object objJ = lVar2.j();
        if (objJ == a.f48038a) {
            b.c(eVar);
        }
        return objJ;
    }
}
