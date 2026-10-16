package androidx.compose.foundation;

import h.ab;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface BasicTooltipState {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.BasicTooltipState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Object show$default(BasicTooltipState basicTooltipState, MutatePriority mutatePriority, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
            }
            if ((i2 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return basicTooltipState.show(mutatePriority, eVar);
        }
    }

    void dismiss();

    boolean isPersistent();

    boolean isVisible();

    void onDispose();

    Object show(MutatePriority mutatePriority, e<? super ab> eVar);
}
