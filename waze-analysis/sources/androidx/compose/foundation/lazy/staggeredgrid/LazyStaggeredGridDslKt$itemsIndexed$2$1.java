package androidx.compose.foundation.lazy.staggeredgrid;

import h.g.a.l;
import h.g.a.p;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$2$1 implements l<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ p $key;

    public LazyStaggeredGridDslKt$itemsIndexed$2$1(p pVar, List list) {
        this.$key = pVar;
        this.$items = list;
    }

    public final Object invoke(int i2) {
        return this.$key.invoke(Integer.valueOf(i2), this.$items.get(i2));
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
