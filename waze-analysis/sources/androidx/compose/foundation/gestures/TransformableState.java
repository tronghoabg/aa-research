package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import h.ab;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface TransformableState {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TransformableState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Object transform$default(TransformableState transformableState, MutatePriority mutatePriority, p pVar, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
            }
            if ((i2 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return transformableState.transform(mutatePriority, pVar, eVar);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
    }

    boolean isTransformInProgress();

    Object transform(MutatePriority mutatePriority, p<? super TransformScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar);
}
