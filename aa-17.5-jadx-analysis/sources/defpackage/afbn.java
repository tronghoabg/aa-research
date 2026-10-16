package defpackage;

import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class afbn implements ListIterator, afgc {
    final /* synthetic */ Object a;
    private final ListIterator b;
    private final /* synthetic */ int c;

    public afbn(afbm afbmVar, int i, int i2) {
        this.c = i2;
        this.a = afbmVar;
        this.b = afbmVar.a.listIterator(woy.bx(afbmVar, i));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        if (this.c == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        ListIterator listIterator = this.b;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        ListIterator listIterator = this.b;
        return i != 0 ? listIterator.hasPrevious() : listIterator.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.c;
        ListIterator listIterator = this.b;
        return i != 0 ? listIterator.hasNext() : listIterator.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.c;
        ListIterator listIterator = this.b;
        return i != 0 ? listIterator.previous() : listIterator.previous();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int iBh;
        int i = this.c;
        ListIterator listIterator = this.b;
        if (i != 0) {
            ?? r2 = this.a;
            iPreviousIndex = listIterator.previousIndex();
            iBh = woy.bh(r2);
        } else {
            ?? r22 = this.a;
            iPreviousIndex = listIterator.previousIndex();
            iBh = woy.bh(r22);
        }
        return iBh - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.c;
        ListIterator listIterator = this.b;
        return i != 0 ? listIterator.next() : listIterator.next();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int iBh;
        int i = this.c;
        ListIterator listIterator = this.b;
        if (i != 0) {
            ?? r2 = this.a;
            iNextIndex = listIterator.nextIndex();
            iBh = woy.bh(r2);
        } else {
            ?? r22 = this.a;
            iNextIndex = listIterator.nextIndex();
            iBh = woy.bh(r22);
        }
        return iBh - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        if (this.c == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        this.b.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (this.c == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        this.b.set(obj);
    }

    public afbn(afbo afboVar, int i, int i2) {
        this.c = i2;
        this.a = afboVar;
        this.b = afboVar.a.listIterator(woy.bx(afboVar, i));
    }
}
