package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LazyListPrefetchScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.LazyListPrefetchScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LazyLayoutPrefetchState.PrefetchHandle schedulePrefetch$default(LazyListPrefetchScope lazyListPrefetchScope, int i2, l lVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: schedulePrefetch");
            }
            if ((i3 & 2) != 0) {
                lVar = null;
            }
            return lazyListPrefetchScope.schedulePrefetch(i2, lVar);
        }
    }

    LazyLayoutPrefetchState.PrefetchHandle schedulePrefetch(int i2, l<? super LazyListPrefetchResultScope, ab> lVar);
}
