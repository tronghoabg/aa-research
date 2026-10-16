package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PageSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Density;
import h.g.a.p;
import h.h.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CarouselPageSize implements PageSize {
    public static final int $stable = 0;
    private final float afterContentPadding;
    private final float beforeContentPadding;
    private final p<Float, Float, KeylineList> keylineList;
    private final MutableState strategyState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Strategy.Companion.getEmpty(), null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public CarouselPageSize(p<? super Float, ? super Float, KeylineList> pVar, float f2, float f3) {
        this.keylineList = pVar;
        this.beforeContentPadding = f2;
        this.afterContentPadding = f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Strategy getStrategyState() {
        return (Strategy) this.strategyState$delegate.getValue();
    }

    private final void setStrategyState(Strategy strategy) {
        this.strategyState$delegate.setValue(strategy);
    }

    @Override // androidx.compose.foundation.pager.PageSize
    public int calculateMainAxisPageSize(Density density, int i2, int i3) {
        float f2 = i2;
        float f3 = i3;
        setStrategyState(new Strategy(this.keylineList.invoke(Float.valueOf(f2), Float.valueOf(f3)), f2, f3, this.beforeContentPadding, this.afterContentPadding));
        return getStrategy().isValid() ? a.b(getStrategy().getItemMainAxisSize()) : i2;
    }

    public final Strategy getStrategy() {
        return getStrategyState();
    }
}
