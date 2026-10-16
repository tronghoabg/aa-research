package defpackage;

import java.util.AbstractCollection;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class aeri implements aeui {
    final /* synthetic */ AbstractCollection a;
    private final aeui b;
    private final /* synthetic */ int c;

    public aeri(AbstractCollection abstractCollection, aeui aeuiVar, int i) {
        this.c = i;
        this.a = abstractCollection;
        this.b = aeuiVar;
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final void add(Object obj) {
        int i = this.c;
        aeui aeuiVar = this.b;
        if (i != 0) {
            aeuiVar.add(obj);
        } else {
            aeuiVar.add(obj);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        AbstractCollection abstractCollection = this.a;
        aeui aeuiVar = this.b;
        return i != 0 ? aeuiVar.nextIndex() < ((aequ) abstractCollection).c : aeuiVar.nextIndex() < ((aerk) abstractCollection).c;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final boolean hasPrevious() {
        int i = this.c;
        AbstractCollection abstractCollection = this.a;
        if (i != 0) {
            return this.b.previousIndex() >= ((aequ) abstractCollection).b;
        }
        return this.b.previousIndex() >= ((aerk) abstractCollection).b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (this.c != 0) {
            if (hasNext()) {
                return this.b.next();
            }
            throw new NoSuchElementException();
        }
        if (hasNext()) {
            return this.b.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i;
        int iNextIndex;
        int i2 = this.c;
        AbstractCollection abstractCollection = this.a;
        if (i2 != 0) {
            i = ((aequ) abstractCollection).b;
            iNextIndex = this.b.nextIndex();
        } else {
            i = ((aerk) abstractCollection).b;
            iNextIndex = this.b.nextIndex();
        }
        return iNextIndex - i;
    }

    @Override // java.util.ListIterator, defpackage.aeed
    public final Object previous() {
        if (this.c != 0) {
            if (hasPrevious()) {
                return this.b.previous();
            }
            throw new NoSuchElementException();
        }
        if (hasPrevious()) {
            return this.b.previous();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        int iPreviousIndex;
        int i2 = this.c;
        AbstractCollection abstractCollection = this.a;
        if (i2 != 0) {
            i = ((aequ) abstractCollection).b;
            iPreviousIndex = this.b.previousIndex();
        } else {
            i = ((aerk) abstractCollection).b;
            iPreviousIndex = this.b.previousIndex();
        }
        return iPreviousIndex - i;
    }

    @Override // defpackage.aeui, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.c;
        aeui aeuiVar = this.b;
        if (i != 0) {
            aeuiVar.remove();
        } else {
            aeuiVar.remove();
        }
    }

    @Override // defpackage.aeui, java.util.ListIterator
    public final void set(Object obj) {
        int i = this.c;
        aeui aeuiVar = this.b;
        if (i != 0) {
            aeuiVar.set(obj);
        } else {
            aeuiVar.set(obj);
        }
    }
}
