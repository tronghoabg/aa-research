package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.unit.IntOffset;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutModifierNodeCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateAlignmentAndPlaceChildAsNeeded(LookaheadCapablePlaceable lookaheadCapablePlaceable, AlignmentLine alignmentLine) {
        LookaheadCapablePlaceable child = lookaheadCapablePlaceable.getChild();
        if (child == null) {
            InlineClassHelperKt.throwIllegalStateException("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line");
        }
        if (lookaheadCapablePlaceable.getMeasureResult$ui().getAlignmentLines().containsKey(alignmentLine)) {
            Integer num = lookaheadCapablePlaceable.getMeasureResult$ui().getAlignmentLines().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int i2 = child.get(alignmentLine);
        if (i2 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean zIsShallowPlacing$ui = lookaheadCapablePlaceable.isShallowPlacing$ui();
        boolean zIsPlacingForAlignment$ui = lookaheadCapablePlaceable.isPlacingForAlignment$ui();
        child.setShallowPlacing$ui(true);
        lookaheadCapablePlaceable.setPlacingForAlignment$ui(true);
        lookaheadCapablePlaceable.replace$ui();
        child.setShallowPlacing$ui(zIsShallowPlacing$ui);
        lookaheadCapablePlaceable.setPlacingForAlignment$ui(zIsPlacingForAlignment$ui);
        return i2 + (alignmentLine instanceof HorizontalAlignmentLine ? IntOffset.m11297getYimpl(child.mo9995getPositionnOccac()) : IntOffset.m11296getXimpl(child.mo9995getPositionnOccac()));
    }
}
