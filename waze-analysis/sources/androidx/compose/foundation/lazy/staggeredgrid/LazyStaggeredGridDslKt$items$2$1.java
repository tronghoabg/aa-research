package androidx.compose.foundation.lazy.staggeredgrid;

import h.g.a.l;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$2$1 implements l<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ l $key;

    public LazyStaggeredGridDslKt$items$2$1(l lVar, List list) {
        this.$key = lVar;
        this.$items = list;
    }

    public final Object invoke(int i2) {
        return this.$key.invoke(this.$items.get(i2));
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
