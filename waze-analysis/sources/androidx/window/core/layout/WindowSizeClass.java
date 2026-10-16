package androidx.window.core.layout;

import h.a.i;
import h.g.b.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowSizeClass {
    public static final Set<WindowSizeClass> BREAKPOINTS_V1;
    public static final Set<WindowSizeClass> BREAKPOINTS_V2;
    public static final Companion Companion;
    private static final List<Integer> HEIGHT_DP_BREAKPOINTS_V1;
    private static final List<Integer> HEIGHT_DP_BREAKPOINTS_V2;
    public static final int HEIGHT_DP_EXPANDED_LOWER_BOUND = 900;
    public static final int HEIGHT_DP_MEDIUM_LOWER_BOUND = 480;
    private static final List<Integer> WIDTH_DP_BREAKPOINTS_V1;
    private static final List<Integer> WIDTH_DP_BREAKPOINTS_V2;
    public static final int WIDTH_DP_EXPANDED_LOWER_BOUND = 840;
    public static final int WIDTH_DP_EXTRA_LARGE_LOWER_BOUND = 1600;
    public static final int WIDTH_DP_LARGE_LOWER_BOUND = 1200;
    public static final int WIDTH_DP_MEDIUM_LOWER_BOUND = 600;
    private final int minHeightDp;
    private final int minWidthDp;

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        List<Integer> listI = i.i(0, 600, 840);
        WIDTH_DP_BREAKPOINTS_V1 = listI;
        List<Integer> listAf = i.af(listI, i.i(1200, 1600));
        WIDTH_DP_BREAKPOINTS_V2 = listAf;
        List<Integer> listI2 = i.i(0, 480, 900);
        HEIGHT_DP_BREAKPOINTS_V1 = listI2;
        HEIGHT_DP_BREAKPOINTS_V2 = listI2;
        BREAKPOINTS_V1 = companion.createBreakpointSet(listI, listI2);
        BREAKPOINTS_V2 = companion.createBreakpointSet(listAf, listI2);
    }

    public WindowSizeClass(int i2, int i3) {
        this.minWidthDp = i2;
        this.minHeightDp = i3;
        if (i2 < 0) {
            throw new IllegalArgumentException("Expected minWidthDp to be at least 0, minWidthDp: " + i2 + ".");
        }
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException("Expected minHeightDp to be at least 0, minHeightDp: " + i3 + ".");
    }

    public static final WindowSizeClass compute(float f2, float f3) {
        return Companion.compute(f2, f3);
    }

    public static /* synthetic */ void getWindowHeightSizeClass$annotations() {
    }

    public static /* synthetic */ void getWindowWidthSizeClass$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WindowSizeClass windowSizeClass = (WindowSizeClass) obj;
        return this.minWidthDp == windowSizeClass.minWidthDp && this.minHeightDp == windowSizeClass.minHeightDp;
    }

    public final int getMinHeightDp() {
        return this.minHeightDp;
    }

    public final int getMinWidthDp() {
        return this.minWidthDp;
    }

    public final WindowHeightSizeClass getWindowHeightSizeClass() {
        return WindowHeightSizeClass.Companion.compute$window_core(this.minHeightDp);
    }

    public final WindowWidthSizeClass getWindowWidthSizeClass() {
        return WindowWidthSizeClass.Companion.compute$window_core(this.minWidthDp);
    }

    public int hashCode() {
        return (this.minWidthDp * 31) + this.minHeightDp;
    }

    public final boolean isAtLeastBreakpoint(int i2, int i3) {
        return isWidthAtLeastBreakpoint(i2) && isHeightAtLeastBreakpoint(i3);
    }

    public final boolean isHeightAtLeastBreakpoint(int i2) {
        return this.minHeightDp >= i2;
    }

    public final boolean isWidthAtLeastBreakpoint(int i2) {
        return this.minWidthDp >= i2;
    }

    public String toString() {
        return "WindowSizeClass(minWidthDp=" + this.minWidthDp + ", minHeightDp=" + this.minHeightDp + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<WindowSizeClass> createBreakpointSet(List<Integer> list, List<Integer> list2) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                List<Integer> list3 = list2;
                ArrayList arrayList2 = new ArrayList(i.q(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new WindowSizeClass(iIntValue, ((Number) it2.next()).intValue()));
                }
                i.aD(arrayList, arrayList2);
            }
            return i.au(arrayList);
        }

        public final WindowSizeClass compute(float f2, float f3) {
            int i2 = 0;
            int i3 = f2 >= 840.0f ? 840 : f2 >= 600.0f ? 600 : 0;
            if (f3 >= 900.0f) {
                i2 = 900;
            } else if (f3 >= 480.0f) {
                i2 = 480;
            }
            return new WindowSizeClass(i3, i2);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public WindowSizeClass(float f2, float f3) {
        this((int) f2, (int) f3);
    }
}
