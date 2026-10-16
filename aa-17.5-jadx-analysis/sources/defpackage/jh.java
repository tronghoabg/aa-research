package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* loaded from: classes2.dex */
final class jh extends PopupWindow {
    public jh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        lah lahVarC = lah.C(context, attributeSet, fs.t, i, 0);
        if (lahVarC.y(2)) {
            setOverlapAnchor(lahVarC.x(2, false));
        }
        setBackgroundDrawable(lahVarC.s(0));
        lahVarC.w();
    }
}
