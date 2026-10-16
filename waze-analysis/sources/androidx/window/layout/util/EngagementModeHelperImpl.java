package androidx.window.layout.util;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculator;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EngagementModeHelperImpl implements EngagementModeHelper {
    public static final Companion Companion = new Companion(null);
    private static final int DIAGONAL_INCH_SQUARED_LARGE_LOWER_BOUND = 121;
    private final WindowMetricsCalculator windowMetricsCalculator;

    public /* synthetic */ EngagementModeHelperImpl(WindowMetricsCalculator windowMetricsCalculator, int i2, o oVar) {
        this((i2 & 1) != 0 ? WindowMetricsCalculator.Companion.getOrCreate() : windowMetricsCalculator);
    }

    public final DisplayMetrics getDisplayMetrics(Context context) {
        x.f(context, "uiContext");
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                Display display = context.getDisplay();
                if (display != null) {
                    display.getRealMetrics(displayMetrics);
                    return displayMetrics;
                }
            } catch (UnsupportedOperationException unused) {
            }
        }
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        x.e(displayMetrics2, "getDisplayMetrics(...)");
        return displayMetrics2;
    }

    @Override // androidx.window.layout.util.EngagementModeHelper
    public boolean hasLargeEnoughDisplay(Context context) {
        x.f(context, "uiContext");
        WindowMetrics windowMetricsComputeMaximumWindowMetrics = this.windowMetricsCalculator.computeMaximumWindowMetrics(context);
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        return Math.pow(((double) windowMetricsComputeMaximumWindowMetrics.getBounds().width()) / ((double) displayMetrics.xdpi), 2.0d) + Math.pow(((double) windowMetricsComputeMaximumWindowMetrics.getBounds().height()) / ((double) displayMetrics.ydpi), 2.0d) >= 121.0d;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public EngagementModeHelperImpl(WindowMetricsCalculator windowMetricsCalculator) {
        x.f(windowMetricsCalculator, "windowMetricsCalculator");
        this.windowMetricsCalculator = windowMetricsCalculator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EngagementModeHelperImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
