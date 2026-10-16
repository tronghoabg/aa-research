package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import e.b.c;
import h.c.a.a;
import h.c.e;
import h.c.g;
import h.c.h;
import h.c.i;
import h.c.j;
import h.d.b;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final Choreographer choreographer;
    private final AndroidUiDispatcher dispatcher;

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.choreographer = choreographer;
        this.dispatcher = androidUiDispatcher;
    }

    @Override // h.c.j
    public /* bridge */ <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public /* bridge */ <E extends h> E get(i<E> iVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, iVar);
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
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
        AndroidUiDispatcher androidUiDispatcher = this.dispatcher;
        if (androidUiDispatcher == null) {
            h hVar = eVar.getContext().get(g.f48059a);
            androidUiDispatcher = hVar instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) hVar : null;
        }
        kotlinx.coroutines.l lVar2 = new kotlinx.coroutines.l(h.c.a.h.d(eVar), 1);
        lVar2.u();
        final kotlinx.coroutines.l lVar3 = lVar2;
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                Object objA;
                try {
                    objA = lVar.invoke(Long.valueOf(j2));
                } catch (Throwable th) {
                    objA = c.a(th);
                }
                lVar3.resumeWith(objA);
            }
        };
        if (androidUiDispatcher == null || !x.n(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(frameCallback);
            lVar3.c(new AndroidUiFrameClock$withFrameNanos$2$2(this, frameCallback));
        } else {
            androidUiDispatcher.postFrameCallback$ui(frameCallback);
            lVar3.c(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, frameCallback));
        }
        Object objJ = lVar2.j();
        if (objJ == a.f48038a) {
            b.c(eVar);
        }
        return objJ;
    }

    public AndroidUiFrameClock(Choreographer choreographer) {
        this(choreographer, null);
    }
}
