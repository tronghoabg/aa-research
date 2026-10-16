package androidx.compose.runtime;

import h.ab;
import h.c.a.a;
import h.c.a.h;
import h.c.e;
import h.d.b;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ProduceFrameSignal {
    private Object pendingFrameContinuation;

    public final Object awaitFrameRequest(Object obj, e<? super ab> eVar) {
        synchronized (obj) {
            if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                this.pendingFrameContinuation = RecomposerKt.FramePending;
                return ab.f48028a;
            }
            l lVar = new l(h.d(eVar), 1);
            lVar.u();
            l lVar2 = lVar;
            synchronized (obj) {
                if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                    this.pendingFrameContinuation = RecomposerKt.FramePending;
                } else {
                    this.pendingFrameContinuation = lVar2;
                    lVar2 = null;
                }
            }
            if (lVar2 != null) {
                lVar2.resumeWith(ab.f48028a);
            }
            Object objJ = lVar.j();
            a aVar = a.f48038a;
            if (objJ == aVar) {
                b.c(eVar);
            }
            return objJ == aVar ? objJ : ab.f48028a;
        }
    }

    public final e<ab> requestFrameLocked() {
        Object obj = this.pendingFrameContinuation;
        if (obj instanceof e) {
            this.pendingFrameContinuation = RecomposerKt.FramePending;
            return (e) obj;
        }
        if (x.n(obj, RecomposerKt.ProduceAnotherFrame) || x.n(obj, RecomposerKt.FramePending)) {
            return null;
        }
        if (obj == null) {
            this.pendingFrameContinuation = RecomposerKt.ProduceAnotherFrame;
            return null;
        }
        Objects.toString(obj);
        throw new IllegalStateException("invalid pendingFrameContinuation ".concat(obj.toString()));
    }

    public final void takeFrameRequestLocked() {
        if (this.pendingFrameContinuation != RecomposerKt.FramePending) {
            PreconditionsKt.throwIllegalStateException("frame not pending");
        }
        this.pendingFrameContinuation = null;
    }
}
