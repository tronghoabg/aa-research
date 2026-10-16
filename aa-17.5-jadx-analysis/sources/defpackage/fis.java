package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* loaded from: classes2.dex */
final class fis implements fip {
    public static final fis b = new fis();

    @Override // defpackage.fip
    public final Rect a(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
