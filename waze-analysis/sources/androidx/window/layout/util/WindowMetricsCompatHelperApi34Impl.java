package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import androidx.window.layout.WindowMetrics;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowMetricsCompatHelperApi34Impl implements WindowMetricsCompatHelper {
    public static final WindowMetricsCompatHelperApi34Impl INSTANCE = new WindowMetricsCompatHelperApi34Impl();

    private WindowMetricsCompatHelperApi34Impl() {
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics currentWindowMetrics(Context context, DensityCompatHelper densityCompatHelper) {
        x.f(context, "context");
        x.f(densityCompatHelper, "densityCompatHelper");
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        x.e(bounds, "getBounds(...)");
        return new WindowMetrics(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics maximumWindowMetrics(Context context, DensityCompatHelper densityCompatHelper) {
        x.f(context, "context");
        x.f(densityCompatHelper, "densityCompatHelper");
        return WindowMetricsCompatHelperApi30Impl.INSTANCE.maximumWindowMetrics(context, densityCompatHelper);
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics translateWindowMetrics(android.view.WindowMetrics windowMetrics, float f2) {
        x.f(windowMetrics, "windowMetrics");
        Rect bounds = windowMetrics.getBounds();
        x.e(bounds, "getBounds(...)");
        return new WindowMetrics(bounds, windowMetrics.getDensity());
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics currentWindowMetrics(Activity activity, DensityCompatHelper densityCompatHelper) {
        x.f(activity, "activity");
        x.f(densityCompatHelper, "densityCompatHelper");
        return WindowMetricsCompatHelperApi30Impl.INSTANCE.currentWindowMetrics(activity, densityCompatHelper);
    }
}
