package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes2.dex */
class dnr extends vy {
    @Override // defpackage.vy
    public final void k(View view, int i, int i2) {
        view.setSystemGestureExclusionRects(woy.bk(new Rect(0, 0, i, i2)));
    }
}
