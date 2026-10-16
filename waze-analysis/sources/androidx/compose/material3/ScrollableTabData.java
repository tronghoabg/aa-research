package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.unit.Density;
import h.a.i;
import h.k.n;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ScrollableTabData {
    private final FiniteAnimationSpec<Float> animationSpec;
    private final af coroutineScope;
    private final ScrollState scrollState;
    private Integer selectedTab;

    public ScrollableTabData(ScrollState scrollState, af afVar, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.scrollState = scrollState;
        this.coroutineScope = afVar;
        this.animationSpec = finiteAnimationSpec;
    }

    private final int calculateTabOffset(TabPosition tabPosition, Density density, int i2, List<TabPosition> list) {
        int iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(((TabPosition) i.T(list)).m5709getRightD9Ej5fM()) + i2;
        int maxValue = iMo2121roundToPx0680j_4 - this.scrollState.getMaxValue();
        return n.j(density.mo2121roundToPx0680j_4(tabPosition.m5708getLeftD9Ej5fM()) - ((maxValue / 2) - (density.mo2121roundToPx0680j_4(tabPosition.m5710getWidthD9Ej5fM()) / 2)), 0, n.h(iMo2121roundToPx0680j_4 - maxValue, 0));
    }

    public final void onLaidOut(Density density, int i2, List<TabPosition> list, int i3) {
        int iCalculateTabOffset;
        Integer num = this.selectedTab;
        if (num != null && num.intValue() == i3) {
            return;
        }
        this.selectedTab = Integer.valueOf(i3);
        TabPosition tabPosition = (TabPosition) i.S(list, i3);
        if (tabPosition == null || this.scrollState.getValue() == (iCalculateTabOffset = calculateTabOffset(tabPosition, density, i2, list))) {
            return;
        }
        aj.z(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, iCalculateTabOffset, null), 3);
    }
}
