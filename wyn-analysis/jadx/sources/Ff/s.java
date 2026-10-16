package ff;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class s extends r {
    public static void c0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void d0(List list, Comparator comparator) {
        AbstractC3340k.e(list, "<this>");
        AbstractC3340k.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
