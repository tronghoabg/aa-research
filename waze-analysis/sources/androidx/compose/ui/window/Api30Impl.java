package androidx.compose.ui.window;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class Api30Impl {
    public static final Api30Impl INSTANCE = new Api30Impl();

    private Api30Impl() {
    }

    public final int getMaxDialogHeightExcludingSystemBarInsets(Window window) {
        WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }

    public final void setFitInsetsSides(WindowManager.LayoutParams layoutParams, int i2) {
        layoutParams.setFitInsetsSides(i2);
    }

    public final void setFitInsetsTypes(WindowManager.LayoutParams layoutParams, int i2) {
        layoutParams.setFitInsetsTypes(i2);
    }
}
