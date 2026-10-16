package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScrollableAreaKt {
    public static final Modifier scrollableArea(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        return ClipScrollableContainerKt.clipScrollableContainer(modifier, orientation).then(new ScrollableAreaElement(scrollableState, orientation, z, z2, flingBehavior, mutableInteractionSource, bringIntoViewSpec, false, overscrollEffect));
    }

    public static /* synthetic */ Modifier scrollableArea$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, int i2, Object obj) {
        boolean z3 = z | (!((i2 & 8) == 0));
        boolean z4 = z2 & ((i2 & 16) == 0);
        if ((i2 & 32) != 0) {
            flingBehavior = null;
        }
        if ((i2 & 64) != 0) {
            mutableInteractionSource = null;
        }
        if ((i2 & 128) != 0) {
            bringIntoViewSpec = null;
        }
        return scrollableArea(modifier, scrollableState, orientation, overscrollEffect, z3, z4, flingBehavior, mutableInteractionSource, bringIntoViewSpec);
    }

    public static final Modifier scrollableArea(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        return ClipScrollableContainerKt.clipScrollableContainer(modifier, orientation).then(new ScrollableAreaElement(scrollableState, orientation, z, z2, flingBehavior, mutableInteractionSource, bringIntoViewSpec, true, null));
    }

    public static /* synthetic */ Modifier scrollableArea$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, int i2, Object obj) {
        boolean z3 = z | (!((i2 & 4) == 0));
        boolean z4 = z2 & ((i2 & 8) == 0);
        if ((i2 & 16) != 0) {
            flingBehavior = null;
        }
        if ((i2 & 32) != 0) {
            mutableInteractionSource = null;
        }
        if ((i2 & 64) != 0) {
            bringIntoViewSpec = null;
        }
        return scrollableArea(modifier, scrollableState, orientation, z3, z4, flingBehavior, mutableInteractionSource, bringIntoViewSpec);
    }
}
