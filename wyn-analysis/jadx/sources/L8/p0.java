package l8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import k8.InterfaceC3202k;

/* loaded from: classes4.dex */
public final class p0 extends o0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f40150a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f40150a.iterator();
        it.getClass();
        InterfaceC3202k interfaceC3202k = this.f40151b;
        interfaceC3202k.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC3202k.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new p0(((SortedSet) this.f40150a).headSet(obj), this.f40151b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f40150a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f40151b.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new p0(((SortedSet) this.f40150a).subSet(obj, obj2), this.f40151b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new p0(((SortedSet) this.f40150a).tailSet(obj), this.f40151b);
    }
}
