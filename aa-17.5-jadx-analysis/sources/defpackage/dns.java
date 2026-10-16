package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* loaded from: classes2.dex */
final class dns extends dnr {
    @Override // defpackage.vy
    public final void j(View view, Rect rect) {
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
