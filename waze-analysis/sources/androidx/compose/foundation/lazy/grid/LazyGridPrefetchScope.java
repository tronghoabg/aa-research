package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import h.ab;
import h.g.a.l;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LazyGridPrefetchScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    List<LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(int i2);

    List<LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(int i2, l<? super LazyGridPrefetchResultScope, ab> lVar);
}
