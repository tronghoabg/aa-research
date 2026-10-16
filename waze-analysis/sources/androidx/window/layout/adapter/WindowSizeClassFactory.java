package androidx.window.layout.adapter;

import androidx.window.core.layout.WindowSizeClass;
import androidx.window.core.layout.WindowSizeClassSelectors;
import androidx.window.layout.WindowMetrics;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowSizeClassFactory {
    public static final WindowSizeClass computeWindowSizeClass(Set<WindowSizeClass> set, WindowMetrics windowMetrics) {
        x.f(set, "<this>");
        x.f(windowMetrics, "windowMetrics");
        return WindowSizeClassSelectors.computeWindowSizeClass(set, windowMetrics.getWidthDp(), windowMetrics.getHeightDp());
    }
}
