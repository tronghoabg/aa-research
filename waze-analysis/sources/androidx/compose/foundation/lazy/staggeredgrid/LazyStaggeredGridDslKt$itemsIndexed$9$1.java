package androidx.compose.foundation.lazy.staggeredgrid;

import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$9$1 implements l<Integer, StaggeredGridItemSpan> {
    final /* synthetic */ Object[] $items;
    final /* synthetic */ p $span;

    public LazyStaggeredGridDslKt$itemsIndexed$9$1(p pVar, Object[] objArr) {
        this.$span = pVar;
        this.$items = objArr;
    }

    public final StaggeredGridItemSpan invoke(int i2) {
        return (StaggeredGridItemSpan) this.$span.invoke(Integer.valueOf(i2), this.$items[i2]);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ StaggeredGridItemSpan invoke(Integer num) {
        return invoke(num.intValue());
    }
}
