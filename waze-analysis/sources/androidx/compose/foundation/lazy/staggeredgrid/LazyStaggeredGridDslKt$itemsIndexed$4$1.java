package androidx.compose.foundation.lazy.staggeredgrid;

import h.g.a.l;
import h.g.a.p;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$4$1 implements l<Integer, StaggeredGridItemSpan> {
    final /* synthetic */ List $items;
    final /* synthetic */ p $span;

    public LazyStaggeredGridDslKt$itemsIndexed$4$1(p pVar, List list) {
        this.$span = pVar;
        this.$items = list;
    }

    public final StaggeredGridItemSpan invoke(int i2) {
        return (StaggeredGridItemSpan) this.$span.invoke(Integer.valueOf(i2), this.$items.get(i2));
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ StaggeredGridItemSpan invoke(Integer num) {
        return invoke(num.intValue());
    }
}
