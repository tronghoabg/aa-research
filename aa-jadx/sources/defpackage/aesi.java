package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aesi implements defpackage.aevi {
    final /* synthetic */ java.util.AbstractCollection a;
    private final defpackage.aevi b;
    private final /* synthetic */ int c;

    public aesi(java.util.AbstractCollection abstractCollection, defpackage.aevi aeviVar, int i) {
        this.c = i;
        this.a = abstractCollection;
        this.b = aeviVar;
    }

    @Override // defpackage.aevi, java.util.ListIterator
    public final void add(java.lang.Object obj) {
        int i = this.c;
        defpackage.aevi aeviVar = this.b;
        if (i != 0) {
            aeviVar.add(obj);
        } else {
            aeviVar.add(obj);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        java.util.AbstractCollection abstractCollection = this.a;
        defpackage.aevi aeviVar = this.b;
        if (i != 0) {
            return aeviVar.nextIndex() < ((defpackage.aeru) abstractCollection).c;
        }
        return aeviVar.nextIndex() < ((defpackage.aesk) abstractCollection).c;
    }

    @Override // java.util.ListIterator, defpackage.aefd
    public final boolean hasPrevious() {
        int i = this.c;
        java.util.AbstractCollection abstractCollection = this.a;
        if (i != 0) {
            return this.b.previousIndex() >= ((defpackage.aeru) abstractCollection).b;
        }
        return this.b.previousIndex() >= ((defpackage.aesk) abstractCollection).b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        if (this.c != 0) {
            if (hasNext()) {
                return this.b.next();
            }
            throw new java.util.NoSuchElementException();
        }
        if (hasNext()) {
            return this.b.next();
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i;
        int iNextIndex;
        int i2 = this.c;
        java.util.AbstractCollection abstractCollection = this.a;
        if (i2 != 0) {
            i = ((defpackage.aeru) abstractCollection).b;
            iNextIndex = this.b.nextIndex();
        } else {
            i = ((defpackage.aesk) abstractCollection).b;
            iNextIndex = this.b.nextIndex();
        }
        return iNextIndex - i;
    }

    @Override // java.util.ListIterator, defpackage.aefd
    public final java.lang.Object previous() {
        if (this.c != 0) {
            if (hasPrevious()) {
                return this.b.previous();
            }
            throw new java.util.NoSuchElementException();
        }
        if (hasPrevious()) {
            return this.b.previous();
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        int iPreviousIndex;
        int i2 = this.c;
        java.util.AbstractCollection abstractCollection = this.a;
        if (i2 != 0) {
            i = ((defpackage.aeru) abstractCollection).b;
            iPreviousIndex = this.b.previousIndex();
        } else {
            i = ((defpackage.aesk) abstractCollection).b;
            iPreviousIndex = this.b.previousIndex();
        }
        return iPreviousIndex - i;
    }

    @Override // defpackage.aevi, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.c;
        defpackage.aevi aeviVar = this.b;
        if (i != 0) {
            aeviVar.remove();
        } else {
            aeviVar.remove();
        }
    }

    @Override // defpackage.aevi, java.util.ListIterator
    public final void set(java.lang.Object obj) {
        int i = this.c;
        defpackage.aevi aeviVar = this.b;
        if (i != 0) {
            aeviVar.set(obj);
        } else {
            aeviVar.set(obj);
        }
    }
}
