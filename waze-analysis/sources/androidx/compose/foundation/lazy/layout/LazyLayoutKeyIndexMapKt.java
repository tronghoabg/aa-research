package androidx.compose.foundation.lazy.layout;

import h.k.j;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutKeyIndexMapKt {
    public static final LazyLayoutKeyIndexMap LazyLayoutKeyIndexMap(j jVar, LazyLayoutIntervalContent<?> lazyLayoutIntervalContent) {
        return new NearestRangeKeyIndexMap(jVar, lazyLayoutIntervalContent);
    }
}
