package androidx.compose.foundation.lazy.staggeredgrid;

import h.g.a.l;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$4$1 implements l<Integer, StaggeredGridItemSpan> {
    final /* synthetic */ List $items;
    final /* synthetic */ l $span;

    public LazyStaggeredGridDslKt$items$4$1(l lVar, List list) {
        this.$span = lVar;
        this.$items = list;
    }

    public final StaggeredGridItemSpan invoke(int i2) {
        return (StaggeredGridItemSpan) this.$span.invoke(this.$items.get(i2));
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ StaggeredGridItemSpan invoke(Integer num) {
        return invoke(num.intValue());
    }
}
