package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import h.a.i;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
class PopupLayoutHelperImpl29 extends PopupLayoutHelperImpl {
    @Override // androidx.compose.ui.window.PopupLayoutHelperImpl, androidx.compose.ui.window.PopupLayoutHelper
    public void setGestureExclusionRects(View view, int i2, int i3) {
        view.setSystemGestureExclusionRects(i.l(new Rect(0, 0, i2, i3)));
    }
}
