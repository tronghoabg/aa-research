package androidx.compose.foundation.lazy.staggeredgrid;

import h.g.a.p;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends u implements p<Integer, Integer, int[]> {
    LazyStaggeredGridState$scrollPosition$1(Object obj) {
        super(2, obj, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ int[] invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }

    public final int[] invoke(int i2, int i3) {
        return ((LazyStaggeredGridState) this.receiver).fillNearestIndices(i2, i3);
    }
}
