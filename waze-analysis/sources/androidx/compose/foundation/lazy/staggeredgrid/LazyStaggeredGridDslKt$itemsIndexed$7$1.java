package androidx.compose.foundation.lazy.staggeredgrid;

import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$itemsIndexed$7$1 implements l<Integer, Object> {
    final /* synthetic */ Object[] $items;
    final /* synthetic */ p $key;

    public LazyStaggeredGridDslKt$itemsIndexed$7$1(p pVar, Object[] objArr) {
        this.$key = pVar;
        this.$items = objArr;
    }

    public final Object invoke(int i2) {
        return this.$key.invoke(Integer.valueOf(i2), this.$items[i2]);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
