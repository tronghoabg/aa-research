package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import h.ab;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DraggableState {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DraggableState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Object drag$default(DraggableState draggableState, MutatePriority mutatePriority, p pVar, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
            }
            if ((i2 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return draggableState.drag(mutatePriority, pVar, eVar);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
    }

    void dispatchRawDelta(float f2);

    Object drag(MutatePriority mutatePriority, p<? super DragScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar);
}
