package androidx.window.layout.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import androidx.window.core.Bounds;
import androidx.window.layout.WindowMetrics;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowMetricsCompatHelperBaseImpl implements WindowMetricsCompatHelper {
    public static final WindowMetricsCompatHelperBaseImpl INSTANCE = new WindowMetricsCompatHelperBaseImpl();

    private WindowMetricsCompatHelperBaseImpl() {
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics currentWindowMetrics(Context context, DensityCompatHelper densityCompatHelper) {
        x.f(context, "context");
        x.f(densityCompatHelper, "densityCompatHelper");
        Context contextUnwrapContext$window = ContextCompatHelper.INSTANCE.unwrapContext$window(context);
        if (contextUnwrapContext$window instanceof Activity) {
            return currentWindowMetrics((Activity) contextUnwrapContext$window, densityCompatHelper);
        }
        if (!(contextUnwrapContext$window instanceof InputMethodService) && !(contextUnwrapContext$window instanceof Application)) {
            throw new IllegalArgumentException("Must provide a UiContext or Application Context");
        }
        Object systemService = context.getSystemService("window");
        x.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayHelper displayHelper = DisplayHelper.INSTANCE;
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        x.e(defaultDisplay, "getDefaultDisplay(...)");
        Point realSizeForDisplay = displayHelper.getRealSizeForDisplay(defaultDisplay);
        return new WindowMetrics(new Rect(0, 0, realSizeForDisplay.x, realSizeForDisplay.y), densityCompatHelper.density(context));
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics maximumWindowMetrics(Context context, DensityCompatHelper densityCompatHelper) {
        x.f(context, "context");
        x.f(densityCompatHelper, "densityCompatHelper");
        return new WindowMetrics(new Bounds(BoundsHelper.Companion.getInstance().maximumWindowBounds(context)), densityCompatHelper.density(context));
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics translateWindowMetrics(android.view.WindowMetrics windowMetrics, float f2) {
        x.f(windowMetrics, "windowMetrics");
        throw new UnsupportedOperationException("translateWindowMetrics not available before API30");
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics currentWindowMetrics(Activity activity, DensityCompatHelper densityCompatHelper) {
        x.f(activity, "activity");
        x.f(densityCompatHelper, "densityCompatHelper");
        return new WindowMetrics(new Bounds(BoundsHelper.Companion.getInstance().currentWindowBounds(activity)), densityCompatHelper.density(activity));
    }
}
