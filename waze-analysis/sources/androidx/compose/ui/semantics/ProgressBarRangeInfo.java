package androidx.compose.ui.semantics;

import h.g.b.o;
import h.g.b.x;
import h.k.e;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ProgressBarRangeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ProgressBarRangeInfo Indeterminate = new ProgressBarRangeInfo(0.0f, n.b(0.0f, 0.0f), 0, 4, null);
    private final float current;
    private final e<Float> range;
    private final int steps;

    public ProgressBarRangeInfo(float f2, e<Float> eVar, int i2) {
        this.current = f2;
        this.range = eVar;
        this.steps = i2;
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
        return this.current == progressBarRangeInfo.current && x.n(this.range, progressBarRangeInfo.range) && this.steps == progressBarRangeInfo.steps;
    }

    public final float getCurrent() {
        return this.current;
    }

    public final e<Float> getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.current) * 31) + this.range.hashCode()) * 31) + this.steps;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.current + ", range=" + this.range + ", steps=" + this.steps + ')';
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class Companion {
        private Companion() {
        }

        public final ProgressBarRangeInfo getIndeterminate() {
            return ProgressBarRangeInfo.Indeterminate;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ ProgressBarRangeInfo(float f2, e eVar, int i2, int i3, o oVar) {
        this(f2, eVar, (i3 & 4) != 0 ? 0 : i2);
    }
}
