package androidx.compose.material3.carousel;

import androidx.compose.foundation.gestures.snapping.SnapPosition;
import h.a.i;
import h.h.a;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class KeylineSnapPositionKt {
    public static final SnapPosition KeylineSnapPosition(final CarouselPageSize carouselPageSize) {
        return new SnapPosition() { // from class: androidx.compose.material3.carousel.KeylineSnapPositionKt.KeylineSnapPosition.1
            @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
            public int position(int i2, int i3, int i4, int i5, int i6, int i7) {
                return KeylineSnapPositionKt.getSnapPositionOffset(carouselPageSize.getStrategy(), i6, i7);
            }
        };
    }

    public static final int getSnapPositionOffset(Strategy strategy, int i2, int i3) {
        if (!strategy.isValid()) {
            return 0;
        }
        int iB = a.b(strategy.getDefaultKeylines().getFirstFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
        if (i2 <= i.e(strategy.getStartKeylineSteps())) {
            iB = a.b(strategy.getStartKeylineSteps().get(n.j(i.e(strategy.getStartKeylineSteps()) - i2, 0, i.e(strategy.getStartKeylineSteps()))).getFirstFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
        }
        int i4 = i3 - 1;
        if (i2 < i4 - i.e(strategy.getEndKeylineSteps()) || i3 <= strategy.getDefaultKeylines().getFocalCount()) {
            return iB;
        }
        return a.b(strategy.getEndKeylineSteps().get(n.j(i.e(strategy.getEndKeylineSteps()) - (i4 - i2), 0, i.e(strategy.getEndKeylineSteps()))).getLastFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
    }
}
