package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollIndicatorState;
import h.ab;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ScrollableState {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollableState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$getCanScrollBackward(ScrollableState scrollableState) {
            return true;
        }

        public static boolean $default$getCanScrollForward(ScrollableState scrollableState) {
            return true;
        }

        public static boolean $default$getLastScrolledBackward(ScrollableState scrollableState) {
            return false;
        }

        public static boolean $default$getLastScrolledForward(ScrollableState scrollableState) {
            return false;
        }

        public static ScrollIndicatorState $default$getScrollIndicatorState(ScrollableState scrollableState) {
            return null;
        }

        public static /* synthetic */ boolean access$getCanScrollBackward$jd(ScrollableState scrollableState) {
            return true;
        }

        public static /* synthetic */ boolean access$getCanScrollForward$jd(ScrollableState scrollableState) {
            return true;
        }

        public static /* synthetic */ boolean access$getLastScrolledBackward$jd(ScrollableState scrollableState) {
            return false;
        }

        public static /* synthetic */ boolean access$getLastScrolledForward$jd(ScrollableState scrollableState) {
            return false;
        }

        public static /* synthetic */ ScrollIndicatorState access$getScrollIndicatorState$jd(ScrollableState scrollableState) {
            return null;
        }

        public static /* synthetic */ Object scroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, p pVar, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
            }
            if ((i2 & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return scrollableState.scroll(mutatePriority, pVar, eVar);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static boolean getCanScrollBackward(ScrollableState scrollableState) {
            return true;
        }

        @Deprecated
        public static boolean getCanScrollForward(ScrollableState scrollableState) {
            return true;
        }

        @Deprecated
        public static boolean getLastScrolledBackward(ScrollableState scrollableState) {
            return false;
        }

        @Deprecated
        public static boolean getLastScrolledForward(ScrollableState scrollableState) {
            return false;
        }

        @Deprecated
        public static ScrollIndicatorState getScrollIndicatorState(ScrollableState scrollableState) {
            return null;
        }
    }

    float dispatchRawDelta(float f2);

    boolean getCanScrollBackward();

    boolean getCanScrollForward();

    boolean getLastScrolledBackward();

    boolean getLastScrolledForward();

    ScrollIndicatorState getScrollIndicatorState();

    boolean isScrollInProgress();

    Object scroll(MutatePriority mutatePriority, p<? super ScrollScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar);
}
