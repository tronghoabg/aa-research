package R;

import ff.AbstractC2651f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public abstract class c extends AbstractC2651f implements List, Collection, InterfaceC4291a {
    public abstract c a(int i5, Object obj);

    public abstract c c(Object obj);

    @Override // ff.AbstractC2646a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ff.AbstractC2646a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public c d(Collection collection) {
        g gVarE = e();
        gVarE.addAll(collection);
        return gVarE.d();
    }

    public abstract g e();

    public abstract c f(b bVar);

    public abstract c g(int i5);

    public abstract c h(int i5, Object obj);

    @Override // ff.AbstractC2651f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final List subList(int i5, int i10) {
        return new Q.a(this, i5, i10);
    }
}
