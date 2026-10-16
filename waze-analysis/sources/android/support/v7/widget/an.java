package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import androidx.core.widget.PopupWindowCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class an extends PopupWindow {
    public an(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2, 0);
        gc gcVarN = gc.n(context, attributeSet, android.support.v7.a.a.s, i2, 0);
        if (gcVarN.s(2)) {
            PopupWindowCompat.setOverlapAnchor(this, gcVarN.r(2, false));
        }
        setBackgroundDrawable(gcVarN.j(0));
        gcVarN.q();
    }
}
