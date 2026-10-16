package androidx.camera.core.impl.utils;

import android.util.Range;
import h.g.b.x;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RangeUtil {
    public static final RangeUtil INSTANCE = new RangeUtil();

    private RangeUtil() {
    }

    public static final Set<Range<Integer>> filterFixedRanges(Set<Range<Integer>> set) {
        x.f(set, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            Range range = (Range) obj;
            if (x.n(range.getUpper(), range.getLower())) {
                arrayList.add(obj);
            }
        }
        return new LinkedHashSet(arrayList);
    }
}
