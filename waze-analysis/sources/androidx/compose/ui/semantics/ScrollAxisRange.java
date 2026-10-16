package androidx.compose.ui.semantics;

import h.g.a.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScrollAxisRange {
    public static final int $stable = 0;
    private final a<Float> maxValue;
    private final boolean reverseScrolling;
    private final a<Float> value;

    public /* synthetic */ ScrollAxisRange(a aVar, a aVar2, boolean z, int i2, o oVar) {
        this(aVar, aVar2, z & ((i2 & 4) == 0));
    }

    public final a<Float> getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final a<Float> getValue() {
        return this.value;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.value.invoke().floatValue() + ", maxValue=" + this.maxValue.invoke().floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }

    public ScrollAxisRange(a<Float> aVar, a<Float> aVar2, boolean z) {
        this.value = aVar;
        this.maxValue = aVar2;
        this.reverseScrolling = z;
    }
}
