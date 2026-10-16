package androidx.compose.foundation.lazy;

import h.g.a.l;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1 implements l<Integer, Object> {
    final /* synthetic */ List $items;

    public LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(List list) {
        this.$items = list;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        invoke(num.intValue());
        return null;
    }

    public final Object invoke(int i2) {
        this.$items.get(i2);
        return null;
    }
}
