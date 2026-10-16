package ff;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class t extends s {
    public static void e0(Iterable elements, Collection collection) {
        AbstractC3340k.e(collection, "<this>");
        AbstractC3340k.e(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void f0(Collection collection, Object[] elements) {
        AbstractC3340k.e(collection, "<this>");
        AbstractC3340k.e(elements, "elements");
        collection.addAll(m.c0(elements));
    }

    public static final Collection g0(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : o.S0(iterable);
    }
}
