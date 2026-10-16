package androidx.window.core.layout;

import e.c.d.a;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowSizeClassGridCreator {
    public static final Set<WindowSizeClass> addHeightDpBreakpoints(Set<WindowSizeClass> set, Set<Integer> set2) {
        x.f(set, "<this>");
        x.f(set2, "minHeightDpBreakPoints");
        Set<WindowSizeClass> set3 = set;
        ArrayList arrayList = new ArrayList(i.q(set3, 10));
        Iterator<T> it = set3.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((WindowSizeClass) it.next()).getMinWidthDp()));
        }
        return a.v(set, createGridWindowSizeClassSet(i.au(arrayList), set2));
    }

    public static final Set<WindowSizeClass> createGridWindowSizeClassSet(Set<Integer> set, Set<Integer> set2) {
        x.f(set, "minWidthDpBreakPoints");
        x.f(set2, "minHeightDpBreakPoints");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Set<Integer> set3 = set2;
            ArrayList arrayList2 = new ArrayList(i.q(set3, 10));
            Iterator<T> it2 = set3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new WindowSizeClass(iIntValue, ((Number) it2.next()).intValue()));
            }
            i.aD(arrayList, arrayList2);
        }
        return i.au(arrayList);
    }
}
