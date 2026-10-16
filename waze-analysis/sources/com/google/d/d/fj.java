package com.google.d.d;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class fj extends fi implements SortedSet {
    fj(SortedSet sortedSet, com.google.d.b.ab abVar) {
        super(sortedSet, abVar);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f7407a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f7407a.iterator();
        com.google.d.b.an.B(it);
        com.google.d.b.ab abVar = this.f7408b;
        com.google.d.b.an.B(abVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (abVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new fj(((SortedSet) this.f7407a).headSet(obj), this.f7408b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f7407a;
        while (true) {
            com.google.d.b.ab abVar = this.f7408b;
            Object objLast = sortedSetHeadSet.last();
            if (abVar.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new fj(((SortedSet) this.f7407a).subSet(obj, obj2), this.f7408b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new fj(((SortedSet) this.f7407a).tailSet(obj), this.f7408b);
    }
}
