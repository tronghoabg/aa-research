package androidx.window.core.layout;

import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowSizeClassSelectors {
    public static final WindowSizeClass computeWindowSizeClass(Set<WindowSizeClass> set, int i2, int i3) {
        x.f(set, "<this>");
        Set<WindowSizeClass> set2 = set;
        int minWidthDp = 0;
        for (WindowSizeClass windowSizeClass : set2) {
            if (windowSizeClass.getMinWidthDp() <= i2 && windowSizeClass.getMinWidthDp() > minWidthDp) {
                minWidthDp = windowSizeClass.getMinWidthDp();
            }
        }
        WindowSizeClass windowSizeClass2 = new WindowSizeClass(0, 0);
        for (WindowSizeClass windowSizeClass3 : set2) {
            if (windowSizeClass3.getMinWidthDp() == minWidthDp && windowSizeClass3.getMinHeightDp() <= i3 && windowSizeClass2.getMinHeightDp() <= windowSizeClass3.getMinHeightDp()) {
                windowSizeClass2 = windowSizeClass3;
            }
        }
        return windowSizeClass2;
    }

    public static final WindowSizeClass computeWindowSizeClassPreferHeight(Set<WindowSizeClass> set, int i2, int i3) {
        x.f(set, "<this>");
        Set<WindowSizeClass> set2 = set;
        int minHeightDp = 0;
        for (WindowSizeClass windowSizeClass : set2) {
            if (windowSizeClass.getMinHeightDp() <= i3 && windowSizeClass.getMinHeightDp() > minHeightDp) {
                minHeightDp = windowSizeClass.getMinHeightDp();
            }
        }
        WindowSizeClass windowSizeClass2 = new WindowSizeClass(0, 0);
        for (WindowSizeClass windowSizeClass3 : set2) {
            if (windowSizeClass3.getMinHeightDp() == minHeightDp && windowSizeClass3.getMinWidthDp() <= i2 && windowSizeClass2.getMinWidthDp() <= windowSizeClass3.getMinWidthDp()) {
                windowSizeClass2 = windowSizeClass3;
            }
        }
        return windowSizeClass2;
    }

    public static final WindowSizeClass computeWindowSizeClass(Set<WindowSizeClass> set, float f2, float f3) {
        x.f(set, "<this>");
        return computeWindowSizeClass(set, (int) f2, (int) f3);
    }
}
