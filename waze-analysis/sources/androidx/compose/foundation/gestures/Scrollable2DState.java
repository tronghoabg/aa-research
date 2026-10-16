package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import h.ab;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Scrollable2DState {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.Scrollable2DState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Object scroll$default(Scrollable2DState scrollable2DState, MutatePriority mutatePriority, p pVar, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
            }
            if ((i2 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return scrollable2DState.scroll(mutatePriority, pVar, eVar);
        }
    }

    /* renamed from: canScroll-k-4lQ0M */
    boolean mo2167canScrollk4lQ0M(long j2);

    /* renamed from: dispatchRawDelta-MK-Hz9U */
    long mo2168dispatchRawDeltaMKHz9U(long j2);

    boolean isScrollInProgress();

    Object scroll(MutatePriority mutatePriority, p<? super Scroll2DScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar);
}
