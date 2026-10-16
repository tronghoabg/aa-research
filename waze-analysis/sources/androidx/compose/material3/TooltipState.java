package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import h.ab;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface TooltipState {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.TooltipState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Object show$default(TooltipState tooltipState, MutatePriority mutatePriority, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
            }
            if ((i2 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return tooltipState.show(mutatePriority, eVar);
        }
    }

    void dismiss();

    MutableTransitionState<Boolean> getTransition();

    boolean isPersistent();

    boolean isVisible();

    void onDispose();

    Object show(MutatePriority mutatePriority, e<? super ab> eVar);
}
