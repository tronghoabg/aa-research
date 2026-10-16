package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.window.layout.util.DensityCompatHelper;
import androidx.window.layout.util.WindowMetricsCompatHelper;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {
    private final DensityCompatHelper densityCompatHelper;
    private final ArrayList<Integer> insetsTypeMasks;

    public WindowMetricsCalculatorCompat(DensityCompatHelper densityCompatHelper) {
        x.f(densityCompatHelper, "densityCompatHelper");
        this.densityCompatHelper = densityCompatHelper;
        this.insetsTypeMasks = i.f(1, 2, 4, 8, 16, 32, 64, 128);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeCurrentWindowMetrics(Activity activity) {
        x.f(activity, "activity");
        return WindowMetricsCompatHelper.Companion.getInstance().currentWindowMetrics(activity, this.densityCompatHelper);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public /* synthetic */ WindowMetrics computeCurrentWindowMetricsOrNull(Context context) {
        return WindowMetricsCalculator.CC.$default$computeCurrentWindowMetricsOrNull(this, context);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeMaximumWindowMetrics(Activity activity) {
        x.f(activity, "activity");
        return WindowMetricsCompatHelper.Companion.getInstance().maximumWindowMetrics(activity, this.densityCompatHelper);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public /* synthetic */ WindowMetrics computeMaximumWindowMetricsOrNull(Context context) {
        return WindowMetricsCalculator.CC.$default$computeMaximumWindowMetricsOrNull(this, context);
    }

    public final ArrayList<Integer> getInsetsTypeMasks$window() {
        return this.insetsTypeMasks;
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeCurrentWindowMetrics(Context context) {
        x.f(context, "context");
        return WindowMetricsCompatHelper.Companion.getInstance().currentWindowMetrics(context, this.densityCompatHelper);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeMaximumWindowMetrics(Context context) {
        x.f(context, "context");
        return WindowMetricsCompatHelper.Companion.getInstance().maximumWindowMetrics(context, this.densityCompatHelper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WindowMetricsCalculatorCompat() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ WindowMetricsCalculatorCompat(DensityCompatHelper densityCompatHelper, int i2, o oVar) {
        this((i2 & 1) != 0 ? DensityCompatHelper.Companion.getInstance() : densityCompatHelper);
    }
}
