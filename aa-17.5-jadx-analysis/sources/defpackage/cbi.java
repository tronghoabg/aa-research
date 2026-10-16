package defpackage;

import j$.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class cbi<E> extends afar<E> implements List<E>, cbf {
    @Override // defpackage.afam, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.afam, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.cbf
    public cbf d(Collection collection) {
        cbl cblVarJ = j();
        cblVarJ.addAll(collection);
        return cblVarJ.c();
    }

    @Override // defpackage.cbf
    public final cbf e(Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? h(iIndexOf) : this;
    }

    @Override // defpackage.cbf
    public final cbf f(Collection collection) {
        return g(new bji(collection, 17));
    }

    @Override // defpackage.afar, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // defpackage.afar, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.afar, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return new cbd(this, i, i2);
    }
}
