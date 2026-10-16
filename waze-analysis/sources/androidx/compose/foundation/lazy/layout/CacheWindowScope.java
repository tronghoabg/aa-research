package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.unit.Density;
import h.ab;
import h.g.a.p;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface CacheWindowScope {
    Density getDensity();

    int getFirstVisibleLineIndex();

    boolean getHasVisibleItems();

    int getLastIndexInLine(int i2);

    int getLastLineIndex();

    int getLastVisibleLineIndex();

    int getMainAxisExtraSpaceEnd();

    int getMainAxisExtraSpaceStart();

    int getMainAxisViewportSize();

    int getTotalItemsCount();

    int getVisibleItemLine(int i2);

    int getVisibleItemSize(int i2);

    int getVisibleLineCount();

    Object getVisibleLineKey(int i2);

    List<LazyLayoutPrefetchState.PrefetchHandle> schedulePrefetch(int i2, p<? super Integer, ? super Integer, ab> pVar);
}
