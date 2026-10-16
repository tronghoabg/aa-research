package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.media3.muxer.MuxerUtil;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyListLayoutInfoKt {
    public static final int calculateContentSize(LazyListLayoutInfo lazyListLayoutInfo) {
        int beforeContentPadding = lazyListLayoutInfo.getBeforeContentPadding() + lazyListLayoutInfo.getAfterContentPadding();
        return lazyListLayoutInfo.getTotalItemsCount() == 0 ? beforeContentPadding : ((visibleItemsAverageSize(lazyListLayoutInfo) - lazyListLayoutInfo.getMainAxisItemSpacing()) * lazyListLayoutInfo.getTotalItemsCount()) + ((lazyListLayoutInfo.getTotalItemsCount() - 1) * lazyListLayoutInfo.getMainAxisItemSpacing()) + beforeContentPadding;
    }

    public static final int getSingleAxisViewportSize(LazyListLayoutInfo lazyListLayoutInfo) {
        return (int) (lazyListLayoutInfo.getOrientation() == Orientation.Vertical ? lazyListLayoutInfo.mo2879getViewportSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE : lazyListLayoutInfo.mo2879getViewportSizeYbymL2g() >> 32);
    }

    public static final int visibleItemsAverageSize(LazyListLayoutInfo lazyListLayoutInfo) {
        List<LazyListItemInfo> visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int size = visibleItemsInfo.size();
        int size2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            size2 += visibleItemsInfo.get(i2).getSize();
        }
        return (size2 / visibleItemsInfo.size()) + lazyListLayoutInfo.getMainAxisItemSpacing();
    }
}
