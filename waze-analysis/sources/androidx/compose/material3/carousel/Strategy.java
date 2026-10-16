package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import h.h.a;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Strategy {
    private final float afterContentPadding;
    private final float availableSpace;
    private final float beforeContentPadding;
    private final KeylineList defaultKeylines;
    private final List<KeylineList> endKeylineSteps;
    private final float endShiftDistance;
    private final FloatList endShiftPoints;
    private final boolean isValid;
    private final float itemSpacing;
    private List<KeylineList> lastStartAndEndKeylineListSteps;
    private final List<KeylineList> startKeylineSteps;
    private final float startShiftDistance;
    private final FloatList startShiftPoints;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Strategy Empty = new Strategy(KeylineListKt.emptyKeylineList(), i.h(), i.h(), 0.0f, 0.0f, 0.0f, 0.0f);

    private Strategy(KeylineList keylineList, List<KeylineList> list, List<KeylineList> list2, float f2, float f3, float f4, float f5) {
        this.defaultKeylines = keylineList;
        this.startKeylineSteps = list;
        this.endKeylineSteps = list2;
        this.availableSpace = f2;
        this.itemSpacing = f3;
        this.beforeContentPadding = f4;
        this.afterContentPadding = f5;
        float startShiftDistance = StrategyKt.getStartShiftDistance(list, f4);
        this.startShiftDistance = startShiftDistance;
        float endShiftDistance = StrategyKt.getEndShiftDistance(list2, f5);
        this.endShiftDistance = endShiftDistance;
        this.startShiftPoints = StrategyKt.getStepInterpolationPoints(startShiftDistance, list, true);
        this.endShiftPoints = StrategyKt.getStepInterpolationPoints(endShiftDistance, list2, false);
        this.isValid = (keylineList.isEmpty() || f2 == 0.0f || getItemMainAxisSize() == 0.0f) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        boolean z = this.isValid;
        if (!z && !((Strategy) obj).isValid) {
            return true;
        }
        Strategy strategy = (Strategy) obj;
        return z == strategy.isValid && this.availableSpace == strategy.availableSpace && this.itemSpacing == strategy.itemSpacing && this.beforeContentPadding == strategy.beforeContentPadding && this.afterContentPadding == strategy.afterContentPadding && getItemMainAxisSize() == strategy.getItemMainAxisSize() && this.startShiftDistance == strategy.startShiftDistance && this.endShiftDistance == strategy.endShiftDistance && x.n(this.startShiftPoints, strategy.startShiftPoints) && x.n(this.endShiftPoints, strategy.endShiftPoints) && x.n(this.defaultKeylines, strategy.defaultKeylines);
    }

    public final float getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final float getAvailableSpace() {
        return this.availableSpace;
    }

    public final float getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final KeylineList getDefaultKeylines() {
        return this.defaultKeylines;
    }

    public final List<KeylineList> getEndKeylineSteps() {
        return this.endKeylineSteps;
    }

    public final float getItemMainAxisSize() {
        return this.defaultKeylines.getFirstFocal().getSize();
    }

    public final float getItemSpacing() {
        return this.itemSpacing;
    }

    public final KeylineList getKeylineListForScrollOffset$material3(float f2, float f3, boolean z) {
        float f4 = this.startShiftDistance;
        float fMax = Math.max(0.0f, f2);
        float fMax2 = Math.max(0.0f, f3 - this.endShiftDistance);
        if (f4 <= fMax && fMax <= fMax2) {
            return this.defaultKeylines;
        }
        float fLerp = StrategyKt.lerp(1.0f, 0.0f, 0.0f, f4, fMax);
        FloatList floatList = this.startShiftPoints;
        List<KeylineList> list = this.startKeylineSteps;
        if (fMax > fMax2) {
            fLerp = StrategyKt.lerp(0.0f, 1.0f, fMax2, f3, fMax);
            floatList = this.endShiftPoints;
            List<KeylineList> list2 = this.endKeylineSteps;
            if (fMax2 < 0.01f && list.size() == 2 && this.endKeylineSteps.size() == 2) {
                List<KeylineList> listI = this.lastStartAndEndKeylineListSteps;
                if (listI == null) {
                    listI = i.i((KeylineList) i.T(this.startKeylineSteps), (KeylineList) i.T(this.endKeylineSteps));
                    this.lastStartAndEndKeylineListSteps = listI;
                }
                list = listI;
                x.c(list);
            } else {
                list = list2;
            }
        }
        ShiftPointRange shiftPointRange = StrategyKt.getShiftPointRange(list.size(), floatList, fLerp);
        if (z) {
            return list.get(a.b(shiftPointRange.getSteppedInterpolation()) == 0 ? shiftPointRange.getFromStepIndex() : shiftPointRange.getToStepIndex());
        }
        return KeylineListKt.lerp(list.get(shiftPointRange.getFromStepIndex()), list.get(shiftPointRange.getToStepIndex()), shiftPointRange.getSteppedInterpolation());
    }

    public final List<KeylineList> getStartKeylineSteps() {
        return this.startKeylineSteps;
    }

    public int hashCode() {
        if (!this.isValid) {
            return Strategy$$ExternalSyntheticBackport0.m(false);
        }
        return (((((((((((((((((((Strategy$$ExternalSyntheticBackport0.m(true) * 31) + Float.floatToIntBits(this.availableSpace)) * 31) + Float.floatToIntBits(this.itemSpacing)) * 31) + Float.floatToIntBits(this.beforeContentPadding)) * 31) + Float.floatToIntBits(this.afterContentPadding)) * 31) + Float.floatToIntBits(getItemMainAxisSize())) * 31) + Float.floatToIntBits(this.startShiftDistance)) * 31) + Float.floatToIntBits(this.endShiftDistance)) * 31) + this.startShiftPoints.hashCode()) * 31) + this.endShiftPoints.hashCode()) * 31) + this.defaultKeylines.hashCode();
    }

    public final boolean isValid() {
        return this.isValid;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Strategy getEmpty() {
            return Strategy.Empty;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public Strategy(KeylineList keylineList, float f2, float f3, float f4, float f5) {
        this(keylineList, StrategyKt.getStartKeylineSteps(keylineList, f2, f3, f4), StrategyKt.getEndKeylineSteps(keylineList, f2, f3, f5), f2, f3, f4, f5);
    }
}
