package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import h.ab;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface BringIntoViewRequester {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequester$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Object bringIntoView$default(BringIntoViewRequester bringIntoViewRequester, Rect rect, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
            }
            if (1 == (i2 & 1)) {
                rect = null;
            }
            return bringIntoViewRequester.bringIntoView(rect, eVar);
        }
    }

    Object bringIntoView(Rect rect, e<? super ab> eVar);
}
