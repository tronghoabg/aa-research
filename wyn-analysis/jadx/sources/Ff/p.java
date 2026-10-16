package ff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public abstract class p extends AbstractC3935e {
    public static int a0(Iterable iterable, int i5) {
        AbstractC3340k.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i5;
    }

    public static ArrayList b0(Iterable iterable) {
        AbstractC3340k.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            t.e0((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
