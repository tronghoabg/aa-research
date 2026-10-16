package androidx.compose.foundation.lazy.staggeredgrid;

import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$9$1 implements l<Integer, StaggeredGridItemSpan> {
    final /* synthetic */ Object[] $items;
    final /* synthetic */ l $span;

    public LazyStaggeredGridDslKt$items$9$1(l lVar, Object[] objArr) {
        this.$span = lVar;
        this.$items = objArr;
    }

    public final StaggeredGridItemSpan invoke(int i2) {
        return (StaggeredGridItemSpan) this.$span.invoke(this.$items[i2]);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ StaggeredGridItemSpan invoke(Integer num) {
        return invoke(num.intValue());
    }
}
