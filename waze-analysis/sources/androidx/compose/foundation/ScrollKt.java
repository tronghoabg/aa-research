package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScrollKt {
    public static final Modifier horizontalScroll(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2) {
        return scroll$default(modifier, scrollState, z2, flingBehavior, z, false, true, null, 64, null);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, OverscrollEffect overscrollEffect, boolean z, FlingBehavior flingBehavior, boolean z2, int i2, Object obj) {
        boolean z3 = z | (!((i2 & 4) == 0));
        if ((i2 & 8) != 0) {
            flingBehavior = null;
        }
        return horizontalScroll(modifier, scrollState, overscrollEffect, z3, flingBehavior, z2 & ((i2 & 16) == 0));
    }

    public static final ScrollState rememberScrollState(final int i2, Composer composer, int i3, int i4) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464256199, i3, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:70)");
        }
        boolean z = true;
        if (1 == (i4 & 1)) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        Saver<ScrollState, ?> saver = ScrollState.Companion.getSaver();
        if ((((i3 & 14) ^ 6) <= 4 || !composer.changed(i2)) && (i3 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.foundation.ScrollKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return ScrollKt.rememberScrollState$lambda$0$0(i2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ScrollState scrollState = (ScrollState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saver, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return scrollState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrollState rememberScrollState$lambda$0$0(int i2) {
        return new ScrollState(i2);
    }

    private static final Modifier scroll(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2, boolean z3, boolean z4, OverscrollEffect overscrollEffect) {
        Orientation orientation = z3 ? Orientation.Vertical : Orientation.Horizontal;
        return (z4 ? ScrollableAreaKt.scrollableArea$default(modifier, scrollState, orientation, z2, z, flingBehavior, scrollState.getInternalInteractionSource$foundation(), null, 64, null) : ScrollableAreaKt.scrollableArea$default(modifier, scrollState, orientation, overscrollEffect, z2, z, flingBehavior, scrollState.getInternalInteractionSource$foundation(), null, 128, null)).then(new ScrollingLayoutElement(scrollState, z, z3));
    }

    static /* synthetic */ Modifier scroll$default(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2, boolean z3, boolean z4, OverscrollEffect overscrollEffect, int i2, Object obj) {
        return scroll(modifier, scrollState, z, flingBehavior, z2, z3, z4, (i2 & 64) != 0 ? null : overscrollEffect);
    }

    public static final Modifier verticalScroll(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2) {
        return scroll$default(modifier, scrollState, z2, flingBehavior, z, true, true, null, 64, null);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, OverscrollEffect overscrollEffect, boolean z, FlingBehavior flingBehavior, boolean z2, int i2, Object obj) {
        boolean z3 = z | (!((i2 & 4) == 0));
        if ((i2 & 8) != 0) {
            flingBehavior = null;
        }
        return verticalScroll(modifier, scrollState, overscrollEffect, z3, flingBehavior, z2 & ((i2 & 16) == 0));
    }

    public static final Modifier horizontalScroll(Modifier modifier, ScrollState scrollState, OverscrollEffect overscrollEffect, boolean z, FlingBehavior flingBehavior, boolean z2) {
        return scroll(modifier, scrollState, z2, flingBehavior, z, false, false, overscrollEffect);
    }

    public static final Modifier verticalScroll(Modifier modifier, ScrollState scrollState, OverscrollEffect overscrollEffect, boolean z, FlingBehavior flingBehavior, boolean z2) {
        return scroll(modifier, scrollState, z2, flingBehavior, z, true, false, overscrollEffect);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2, int i2, Object obj) {
        boolean z3 = z | (!((i2 & 2) == 0));
        if ((i2 & 4) != 0) {
            flingBehavior = null;
        }
        return horizontalScroll(modifier, scrollState, z3, flingBehavior, z2 & ((i2 & 8) == 0));
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2, int i2, Object obj) {
        boolean z3 = z | (!((i2 & 2) == 0));
        if ((i2 & 4) != 0) {
            flingBehavior = null;
        }
        return verticalScroll(modifier, scrollState, z3, flingBehavior, z2 & ((i2 & 8) == 0));
    }
}
