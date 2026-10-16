package ff;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ff.F, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2645F extends tg.b {
    public static LinkedHashSet Y(Set set, Serializable serializable) {
        AbstractC3340k.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2641B.D(set.size()));
        boolean z2 = false;
        for (Object obj : set) {
            boolean z10 = true;
            if (!z2 && AbstractC3340k.a(obj, serializable)) {
                z2 = true;
                z10 = false;
            }
            if (z10) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static LinkedHashSet Z(Set set, Iterable elements) {
        AbstractC3340k.e(set, "<this>");
        AbstractC3340k.e(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2641B.D(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        t.e0(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet a0(Set set, Object obj) {
        AbstractC3340k.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2641B.D(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
