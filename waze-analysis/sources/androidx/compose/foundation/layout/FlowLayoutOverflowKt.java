package androidx.compose.foundation.layout;

import h.f;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FlowLayoutOverflowKt {
    public static final f<Integer> lazyInt(String str, h.g.a.a<Integer> aVar) {
        return new LazyImpl(aVar, str);
    }

    public static /* synthetic */ f lazyInt$default(String str, h.g.a.a aVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            str = "Lazy item is not yet initialized";
        }
        return lazyInt(str, aVar);
    }
}
