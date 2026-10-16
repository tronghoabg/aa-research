package androidx.compose.foundation.lazy.staggeredgrid;

import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt$items$7$1 implements l<Integer, Object> {
    final /* synthetic */ Object[] $items;
    final /* synthetic */ l $key;

    public LazyStaggeredGridDslKt$items$7$1(l lVar, Object[] objArr) {
        this.$key = lVar;
        this.$items = objArr;
    }

    public final Object invoke(int i2) {
        return this.$key.invoke(this.$items[i2]);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
