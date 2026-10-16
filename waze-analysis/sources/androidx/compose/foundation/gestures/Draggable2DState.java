package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import h.ab;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Draggable2DState {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.Draggable2DState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Object drag$default(Draggable2DState draggable2DState, MutatePriority mutatePriority, p pVar, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
            }
            if ((i2 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return draggable2DState.drag(mutatePriority, pVar, eVar);
        }
    }

    /* renamed from: dispatchRawDelta-k-4lQ0M */
    void mo2165dispatchRawDeltak4lQ0M(long j2);

    Object drag(MutatePriority mutatePriority, p<? super Drag2DScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar);
}
