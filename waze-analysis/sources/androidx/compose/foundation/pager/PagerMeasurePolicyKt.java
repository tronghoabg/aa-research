package androidx.compose.foundation.pager;

import android.os.Trace;
import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import h.a.i;
import h.g.a.a;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PagerMeasurePolicyKt {
    private static final boolean DebugEnabled = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void keepAroundItems(LazyLayoutMeasureScope lazyLayoutMeasureScope, CacheWindowLogic cacheWindowLogic, List<? extends PageInfo> list) {
        Trace.beginSection("compose:pager:cache_window:keepAroundItems");
        try {
            if (cacheWindowLogic.hasValidBounds() && !list.isEmpty()) {
                int index = ((PageInfo) i.P(list)).getIndex();
                int index2 = ((PageInfo) i.T(list)).getIndex();
                for (int prefetchWindowStartLine$foundation = cacheWindowLogic.getPrefetchWindowStartLine$foundation(); prefetchWindowStartLine$foundation < index; prefetchWindowStartLine$foundation++) {
                    lazyLayoutMeasureScope.compose(prefetchWindowStartLine$foundation);
                }
                int i2 = index2 + 1;
                int prefetchWindowEndLine$foundation = cacheWindowLogic.getPrefetchWindowEndLine$foundation();
                if (i2 <= prefetchWindowEndLine$foundation) {
                    while (true) {
                        lazyLayoutMeasureScope.compose(i2);
                        if (i2 == prefetchWindowEndLine$foundation) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0136 A[PHI: r3
  0x0136: PHI (r3v20 int) = (r3v18 int), (r3v21 int) binds: [B:102:0x0134, B:98:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094 A[PHI: r4
  0x0094: PHI (r4v23 androidx.compose.ui.Alignment$Horizontal) = (r4v21 androidx.compose.ui.Alignment$Horizontal), (r4v24 androidx.compose.ui.Alignment$Horizontal) binds: [B:44:0x0092, B:40:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0 A[PHI: r9
  0x00b0: PHI (r9v13 androidx.compose.ui.Alignment$Vertical) = (r9v10 androidx.compose.ui.Alignment$Vertical), (r9v14 androidx.compose.ui.Alignment$Vertical) binds: [B:54:0x00ae, B:50:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc A[PHI: r12
  0x00cc: PHI (r12v11 float) = (r12v9 float), (r12v12 float) binds: [B:64:0x00ca, B:60:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e8 A[PHI: r13
  0x00e8: PHI (r13v11 androidx.compose.foundation.pager.PageSize) = (r13v9 androidx.compose.foundation.pager.PageSize), (r13v12 androidx.compose.foundation.pager.PageSize) binds: [B:74:0x00e6, B:70:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102 A[PHI: r14
  0x0102: PHI (r14v11 androidx.compose.foundation.gestures.snapping.SnapPosition) = 
  (r14v8 androidx.compose.foundation.gestures.snapping.SnapPosition)
  (r14v12 androidx.compose.foundation.gestures.snapping.SnapPosition)
 binds: [B:84:0x0100, B:80:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /* renamed from: rememberPagerMeasurePolicy-8u0NR3k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy m3039rememberPagerMeasurePolicy8u0NR3k(h.g.a.a<androidx.compose.foundation.pager.PagerLazyLayoutItemProvider> r21, androidx.compose.foundation.pager.PagerState r22, androidx.compose.foundation.layout.PaddingValues r23, boolean r24, androidx.compose.foundation.gestures.Orientation r25, int r26, float r27, androidx.compose.foundation.pager.PageSize r28, androidx.compose.ui.Alignment.Horizontal r29, androidx.compose.ui.Alignment.Vertical r30, androidx.compose.foundation.gestures.snapping.SnapPosition r31, kotlinx.coroutines.af r32, h.g.a.a<java.lang.Integer> r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerMeasurePolicyKt.m3039rememberPagerMeasurePolicy8u0NR3k(h.g.a.a, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.gestures.Orientation, int, float, androidx.compose.foundation.pager.PageSize, androidx.compose.ui.Alignment$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.snapping.SnapPosition, kotlinx.coroutines.af, h.g.a.a, androidx.compose.runtime.Composer, int, int):androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy");
    }

    private static final void debugLog(a<String> aVar) {
    }
}
