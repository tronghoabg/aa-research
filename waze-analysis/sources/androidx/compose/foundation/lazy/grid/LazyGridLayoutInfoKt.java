package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.media3.muxer.MuxerUtil;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridLayoutInfoKt {
    public static final int calculateContentSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        int beforeContentPadding = lazyGridLayoutInfo.getBeforeContentPadding() + lazyGridLayoutInfo.getAfterContentPadding();
        if (lazyGridLayoutInfo.getTotalItemsCount() == 0) {
            return beforeContentPadding;
        }
        int iCeil = (int) ((float) Math.ceil(lazyGridLayoutInfo.getTotalItemsCount() / lazyGridLayoutInfo.getMaxSpan()));
        return ((visibleLinesAverageMainAxisSize(lazyGridLayoutInfo) - lazyGridLayoutInfo.getMainAxisItemSpacing()) * iCeil) + ((iCeil - 1) * lazyGridLayoutInfo.getMainAxisItemSpacing()) + beforeContentPadding;
    }

    public static final int getSingleAxisViewportSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        return (int) (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridLayoutInfo.mo2913getViewportSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE : lazyGridLayoutInfo.mo2913getViewportSizeYbymL2g() >> 32);
    }

    public static final int visibleLinesAverageMainAxisSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        Orientation orientation = lazyGridLayoutInfo.getOrientation();
        Orientation orientation2 = Orientation.Vertical;
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < visibleItemsInfo.size()) {
            boolean z = orientation == orientation2;
            int iVisibleLinesAverageMainAxisSize$lineOf = visibleLinesAverageMainAxisSize$lineOf(z, lazyGridLayoutInfo, i2);
            if (iVisibleLinesAverageMainAxisSize$lineOf == -1) {
                i2++;
            } else {
                int iMax = 0;
                while (i2 < visibleItemsInfo.size() && visibleLinesAverageMainAxisSize$lineOf(z, lazyGridLayoutInfo, i2) == iVisibleLinesAverageMainAxisSize$lineOf) {
                    iMax = Math.max(iMax, (int) (z ? visibleItemsInfo.get(i2).mo2909getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE : visibleItemsInfo.get(i2).mo2909getSizeYbymL2g() >> 32));
                    i2++;
                }
                i3 += iMax;
                i4++;
            }
        }
        return (i3 / i4) + lazyGridLayoutInfo.getMainAxisItemSpacing();
    }

    private static final int visibleLinesAverageMainAxisSize$lineOf(boolean z, LazyGridLayoutInfo lazyGridLayoutInfo, int i2) {
        return z ? lazyGridLayoutInfo.getVisibleItemsInfo().get(i2).getRow() : lazyGridLayoutInfo.getVisibleItemsInfo().get(i2).getColumn();
    }
}
