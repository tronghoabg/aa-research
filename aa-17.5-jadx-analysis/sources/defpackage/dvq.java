package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* loaded from: classes2.dex */
public final class dvq extends dvr {
    @Override // defpackage.dvr
    public final void a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        b();
        outline.setRoundRect(this.e, this.d);
    }
}
