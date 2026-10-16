package androidx.compose.foundation.pager;

import androidx.collection.SieveCacheKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PagerLayoutInfoKt {
    public static final int calculateContentSize(PagerLayoutInfo pagerLayoutInfo, int i2) {
        int beforeContentPadding = pagerLayoutInfo.getBeforeContentPadding() + pagerLayoutInfo.getAfterContentPadding();
        if (i2 == 0) {
            return beforeContentPadding;
        }
        long j2 = i2;
        long pageSize = (pagerLayoutInfo.getPageSize() * j2) + (((-1) + j2) * pagerLayoutInfo.getPageSpacing()) + beforeContentPadding;
        if (pageSize > SieveCacheKt.NodeLinkMask) {
            pageSize = 2147483647L;
        }
        return (int) pageSize;
    }

    public static final int getMainAxisViewportSize(PagerLayoutInfo pagerLayoutInfo) {
        return (int) (pagerLayoutInfo.getOrientation() == Orientation.Vertical ? pagerLayoutInfo.mo3036getViewportSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE : pagerLayoutInfo.mo3036getViewportSizeYbymL2g() >> 32);
    }
}
